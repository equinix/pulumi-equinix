package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/metal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		cfg := config.New(ctx, "")
		portId := cfg.Require("portId")
		port, err := metal.NewPort(ctx, "port", &metal.PortArgs{
			PortId: pulumi.String(portId),
			Bonded: pulumi.Bool(true),
			Layer2: pulumi.Bool(true),
		})
		if err != nil {
			return err
		}
		ctx.Export("portType", port.Type)
		ctx.Export("portBondedNetworkType", port.NetworkType)
		return nil
	})
}
