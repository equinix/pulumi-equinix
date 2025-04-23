package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/fabric"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		raRule, err := fabric.NewRouteAggregationRule(ctx, "raRule", &fabric.RouteAggregationRuleArgs{
			RouteAggregationId: pulumi.String("<route_aggregation_id>"),
			Name:               pulumi.String("ra-rule-test"),
			Description:        pulumi.String("Route aggregation rule"),
			Prefix:             pulumi.String("192.168.0.0/24"),
		})
		if err != nil {
			return err
		}
		ctx.Export("routeAggregationRuleName", raRule.Name)
		ctx.Export("routeAggregationRuleDescription", raRule.Description)
		ctx.Export("routeAggregationRuleType", raRule.Type)
		ctx.Export("routeAggregationRulePrefix", raRule.Prefix)
		ctx.Export("routeAggregationRuleState", raRule.State)
		return nil
	})
}
