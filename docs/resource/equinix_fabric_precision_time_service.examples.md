## Example Usage
{{% example %}}
```typescript
import * as pulumi from "@pulumi/pulumi";

export const eptServiceId = ptp.id;
export const eptServiceName = ptp.name;
export const eptServiceState = ptp.state;
export const eptServiceType = ptp.type;
export const eptServiceConnection = ptp.connections;
export const eptServiceIpv4 = ptp.ipv4;
```
```python
import pulumi

pulumi.export("eptServiceId", ptp["id"])
pulumi.export("eptServiceName", ptp["name"])
pulumi.export("eptServiceState", ptp["state"])
pulumi.export("eptServiceType", ptp["type"])
pulumi.export("eptServiceConnection", ptp["connections"])
pulumi.export("eptServiceIpv4", ptp["ipv4"])
```
```go
package main

import (
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		ctx.Export("eptServiceId", ptp.Id)
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

return await Deployment.RunAsync(() => 
{
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
    type: equinix:fabricPrecisionTimeService
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
