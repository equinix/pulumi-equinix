package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/metal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		_, err := metal.NewVlan(ctx, "vlan1", &metal.VlanArgs{
			Description: pulumi.String("VLAN in New Jersey"),
			Metro:       pulumi.String("sv"),
			ProjectId:   pulumi.Any(projectId),
			Vxlan:       pulumi.Int(1040),
		})
		if err != nil {
			return err
		}
		return nil
	})
}
