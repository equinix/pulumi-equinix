package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/fabric"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		rfRule, err := fabric.NewRouteFilterRule(ctx, "rfRule", &fabric.RouteFilterRuleArgs{
			RouteFilterId: pulumi.String("<route_filter_policy_id>"),
			Name:          pulumi.String("Route Filter Rule Name"),
			Prefix:        pulumi.String("192.168.0.0/24"),
			PrefixMatch:   pulumi.String("exact"),
			Description:   pulumi.String("Route Filter Rule for X Purpose"),
		})
		if err != nil {
			return err
		}
		ctx.Export("routeFilterRuleId", rfRule.ID())
		ctx.Export("routeFilterId", rfRule.RouteFilterId)
		ctx.Export("routeFilterRulePrefix", rfRule.Prefix)
		ctx.Export("routeFilterRulePrefixMatch", rfRule.PrefixMatch)
		return nil
	})
}
