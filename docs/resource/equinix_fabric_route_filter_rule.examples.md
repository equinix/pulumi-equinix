## Example Usage
{{% example %}}
```typescript
import * as pulumi from "@pulumi/pulumi";

export const routeFilterRuleId = rfRule.id;
export const routeFilterId = rfRule.routeFilterId;
export const routeFilterRulePrefix = rfRule.prefix;
export const routeFilterRulePrefixMatch = rfRule.prefixMatch;
```
```python
import pulumi

pulumi.export("routeFilterRuleId", rf_rule["id"])
pulumi.export("routeFilterId", rf_rule["routeFilterId"])
pulumi.export("routeFilterRulePrefix", rf_rule["prefix"])
pulumi.export("routeFilterRulePrefixMatch", rf_rule["prefixMatch"])
```
```go
package main

import (
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		ctx.Export("routeFilterRuleId", rfRule.Id)
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

return await Deployment.RunAsync(() => 
{
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
    type: equinix:fabricRouteFilterRule
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
