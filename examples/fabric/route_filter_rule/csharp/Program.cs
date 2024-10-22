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

