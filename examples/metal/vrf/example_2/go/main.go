package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/metal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		example, err := metal.NewReservedIpBlock(ctx, "example", &metal.ReservedIpBlockArgs{
			Description: pulumi.String("Reserved IP block (192.168.100.0/29) taken from on of the ranges in the VRF's pool of address space."),
			ProjectId:   pulumi.Any(exampleEquinixMetalProject.Id),
			Metro:       pulumi.Any(exampleEquinixMetalVrf.Metro),
			Type:        pulumi.String("vrf"),
			VrfId:       pulumi.Any(exampleEquinixMetalVrf.Id),
			Cidr:        pulumi.Int(29),
			Network:     pulumi.String("192.168.100.0"),
		})
		if err != nil {
			return err
		}
		exampleVlan, err := metal.NewVlan(ctx, "exampleVlan", &metal.VlanArgs{
			Description: pulumi.String("A VLAN for Layer2 and Hybrid Metal devices"),
			Metro:       pulumi.Any(exampleEquinixMetalVrf.Metro),
			ProjectId:   pulumi.Any(exampleEquinixMetalProject.Id),
		})
		if err != nil {
			return err
		}
		_, err = metal.NewGateway(ctx, "exampleGateway", &metal.GatewayArgs{
			ProjectId:       pulumi.Any(exampleEquinixMetalProject.Id),
			VlanId:          exampleVlan.ID(),
			IpReservationId: example.ID(),
		})
		if err != nil {
			return err
		}
		return nil
	})
}
