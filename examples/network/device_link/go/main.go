package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/networkedge"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		cfg := config.New(ctx, "")
		accountName := cfg.Require("accountName")
		accountMetro := cfg.Require("accountMetro")
		device1Id := cfg.Require("device1Id")
		device2Id := cfg.Require("device2Id")
		accountfNum := networkedge.GetAccount(ctx, &networkedge.GetAccountArgs{
			Name:      pulumi.StringRef(accountName),
			MetroCode: accountMetro,
		}, nil).Number
		device1Metro := networkedge.LookupDevice(ctx, &networkedge.LookupDeviceArgs{
			Uuid: pulumi.StringRef(device1Id),
		}, nil).MetroCode
		device2Metro := networkedge.LookupDevice(ctx, &networkedge.LookupDeviceArgs{
			Uuid: pulumi.StringRef(device2Id),
		}, nil).MetroCode
		deviceLink, err := networkedge.NewDeviceLink(ctx, "deviceLink", &networkedge.DeviceLinkArgs{
			Name:   pulumi.String("test-link"),
			Subnet: pulumi.String("192.168.40.64/27"),
			Devices: networkedge.DeviceLinkDeviceArray{
				&networkedge.DeviceLinkDeviceArgs{
					Id:          pulumi.String("device1Id"),
					Asn:         pulumi.Int(22111),
					InterfaceId: pulumi.Int(6),
				},
				&networkedge.DeviceLinkDeviceArgs{
					Id:          pulumi.String("device2Id"),
					Asn:         pulumi.Int(22333),
					InterfaceId: pulumi.Int(7),
				},
			},
			Links: networkedge.DeviceLinkLinkArray{
				&networkedge.DeviceLinkLinkArgs{
					AccountNumber:  pulumi.String(accountfNum),
					SrcMetroCode:   pulumi.String(device1Metro),
					DstMetroCode:   pulumi.String(device2Metro),
					Throughput:     pulumi.String("50"),
					ThroughputUnit: pulumi.String("Mbps"),
				},
			},
		})
		if err != nil {
			return err
		}
		ctx.Export("status", deviceLink.Status)
		ctx.Export("devices", deviceLink.Devices)
		return nil
	})
}
