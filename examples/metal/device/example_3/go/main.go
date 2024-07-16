package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/metal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		_, err := metal.NewDevice(ctx, "web1", &metal.DeviceArgs{
			Hostname:        pulumi.String("tf.coreos2"),
			Plan:            pulumi.String(metal.PlanC3SmallX86),
			Metro:           pulumi.String("ny"),
			OperatingSystem: pulumi.String(metal.OperatingSystem_Ubuntu20_04),
			BillingCycle:    pulumi.String(metal.BillingCycleHourly),
			ProjectId:       pulumi.Any(projectId),
			IpAddresses: metal.DeviceIpAddressArray{
				&metal.DeviceIpAddressArgs{
					Type: pulumi.String("private_ipv4"),
					Cidr: pulumi.Int(30),
				},
			},
		})
		if err != nil {
			return err
		}
		return nil
	})
}
