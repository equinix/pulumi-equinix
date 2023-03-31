{{< chooser language "typescript,python,go,csharp,java,yaml" / >}}

{{% choosable language "javascript,typescript" %}}

```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const config = new pulumi.Config();
const deviceId = config.require("deviceId");
const networkType = config.get("networkType") || "hybrid";
const deviceNetwork = new equinix.metal.DeviceNetworkType("deviceNetwork", {
    deviceId: deviceId,
    type: networkType,
});
export const deviceNetworkId = deviceNetwork.id;
```

{{% /choosable %}}

{{% choosable language python %}}

```python
import pulumi
import pulumi_equinix as equinix

config = pulumi.Config()
device_id = config.require("deviceId")
network_type = config.get("networkType")
if network_type is None:
    network_type = "hybrid"
device_network = equinix.metal.DeviceNetworkType("deviceNetwork",
    device_id=device_id,
    type=network_type)
pulumi.export("deviceNetworkId", device_network.id)
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
		networkType := "hybrid"
		if param := cfg.Get("networkType"); param != "" {
			networkType = param
		}
		deviceNetwork, err := metal.NewDeviceNetworkType(ctx, "deviceNetwork", &metal.DeviceNetworkTypeArgs{
			DeviceId: pulumi.String(deviceId),
			Type:     pulumi.String(networkType),
		})
		if err != nil {
			return err
		}
		ctx.Export("deviceNetworkId", deviceNetwork.ID())
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
    var networkType = config.Get("networkType") ?? "hybrid";
    var deviceNetwork = new Equinix.Metal.DeviceNetworkType("deviceNetwork", new()
    {
        DeviceId = deviceId,
        Type = networkType,
    });

    return new Dictionary<string, object?>
    {
        ["deviceNetworkId"] = deviceNetwork.Id,
    };
});
```

{{% /choosable %}}

{{% choosable language java %}}

```java
package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.equinix.pulumi.metal.DeviceNetworkType;
import com.equinix.pulumi.metal.DeviceNetworkTypeArgs;

public class App {
    public static void main(String[] args) {
        Pulumi.run(App::stack);
    }

    public static void stack(Context ctx) {
        final var config = ctx.config();
        final var deviceId = config.get("deviceId").get();
        final var networkType = config.get("networkType").orElse("hybrid");
        var deviceNetwork = new DeviceNetworkType("deviceNetwork", DeviceNetworkTypeArgs.builder()        
            .deviceId(deviceId)
            .type(networkType)
            .build());

        ctx.export("deviceNetworkId", deviceNetwork.id());
    }
}
```

{{% /choosable %}}

{{% choosable language yaml %}}

```yaml
config:
  deviceId:
    type: string
  networkType:
    type: string
    default: hybrid
resources:
  deviceNetwork:
    type: equinix:metal:DeviceNetworkType
    properties:
      deviceId: ${deviceId}
      type: ${networkType}
outputs:
  deviceNetworkId: ${deviceNetwork.id}
```

{{% /choosable %}}
