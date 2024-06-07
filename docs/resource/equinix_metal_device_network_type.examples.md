## Example Usage
{{% example %}}
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
```csharp
using System.Collections.Generic;
using System.Linq;
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
```java
package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.equinix.metal.DeviceNetworkType;
import com.pulumi.equinix.metal.DeviceNetworkTypeArgs;
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
        final var deviceId = config.get("deviceId");
        final var networkType = config.get("networkType").orElse("hybrid");
        var deviceNetwork = new DeviceNetworkType("deviceNetwork", DeviceNetworkTypeArgs.builder()        
            .deviceId(deviceId)
            .type(networkType)
            .build());

        ctx.export("deviceNetworkId", deviceNetwork.id());
    }
}
```
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
{{% /example %}}
