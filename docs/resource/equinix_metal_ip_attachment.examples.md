## Example Usage
{{% example %}}

```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const config = new pulumi.Config();
const deviceId = config.require("deviceId");
const subnetCidr = config.get("subnetCidr") || "147.229.10.152/31";
const ipAttachResource = new equinix.metal.IpAttachment("ipAttach", {
    deviceId: deviceId,
    cidrNotation: subnetCidr,
});
export const ipAttach = ipAttachResource.id;
export const ipNetmask = ipAttachResource.netmask;
```
```python
import pulumi
import pulumi_equinix as equinix

config = pulumi.Config()
device_id = config.require("deviceId")
subnet_cidr = config.get("subnetCidr")
if subnet_cidr is None:
    subnet_cidr = "147.229.10.152/31"
ip_attach_resource = equinix.metal.IpAttachment("ipAttach",
    device_id=device_id,
    cidr_notation=subnet_cidr)
pulumi.export("ipAttach", ip_attach_resource.id)
pulumi.export("ipNetmask", ip_attach_resource.netmask)
```
```go
package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/metal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		cfg := config.New(ctx, "")
		deviceId := cfg.Require("deviceId")
		subnetCidr := "147.229.10.152/31"
		if param := cfg.Get("subnetCidr"); param != "" {
			subnetCidr = param
		}
		ipAttachResource, err := metal.NewIpAttachment(ctx, "ipAttach", &metal.IpAttachmentArgs{
			DeviceId:     pulumi.String(deviceId),
			CidrNotation: pulumi.String(subnetCidr),
		})
		if err != nil {
			return err
		}
		ctx.Export("ipAttach", ipAttachResource.ID())
		ctx.Export("ipNetmask", ipAttachResource.Netmask)
		return nil
	})
}
```
```csharp
using System.Collections.Generic;
using Pulumi;
using Equinix = Pulumi.Equinix;

return await Deployment.RunAsync(() => 
{
    var config = new Config();
    var deviceId = config.Require("deviceId");
    var subnetCidr = config.Get("subnetCidr") ?? "147.229.10.152/31";
    var ipAttachResource = new Equinix.Metal.IpAttachment("ipAttach", new()
    {
        DeviceId = deviceId,
        CidrNotation = subnetCidr,
    });

    return new Dictionary<string, object?>
    {
        ["ipAttach"] = ipAttachResource.Id,
        ["ipNetmask"] = ipAttachResource.Netmask,
    };
});
```
```java
package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.equinix.pulumi.metal.IpAttachment;
import com.equinix.pulumi.metal.IpAttachmentArgs;

public class App {
    public static void main(String[] args) {
        Pulumi.run(App::stack);
    }

    public static void stack(Context ctx) {
        final var config = ctx.config();
        final var deviceId = config.get("deviceId").get();
        final var subnetCidr = config.get("subnetCidr").orElse("147.229.10.152/31");
        var ipAttachResource = new IpAttachment("ipAttachResource", IpAttachmentArgs.builder()        
            .deviceId(deviceId)
            .cidrNotation(subnetCidr)
            .build());

        ctx.export("ipAttach", ipAttachResource.id());
        ctx.export("ipNetmask", ipAttachResource.netmask());
    }
}
```
```yaml
config:
  deviceId:
    type: string
  subnetCidr:
    type: string
    default: 147.229.10.152/31
resources:
  ipAttach:
    type: equinix:metal:IpAttachment
    properties:
      deviceId: ${deviceId}
      cidrNotation: ${subnetCidr}
outputs:
  ipAttach: ${ipAttach.id}
  ipNetmask: ${ipAttach.netmask}
```
{{% /example %}}
