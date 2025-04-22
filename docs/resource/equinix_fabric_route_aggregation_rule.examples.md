## Example Usage
{{% example %}}
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const raRule = new equinix.fabric.RouteAggregationRule("raRule", {
    routeAggregationId: "<route_aggregation_id>",
    name: "ra-rule-test",
    description: "Route aggregation rule",
    prefix: "192.168.0.0/24",
});
export const routeAggregationRuleName = raRule.name;
export const routeAggregationRuleDescription = raRule.description;
export const routeAggregationRuleType = raRule.type;
export const routeAggregationRulePrefix = raRule.prefix;
export const routeAggregationRuleState = raRule.state;
```
```python
import pulumi
import pulumi_equinix as equinix

ra_rule = equinix.fabric.RouteAggregationRule("raRule",
    route_aggregation_id="<route_aggregation_id>",
    name="ra-rule-test",
    description="Route aggregation rule",
    prefix="192.168.0.0/24")
pulumi.export("routeAggregationRuleName", ra_rule.name)
pulumi.export("routeAggregationRuleDescription", ra_rule.description)
pulumi.export("routeAggregationRuleType", ra_rule.type)
pulumi.export("routeAggregationRulePrefix", ra_rule.prefix)
pulumi.export("routeAggregationRuleState", ra_rule.state)
```
```go
package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/fabric"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		raRule, err := fabric.NewRouteAggregationRule(ctx, "raRule", &fabric.RouteAggregationRuleArgs{
			RouteAggregationId: pulumi.String("<route_aggregation_id>"),
			Name:               pulumi.String("ra-rule-test"),
			Description:        pulumi.String("Route aggregation rule"),
			Prefix:             pulumi.String("192.168.0.0/24"),
		})
		if err != nil {
			return err
		}
		ctx.Export("routeAggregationRuleName", raRule.Name)
		ctx.Export("routeAggregationRuleDescription", raRule.Description)
		ctx.Export("routeAggregationRuleType", raRule.Type)
		ctx.Export("routeAggregationRulePrefix", raRule.Prefix)
		ctx.Export("routeAggregationRuleState", raRule.State)
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
    var raRule = new Equinix.Fabric.RouteAggregationRule("raRule", new()
    {
        RouteAggregationId = "<route_aggregation_id>",
        Name = "ra-rule-test",
        Description = "Route aggregation rule",
        Prefix = "192.168.0.0/24",
    });

    return new Dictionary<string, object?>
    {
        ["routeAggregationRuleName"] = raRule.Name,
        ["routeAggregationRuleDescription"] = raRule.Description,
        ["routeAggregationRuleType"] = raRule.Type,
        ["routeAggregationRulePrefix"] = raRule.Prefix,
        ["routeAggregationRuleState"] = raRule.State,
    };
});
```
```java
package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.equinix.fabric.RouteAggregationRule;
import com.pulumi.equinix.fabric.RouteAggregationRuleArgs;
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
        var raRule = new RouteAggregationRule("raRule", RouteAggregationRuleArgs.builder()
            .routeAggregationId("<route_aggregation_id>")
            .name("ra-rule-test")
            .description("Route aggregation rule")
            .prefix("192.168.0.0/24")
            .build());

        ctx.export("routeAggregationRuleName", raRule.name());
        ctx.export("routeAggregationRuleDescription", raRule.description());
        ctx.export("routeAggregationRuleType", raRule.type());
        ctx.export("routeAggregationRulePrefix", raRule.prefix());
        ctx.export("routeAggregationRuleState", raRule.state());
    }
}
```
```yaml
resources:
  raRule:
    type: equinix:fabric:RouteAggregationRule
    name: ra_rule
    properties:
      routeAggregationId: <route_aggregation_id>
      name: ra-rule-test
      description: Route aggregation rule
      prefix: 192.168.0.0/24
outputs:
  routeAggregationRuleName: ${raRule.name}
  routeAggregationRuleDescription: ${raRule.description}
  routeAggregationRuleType: ${raRule.type}
  routeAggregationRulePrefix: ${raRule.prefix}
  routeAggregationRuleState: ${raRule.state}
```
{{% /example %}}
