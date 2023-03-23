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
		vlanId := cfg.Require("vlanId")
		gateway, err := metal.NewGateway(ctx, "gateway", &metal.GatewayArgs{
			ProjectId:             pulumi.String(projectId),
			VlanId:                pulumi.String(vlanId),
			PrivateIpv4SubnetSize: pulumi.Int(8),
		})
		if err != nil {
			return err
		}
		ctx.Export("gatewayState", gateway.State)
		return nil
	})
}
