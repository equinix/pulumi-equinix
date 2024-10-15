package main

import (
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		ctx.Export("routeFilterRuleId", rfRule.Id)
		ctx.Export("routeFilterId", rfRule.RouteFilterId)
		ctx.Export("routeFilterRulePrefix", rfRule.Prefix)
		ctx.Export("routeFilterRulePrefixMatch", rfRule.PrefixMatch)
		return nil
	})
}
