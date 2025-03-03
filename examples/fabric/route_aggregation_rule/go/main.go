package main

import (
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		ctx.Export("routeAggregationRuleName", raRule.Name)
		ctx.Export("routeAggregationRuleDescription", raRule.Description)
		ctx.Export("routeAggregationRuleType", raRule.Type)
		ctx.Export("routeAggregationRulePrefix", raRule.Prefix)
		ctx.Export("routeAggregationRuleState", raRule.State)
		return nil
	})
}
