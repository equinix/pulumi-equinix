## Example Usage
{{% example %}}
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const config = new pulumi.Config();
const projectId = config.require("projectId");
const metro = config.get("metro") || "DA";
const vrf = new equinix.metal.Vrf("vrf", {
    description: "VRF with ASN 65000 and a pool of address space",
    name: "example-vrf",
    metro: metro,
    localAsn: 65000,
    ipRanges: [
        "192.168.100.0/25",
        "192.168.200.0/25",
    ],
    projectId: projectId,
});
export const vrfId = vrf.id;
```
```python
import pulumi
import pulumi_equinix as equinix

config = pulumi.Config()
project_id = config.require("projectId")
metro = config.get("metro")
if metro is None:
    metro = "DA"
vrf = equinix.metal.Vrf("vrf",
    description="VRF with ASN 65000 and a pool of address space",
    name="example-vrf",
    metro=metro,
    local_asn=65000,
    ip_ranges=[
        "192.168.100.0/25",
        "192.168.200.0/25",
    ],
    project_id=project_id)
pulumi.export("vrfId", vrf.id)
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
		metro := "DA"
		if param := cfg.Get("metro"); param != "" {
			metro = param
		}
		vrf, err := metal.NewVrf(ctx, "vrf", &metal.VrfArgs{
			Description: pulumi.String("VRF with ASN 65000 and a pool of address space"),
			Name:        pulumi.String("example-vrf"),
			Metro:       pulumi.String(metro),
			LocalAsn:    pulumi.Int(65000),
			IpRanges: pulumi.StringArray{
				pulumi.String("192.168.100.0/25"),
				pulumi.String("192.168.200.0/25"),
			},
			ProjectId: pulumi.String(projectId),
		})
		if err != nil {
			return err
		}
		ctx.Export("vrfId", vrf.ID())
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
    var projectId = config.Require("projectId");
    var metro = config.Get("metro") ?? "DA";
    var vrf = new Equinix.Metal.Vrf("vrf", new()
    {
        Description = "VRF with ASN 65000 and a pool of address space",
        Name = "example-vrf",
        Metro = metro,
        LocalAsn = 65000,
        IpRanges = new[]
        {
            "192.168.100.0/25",
            "192.168.200.0/25",
        },
        ProjectId = projectId,
    });

    return new Dictionary<string, object?>
    {
        ["vrfId"] = vrf.Id,
    };
});
```
```java
package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.equinix.metal.Vrf;
import com.pulumi.equinix.metal.VrfArgs;
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
        final var metro = config.get("metro").orElse("DA");
        var vrf = new Vrf("vrf", VrfArgs.builder()        
            .description("VRF with ASN 65000 and a pool of address space")
            .name("example-vrf")
            .metro(metro)
            .localAsn(65000)
            .ipRanges(            
                "192.168.100.0/25",
                "192.168.200.0/25")
            .projectId(projectId)
            .build());

        ctx.export("vrfId", vrf.id());
    }
}
```
```yaml
config:
  projectId:
    type: string
  metro:
    type: string
    default: DA
resources:
  vrf:
    type: equinix:metal:Vrf
    properties:
      description: VRF with ASN 65000 and a pool of address space
      name: example-vrf
      metro: ${metro}
      localAsn: 65000
      ipRanges:
      - 192.168.100.0/25
      - 192.168.200.0/25
      projectId: ${projectId}
outputs:
  vrfId: ${vrf.id}
```
{{% /example %}}
