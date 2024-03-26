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

  - In the ./examples/ directory, use the .generate.sh script to create a new example for a specific resource.
  - Create a subdirectory for the new resource under ./examples/{service}/{resource}.
  - Copy the script into the new subdirectory and create a Pulumi.yaml file, following the format of existing examples.
  - After generating the examples, create a new subdirectory named yaml to store the Pulumi.yaml file.
  - Copy the new example.md file to the docs/resource directory and rename it accordingly.
  - Update the internal format by removing the tags `chooser` and `choosable` and enclosing the content within a single block `example`:

    ```
    ## Example Usage
    {{% example %}}
      add all SDK examples here
    {{% /example %}}.
    ```

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

