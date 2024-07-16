# Contributing to the Pulumi ecosystem

Do you want to contribute to Pulumi? Awesome! We are so happy to have you.
We have a few tips and housekeeping items to help you get up and running.

## Code of Conduct

Please make sure to read and observe our [Code of Conduct](./CODE-OF-CONDUCT.md)

## Community Expectations

Please read about our [contribution guidelines here.](https://github.com/pulumi/pulumi/blob/master/CONTRIBUTING.md#communications)

## Setting up your development environment

### Pulumi prerequisites

Please refer to the [main Pulumi repo](https://github.com/pulumi/pulumi/)'s [CONTRIBUTING.md file](
https://github.com/pulumi/pulumi/blob/master/CONTRIBUTING.md#developing) for details on how to get set up with Pulumi.

## Updating the upstream Terraform provider version

This project utilizes the [pulumi-terraform-bridge](https://github.com/pulumi/pulumi-terraform-bridge) library to adapt an existing Terraform provider into a Pulumi provider. The Terraform provider is integrated as a git submodule named upstream, allowing for necessary patches such as modifying the user-agent and enabling access to the Terraform provider constructor.

### Manual Update Process

1. Update Version in go.mod:

- Navigate to the ./provider directory.
- Update the version in the go.mod file to track the version being used.

2. Update Upstream Submodule:

- Navigate to the upstream submodule directory.
- Update the submodule to point to the latest tag (e.g., git checkout v2.0).

3. Build the Project:

- Return to the root directory.
- Execute `make build` to generate the provider and SDKs.
- *Note:* During this process, patches will be applied to the upstream submodule. If any failures occur, follow the instructions below in `Additional Steps`.

4. Update Resource Definitions:

- If there are new resources in the Terraform provider, update the ./provider/resources.go file.
- Update the ProviderInfo function's Resources or DataSources fields as needed.
- Define resource fields such as Tok, Docs, and Fields if required.

  - Field `Tok` (required). Example `Tok` for new resource "Foo" in service "Bar" :

  ```
  "equinix_bar_foo": {
      Tok: makeProviderResource(barMod, "Foo"),
  }
  ```

  - Field `Docs` (optional) :
  We use `Docs` when we want to ensure that an example of the resource exists for all available SDKs. This should be done automatically with the bridge plugin taking the 
  example defined in the Terraform documentation, but if it finds an error it deletes the example from the documentation. Follow the instructions below in `Additional Steps` to define a new example.
  
  ```
  Docs: &tfbridge.DocInfo{
      ReplaceExamplesSection: true,
  }
  ```

  - Field `Fields` (optional) :

  We mainly use this when we need to expressly limit the maximum number of items. The MaxItemsOne attribute is used when a field in the Terraform provider, which 
  represents a set or list in Terraform, should be interpreted as a single item in Pulumi. This is necessary when a field in Terraform, which logically represents a single 
  nested object, is not explicitly limited to a single item in Terraform. Without setting `MaxItemsOne`, the Pulumi provider may interpret such fields as lists, leading to 
  unexpected behavior or errors. Setting MaxItemsOne ensures that the corresponding field in Pulumi is treated as a single item, aligning it with its logical 
  representation. Example for a field "quuz":

  ```
  Fields: map[string]*tfbridge.SchemaInfo{
      "quuz": {
          MaxItemsOne: tfbridge.True(),
      },
  }
  ```

5. Rebuild the Project:

- Re-execute `make build` to ensure that the SDKs are generated without errors.

6. Additional Steps

- Updating or Adding Patches

  - Use `make upstream.rebase` to begin the rebase process.
  - Navigate to the upstream directory and make necessary changes.
  - Commit the changes with a concise and self-explanatory commit message (don't push them)
  - Return to the root directory and execute `make upstream.finalize` to generate new patches.
  - If patch application fails, address the issues causing the failure.

- Generating New Examples

  The bridge plugin has the capability to import Terraform examples, but this functionality is not always reliable. Therefore, we generate examples for all supported languages using the `pulumi convert` command and replace the examples section in the documentation.

  To add or update an example, you need to edit or add a new YAML template at the path `examples/{service-name}/{resource-name}/Pulumi.yaml`. You can use any existing templates as references or consult the [Pulumi YAML Language Reference](https://www.pulumi.com/docs/languages-sdks/yaml/yaml-language-reference/).

  Once you have made your edits, you can use the `make examples` command. This command will:
  1. Generate the example in all supported languages, which can be found in their respective folders: `examples/{service-name}/{resource-name}/{language-name}` (e.g., go, python, typescript, csharp, java).
  2. Update the examples that appear in the documentation with a new markdown file in `docs/resource/{resource-name}`.

  If you are adding an example for a new resource, don't forget to include the `ReplaceExamplesSection: true` option in the resource definition in the ProviderInfo mapping in `provider/resources.go`.

  For multiple examples of the same resource, each example must have its own subfolder (see `examples/metal/port/` for reference) with its own Pulumi.yaml. To ensure all examples are correctly displayed in the documentation, update the `scripts/generate_examples.sh` file by adding a new call to the `merge_examples_files` function at the end of the file. For example:
  ```sh
  merge_example_files "equinix_metal_port" "equinix_metal_port_hybrid_bonded" "equinix_metal_port_hybrid_unbonded" "equinix_metal_port_layer2_bonded"
  ```
  In this command, the first parameter is the resource name, and the subsequent parameters are the normalized names of the examples to be merged. For example, if the name defined within the yaml file is "equinix-metal-port-hybrid-bonded" then its normalized name will be "equinix_metal_port_hybrid_bonded".

  By following these steps, you can ensure that all examples are properly generated and included in the documentation for Pulumi providers.

**Note: Failing upgrade-provider Tool**
Pulumi provides an [upgrade-provider](https://github.com/pulumi/upgrade-provider) tool that aims to reduce the amount of human intervention necessary for upgrading bridged Pulumi providers. As of March 2024, the upgrade-provider tool may encounter issues (with Equinix provider) due to changes in directory structure during the migration of resources from SDKv2 to Framework. Until this issue is resolved, manual updates are necessary following the outlined steps.

## Committing Generated Code

You must generate and check in the SDKs on each pull request containing a code change, e.g. adding a new resource to `resources.go`.

1. Run `make build` from the root of this repository
1. Open a pull request containing all changes
1. *Note:* If a large number of seemingly-unrelated diffs are produced by `make build` (for example, lots of changes to comments unrelated to the change you are making), ensure that the latest dependencies for the provider are installed by running `go mod tidy` in the `provider/` directory of this repository.

## Running Integration Tests

The examples and integration tests in this repository will create and destroy real
cloud resources while running. Before running these tests, make sure that you have
configured access to your cloud provider with Pulumi.

_TODO: Add any steps you need to take to run integration tests here_

