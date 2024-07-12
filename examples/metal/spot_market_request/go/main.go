package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/metal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		_, err := metal.NewSpotMarketRequest(ctx, "req", &metal.SpotMarketRequestArgs{
			ProjectId:   pulumi.Any(projectId),
			MaxBidPrice: pulumi.Float64(0.03),
			Metro:       pulumi.String("ny"),
			DevicesMin:  pulumi.Int(1),
			DevicesMax:  pulumi.Int(1),
			InstanceParameters: &metal.SpotMarketRequestInstanceParametersArgs{
				Hostname:        pulumi.String("testspot"),
				BillingCycle:    pulumi.String("hourly"),
				OperatingSystem: pulumi.String("ubuntu_20_04"),
				Plan:            pulumi.String("c3.small.x86"),
			},
		})
		if err != nil {
			return err
		}
		return nil
	})
}
