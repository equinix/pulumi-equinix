package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/networkedge"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		_, err := networkedge.NewDeviceLink(ctx, "test", &networkedge.DeviceLinkArgs{
			Name:      pulumi.String("test-DLG"),
			ProjectId: pulumi.String("xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"),
			Devices: networkedge.DeviceLinkDeviceArray{
				&networkedge.DeviceLinkDeviceArgs{
					Id:          pulumi.Any(testEquinixNetworkDevice.Uuid),
					InterfaceId: pulumi.Int(6),
				},
				&networkedge.DeviceLinkDeviceArgs{
					Id:          pulumi.Any(testEquinixNetworkDevice.SecondaryDevice[0].Uuid),
					InterfaceId: pulumi.Int(7),
				},
			},
			MetroLinks: networkedge.DeviceLinkMetroLinkArray{
				&networkedge.DeviceLinkMetroLinkArgs{
					AccountNumber:  pulumi.Any(testEquinixNetworkDevice.AccountNumber),
					MetroCode:      pulumi.Any(testEquinixNetworkDevice.MetroCode),
					Throughput:     pulumi.String("50"),
					ThroughputUnit: pulumi.String("Mbps"),
				},
				&networkedge.DeviceLinkMetroLinkArgs{
					AccountNumber:  pulumi.Any(testEquinixNetworkDevice.SecondaryDevice[0].AccountNumber),
					MetroCode:      pulumi.Any(testEquinixNetworkDevice.SecondaryDevice[0].MetroCode),
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
