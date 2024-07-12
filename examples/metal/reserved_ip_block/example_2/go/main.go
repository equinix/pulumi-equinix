package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/metal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		example, err := metal.NewReservedIpBlock(ctx, "example", &metal.ReservedIpBlockArgs{
			ProjectId: pulumi.Any(projectId),
			Metro:     pulumi.String("sv"),
			Quantity:  pulumi.Int(2),
		})
		if err != nil {
			return err
		}
		_, err = metal.NewDevice(ctx, "nodes", &metal.DeviceArgs{
			ProjectId:       pulumi.Any(projectId),
			Metro:           pulumi.String("sv"),
			Plan:            pulumi.String(metal.PlanC3SmallX86),
			OperatingSystem: pulumi.String(metal.OperatingSystem_Ubuntu20_04),
			Hostname:        pulumi.String("test"),
			BillingCycle:    pulumi.String(metal.BillingCycleHourly),
			IpAddresses: metal.DeviceIpAddressArray{
				&metal.DeviceIpAddressArgs{
					Type: pulumi.String("public_ipv4"),
					Cidr: pulumi.Int(31),
					ReservationIds: pulumi.StringArray{
						example.ID(),
					},
				},
				&metal.DeviceIpAddressArgs{
					Type: pulumi.String("private_ipv4"),
				},
			},
		})
		if err != nil {
			return err
		}
		return nil
	})
}
