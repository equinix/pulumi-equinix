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
