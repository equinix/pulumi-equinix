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
