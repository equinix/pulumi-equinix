package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/metal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		_, err := metal.NewDevice(ctx, "pxe1", &metal.DeviceArgs{
			Hostname:        pulumi.String("tf.coreos2-pxe"),
			Plan:            pulumi.String(metal.PlanC3SmallX86),
			Metro:           pulumi.String("sv"),
			OperatingSystem: pulumi.String(metal.OperatingSystemCustomIPXE),
			BillingCycle:    pulumi.String(metal.BillingCycleHourly),
			ProjectId:       pulumi.Any(projectId),
			IpxeScriptUrl:   pulumi.String("https://rawgit.com/cloudnativelabs/pxe/master/packet/coreos-stable-metal.ipxe"),
			AlwaysPxe:       pulumi.Bool(false),
			UserData:        pulumi.Any(userData),
			CustomData:      pulumi.Any(customData),
			Behavior: &metal.DeviceBehaviorArgs{
				AllowChanges: pulumi.StringArray{
					pulumi.String("custom_data"),
					pulumi.String("user_data"),
				},
			},
		})
		if err != nil {
			return err
		}
		return nil
	})
}
