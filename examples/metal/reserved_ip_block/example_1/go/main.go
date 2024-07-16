package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/metal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		_, err := metal.NewReservedIpBlock(ctx, "twoElasticAddresses", &metal.ReservedIpBlockArgs{
			ProjectId: pulumi.Any(projectId),
			Metro:     pulumi.String("sv"),
			Quantity:  pulumi.Int(2),
		})
		if err != nil {
			return err
		}
		_, err = metal.NewReservedIpBlock(ctx, "test1", &metal.ReservedIpBlockArgs{
			ProjectId: pulumi.Any(projectId),
			Type:      pulumi.String(metal.IpBlockTypePublicIPv4),
			Metro:     pulumi.String("sv"),
			Quantity:  pulumi.Int(1),
		})
		if err != nil {
			return err
		}
		_, err = metal.NewReservedIpBlock(ctx, "test", &metal.ReservedIpBlockArgs{
			ProjectId: pulumi.Any(projectId),
			Type:      pulumi.String(metal.IpBlockTypeGlobalIPv4),
			Quantity:  pulumi.Int(1),
		})
		if err != nil {
			return err
		}
		return nil
	})
}
