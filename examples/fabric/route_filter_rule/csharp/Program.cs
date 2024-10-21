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
