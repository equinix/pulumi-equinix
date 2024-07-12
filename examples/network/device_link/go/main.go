package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/networkedge"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		_, err := networkedge.NewDeviceLink(ctx, "test", &networkedge.DeviceLinkArgs{
			Name:      pulumi.String("test-link"),
			Subnet:    pulumi.String("192.168.40.64/27"),
			ProjectId: pulumi.String("a86d7112-d740-4758-9c9c-31e66373746b"),
			Devices: networkedge.DeviceLinkDeviceArray{
				&networkedge.DeviceLinkDeviceArgs{
					Id:          pulumi.Any(testEquinixNetworkDevice.Uuid),
					Asn:         pulumi.Int(22111),
					InterfaceId: pulumi.Int(6),
				},
				&networkedge.DeviceLinkDeviceArgs{
					Id:          pulumi.Any(testEquinixNetworkDevice.SecondaryDevice[0].Uuid),
					Asn:         pulumi.Int(22333),
					InterfaceId: pulumi.Int(7),
				},
			},
			Links: networkedge.DeviceLinkLinkArray{
				&networkedge.DeviceLinkLinkArgs{
					AccountNumber:  pulumi.Any(testEquinixNetworkDevice.AccountNumber),
					SrcMetroCode:   pulumi.Any(testEquinixNetworkDevice.MetroCode),
					DstMetroCode:   pulumi.Any(testEquinixNetworkDevice.SecondaryDevice[0].MetroCode),
					Throughput:     pulumi.String("50"),
					ThroughputUnit: pulumi.String("Mbps"),
				},
			},
		})
		if err != nil {
			return err
		}
		return nil
	})
}
