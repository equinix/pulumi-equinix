package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix"
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/fabric"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		_, err := fabric.NewConnection(ctx, "metal2aws", &fabric.ConnectionArgs{
			Name: pulumi.String("ConnectionName"),
			Type: pulumi.String("EVPLAN_VC"),
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
					Type:              pulumi.String("METAL_NETWORK"),
					AuthenticationKey: pulumi.String("<metal_authorization_code>"),
				},
			},
			ZSide: &fabric.ConnectionZSideArgs{
				AccessPoint: &fabric.ConnectionZSideAccessPointArgs{
					Type:              pulumi.String(fabric.AccessPointTypeSP),
					AuthenticationKey: pulumi.String("<aws_account_id>"),
					SellerRegion:      pulumi.String("us-west-1"),
					Profile: &fabric.ConnectionZSideAccessPointProfileArgs{
						Type: pulumi.String(fabric.ProfileTypeL2Profile),
						Uuid: pulumi.String("<service_profile_uuid>"),
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
