package main

import (
	"fmt"

	"github.com/equinix/pulumi-equinix/sdk/go/equinix/metal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		cfg := config.New(ctx, "")
		projectId := cfg.Require("projectId")
		web, err := metal.NewDevice(ctx, "web", &metal.DeviceArgs{
			Hostname:        pulumi.String("webserver1"),
			Plan:            pulumi.String(metal.PlanC3SmallX86),
			OperatingSystem: pulumi.String(metal.OperatingSystem_Ubuntu20_04),
			Metro:           pulumi.String("sv"),
			BillingCycle:    pulumi.String(metal.BillingCycleHourly),
			ProjectId:       pulumi.String(projectId),
		})
		if err != nil {
			return err
		}
		ctx.Export("webPublicIp", web.AccessPublicIpv4.ApplyT(func(accessPublicIpv4 string) (string, error) {
			return fmt.Sprintf("http://%v", accessPublicIpv4), nil
		}).(pulumi.StringOutput))
		return nil
	})
}
