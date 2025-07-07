## Example Usage
{{% example %}}
```typescript
import * as pulumi from "@pulumi/pulumi";

export const routeAggregationRuleName = raRule.name;
export const routeAggregationRuleDescription = raRule.description;
export const routeAggregationRuleType = raRule.type;
export const routeAggregationRulePrefix = raRule.prefix;
export const routeAggregationRuleState = raRule.state;
```
```python
import pulumi

pulumi.export("routeAggregationRuleName", ra_rule["name"])
pulumi.export("routeAggregationRuleDescription", ra_rule["description"])
pulumi.export("routeAggregationRuleType", ra_rule["type"])
pulumi.export("routeAggregationRulePrefix", ra_rule["prefix"])
pulumi.export("routeAggregationRuleState", ra_rule["state"])
```
```go
package main

import (
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
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

return await Deployment.RunAsync(() => 
{
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
    type: equinix:fabricRouteAggregationRule
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
