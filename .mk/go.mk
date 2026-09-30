# Equinix-specific post-processing of the generated Go SDK.
#
# The generated Makefile is owned by ci-mgmt, so customizations live here instead.
# Go codegen imports the root `equinix` package into fabric/pulumiTypes.go and
# networkedge/networkFile.go because some properties reference the
# `equinix:index/metro:Metro` enum, but those properties are generated as plain
# string inputs, leaving the import unused and the SDK uncompilable.
# goimports removes the unused imports.

.make/patch_go: .make/generate_go
	go run golang.org/x/tools/cmd/goimports@v0.50.0 -w sdk/go/
	@touch $@

generate_go: .make/patch_go
.make/build_go: .make/patch_go
