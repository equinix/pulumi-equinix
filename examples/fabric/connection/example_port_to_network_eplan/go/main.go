package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/fabric"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		_, err := fabric.NewConnection(ctx, "eplan", &fabric.ConnectionArgs{
			Order: &fabric.ConnectionOrderArgs{
				PurchaseOrderNumber: pulumi.String("1-323292"),
			},
			ASide: &fabric.ConnectionASideArgs{
				AccessPoint: &fabric.ConnectionASideAccessPointArgs{
					Port: &fabric.ConnectionASideAccessPointPortArgs{
						Uuid: pulumi.String("<aside_port_uuid>"),
					},
					Type: pulumi.String(fabric.AccessPointTypeColo),
				},
			},
			ZSide: &fabric.ConnectionZSideArgs{
				AccessPoint: &fabric.ConnectionZSideAccessPointArgs{
					Network: &fabric.ConnectionZSideAccessPointNetworkArgs{
						Uuid: pulumi.String("<network_uuid>"),
					},
					Type: pulumi.String(fabric.AccessPointTypeNetwork),
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
			Type:      pulumi.String("EPLAN_VC"),
			Bandwidth: pulumi.Int(50),
		})
		if err != nil {
			return err
		}
		return nil
	})
}
