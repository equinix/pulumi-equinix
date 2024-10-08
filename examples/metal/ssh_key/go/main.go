package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/metal"
	"github.com/pulumi/pulumi-std/sdk/go/std"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		invokeFile, err := std.File(ctx, &std.FileArgs{
			Input: "/home/terraform/.ssh/id_rsa.pub",
		}, nil)
		if err != nil {
			return err
		}
		key1, err := metal.NewSshKey(ctx, "key1", &metal.SshKeyArgs{
			Name:      pulumi.String("terraform-1"),
			PublicKey: pulumi.String(invokeFile.Result),
		})
		if err != nil {
			return err
		}
		_, err = metal.NewDevice(ctx, "test", &metal.DeviceArgs{
			Hostname:        pulumi.String("test-device"),
			Plan:            pulumi.String(metal.PlanC3SmallX86),
			Metro:           pulumi.String("sv"),
			OperatingSystem: pulumi.String(metal.OperatingSystem_Ubuntu20_04),
			BillingCycle:    pulumi.String(metal.BillingCycleHourly),
			ProjectId:       pulumi.Any(projectId),
		}, pulumi.DependsOn([]pulumi.Resource{
			key1,
		}))
		if err != nil {
			return err
		}
		return nil
	})
}
