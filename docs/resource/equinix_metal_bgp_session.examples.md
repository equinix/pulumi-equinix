## Example Usage
{{% example %}}

```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const config = new pulumi.Config();
const deviceId = config.require("deviceId");
const bgp = new equinix.metal.BgpSession("bgp", {
    deviceId: deviceId,
    addressFamily: "ipv4",
});
export const bgpSessionStatus = bgp.status;
```
```python
import pulumi
import pulumi_equinix as equinix

config = pulumi.Config()
device_id = config.require("deviceId")
bgp = equinix.metal.BgpSession("bgp",
    device_id=device_id,
    address_family="ipv4")
pulumi.export("bgpSessionStatus", bgp.status)
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
		bgp, err := metal.NewBgpSession(ctx, "bgp", &metal.BgpSessionArgs{
			DeviceId:      pulumi.String(deviceId),
			AddressFamily: pulumi.String("ipv4"),
		})
		if err != nil {
			return err
		}
		ctx.Export("bgpSessionStatus", bgp.Status)
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
    var bgp = new Equinix.Metal.BgpSession("bgp", new()
    {
        DeviceId = deviceId,
        AddressFamily = "ipv4",
    });

    return new Dictionary<string, object?>
    {
        ["bgpSessionStatus"] = bgp.Status,
    };
});
```
```java
package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.equinix.pulumi.metal.BgpSession;
import com.equinix.pulumi.metal.BgpSessionArgs;

public class App {
    public static void main(String[] args) {
        Pulumi.run(App::stack);
    }

    public static void stack(Context ctx) {
        final var config = ctx.config();
        final var deviceId = config.get("deviceId").get();
        var bgp = new BgpSession("bgp", BgpSessionArgs.builder()        
            .deviceId(deviceId)
            .addressFamily("ipv4")
            .build());

        ctx.export("bgpSessionStatus", bgp.status());
    }
}
```
```yaml
config:
  deviceId:
    type: string
resources:
  bgp:
    type: equinix:metal:BgpSession
    properties:
      deviceId: ${deviceId}
      addressFamily: ipv4
outputs:
  bgpSessionStatus: ${bgp.status}
```{{% /example %}}

