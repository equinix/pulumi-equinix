## Example Usage
{{% example %}}
```typescript
import * as pulumi from "@pulumi/pulumi";

const config = new pulumi.Config();
const deviceId = config.require("deviceId");
const networkType = config.get("networkType") || "hybrid";
export const deviceNetworkId = deviceNetwork.id;
```
```python
import pulumi

config = pulumi.Config()
device_id = config.require("deviceId")
network_type = config.get("networkType")
if network_type is None:
    network_type = "hybrid"
pulumi.export("deviceNetworkId", device_network["id"])
```
```go
package main

import (
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
		ctx.Export("deviceNetworkId", deviceNetwork.Id)
		return nil
	})
}
```
```csharp
using System.Collections.Generic;
using System.Linq;
using Pulumi;

return await Deployment.RunAsync(() => 
{
    var config = new Config();
    var deviceId = config.Require("deviceId");
    var networkType = config.Get("networkType") ?? "hybrid";
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
