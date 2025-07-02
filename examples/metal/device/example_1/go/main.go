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
			Metro:           pulumi.String("sv"),
			OperatingSystem: pulumi.String("ubuntu_24_04"),
			BillingCycle:    pulumi.String(metal.BillingCycleHourly),
			ProjectId:       pulumi.Any(projectId),
		})
		if err != nil {
			return err
		}
		return nil
	})
}
