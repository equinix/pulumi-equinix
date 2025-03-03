## Example Usage
{{% example %}}
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";
import * as std from "@pulumi/std";

const myblock = new equinix.metal.ReservedIpBlock("myblock", {
    projectId: projectId,
    metro: "ny",
    quantity: 2,
});
const firstAddressAssignment = new equinix.metal.IpAttachment("firstAddressAssignment", {
    deviceId: mydevice.id,
    cidrNotation: std.joinOutput({
        separator: "/",
        input: [
            std.cidrhostOutput({
                input: myblockMetalReservedIpBlock.cidrNotation,
                host: 0,
            }).apply(invoke => invoke.result),
            "32",
        ],
    }).apply(invoke => invoke.result),
});
```
```python
import pulumi
import pulumi_equinix as equinix
import pulumi_std as std

myblock = equinix.metal.ReservedIpBlock("myblock",
    project_id=project_id,
    metro="ny",
    quantity=2)
first_address_assignment = equinix.metal.IpAttachment("firstAddressAssignment",
    device_id=mydevice["id"],
    cidr_notation=std.join_output(separator="/",
        input=[
            std.cidrhost_output(input=myblock_metal_reserved_ip_block["cidrNotation"],
                host=0).apply(lambda invoke: invoke.result),
            "32",
        ]).apply(lambda invoke: invoke.result))
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
		_, err := metal.NewReservedIpBlock(ctx, "myblock", &metal.ReservedIpBlockArgs{
			ProjectId: pulumi.Any(projectId),
			Metro:     pulumi.String("ny"),
			Quantity:  pulumi.Int(2),
		})
		if err != nil {
			return err
		}
		_, err = metal.NewIpAttachment(ctx, "firstAddressAssignment", &metal.IpAttachmentArgs{
			DeviceId: pulumi.Any(mydevice.Id),
			CidrNotation: pulumi.String(std.JoinOutput(ctx, std.JoinOutputArgs{
				Separator: pulumi.String("/"),
				Input: pulumi.StringArray{
					std.CidrhostOutput(ctx, std.CidrhostOutputArgs{
						Input: pulumi.Any(myblockMetalReservedIpBlock.CidrNotation),
						Host:  pulumi.Int(0),
					}, nil).ApplyT(func(invoke std.CidrhostResult) (*string, error) {
						return invoke.Result, nil
					}).(pulumi.StringPtrOutput),
					pulumi.String("32"),
				},
			}, nil).ApplyT(func(invoke std.JoinResult) (*string, error) {
				return invoke.Result, nil
			}).(pulumi.StringPtrOutput)),
		})
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
    var myblock = new Equinix.Metal.ReservedIpBlock("myblock", new()
    {
        ProjectId = projectId,
        Metro = "ny",
        Quantity = 2,
    });

    var firstAddressAssignment = new Equinix.Metal.IpAttachment("firstAddressAssignment", new()
    {
        DeviceId = mydevice.Id,
        CidrNotation = Std.Cidrhost.Invoke(new()
        {
            Input = myblockMetalReservedIpBlock.CidrNotation,
            Host = 0,
        }).Apply(invoke => Std.Join.Invoke(new()
        {
            Separator = "/",
            Input = new[]
            {
                invoke.Result,
                "32",
            },
        })).Apply(invoke => invoke.Result),
    });

});
```
```java
package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.equinix.metal.ReservedIpBlock;
import com.pulumi.equinix.metal.ReservedIpBlockArgs;
import com.pulumi.equinix.metal.IpAttachment;
import com.pulumi.equinix.metal.IpAttachmentArgs;
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
        var myblock = new ReservedIpBlock("myblock", ReservedIpBlockArgs.builder()
            .projectId(projectId)
            .metro("ny")
            .quantity(2)
            .build());

        var firstAddressAssignment = new IpAttachment("firstAddressAssignment", IpAttachmentArgs.builder()
            .deviceId(mydevice.id())
            .cidrNotation(StdFunctions.join(JoinArgs.builder()
                .separator("/")
                .input(                
                    StdFunctions.cidrhost(CidrhostArgs.builder()
                        .input(myblockMetalReservedIpBlock.cidrNotation())
                        .host(0)
                        .build()).result(),
                    "32")
                .build()).result())
            .build());

    }
}
```
```yaml
resources:
  # Reserve /30 block of max 2 public IPv4 addresses in metro ny for myproject
  myblock:
    type: equinix:metal:ReservedIpBlock
    properties:
      projectId: ${projectId}
      metro: ny
      quantity: 2
  # Assign /32 subnet (single address) from reserved block to a device
  firstAddressAssignment:
    type: equinix:metal:IpAttachment
    name: first_address_assignment
    properties:
      deviceId: ${mydevice.id}
      cidrNotation:
        fn::invoke:
          Function: std:join
          Arguments:
            separator: /
            input:
              - fn::invoke:
                  Function: std:cidrhost
                  Arguments:
                    input: ${myblockMetalReservedIpBlock.cidrNotation}
                    host: 0
                  Return: result
              - '32'
          Return: result
```
{{% /example %}}
