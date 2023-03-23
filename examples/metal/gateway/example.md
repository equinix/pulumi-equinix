{{< chooser language "typescript,python,go,csharp,java,yaml" / >}}

{{% choosable language "javascript,typescript" %}}

```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix/pulumi-equinix";

const config = new pulumi.Config();
const projectId = config.require("projectId");
const vlanId = config.require("vlanId");
const gateway = new equinix.metal.Gateway("gateway", {
    projectId: projectId,
    vlanId: vlanId,
    privateIpv4SubnetSize: 8,
});
export const gatewayState = gateway.state;
```

{{% /choosable %}}

{{% choosable language python %}}

```python
import pulumi
import pulumi_equinix as equinix

config = pulumi.Config()
project_id = config.require("projectId")
vlan_id = config.require("vlanId")
gateway = equinix.metal.Gateway("gateway",
    project_id=project_id,
    vlan_id=vlan_id,
    private_ipv4_subnet_size=8)
pulumi.export("gatewayState", gateway.state)
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
		projectId := cfg.Require("projectId")
		vlanId := cfg.Require("vlanId")
		gateway, err := metal.NewGateway(ctx, "gateway", &metal.GatewayArgs{
			ProjectId:             pulumi.String(projectId),
			VlanId:                pulumi.String(vlanId),
			PrivateIpv4SubnetSize: pulumi.Int(8),
		})
		if err != nil {
			return err
		}
		ctx.Export("gatewayState", gateway.State)
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
    var projectId = config.Require("projectId");
    var vlanId = config.Require("vlanId");
    var gateway = new Equinix.Metal.Gateway("gateway", new()
    {
        ProjectId = projectId,
        VlanId = vlanId,
        PrivateIpv4SubnetSize = 8,
    });

    return new Dictionary<string, object?>
    {
        ["gatewayState"] = gateway.State,
    };
});
```

{{% /choosable %}}

{{% choosable language java %}}

```java
package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.equinix.metal.Gateway;
import com.pulumi.equinix.metal.GatewayArgs;
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
        final var projectId = config.get("projectId");
        final var vlanId = config.get("vlanId");
        var gateway = new Gateway("gateway", GatewayArgs.builder()        
            .projectId(projectId)
            .vlanId(vlanId)
            .privateIpv4SubnetSize(8)
            .build());

        ctx.export("gatewayState", gateway.state());
    }
}
```

{{% /choosable %}}

{{% choosable language yaml %}}

```yaml
config:
  projectId:
    type: string
  vlanId:
    type: string
resources:
  gateway:
    type: equinix:metal:Gateway
    properties:
      projectId: ${projectId}
      vlanId: ${vlanId}
      privateIpv4SubnetSize: 8
outputs:
  gatewayState: ${gateway.state}
```

{{% /choosable %}}
