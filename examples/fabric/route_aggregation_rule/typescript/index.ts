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
