package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/metal"
	"github.com/pulumi/pulumi-std/sdk/go/std"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		key1, err := metal.NewSshKey(ctx, "key1", &metal.SshKeyArgs{
			Name: pulumi.String("terraform-1"),
			PublicKey: pulumi.String(std.FileOutput(ctx, std.FileOutputArgs{
				Input: pulumi.String("/home/terraform/.ssh/id_rsa.pub"),
			}, nil).ApplyT(func(invoke std.FileResult) (*string, error) {
				return invoke.Result, nil
			}).(pulumi.StringPtrOutput)),
		})
		if err != nil {
			return err
		}
		_, err = metal.NewDevice(ctx, "test", &metal.DeviceArgs{
			Hostname:        pulumi.String("test-device"),
			Plan:            pulumi.String(metal.PlanC3SmallX86),
			Metro:           pulumi.String("sv"),
			OperatingSystem: pulumi.String("ubuntu_24_04"),
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
