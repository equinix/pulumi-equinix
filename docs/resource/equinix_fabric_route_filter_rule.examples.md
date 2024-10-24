## Example Usage
{{% example %}}
```typescript
import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const rfRule = new equinix.fabric.RouteFilterRule("rfRule", {
    routeFilterId: "<route_filter_policy_id>",
    name: "Route Filter Rule Name",
    prefix: "192.168.0.0/24",
    prefixMatch: "exact",
    description: "Route Filter Rule for X Purpose",
});
export const routeFilterRuleId = rfRule.id;
export const routeFilterId = rfRule.routeFilterId;
export const routeFilterRulePrefix = rfRule.prefix;
export const routeFilterRulePrefixMatch = rfRule.prefixMatch;
```
```python
import pulumi
import pulumi_equinix as equinix

rf_rule = equinix.fabric.RouteFilterRule("rfRule",
    route_filter_id="<route_filter_policy_id>",
    name="Route Filter Rule Name",
    prefix="192.168.0.0/24",
    prefix_match="exact",
    description="Route Filter Rule for X Purpose")
pulumi.export("routeFilterRuleId", rf_rule.id)
pulumi.export("routeFilterId", rf_rule.route_filter_id)
pulumi.export("routeFilterRulePrefix", rf_rule.prefix)
pulumi.export("routeFilterRulePrefixMatch", rf_rule.prefix_match)
```
```go
package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/fabric"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		rfRule, err := fabric.NewRouteFilterRule(ctx, "rfRule", &fabric.RouteFilterRuleArgs{
			RouteFilterId: pulumi.String("<route_filter_policy_id>"),
			Name:          pulumi.String("Route Filter Rule Name"),
			Prefix:        pulumi.String("192.168.0.0/24"),
			PrefixMatch:   pulumi.String("exact"),
			Description:   pulumi.String("Route Filter Rule for X Purpose"),
		})
		if err != nil {
			return err
		}
		ctx.Export("routeFilterRuleId", rfRule.ID())
		ctx.Export("routeFilterId", rfRule.RouteFilterId)
		ctx.Export("routeFilterRulePrefix", rfRule.Prefix)
		ctx.Export("routeFilterRulePrefixMatch", rfRule.PrefixMatch)
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
    var rfRule = new Equinix.Fabric.RouteFilterRule("rfRule", new()
    {
        RouteFilterId = "<route_filter_policy_id>",
        Name = "Route Filter Rule Name",
        Prefix = "192.168.0.0/24",
        PrefixMatch = "exact",
        Description = "Route Filter Rule for X Purpose",
    });

    return new Dictionary<string, object?>
    {
        ["routeFilterRuleId"] = rfRule.Id,
        ["routeFilterId"] = rfRule.RouteFilterId,
        ["routeFilterRulePrefix"] = rfRule.Prefix,
        ["routeFilterRulePrefixMatch"] = rfRule.PrefixMatch,
    };
});
```
```java
package generated_program;

import com.pulumi.Context;
import com.pulumi.Pulumi;
import com.pulumi.core.Output;
import com.pulumi.equinix.fabric.RouteFilterRule;
import com.pulumi.equinix.fabric.RouteFilterRuleArgs;
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
        var rfRule = new RouteFilterRule("rfRule", RouteFilterRuleArgs.builder()
            .routeFilterId("<route_filter_policy_id>")
            .name("Route Filter Rule Name")
            .prefix("192.168.0.0/24")
            .prefixMatch("exact")
            .description("Route Filter Rule for X Purpose")
            .build());

        ctx.export("routeFilterRuleId", rfRule.id());
        ctx.export("routeFilterId", rfRule.routeFilterId());
        ctx.export("routeFilterRulePrefix", rfRule.prefix());
        ctx.export("routeFilterRulePrefixMatch", rfRule.prefixMatch());
    }
}
```
```yaml
resources:
  rfRule:
    type: equinix:fabric:RouteFilterRule
    name: rf_rule
    properties:
      routeFilterId: <route_filter_policy_id>
      name: Route Filter Rule Name
      prefix: 192.168.0.0/24
      prefixMatch: exact
      description: Route Filter Rule for X Purpose
outputs:
  routeFilterRuleId: ${rfRule.id}
  routeFilterId: ${rfRule.routeFilterId}
  routeFilterRulePrefix: ${rfRule.prefix}
  routeFilterRulePrefixMatch: ${rfRule.prefixMatch}
```
{{% /example %}}
