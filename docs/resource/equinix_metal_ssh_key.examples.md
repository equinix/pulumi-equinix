## Example Usage
{{% example %}}
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";
import * as std from "@pulumi/std";

const key1 = new equinix.metal.SshKey("key1", {
    name: "terraform-1",
    publicKey: std.fileOutput({
        input: "/home/terraform/.ssh/id_rsa.pub",
    }).apply(invoke => invoke.result),
});
const test = new equinix.metal.Device("test", {
    hostname: "test-device",
    plan: equinix.metal.Plan.C3SmallX86,
    metro: "sv",
    operatingSystem: "ubuntu_24_04",
    billingCycle: equinix.metal.BillingCycle.Hourly,
    projectId: projectId,
}, {
    dependsOn: [key1],
});
```
```python
import pulumi
import pulumi_equinix as equinix
import pulumi_std as std

key1 = equinix.metal.SshKey("key1",
    name="terraform-1",
    public_key=std.file_output(input="/home/terraform/.ssh/id_rsa.pub").apply(lambda invoke: invoke.result))
test = equinix.metal.Device("test",
    hostname="test-device",
    plan=equinix.metal.Plan.C3_SMALL_X86,
    metro="sv",
    operating_system="ubuntu_24_04",
    billing_cycle=equinix.metal.BillingCycle.HOURLY,
    project_id=project_id,
    opts = pulumi.ResourceOptions(depends_on=[key1]))
```
```go
package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/metal"
	"github.com/pulumi/pulumi-std/sdk/go/std"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		key1, err := metal.NewSshKey(ctx, "key1", &metal.SshKeyArgs{
			Name: pulumi.String("terraform-1"),
			PublicKey: pulumi.String(std.FileOutput(ctx, std.FileOutputArgs{
				Input: pulumi.String("/home/terraform/.ssh/id_rsa.pub"),
			}, nil).ApplyT(func(invoke std.FileResult) (*string, error) {
				return invoke.Result, nil
			}).(pulumi.StringPtrOutput)),
		})
		if err != nil {
			return err
		}
		_, err = metal.NewDevice(ctx, "test", &metal.DeviceArgs{
			Hostname:        pulumi.String("test-device"),
			Plan:            pulumi.String(metal.PlanC3SmallX86),
			Metro:           pulumi.String("sv"),
			OperatingSystem: pulumi.String("ubuntu_24_04"),
			BillingCycle:    pulumi.String(metal.BillingCycleHourly),
			ProjectId:       pulumi.Any(projectId),
		}, pulumi.DependsOn([]pulumi.Resource{
			key1,
		}))
		if err != nil {
			return err
		}
		return nil
	})
}
```
```csharp
using System.Collections.Generic;
using System.Linq;
using Pulumi;
using Equinix = Pulumi.Equinix;
using Std = Pulumi.Std;

return await Deployment.RunAsync(() => 
{
    var key1 = new Equinix.Metal.SshKey("key1", new()
    {
        Name = "terraform-1",
        PublicKey = Std.File.Invoke(new()
        {
            Input = "/home/terraform/.ssh/id_rsa.pub",
        }).Apply(invoke => invoke.Result),
    });

    var test = new Equinix.Metal.Device("test", new()
    {
        Hostname = "test-device",
        Plan = Equinix.Metal.Plan.C3SmallX86,
        Metro = "sv",
        OperatingSystem = "ubuntu_24_04",
        BillingCycle = Equinix.Metal.BillingCycle.Hourly,
        ProjectId = projectId,
    }, new CustomResourceOptions
    {
        DependsOn =
        {
            key1,
        },
    });

});
```
```java
package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.equinix.pulumi.equinix.metal.SshKey;
import com.equinix.pulumi.equinix.metal.SshKeyArgs;
import com.pulumi.std.StdFunctions;
import com.pulumi.std.inputs.FileArgs;
import com.equinix.pulumi.equinix.metal.Device;
import com.equinix.pulumi.equinix.metal.DeviceArgs;
import com.pulumi.resources.CustomResourceOptions;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

public class App {
    public static void main(String[] args) {
        Pulumi.run(App::stack);
    }

    public static void stack(Context ctx) {
        var key1 = new SshKey("key1", SshKeyArgs.builder()
            .name("terraform-1")
            .publicKey(StdFunctions.file(FileArgs.builder()
                .input("/home/terraform/.ssh/id_rsa.pub")
                .build()).applyValue(_invoke -> _invoke.result()))
            .build());

        var test = new Device("test", DeviceArgs.builder()
            .hostname("test-device")
            .plan("c3.small.x86")
            .metro("sv")
            .operatingSystem("ubuntu_24_04")
            .billingCycle("hourly")
            .projectId(projectId)
            .build(), CustomResourceOptions.builder()
                .dependsOn(key1)
                .build());

    }
}
```
```yaml
resources:
  # Create a new SSH key
  key1:
    type: equinix:metal:SshKey
    properties:
      name: terraform-1
      publicKey:
        fn::invoke:
          function: std:file
          arguments:
            input: /home/terraform/.ssh/id_rsa.pub
          return: result
  # Create new device with "key1" included. The device resource "depends_on" the
  # key, in order to make sure the key is created before the device.
  test:
    type: equinix:metal:Device
    properties:
      hostname: test-device
      plan: c3.small.x86
      metro: sv
      operatingSystem: ubuntu_24_04
      billingCycle: hourly
      projectId: ${projectId}
    options:
      dependsOn:
        - ${key1}
```
{{% /example %}}
