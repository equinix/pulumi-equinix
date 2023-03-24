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
		vxlan := cfg.Require("vxlan")
		vlan, err := metal.NewVlan(ctx, "vlan", &metal.VlanArgs{
			Description: pulumi.String("VLAN in Dallas"),
			ProjectId:   pulumi.String(projectId),
			Metro:       pulumi.String(metro),
			Vxlan:       pulumi.String(vxlan),
		})
		if err != nil {
			return err
		}
		ctx.Export("vlanId", vlan.ID())
		return nil
	})
}
