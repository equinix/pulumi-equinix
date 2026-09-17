## Example Usage
{{% example %}}
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const ptp = new equinix.fabric.PrecisionTimeService("ptp", {
    type: "PTP",
    name: "tf_acc_eptptp_PFCR",
    "package": {
        code: "PTP_STANDARD",
    },
    connections: [{
        uuid: "<connection_id>",
    }],
    ipv4: {
        primary: "191.168.254.241",
        secondary: "191.168.254.242",
        networkMask: "255.255.255.240",
        defaultGateway: "191.168.254.254",
    },
});
export const eptServiceId = ptp.id;
export const eptServiceName = ptp.name;
export const eptServiceState = ptp.state;
export const eptServiceType = ptp.type;
export const eptServiceConnection = ptp.connections;
export const eptServiceIpv4 = ptp.ipv4;
```
```python
import pulumi
import pulumi_equinix as equinix

ptp = equinix.fabric.PrecisionTimeService("ptp",
    type="PTP",
    name="tf_acc_eptptp_PFCR",
    package={
        "code": "PTP_STANDARD",
    },
    connections=[{
        "uuid": "<connection_id>",
    }],
    ipv4={
        "primary": "191.168.254.241",
        "secondary": "191.168.254.242",
        "network_mask": "255.255.255.240",
        "default_gateway": "191.168.254.254",
    })
pulumi.export("eptServiceId", ptp.id)
pulumi.export("eptServiceName", ptp.name)
pulumi.export("eptServiceState", ptp.state)
pulumi.export("eptServiceType", ptp.type)
pulumi.export("eptServiceConnection", ptp.connections)
pulumi.export("eptServiceIpv4", ptp.ipv4)
```
```go
package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/fabric"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		ptp, err := fabric.NewPrecisionTimeService(ctx, "ptp", &fabric.PrecisionTimeServiceArgs{
			Type: pulumi.String("PTP"),
			Name: pulumi.String("tf_acc_eptptp_PFCR"),
			Package: &fabric.PrecisionTimeServicePackageArgs{
				Code: pulumi.String("PTP_STANDARD"),
			},
			Connections: fabric.PrecisionTimeServiceConnectionArray{
				&fabric.PrecisionTimeServiceConnectionArgs{
					Uuid: pulumi.String("<connection_id>"),
				},
			},
			Ipv4: &fabric.PrecisionTimeServiceIpv4Args{
				Primary:        pulumi.String("191.168.254.241"),
				Secondary:      pulumi.String("191.168.254.242"),
				NetworkMask:    pulumi.String("255.255.255.240"),
				DefaultGateway: pulumi.String("191.168.254.254"),
			},
		})
		if err != nil {
			return err
		}
		ctx.Export("eptServiceId", ptp.ID())
		ctx.Export("eptServiceName", ptp.Name)
		ctx.Export("eptServiceState", ptp.State)
		ctx.Export("eptServiceType", ptp.Type)
		ctx.Export("eptServiceConnection", ptp.Connections)
		ctx.Export("eptServiceIpv4", ptp.Ipv4)
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
    var ptp = new Equinix.Fabric.PrecisionTimeService("ptp", new()
    {
        Type = "PTP",
        Name = "tf_acc_eptptp_PFCR",
        Package = new Equinix.Fabric.Inputs.PrecisionTimeServicePackageArgs
        {
            Code = "PTP_STANDARD",
        },
        Connections = new[]
        {
            new Equinix.Fabric.Inputs.PrecisionTimeServiceConnectionArgs
            {
                Uuid = "<connection_id>",
            },
        },
        Ipv4 = new Equinix.Fabric.Inputs.PrecisionTimeServiceIpv4Args
        {
            Primary = "191.168.254.241",
            Secondary = "191.168.254.242",
            NetworkMask = "255.255.255.240",
            DefaultGateway = "191.168.254.254",
        },
    });

    return new Dictionary<string, object?>
    {
        ["eptServiceId"] = ptp.Id,
        ["eptServiceName"] = ptp.Name,
        ["eptServiceState"] = ptp.State,
        ["eptServiceType"] = ptp.Type,
        ["eptServiceConnection"] = ptp.Connections,
        ["eptServiceIpv4"] = ptp.Ipv4,
    };
});
```
```java
package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.equinix.fabric.PrecisionTimeService;
import com.pulumi.equinix.fabric.PrecisionTimeServiceArgs;
import com.pulumi.equinix.fabric.inputs.PrecisionTimeServicePackageArgs;
import com.pulumi.equinix.fabric.inputs.PrecisionTimeServiceConnectionArgs;
import com.pulumi.equinix.fabric.inputs.PrecisionTimeServiceIpv4Args;
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
        var ptp = new PrecisionTimeService("ptp", PrecisionTimeServiceArgs.builder()
            .type("PTP")
            .name("tf_acc_eptptp_PFCR")
            .package_(PrecisionTimeServicePackageArgs.builder()
                .code("PTP_STANDARD")
                .build())
            .connections(PrecisionTimeServiceConnectionArgs.builder()
                .uuid("<connection_id>")
                .build())
            .ipv4(PrecisionTimeServiceIpv4Args.builder()
                .primary("191.168.254.241")
                .secondary("191.168.254.242")
                .networkMask("255.255.255.240")
                .defaultGateway("191.168.254.254")
                .build())
            .build());

        ctx.export("eptServiceId", ptp.id());
        ctx.export("eptServiceName", ptp.name());
        ctx.export("eptServiceState", ptp.state());
        ctx.export("eptServiceType", ptp.type());
        ctx.export("eptServiceConnection", ptp.connections());
        ctx.export("eptServiceIpv4", ptp.ipv4());
    }
}
```
```yaml
resources:
  ptp:
    type: equinix:fabric:PrecisionTimeService
    properties:
      type: PTP
      name: tf_acc_eptptp_PFCR
      package:
        code: PTP_STANDARD
      connections:
        - uuid: <connection_id>
      ipv4:
        primary: 191.168.254.241
        secondary: 191.168.254.242
        networkMask: 255.255.255.240
        defaultGateway: 191.168.254.254
outputs:
  eptServiceId: ${ptp.id}
  eptServiceName: ${ptp.name}
  eptServiceState: ${ptp.state}
  eptServiceType: ${ptp.type}
  eptServiceConnection: ${ptp.connections}
  eptServiceIpv4: ${ptp.ipv4}
```
{{% /example %}}
