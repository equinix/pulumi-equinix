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
		metro := "DA"
		if param := cfg.Get("metro"); param != "" {
			metro = param
		}
		vrf, err := metal.NewVrf(ctx, "vrf", &metal.VrfArgs{
			Description: pulumi.String("VRF with ASN 65000 and a pool of address space"),
			Name:        pulumi.String("example-vrf"),
			Metro:       pulumi.String(metro),
			LocalAsn:    pulumi.Int(65000),
			IpRanges: pulumi.StringArray{
				pulumi.String("192.168.100.0/25"),
				pulumi.String("192.168.200.0/25"),
			},
			ProjectId: pulumi.String(projectId),
		})
		if err != nil {
			return err
		}
		ctx.Export("vrfId", vrf.ID())
		return nil
	})
}
