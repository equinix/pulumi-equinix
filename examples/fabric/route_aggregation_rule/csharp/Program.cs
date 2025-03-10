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

