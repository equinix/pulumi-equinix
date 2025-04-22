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

