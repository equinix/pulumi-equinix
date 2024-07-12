package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/metal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		test, err := metal.NewVlan(ctx, "test", &metal.VlanArgs{
			Description: pulumi.String("VLAN in New York"),
			Metro:       pulumi.String("ny"),
			ProjectId:   pulumi.Any(projectId),
		})
		if err != nil {
			return err
		}
		testDevice, err := metal.NewDevice(ctx, "testDevice", &metal.DeviceArgs{
			Hostname:        pulumi.String("test"),
			Plan:            pulumi.String(metal.PlanC3SmallX86),
			Metro:           pulumi.String("ny"),
			OperatingSystem: pulumi.String(metal.OperatingSystem_Ubuntu20_04),
			BillingCycle:    pulumi.String(metal.BillingCycleHourly),
			ProjectId:       pulumi.Any(projectId),
		})
		if err != nil {
			return err
		}
		testDeviceNetworkType, err := metal.NewDeviceNetworkType(ctx, "testDeviceNetworkType", &metal.DeviceNetworkTypeArgs{
			DeviceId: testDevice.ID(),
			Type:     pulumi.String("hybrid"),
		})
		if err != nil {
			return err
		}
		_, err = metal.NewPortVlanAttachment(ctx, "testPortVlanAttachment", &metal.PortVlanAttachmentArgs{
			DeviceId: testDeviceNetworkType.ID(),
			PortName: pulumi.String("eth1"),
			VlanVnid: test.Vxlan,
		})
		if err != nil {
			return err
		}
		return nil
	})
}
