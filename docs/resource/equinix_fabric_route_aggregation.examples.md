## Example Usage
{{% example %}}
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const newRa = new equinix.fabric.RouteAggregation("new-ra", {
    type: "BGP_IPv4_PREFIX_AGGREGATION",
    name: "new-ra",
    description: "Test aggregation",
    project: {
        projectId: "776847000642406",
    },
});
```
```python
import pulumi
import pulumi_equinix as equinix

new_ra = equinix.fabric.RouteAggregation("new-ra",
    type="BGP_IPv4_PREFIX_AGGREGATION",
    name="new-ra",
    description="Test aggregation",
    project={
        "project_id": "776847000642406",
    })
```
```go
package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/fabric"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		_, err := fabric.NewRouteAggregation(ctx, "new-ra", &fabric.RouteAggregationArgs{
			Type:        pulumi.String("BGP_IPv4_PREFIX_AGGREGATION"),
			Name:        pulumi.String("new-ra"),
			Description: pulumi.String("Test aggregation"),
			Project: &fabric.RouteAggregationProjectArgs{
				ProjectId: pulumi.String("776847000642406"),
			},
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
    var newRa = new Equinix.Fabric.RouteAggregation("new-ra", new()
    {
        Type = "BGP_IPv4_PREFIX_AGGREGATION",
        Name = "new-ra",
        Description = "Test aggregation",
        Project = new Equinix.Fabric.Inputs.RouteAggregationProjectArgs
        {
            ProjectId = "776847000642406",
        },
    });

});
```
```java
package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.equinix.fabric.RouteAggregation;
import com.pulumi.equinix.fabric.RouteAggregationArgs;
import com.pulumi.equinix.fabric.inputs.RouteAggregationProjectArgs;
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
        var newRa = new RouteAggregation("newRa", RouteAggregationArgs.builder()
            .type("BGP_IPv4_PREFIX_AGGREGATION")
            .name("new-ra")
            .description("Test aggregation")
            .project(RouteAggregationProjectArgs.builder()
                .projectId("776847000642406")
                .build())
            .build());

    }
}
```
```yaml
resources:
  new-ra:
    type: equinix:fabric:RouteAggregation
    properties:
      type: BGP_IPv4_PREFIX_AGGREGATION
      name: new-ra
      description: Test aggregation
      project:
        projectId: '776847000642406'
```
{{% /example %}}
