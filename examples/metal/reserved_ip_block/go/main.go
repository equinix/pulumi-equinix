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
		_type := "public_ipv4"
		if param := cfg.Get("type"); param != "" {
			_type = param
		}
		quantity := 1
		if param := cfg.GetInt("quantity"); param != 0 {
			quantity = param
		}
		ipBlock, err := metal.NewReservedIpBlock(ctx, "ipBlock", &metal.ReservedIpBlockArgs{
			ProjectId: pulumi.String(projectId),
			Type:      pulumi.String("public_ipv4"),
			Quantity:  pulumi.Int(quantity),
			Metro:     pulumi.String(metro),
		})
		if err != nil {
			return err
		}
		ctx.Export("ipBlockId", ipBlock.ID())
		ctx.Export("ipBlockSubent", ipBlock.CidrNotation)
		return nil
	})
}
