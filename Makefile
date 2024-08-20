PROJECT_NAME := equinix Package

SHELL            := /bin/bash
PACK             := equinix
ORG              := equinix
PROJECT          := github.com/${ORG}/pulumi-${PACK}
NODE_PACK        := pulumi-${PACK}
NODE_PACK_ALIAS  := pulumi_${PACK}
NODE_MODULE_NAME := @${ORG}/${NODE_PACK}
TF_NAME          := ${PACK}
PROVIDER_PATH    := provider
VERSION_PATH     := ${PROVIDER_PATH}/pkg/version.Version
TFGEN            := pulumi-tfgen-${PACK}
PROVIDER         := pulumi-resource-${PACK}
JAVA_GEN         := pulumi-java-gen
JAVA_GROUP_ID    := com.${ORG}.pulumi
JAVA_ARTIFACT_ID := ${PACK}
TESTPARALLELISM  := 4

WORKING_DIR   := $(shell pwd)
BIN_DIR       := $(WORKING_DIR)/.pulumi/bin
PULUMICTL_BIN := $(BIN_DIR)/pulumictl

OS   := $(shell uname | tr '[:upper:]' '[:lower:]')
ARCH := $(shell uname -m)
ifeq ($(ARCH),x86_64)
  ARCH=amd64
endif

EMPTY_TO_AVOID_SED := ""

PULUMICTL_VERSION := v0.0.46

# estimated target version of the plugin that is currently being generated
VERSION         = $(shell $(PULUMICTL_BIN) get version)
PACKAGE_VERSION = $(shell $(PULUMICTL_BIN) get version --language generic)
NODEJS_VERSION  = $(shell $(PULUMICTL_BIN) get version --language javascript)
PYPI_VERSION    = $(shell $(PULUMICTL_BIN) get version --language python)
DOTNET_VERSION  = $(shell $(PULUMICTL_BIN) get version--language dotnet)

development: install_plugins provider lint_provider build_sdks install_sdks cleanup # Build the provider & SDKs for a development environment

# Required for the codegen action that runs in pulumi/pulumi and pulumi/pulumi-terraform-bridge
build: install_plugins provider build_sdks install_sdks
only_build: build

only_tfgen: install_plugins upstream build_schema
tfgen: only_tfgen generate_examples

# Generate examples after the schema is generated
generate_examples: examples

# Build the tfgen binary and generate the schema
build_schema: $(PULUMICTL_BIN)
build_schema:
	(cd provider && go build -o $(WORKING_DIR)/bin/${TFGEN} -ldflags "-X ${PROJECT}/${VERSION_PATH}=${VERSION}" ${PROJECT}/${PROVIDER_PATH}/cmd/${TFGEN})
	$(WORKING_DIR)/bin/${TFGEN} schema --out provider/cmd/${PROVIDER}
	(cd provider && VERSION=$(VERSION) go generate cmd/${PROVIDER}/main.go)

bin/pulumi-java-gen: .pulumi-java-gen.version $(PULUMICTL_BIN)
	$(PULUMICTL_BIN) download-binary -n pulumi-language-java -v v$(shell cat .pulumi-java-gen.version) -r pulumi/pulumi-java

provider: tfgen install_plugins # build the provider binary
provider: only_provider

only_provider: $(PULUMICTL_BIN)
	(cd provider && go build -o $(WORKING_DIR)/bin/${PROVIDER} -ldflags "-X ${PROJECT}/${VERSION_PATH}=${VERSION} -X github.com/equinix/terraform-provider-equinix/version.ProviderVersion=${VERSION}" ${PROJECT}/${PROVIDER_PATH}/cmd/${PROVIDER})

build_sdks: clean build_nodejs build_python build_go build_dotnet build_java # build all the sdks

build_nodejs: upstream $(PULUMICTL_BIN)
	$(WORKING_DIR)/bin/$(TFGEN) nodejs --overlays provider/overlays/nodejs --out sdk/nodejs/
	echo "patch_nodejs: find and replace wrong imports in examples" && \
		find ./sdk/nodejs/ -type f -name "*.ts" -not \( -path "*/bin/*" -o -path "*/node_modules/*" -o -path "*/@types/*" \) -print -exec sed -i.bak 's/import \* as ${PACK} from "@pulumi\/${PACK}"/import \* as ${PACK} from "@${ORG}-labs\/${NODE_PACK}"/g; s/import \* as ${NODE_PACK_ALIAS} from "@${ORG}\/${NODE_PACK}"/import \* as ${PACK} from "@${ORG}-labs\/${NODE_PACK}"/g' {} \;
	echo "patch_nodejs: delete duplicate imports in examples" && \
		find ./sdk/nodejs/ -type f -name "*.ts" -not \( -path "*/bin/*" -o -path "*/node_modules/*" -o -path "*/@types/*" \) -exec sed -i.bak '/@${ORG}-labs\/${NODE_PACK}/N;/^\(.*\)\n\1$$/!P; D' {} \;
	echo "patch_nodejs: remove backup files" && \
		find ./sdk/nodejs/ -type f -name "*.ts.bak" -not \( -path "*/bin/*" -o -path "*/node_modules/*" -o -path "*/@types/*" \) -print -exec /bin/rm {} \;
	cd sdk/nodejs/ && \
		printf "module fake_nodejs_module // Exclude this directory from Go tools\n\ngo 1.17\n" > go.mod && \
        yarn install && \
        yarn run tsc && \
        cp ../../README.md ../../LICENSE package.json yarn.lock ./bin/ && \
		sed -i.bak -e "s/\$${VERSION}/$(NODEJS_VERSION)/g" ./bin/package.json

build_python: upstream $(PULUMICTL_BIN)
	rm -rf sdk/python/
	$(WORKING_DIR)/bin/$(TFGEN) python --overlays provider/overlays/python --out sdk/python/
	cd sdk/python/ && \
		printf "module fake_python_module // Exclude this directory from Go tools\n\ngo 1.17\n" > go.mod && \
        cp ../../README.md . && \
        python3 setup.py clean --all 2>/dev/null && \
        rm -rf ./bin/ ../python.bin/ && cp -R . ../python.bin && mv ../python.bin ./bin && \
        sed -i.bak -e 's/^VERSION = .*/VERSION = "$(PYPI_VERSION)"/g' -e 's/^PLUGIN_VERSION = .*/PLUGIN_VERSION = "$(VERSION)"/g' ./bin/setup.py && \
        rm ./bin/setup.py.bak && \
        cd ./bin && python3 setup.py build sdist

build_dotnet: upstream $(PULUMICTL_BIN)
	$(WORKING_DIR)/bin/$(TFGEN) dotnet --overlays provider/overlays/dotnet --out sdk/dotnet/
	cd sdk/dotnet/ && \
		printf "module fake_dotnet_module // Exclude this directory from Go tools\n\ngo 1.17\n" > go.mod && \
		echo "${DOTNET_VERSION}" >version.txt && \
        dotnet build /p:Version=${DOTNET_VERSION}

build_go:: upstream
	$(WORKING_DIR)/bin/$(TFGEN) go --overlays provider/overlays/go --out sdk/go/
	go install golang.org/x/tools/cmd/goimports@latest
	cd sdk && goimports -w . && go list "$$(grep -e "^module" go.mod | cut -d ' ' -f 2)/go/..." | xargs go build

build_java: bin/pulumi-java-gen patch_java_schema upstream $(PULUMICTL_BIN)
	$(WORKING_DIR)/bin/$(JAVA_GEN) generate --schema provider/cmd/$(PROVIDER)/schema-java.json --out sdk/java --build gradle-nexus
	rm -f ./provider/cmd/$(PROVIDER)/schema-java.json
	echo "patch_java: find and replace invocations of pulumi:fabric/metal/networkedge" && \
		find ./sdk/java/src/main/java/com/equinix/pulumi -type f -name "*.java" -print -exec sed -i.bak 's/pulumi:fabric/equinix:fabric/g; s/pulumi:metal/equinix:metal/g; s/pulumi:networkedge/equinix:networkedge/g' {} \;
	echo "patch_java: remove backup files" && \
		find ./sdk/java/src/main/java/com/equinix/pulumi -type f -name "*.java.bak" -exec /bin/rm {} \;
	echo "patch_java: replace pulumi provider refs added in patch_java_schema" && \
		cd sdk/java/src/main/java/com/equinix/pulumi/ && \
		sed -i.bak -e 's/pulumi:providers:pulumi/pulumi:providers:equinix/g' \
			-e 's/"pulumi", name/"equinix", name/g' ./Provider.java && \
		rm -f Provider.java.bak && \
		sed -i.bak -e 's/"pulumi"/"equinix"/g' ./Config.java && \
		rm -f Config.java.bak && \
		sed -i.bak -e 's/pulumi\/pulumi/equinix\/pulumi/g' ./Utilities.java && \
		rm -f Utilities.java.bak
	echo "patch_java: update gradle info" && \
		cd ./sdk/java/ && \
		awk '/def resolvedVersion/ && !x {print "group = \"$(JAVA_GROUP_ID)\"\n";x=1}1' ./build.gradle > ./build.gradle.tmp && \
		mv build.gradle.tmp build.gradle && \
		sed -i.bak -e 's/info.metaClass.name = .*/info.metaClass.name = "$(JAVA_ARTIFACT_ID)"/g' \
			-e 's/groupId = .*/groupId = "$(JAVA_GROUP_ID)"/g' \
			-e 's/artifactId = .*/artifactId = "$(JAVA_ARTIFACT_ID)"/g' \
			-e 's/inceptionYear = .*/inceptionYear = "2023"/g' \
			-e 's/description = .*/description = "A Pulumi package for creating and managing equinix cloud resources."/g' ./build.gradle && \
		sed -i.bak -E '/inceptionYear/,/packaging/s/(name = ).*/\1"$(PACK)"/' ./build.gradle && \
		rm -f build.gradle.bak
	cd sdk/java/ && \
		printf "module fake_java_module // Exclude this directory from Go tools\n\ngo 1.17\n" > go.mod && \
		gradle --console=plain build && \
		gradle --console=plain javadoc

patch_java_schema:
	echo "patch_java_schema: copy schema.json to schema-java.json " && \
		cp provider/cmd/$(PROVIDER)/schema.json provider/cmd/$(PROVIDER)/schema-java.json
	echo "patch_java_schema: update schema-java.json to generate the SDK with pulumi as root package" && \
		sed -i.bak -e 's/"name": "equinix",/"name": "pulumi",/g' \
			-e 's/equinix:index/pulumi:index/g' \
			-e 's/"equinix": "Equinix",/"pulumi": "Pulumi",/g' \
			-e 's/equinix:metal/pulumi:metal/g' \
			-e 's/equinix:fabric/pulumi:fabric/g' \
			-e 's/equinix:networkedge/pulumi:networkedge/g' ./provider/cmd/$(PROVIDER)/schema-java.json && \
		rm -f ./provider/cmd/$(PROVIDER)/schema-java.json.bak

lint_provider: provider # lint the provider code
	cd provider && golangci-lint run -c ../.golangci.yml

cleanup: # cleans up the temporary directory
	- rm -r $(WORKING_DIR)/bin
	- rm -f provider/cmd/${PROVIDER}/schema.go

help:
	@grep '^[^.#]\+:\s\+.*#' Makefile | \
 	sed "s/\(.\+\):\s*\(.*\) #\s*\(.*\)/`printf "\033[93m"`\1`printf "\033[0m"`	\3 [\2]/" | \
 	expand -t20

clean:
	rm -rf sdk/{dotnet,nodejs,go,python,java}

install_equinix_plugin: only_provider uninstall_equinix_plugin .pulumi/bin/pulumi $(PULUMICTL_BIN)
	.pulumi/bin/pulumi plugin install resource equinix $(VERSION) --file $(WORKING_DIR)/bin/$(PROVIDER)

uninstall_equinix_plugin: .pulumi/bin/pulumi
	.pulumi/bin/pulumi plugin rm resource equinix -a -y

install_plugins: .pulumi/bin/pulumi
	.pulumi/bin/pulumi plugin install resource tls 4.11.0
	.pulumi/bin/pulumi plugin install resource random 4.14.0

install_dotnet_sdk:
	mkdir -p $(WORKING_DIR)/nuget
	find . -name '*.nupkg' -print -exec cp -p {} ${WORKING_DIR}/nuget \;

install_python_sdk:

install_go_sdk:

install_java_sdk:

install_nodejs_sdk:
	yarn link --cwd $(WORKING_DIR)/sdk/nodejs/bin

install_sdks: install_dotnet_sdk install_python_sdk install_nodejs_sdk install_java_sdk

test:
	cd examples && go test -v -tags=all -parallel ${TESTPARALLELISM} -timeout 2h

test_provider:
	@echo ""
	@echo "== test_provider ==================================================================="
	@echo ""
	cd provider && go test -v -short ./... -parallel $(TESTPARALLELISM)

upstream:
ifneq ("$(wildcard upstream)","")
	./upstream.sh init
endif

upstream.finalize:
	echo "Deprecated: Use `./upstream.sh format_patches` instead"
	scripts/upstream_old.sh "$@" end_rebase

upstream.rebase:
	echo "Deprecated: Use `./upstream.sh checkout` and `./upstream.sh rebase` instead"
	scripts/upstream_old.sh "$@" start_rebase

.pulumi/bin/pulumi: .pulumi/version
	curl -fsSL https://get.pulumi.com | HOME=$(WORKING_DIR) sh -s -- --version $(cat .pulumi/version)

$(PULUMICTL_BIN):
	@mkdir -p $(BIN_DIR)
	curl -L https://github.com/pulumi/pulumictl/releases/download/$(PULUMICTL_VERSION)/pulumictl-$(PULUMICTL_VERSION)-$(OS)-$(ARCH).tar.gz -o $(BIN_DIR)/pulumictl.tar.gz
	tar -xzf .pulumi/bin/pulumictl.tar.gz -C $(BIN_DIR)
	rm -f $(BIN_DIR)/pulumictl.tar.gz

examples: install_equinix_plugin $(PULUMICTL_BIN)
	scripts/generate_examples.sh

# Compute the version of Pulumi to use by inspecting the Go dependencies of the provider.
.pulumi/version:
	@mkdir -p .pulumi
	@cd provider && go list -f "{{slice .Version 1}}" -m github.com/pulumi/pulumi/pkg/v3 | tee ../$@

.PHONY: development build build_sdks install_go_sdk install_java_sdk install_python_sdk install_sdks only_build build_dotnet build_go build_java build_nodejs build_python clean cleanup help install_dotnet_sdk install_nodejs_sdk install_equinix_plugin uninstall_equinix_plugin install_plugins lint_provider provider test tfgen upstream upstream.finalize upstream.rebase test_provider examples examples_check
