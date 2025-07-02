package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/metal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		test, err := metal.NewDevice(ctx, "test", &metal.DeviceArgs{
			Hostname:        pulumi.String("test"),
			Plan:            pulumi.String(metal.PlanC3SmallX86),
			Metro:           pulumi.String("ny"),
			OperatingSystem: pulumi.String("ubuntu_24_04"),
			BillingCycle:    pulumi.String(metal.BillingCycleHourly),
			ProjectId:       pulumi.Any(projectId),
		})
		if err != nil {
			return err
		}
		testDeviceNetworkType, err := metal.NewDeviceNetworkType(ctx, "testDeviceNetworkType", &metal.DeviceNetworkTypeArgs{
			DeviceId: test.ID(),
			Type:     pulumi.String("layer2-individual"),
		})
		if err != nil {
			return err
		}
		test1, err := metal.NewVlan(ctx, "test1", &metal.VlanArgs{
			Description: pulumi.String("VLAN in New York"),
			Metro:       pulumi.String("ny"),
			ProjectId:   pulumi.Any(projectId),
		})
		if err != nil {
			return err
		}
		test2, err := metal.NewVlan(ctx, "test2", &metal.VlanArgs{
			Description: pulumi.String("VLAN in New Jersey"),
			Metro:       pulumi.String("ny"),
			ProjectId:   pulumi.Any(projectId),
		})
		if err != nil {
			return err
		}
		test1PortVlanAttachment, err := metal.NewPortVlanAttachment(ctx, "test1PortVlanAttachment", &metal.PortVlanAttachmentArgs{
			DeviceId: testDeviceNetworkType.ID(),
			VlanVnid: test1.Vxlan,
			PortName: pulumi.String("eth1"),
		})
		if err != nil {
			return err
		}
		_, err = metal.NewPortVlanAttachment(ctx, "test2PortVlanAttachment", &metal.PortVlanAttachmentArgs{
			DeviceId: testDeviceNetworkType.ID(),
			VlanVnid: test2.Vxlan,
			PortName: pulumi.String("eth1"),
			Native:   pulumi.Bool(true),
		}, pulumi.DependsOn([]pulumi.Resource{
			test1PortVlanAttachment,
		}))
		if err != nil {
			return err
		}
		return nil
	})
}
