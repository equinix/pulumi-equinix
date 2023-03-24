package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/metal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		cfg := config.New(ctx, "")
		projectId := cfg.Require("projectId")
		metro := "FR"
		if param := cfg.Get("metro"); param != "" {
			metro = param
		}
		request, err := metal.NewSpotMarketRequest(ctx, "request", &metal.SpotMarketRequestArgs{
			ProjectId:   pulumi.String(projectId),
			Metro:       pulumi.String(metro),
			MaxBidPrice: pulumi.Float64(0.75),
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
		ctx.Export("requestId", request.ID())
		return nil
	})
}
