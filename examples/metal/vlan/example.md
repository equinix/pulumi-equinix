{{< chooser language "typescript,python,go,csharp,java,yaml" / >}}

{{% choosable language "javascript,typescript" %}}

```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix/pulumi-equinix";

const config = new pulumi.Config();
const projectId = config.require("projectId");
const metro = config.get("metro") || "DA";
const vxlan = config.requireNumber("vxlan");
const vlan = new equinix.metal.Vlan("vlan", {
    description: "VLAN in Dallas",
    projectId: projectId,
    metro: metro,
    vxlan: vxlan,
});
export const vlanId = vlan.id;
```

{{% /choosable %}}

{{% choosable language python %}}

```python
import pulumi
import pulumi_equinix as equinix

config = pulumi.Config()
project_id = config.require("projectId")
metro = config.get("metro")
if metro is None:
    metro = "DA"
vxlan = config.require_int("vxlan")
vlan = equinix.metal.Vlan("vlan",
    description="VLAN in Dallas",
    project_id=project_id,
    metro=metro,
    vxlan=vxlan)
pulumi.export("vlanId", vlan.id)
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
		metro := "DA"
		if param := cfg.Get("metro"); param != "" {
			metro = param
		}
		vxlan := cfg.RequireInt("vxlan")
		vlan, err := metal.NewVlan(ctx, "vlan", &metal.VlanArgs{
			Description: pulumi.String("VLAN in Dallas"),
			ProjectId:   pulumi.String(projectId),
			Metro:       pulumi.String(metro),
			Vxlan:       pulumi.Int(vxlan),
		})
		if err != nil {
			return err
		}
		ctx.Export("vlanId", vlan.ID())
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
    var metro = config.Get("metro") ?? "DA";
    var vxlan = config.RequireNumber("vxlan");
    var vlan = new Equinix.Metal.Vlan("vlan", new()
    {
        Description = "VLAN in Dallas",
        ProjectId = projectId,
        Metro = metro,
        Vxlan = vxlan,
    });

    return new Dictionary<string, object?>
    {
        ["vlanId"] = vlan.Id,
    };
});
```

{{% /choosable %}}

{{% choosable language java %}}

```java
package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.equinix.pulumi.metal.Vlan;
import com.equinix.pulumi.metal.VlanArgs;

public class App {
    public static void main(String[] args) {
        Pulumi.run(App::stack);
    }

    public static void stack(Context ctx) {
        final var config = ctx.config();
        final var projectId = config.get("projectId").get();
        final var metro = config.get("metro").orElse("DA");
        final var vxlan = Integer.parseInt(config.get("vxlan").get());
        var vlan = new Vlan("vlan", VlanArgs.builder()        
            .description("VLAN in Dallas")
            .projectId(projectId)
            .metro(metro)
            .vxlan(vxlan)
            .build());

        ctx.export("vlanId", vlan.id());
    }
}
```

{{% /choosable %}}

{{% choosable language yaml %}}

```yaml
config:
  projectId:
    type: string
  metro:
    type: string
    default: DA
  vxlan:
    type: integer
resources:
  vlan:
    type: equinix:metal:Vlan
    properties:
      description: VLAN in Dallas
      projectId: ${projectId}
      metro: ${metro}
      vxlan: ${vxlan}
outputs:
  vlanId: ${vlan.id}
```

{{% /choosable %}}
