## Example Usage
{{% example %}}
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const config = new pulumi.Config();
const connectionId = config.require("connectionId");
const routingProtocol = new equinix.fabric.RoutingProtocol("RoutingProtocol", {
    connectionUuid: connectionId,
    name: "My-Direct-route-1",
    type: "DIRECT",
    directIpv4: {
        equinixIfaceIp: "192.168.100.1/30",
    },
});
export const routingProtocolId = routingProtocol.id;
export const routingProtocolState = routingProtocol.state;
export const routingProtocolEquinixAsn = routingProtocol.equinixAsn;
```
```python
import pulumi
import pulumi_equinix as equinix

config = pulumi.Config()
connection_id = config.require("connectionId")
routing_protocol = equinix.fabric.RoutingProtocol("RoutingProtocol",
    connection_uuid=connection_id,
    name="My-Direct-route-1",
    type="DIRECT",
    direct_ipv4=equinix.fabric.RoutingProtocolDirectIpv4Args(
        equinix_iface_ip="192.168.100.1/30",
    ))
pulumi.export("routingProtocolId", routing_protocol.id)
pulumi.export("routingProtocolState", routing_protocol.state)
pulumi.export("routingProtocolEquinixAsn", routing_protocol.equinix_asn)
```
```go
package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/fabric"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		cfg := config.New(ctx, "")
		connectionId := cfg.Require("connectionId")
		routingProtocol, err := fabric.NewRoutingProtocol(ctx, "RoutingProtocol", &fabric.RoutingProtocolArgs{
			ConnectionUuid: pulumi.String(connectionId),
			Name:           pulumi.String("My-Direct-route-1"),
			Type:           pulumi.String("DIRECT"),
			DirectIpv4: &fabric.RoutingProtocolDirectIpv4Args{
				EquinixIfaceIp: pulumi.String("192.168.100.1/30"),
			},
		})
		if err != nil {
			return err
		}
		ctx.Export("routingProtocolId", routingProtocol.ID())
		ctx.Export("routingProtocolState", routingProtocol.State)
		ctx.Export("routingProtocolEquinixAsn", routingProtocol.EquinixAsn)
		return nil
	})
}
```
```csharp
using System.Collections.Generic;
using System.Linq;
using Pulumi;
using Equinix = Pulumi.Equinix;

return await Deployment.RunAsync(() => 
{
    var config = new Config();
    var connectionId = config.Require("connectionId");
    var routingProtocol = new Equinix.Fabric.RoutingProtocol("RoutingProtocol", new()
    {
        ConnectionUuid = connectionId,
        Name = "My-Direct-route-1",
        Type = "DIRECT",
        DirectIpv4 = new Equinix.Fabric.Inputs.RoutingProtocolDirectIpv4Args
        {
            EquinixIfaceIp = "192.168.100.1/30",
        },
    });

    return new Dictionary<string, object?>
    {
        ["routingProtocolId"] = routingProtocol.Id,
        ["routingProtocolState"] = routingProtocol.State,
        ["routingProtocolEquinixAsn"] = routingProtocol.EquinixAsn,
    };
});
```
```java
package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.equinix.fabric.RoutingProtocol;
import com.pulumi.equinix.fabric.RoutingProtocolArgs;
import com.pulumi.equinix.fabric.inputs.RoutingProtocolDirectIpv4Args;
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
        final var config = ctx.config();
        final var connectionId = config.get("connectionId");
        var routingProtocol = new RoutingProtocol("routingProtocol", RoutingProtocolArgs.builder()
            .connectionUuid(connectionId)
            .name("My-Direct-route-1")
            .type("DIRECT")
            .directIpv4(RoutingProtocolDirectIpv4Args.builder()
                .equinixIfaceIp("192.168.100.1/30")
                .build())
            .build());

        ctx.export("routingProtocolId", routingProtocol.id());
        ctx.export("routingProtocolState", routingProtocol.state());
        ctx.export("routingProtocolEquinixAsn", routingProtocol.equinixAsn());
    }
}
```
```yaml
config:
  connectionId:
    type: string
resources:
  RoutingProtocol:
    type: equinix:fabric:RoutingProtocol
    properties:
      connectionUuid: ${connectionId}
      name: My-Direct-route-1
      type: DIRECT
      directIpv4:
        equinixIfaceIp: 192.168.100.1/30
outputs:
  routingProtocolId: ${RoutingProtocol.id}
  routingProtocolState: ${RoutingProtocol.state}
  routingProtocolEquinixAsn: ${RoutingProtocol.equinixAsn}
```
{{% /example %}}
