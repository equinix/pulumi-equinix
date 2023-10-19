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
VERSION          := $(shell pulumictl get version)
JAVA_GEN         := pulumi-java-gen
JAVA_GEN_VERSION := v0.7.1
JAVA_GROUP_ID    := com.${ORG}.pulumi
JAVA_ARTIFACT_ID := ${PACK}
TESTPARALLELISM  := 4

WORKING_DIR     := $(shell pwd)

OS := $(shell uname)
EMPTY_TO_AVOID_SED := ""

prepare::
	@if test -z "${NAME}"; then echo "NAME not set"; exit 1; fi
	@if test -z "${REPOSITORY}"; then echo "REPOSITORY not set"; exit 1; fi
	@if test ! -d "provider/cmd/pulumi-tfgen-x${EMPTY_TO_AVOID_SED}yz"; then "Project already prepared"; exit 1; fi

	mv "provider/cmd/pulumi-tfgen-x${EMPTY_TO_AVOID_SED}yz" provider/cmd/pulumi-tfgen-${NAME}
	mv "provider/cmd/pulumi-resource-x${EMPTY_TO_AVOID_SED}yz" provider/cmd/pulumi-resource-${NAME}

	if [[ "${OS}" != "Darwin" ]]; then \
		sed -i 's,github.com/pulumi/pulumi-equinix,${REPOSITORY},g' provider/go.mod; \
		find ./ ! -path './.git/*' -type f -exec sed -i 's/[x]yz/${NAME}/g' {} \; &> /dev/null; \
	fi

	# In MacOS the -i parameter needs an empty string to execute in place.
	if [[ "${OS}" == "Darwin" ]]; then \
		sed -i '' 's,github.com/pulumi/pulumi-equinix,${REPOSITORY},g' provider/go.mod; \
		find ./ ! -path './.git/*' -type f -exec sed -i '' 's/[x]yz/${NAME}/g' {} \; &> /dev/null; \
	fi

.PHONY: development provider build_sdks build_nodejs build_dotnet build_go build_python build_java clean cleanup

development:: install_plugins provider lint_provider build_sdks install_sdks cleanup # Build the provider & SDKs for a development environment

# Required for the codegen action that runs in pulumi/pulumi and pulumi/pulumi-terraform-bridge
build:: install_plugins provider build_sdks install_sdks
only_build:: build

tfgen:: install_plugins
	(cd provider && go build -o $(WORKING_DIR)/bin/${TFGEN} -ldflags "-X ${PROJECT}/${VERSION_PATH}=${VERSION}" ${PROJECT}/${PROVIDER_PATH}/cmd/${TFGEN})
	$(WORKING_DIR)/bin/${TFGEN} schema --out provider/cmd/${PROVIDER}
	(cd provider && VERSION=$(VERSION) go generate cmd/${PROVIDER}/main.go)

bin/pulumi-java-gen:
	pulumictl download-binary -n pulumi-language-java -v $(JAVA_GEN_VERSION) -r pulumi/pulumi-java

provider:: tfgen install_plugins # build the provider binary
	(cd provider && go build -o $(WORKING_DIR)/bin/${PROVIDER} -ldflags "-X ${PROJECT}/${VERSION_PATH}=${VERSION}" ${PROJECT}/${PROVIDER_PATH}/cmd/${PROVIDER})

build_sdks:: install_plugins provider build_nodejs build_python build_go build_dotnet build_java # build all the sdks

build_nodejs:: VERSION := $(shell pulumictl get version --language javascript)
build_nodejs:: install_plugins tfgen # build the node sdk
	$(WORKING_DIR)/bin/$(TFGEN) nodejs --overlays provider/overlays/nodejs --out sdk/nodejs/
build_nodejs:: patch_nodejs # fix generated files
build_nodejs::
	cd sdk/nodejs/ && \
        yarn install && \
        yarn run tsc && \
        cp ../../README.md ../../LICENSE package.json yarn.lock ./bin/ && \
		sed -i.bak -e "s/\$${VERSION}/$(VERSION)/g" ./bin/package.json

patch_nodejs::
	echo "patch_nodejs: find and replace wrong imports in examples" && \
		find ./sdk/nodejs/ -type f -name "*.ts" -not \( -path "*/bin/*" -o -path "*/node_modules/*" -o -path "*/@types/*" \) -print -exec sed -i.bak 's/import \* as ${PACK} from "@pulumi\/${PACK}"/import \* as ${PACK} from "@${ORG}-labs\/${NODE_PACK}"/g; s/import \* as ${NODE_PACK_ALIAS} from "@${ORG}\/${NODE_PACK}"/import \* as ${PACK} from "@${ORG}-labs\/${NODE_PACK}"/g' {} \;
	echo "patch_nodejs: delete duplicate imports in examples" && \
		find ./sdk/nodejs/ -type f -name "*.ts" -not \( -path "*/bin/*" -o -path "*/node_modules/*" -o -path "*/@types/*" \) -exec sed -i.bak '/@${ORG}-labs\/${NODE_PACK}/N;/^\(.*\)\n\1$$/!P; D' {} \;
	echo "patch_nodejs: remove backup files" && \
		find ./sdk/nodejs/ -type f -name "*.ts.bak" -not \( -path "*/bin/*" -o -path "*/node_modules/*" -o -path "*/@types/*" \) -print -exec /bin/rm {} \;

build_python:: PYPI_VERSION := $(shell pulumictl get version --language python)
build_python:: install_plugins tfgen # build the python sdk
	$(WORKING_DIR)/bin/$(TFGEN) python --overlays provider/overlays/python --out sdk/python/
	cd sdk/python/ && \
        cp ../../README.md . && \
        python3 setup.py clean --all 2>/dev/null && \
        rm -rf ./bin/ ../python.bin/ && cp -R . ../python.bin && mv ../python.bin ./bin && \
        sed -i.bak -e 's/^VERSION = .*/VERSION = "$(PYPI_VERSION)"/g' -e 's/^PLUGIN_VERSION = .*/PLUGIN_VERSION = "$(VERSION)"/g' ./bin/setup.py && \
        rm ./bin/setup.py.bak && \
        cd ./bin && python3 setup.py build sdist

build_dotnet:: DOTNET_VERSION := $(shell pulumictl get version --language dotnet)
build_dotnet:: install_plugins tfgen # build the dotnet sdk
	pulumictl get version --language dotnet
	$(WORKING_DIR)/bin/$(TFGEN) dotnet --overlays provider/overlays/dotnet --out sdk/dotnet/
	cd sdk/dotnet/ && \
		echo "${DOTNET_VERSION}" >version.txt && \
        dotnet build /p:Version=${DOTNET_VERSION}

build_go:: install_plugins tfgen # build the go sdk
	$(WORKING_DIR)/bin/$(TFGEN) go --overlays provider/overlays/go --out sdk/go/

build_java:: PACKAGE_VERSION := $(shell pulumictl get version --language generic)
build_java:: install_plugins tfgen bin/pulumi-java-gen patch_java_schema # build the java sdk
	$(WORKING_DIR)/bin/$(JAVA_GEN) generate --schema provider/cmd/$(PROVIDER)/schema-java.json --out sdk/java --build gradle-nexus
	rm -f ./provider/cmd/$(PROVIDER)/schema-java.json
build_java:: patch_java
	cd sdk/java/ && \
		echo "module fake_java_module // Exclude this directory from Go tools\n\ngo 1.17" > go.mod && \
		gradle --console=plain build

patch_java_schema::
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

patch_java::
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

lint_provider:: provider # lint the provider code
	cd provider && golangci-lint run -c ../.golangci.yml

cleanup:: # cleans up the temporary directory
	rm -r $(WORKING_DIR)/bin
	rm -f provider/cmd/${PROVIDER}/schema.go

help::
	@grep '^[^.#]\+:\s\+.*#' Makefile | \
 	sed "s/\(.\+\):\s*\(.*\) #\s*\(.*\)/`printf "\033[93m"`\1`printf "\033[0m"`	\3 [\2]/" | \
 	expand -t20

clean::
	rm -rf sdk/{dotnet,nodejs,go,python,java}

install_plugins::
	[ -x $(shell which pulumi) ] || curl -fsSL https://get.pulumi.com | sh
	pulumi plugin install resource random 4.3.1

install_dotnet_sdk::
	mkdir -p $(WORKING_DIR)/nuget
	find . -name '*.nupkg' -print -exec cp -p {} ${WORKING_DIR}/nuget \;

install_python_sdk::

install_go_sdk::

install_java_sdk:

install_nodejs_sdk::
	yarn link --cwd $(WORKING_DIR)/sdk/nodejs/bin

install_sdks:: install_dotnet_sdk install_python_sdk install_nodejs_sdk install_java_sdk

test::
	cd examples && go test -v -tags=all -parallel ${TESTPARALLELISM} -timeout 2h

test_provider:
	@echo ""
	@echo "== test_provider ==================================================================="
	@echo ""
	cd provider && go test -v -short ./... -parallel $(TESTPARALLELISM)
