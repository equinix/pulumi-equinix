# Equinix-specific post-processing of the generated Java SDK.
#
# The generated Makefile is owned by ci-mgmt, so customizations live here instead.
# pulumi-java always derives the root package from `basePackage + schema name`
# (com.equinix.equinix) and the Maven groupId from `basePackage` (com.equinix),
# so we rewrite both to keep the published coordinates and package name stable:
# com.equinix.pulumi:equinix / package com.equinix.pulumi.

JAVA_SRC_DIR := sdk/java/src/main/java/com/equinix

.make/patch_java: .make/generate_java
	if [ -d $(JAVA_SRC_DIR)/equinix ]; then \
		rm -rf $(JAVA_SRC_DIR)/pulumi && \
		mv $(JAVA_SRC_DIR)/equinix $(JAVA_SRC_DIR)/pulumi; \
	fi
	find sdk/java -type f \( -name '*.java' -o -name '*.gradle' \) \
		-exec sed -i.bak \
			-e 's/com\.equinix\.equinix/com.equinix.pulumi/g' \
			-e 's|com/equinix/equinix|com/equinix/pulumi|g' {} \; \
		-exec rm {}.bak \;
	sed -i.bak \
		-e 's/^group = "com\.equinix"$$/group = "com.equinix.pulumi"/' \
		-e 's/groupId = "com\.equinix"$$/groupId = "com.equinix.pulumi"/' \
		-e 's/inceptionYear = ""/inceptionYear = "2023"/' \
		-e '/inceptionYear/,/packaging/s/name = ""/name = "equinix"/' \
		sdk/java/build.gradle && \
		rm sdk/java/build.gradle.bak
	@# Fail loudly if the generated layout or coordinates drift again.
	grep -q '"com/equinix/pulumi/version.txt"' $(JAVA_SRC_DIR)/pulumi/Utilities.java
	grep -q '^group = "com.equinix.pulumi"$$' sdk/java/build.gradle
	grep -q 'groupId = "com.equinix.pulumi"$$' sdk/java/build.gradle
	@touch $@

generate_java: .make/patch_java
.make/build_java: .make/patch_java
