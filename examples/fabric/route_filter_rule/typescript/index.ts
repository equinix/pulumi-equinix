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
