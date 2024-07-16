package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix"
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/fabric"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		_, err := fabric.NewConnection(ctx, "accessEplVc", &fabric.ConnectionArgs{
			Name: pulumi.String("ConnectionName"),
			Type: pulumi.String(fabric.ConnectionTypeAccessEPL),
			Notifications: fabric.ConnectionNotificationArray{
				&fabric.ConnectionNotificationArgs{
					Type: pulumi.String(fabric.NotificationsTypeAll),
					Emails: pulumi.StringArray{
						pulumi.String("example@equinix.com"),
						pulumi.String("test1@equinix.com"),
					},
				},
			},
			Bandwidth: pulumi.Int(50),
			Order: &fabric.ConnectionOrderArgs{
				PurchaseOrderNumber: pulumi.String("1-323292"),
			},
			ASide: &fabric.ConnectionASideArgs{
				AccessPoint: &fabric.ConnectionASideAccessPointArgs{
					Type: pulumi.String(fabric.AccessPointTypeColo),
					Port: &fabric.ConnectionASideAccessPointPortArgs{
						Uuid: pulumi.String("<aside_port_uuid>"),
					},
					LinkProtocol: &fabric.ConnectionASideAccessPointLinkProtocolArgs{
						Type:     pulumi.String(fabric.AccessPointLinkProtocolTypeQinQ),
						VlanSTag: pulumi.Int(1976),
					},
				},
			},
			ZSide: &fabric.ConnectionZSideArgs{
				AccessPoint: &fabric.ConnectionZSideAccessPointArgs{
					Type: pulumi.String(fabric.AccessPointTypeColo),
					Port: &fabric.ConnectionZSideAccessPointPortArgs{
						Uuid: pulumi.String("<zside_port_uuid>"),
					},
					Location: &fabric.ConnectionZSideAccessPointLocationArgs{
						MetroCode: pulumi.String(equinix.MetroSiliconValley),
					},
				},
			},
		})
		if err != nil {
			return err
		}
		return nil
	})
}
