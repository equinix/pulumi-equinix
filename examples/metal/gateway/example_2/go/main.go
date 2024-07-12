package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/metal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		test, err := metal.NewVlan(ctx, "test", &metal.VlanArgs{
			Description: pulumi.String("test VLAN in SV"),
			Metro:       pulumi.String("sv"),
			ProjectId:   pulumi.Any(projectId),
		})
		if err != nil {
			return err
		}
		_, err = metal.NewReservedIpBlock(ctx, "test1", &metal.ReservedIpBlockArgs{
			ProjectId: pulumi.Any(projectId),
			Metro:     pulumi.String("sv"),
			Quantity:  pulumi.Int(8),
		})
		if err != nil {
			return err
		}
		_, err = metal.NewGateway(ctx, "testGateway", &metal.GatewayArgs{
			ProjectId:       pulumi.Any(projectId),
			VlanId:          test.ID(),
			IpReservationId: pulumi.Any(testEquinixMetalReservedIpBlock.Id),
		})
		if err != nil {
			return err
		}
		return nil
	})
}
