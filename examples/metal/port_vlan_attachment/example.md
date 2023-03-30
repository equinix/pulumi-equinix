{{< chooser language "typescript,python,go,csharp,java,yaml" / >}}

{{% choosable language "javascript,typescript" %}}

```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix/pulumi-equinix";

const config = new pulumi.Config();
const deviceId = config.require("deviceId");
const portName = config.get("portName") || "eth1";
const vxlanId = config.getNumber("vxlanId") || 1004;
const attach = new equinix.metal.PortVlanAttachment("attach", {
    deviceId: deviceId,
    portName: portName,
    vlanVnid: vxlanId,
});
export const attachId = attach.id;
export const portId = attach.portId;
```

{{% /choosable %}}

{{% choosable language python %}}

```python
import pulumi
import pulumi_equinix as equinix

config = pulumi.Config()
device_id = config.require("deviceId")
port_name = config.get("portName")
if port_name is None:
    port_name = "eth1"
vxlan_id = config.get_int("vxlanId")
if vxlan_id is None:
    vxlan_id = 1004
attach = equinix.metal.PortVlanAttachment("attach",
    device_id=device_id,
    port_name=port_name,
    vlan_vnid=vxlan_id)
pulumi.export("attachId", attach.id)
pulumi.export("portId", attach.port_id)
```

{{% /choosable %}}

{{% choosable language go %}}

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
		portName := "eth1"
		if param := cfg.Get("portName"); param != "" {
			portName = param
		}
		vxlanId := 1004
		if param := cfg.GetInt("vxlanId"); param != 0 {
			vxlanId = param
		}
		attach, err := metal.NewPortVlanAttachment(ctx, "attach", &metal.PortVlanAttachmentArgs{
			DeviceId: pulumi.String(deviceId),
			PortName: pulumi.String(portName),
			VlanVnid: pulumi.Int(vxlanId),
		})
		if err != nil {
			return err
		}
		ctx.Export("attachId", attach.ID())
		ctx.Export("portId", attach.PortId)
		return nil
	})
}
```

{{% /choosable %}}

{{% choosable language csharp %}}

```csharp
using System.Collections.Generic;
using Pulumi;
using Equinix = Pulumi.Equinix;

return await Deployment.RunAsync(() => 
{
    var config = new Config();
    var deviceId = config.Require("deviceId");
    var portName = config.Get("portName") ?? "eth1";
    var vxlanId = config.GetNumber("vxlanId") ?? 1004;
    var attach = new Equinix.Metal.PortVlanAttachment("attach", new()
    {
        DeviceId = deviceId,
        PortName = portName,
        VlanVnid = vxlanId,
    });

    return new Dictionary<string, object?>
    {
        ["attachId"] = attach.Id,
        ["portId"] = attach.PortId,
    };
});
```

{{% /choosable %}}

{{% choosable language java %}}

```java
package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.equinix.pulumi.metal.PortVlanAttachment;
import com.equinix.pulumi.metal.PortVlanAttachmentArgs;

public class App {
    public static void main(String[] args) {
        Pulumi.run(App::stack);
    }

    public static void stack(Context ctx) {
        final var config = ctx.config();
        final var deviceId = config.get("deviceId").get();
        final var portName = config.get("portName").orElse("eth1");
        final var vxlanId = Integer.parseInt(config.get("vxlanId").orElse("1004"));

        var attach = new PortVlanAttachment("attach", PortVlanAttachmentArgs.builder()        
            .deviceId(deviceId)
            .portName(portName)
            .vlanVnid(vxlanId)
            .build());

        ctx.export("attachId", attach.id());
        ctx.export("portId", attach.portId());
    }
}
```

{{% /choosable %}}

{{% choosable language yaml %}}

```yaml
config:
  deviceId:
    type: string
  portName:
    type: string
    default: eth1
  vxlanId:
    type: integer
    default: 1004
resources:
  attach:
    type: equinix:metal:PortVlanAttachment
    properties:
      deviceId: ${deviceId}
      portName: ${portName}
      vlanVnid: ${vxlanId}
outputs:
  attachId: ${attach.id}
  portId: ${attach.portId}
```

{{% /choosable %}}
