package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix"
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/fabric"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		_, err := fabric.NewConnection(ctx, "vd2port", &fabric.ConnectionArgs{
			Order: &fabric.ConnectionOrderArgs{
				PurchaseOrderNumber: pulumi.String("1-323292"),
			},
			ASide: &fabric.ConnectionASideArgs{
				AccessPoint: &fabric.ConnectionASideAccessPointArgs{
					VirtualDevice: &fabric.ConnectionASideAccessPointVirtualDeviceArgs{
						Type: pulumi.String("EDGE"),
						Uuid: pulumi.String("<device_uuid>"),
					},
					Interface: &fabric.ConnectionASideAccessPointInterfaceArgs{
						Type: pulumi.String("NETWORK"),
						Id:   pulumi.Int(7),
					},
					Type: pulumi.String(fabric.AccessPointTypeVD),
				},
			},
			ZSide: &fabric.ConnectionZSideArgs{
				AccessPoint: &fabric.ConnectionZSideAccessPointArgs{
					Port: &fabric.ConnectionZSideAccessPointPortArgs{
						Uuid: pulumi.String("<zside_port_uuid>"),
					},
					LinkProtocol: &fabric.ConnectionZSideAccessPointLinkProtocolArgs{
						Type:     pulumi.String(fabric.AccessPointLinkProtocolTypeDot1q),
						VlanSTag: pulumi.Int(3711),
					},
					Location: &fabric.ConnectionZSideAccessPointLocationArgs{
						MetroCode: pulumi.String(equinix.MetroSiliconValley),
					},
					Type: pulumi.String(fabric.AccessPointTypeColo),
				},
			},
			Notifications: fabric.ConnectionNotificationArray{
				&fabric.ConnectionNotificationArgs{
					Type: pulumi.String(fabric.NotificationsTypeAll),
					Emails: pulumi.StringArray{
						pulumi.String("example@equinix.com"),
						pulumi.String("test1@equinix.com"),
					},
				},
			},
			Name:      pulumi.String("ConnectionName"),
			Type:      pulumi.String(fabric.ConnectionTypeEVPL),
			Bandwidth: pulumi.Int(50),
		})
		if err != nil {
			return err
		}
		return nil
	})
}
