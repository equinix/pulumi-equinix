package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix"
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/fabric"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		_, err := fabric.NewConnection(ctx, "port2aws", &fabric.ConnectionArgs{
			Name: pulumi.String("ConnectionName"),
			Type: pulumi.String(fabric.ConnectionTypeEVPL),
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
			Redundancy: &fabric.ConnectionRedundancyArgs{
				Priority: pulumi.String("PRIMARY"),
			},
			Order: &fabric.ConnectionOrderArgs{
				PurchaseOrderNumber: pulumi.String("1-323929"),
			},
			ASide: &fabric.ConnectionASideArgs{
				AccessPoint: &fabric.ConnectionASideAccessPointArgs{
					Type: pulumi.String(fabric.AccessPointTypeColo),
					Port: &fabric.ConnectionASideAccessPointPortArgs{
						Uuid: pulumi.String("<aside_port_uuid>"),
					},
					LinkProtocol: &fabric.ConnectionASideAccessPointLinkProtocolArgs{
						Type:     pulumi.String(fabric.AccessPointLinkProtocolTypeQinQ),
						VlanSTag: pulumi.Int(2019),
						VlanCTag: pulumi.Int(2112),
					},
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
			AdditionalInfo: pulumi.MapArray{
				pulumi.Map{
					"key":   pulumi.Any("accessKey"),
					"value": pulumi.Any("<aws_access_key>"),
				},
				pulumi.Map{
					"key":   pulumi.Any("secretKey"),
					"value": pulumi.Any("<aws_secret_key>"),
				},
			},
		})
		if err != nil {
			return err
		}
		return nil
	})
}
