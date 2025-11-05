## Example Usage
{{% example %}}
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const vlan1 = new equinix.metal.Vlan("vlan1", {
    description: "VLAN in New Jersey",
    metro: "sv",
    projectId: projectId,
    vxlan: 1040,
});
```
```python
import pulumi
import pulumi_equinix as equinix

vlan1 = equinix.metal.Vlan("vlan1",
    description="VLAN in New Jersey",
    metro="sv",
    project_id=project_id,
    vxlan=1040)
```
```go
package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/metal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		_, err := metal.NewVlan(ctx, "vlan1", &metal.VlanArgs{
			Description: pulumi.String("VLAN in New Jersey"),
			Metro:       pulumi.String("sv"),
			ProjectId:   pulumi.Any(projectId),
			Vxlan:       pulumi.Int(1040),
		})
		if err != nil {
			return err
		}
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
    var vlan1 = new Equinix.Metal.Vlan("vlan1", new()
    {
        Description = "VLAN in New Jersey",
        Metro = "sv",
        ProjectId = projectId,
        Vxlan = 1040,
    });

});
```
```java
package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.equinix.pulumi.equinix.metal.Vlan;
import com.equinix.pulumi.equinix.metal.VlanArgs;
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
        var vlan1 = new Vlan("vlan1", VlanArgs.builder()
            .description("VLAN in New Jersey")
            .metro("sv")
            .projectId(projectId)
            .vxlan(1040)
            .build());

    }
}
```
```yaml
resources:
  # Create a new VLAN in metro "esv"
  vlan1:
    type: equinix:metal:Vlan
    properties:
      description: VLAN in New Jersey
      metro: sv
      projectId: ${projectId}
      vxlan: 1040
```
{{% /example %}}
