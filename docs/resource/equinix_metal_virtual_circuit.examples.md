## Example Usage
{{% example %}}

```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const config = new pulumi.Config();
const projectId = config.require("projectId");
const connectionId = config.require("connectionId");
const vlanId = config.require("vlanId");
const portId = equinix.metal.getInterconnection({
    connectionId: connectionId,
}).then(invoke => invoke.ports?.[0]?.id);
const vc = new equinix.metal.VirtualCircuit("vc", {
    connectionId: connectionId,
    projectId: projectId,
    portId: portId,
    vlanId: vlanId,
    nniVlan: 1056,
});
export const vcStatus = vc.status;
export const vcVnid = vc.vnid;
```
```python
import pulumi
import pulumi_equinix as equinix

config = pulumi.Config()
project_id = config.require("projectId")
connection_id = config.require("connectionId")
vlan_id = config.require("vlanId")
port_id = equinix.metal.get_interconnection(connection_id=connection_id).ports[0].id
vc = equinix.metal.VirtualCircuit("vc",
    connection_id=connection_id,
    project_id=project_id,
    port_id=port_id,
    vlan_id=vlan_id,
    nni_vlan=1056)
pulumi.export("vcStatus", vc.status)
pulumi.export("vcVnid", vc.vnid)
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
		projectId := cfg.Require("projectId")
		connectionId := cfg.Require("connectionId")
		vlanId := cfg.Require("vlanId")
		portId := metal.LookupInterconnection(ctx, &metal.LookupInterconnectionArgs{
			ConnectionId: connectionId,
		}, nil).Ports[0].Id
		vc, err := metal.NewVirtualCircuit(ctx, "vc", &metal.VirtualCircuitArgs{
			ConnectionId: pulumi.String(connectionId),
			ProjectId:    pulumi.String(projectId),
			PortId:       *pulumi.String(portId),
			VlanId:       pulumi.String(vlanId),
			NniVlan:      pulumi.Int(1056),
		})
		if err != nil {
			return err
		}
		ctx.Export("vcStatus", vc.Status)
		ctx.Export("vcVnid", vc.Vnid)
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
    var projectId = config.Require("projectId");
    var connectionId = config.Require("connectionId");
    var vlanId = config.Require("vlanId");
    var portId = Equinix.Metal.GetInterconnection.Invoke(new()
    {
        ConnectionId = connectionId,
    }).Apply(invoke => invoke.Ports[0]?.Id);

    var vc = new Equinix.Metal.VirtualCircuit("vc", new()
    {
        ConnectionId = connectionId,
        ProjectId = projectId,
        PortId = portId,
        VlanId = vlanId,
        NniVlan = 1056,
    });

    return new Dictionary<string, object?>
    {
        ["vcStatus"] = vc.Status,
        ["vcVnid"] = vc.Vnid,
    };
});
```
```java
package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.equinix.pulumi.metal.inputs.GetInterconnectionArgs;
import com.equinix.pulumi.metal.MetalFunctions;
import com.equinix.pulumi.metal.VirtualCircuit;
import com.equinix.pulumi.metal.VirtualCircuitArgs;

public class App {
    public static void main(String[] args) {
        Pulumi.run(App::stack);
    }

    public static void stack(Context ctx) {
        final var config = ctx.config();
        final var projectId = config.get("projectId").get();
        final var connectionId = config.get("connectionId").get();
        final var vlanId = config.get("vlanId").get();
        final var portId = MetalFunctions.getInterconnection(GetInterconnectionArgs.builder()
            .connectionId(connectionId)
            .build()).applyValue(data -> data.ports().get(0).id());

        var vc = new VirtualCircuit("vc", VirtualCircuitArgs.builder()        
            .connectionId(connectionId)
            .projectId(projectId)
            .portId(portId)
            .vlanId(vlanId)
            .nniVlan(1056)
            .build());

        ctx.export("vcStatus", vc.status());
        ctx.export("vcVnid", vc.vnid());
    }
}
```
```yaml
config:
  projectId:
    type: string
  connectionId:
    type: string
  vlanId:
    type: string
variables:
  portId:
    fn::invoke:
      function: equinix:metal:getInterconnection
      arguments:
        connectionId: ${connectionId}
      return: ports[0].id
resources:
  vc:
    type: equinix:metal:VirtualCircuit
    properties:
      connectionId: ${connectionId}
      projectId: ${projectId}
      portId: ${portId}
      vlanId: ${vlanId}
      nniVlan: 1056
outputs:
  vcStatus: ${vc.status}
  vcVnid: ${vc.vnid}
```
{{% /example %}}
