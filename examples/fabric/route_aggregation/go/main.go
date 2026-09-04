package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/fabric"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		_, err := fabric.NewRouteAggregation(ctx, "new-ra", &fabric.RouteAggregationArgs{
			Type:        pulumi.String("BGP_IPv4_PREFIX_AGGREGATION"),
			Name:        pulumi.String("new-ra"),
			Description: pulumi.String("Test aggregation"),
			Project: &fabric.RouteAggregationProjectArgs{
				ProjectId: pulumi.String("776847000642406"),
			},
		})
		if err != nil {
			return err
		}
		return nil
	})
}
