package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix"
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/fabric"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		vd2AzurePrimary, err := fabric.NewConnection(ctx, "vd2azurePrimary", &fabric.ConnectionArgs{
			Name: pulumi.String("ConnectionName"),
			Type: pulumi.String(fabric.ConnectionTypeEVPL),
			Redundancy: &fabric.ConnectionRedundancyArgs{
				Priority: pulumi.String("PRIMARY"),
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
			Bandwidth: pulumi.Int(50),
			Order: &fabric.ConnectionOrderArgs{
				PurchaseOrderNumber: pulumi.String("1-323292"),
			},
			ASide: &fabric.ConnectionASideArgs{
				AccessPoint: &fabric.ConnectionASideAccessPointArgs{
					Type: pulumi.String(fabric.AccessPointTypeVD),
					VirtualDevice: &fabric.ConnectionASideAccessPointVirtualDeviceArgs{
						Type: pulumi.String("EDGE"),
						Uuid: pulumi.String("<device_uuid>"),
					},
					Interface: &fabric.ConnectionASideAccessPointInterfaceArgs{
						Type: pulumi.String("CLOUD"),
						Id:   pulumi.Int(7),
					},
				},
			},
			ZSide: &fabric.ConnectionZSideArgs{
				AccessPoint: &fabric.ConnectionZSideAccessPointArgs{
					Type:              pulumi.String(fabric.AccessPointTypeSP),
					AuthenticationKey: pulumi.String("<Azure_ExpressRouter_Auth_Key>"),
					PeeringType:       pulumi.String(fabric.AccessPointPeeringTypePrivate),
					Profile: &fabric.ConnectionZSideAccessPointProfileArgs{
						Type: pulumi.String(fabric.ProfileTypeL2Profile),
						Uuid: pulumi.String("<Azure_Service_Profile_UUID>"),
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
		_, err = fabric.NewConnection(ctx, "vd2azureSecondary", &fabric.ConnectionArgs{
			Name: pulumi.String("ConnectionName"),
			Type: pulumi.String(fabric.ConnectionTypeEVPL),
			Redundancy: &fabric.ConnectionRedundancyArgs{
				Priority: pulumi.String("SECONDARY"),
				Group: vd2AzurePrimary.Redundancy.ApplyT(func(redundancy fabric.ConnectionRedundancy) (*string, error) {
					return &redundancy.Group, nil
				}).(pulumi.StringPtrOutput),
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
			Bandwidth: pulumi.Int(50),
			Order: &fabric.ConnectionOrderArgs{
				PurchaseOrderNumber: pulumi.String("1-323292"),
			},
			ASide: &fabric.ConnectionASideArgs{
				AccessPoint: &fabric.ConnectionASideAccessPointArgs{
					Type: pulumi.String(fabric.AccessPointTypeVD),
					VirtualDevice: &fabric.ConnectionASideAccessPointVirtualDeviceArgs{
						Type: pulumi.String("EDGE"),
						Uuid: pulumi.String("<device_uuid>"),
					},
					Interface: &fabric.ConnectionASideAccessPointInterfaceArgs{
						Type: pulumi.String("CLOUD"),
						Id:   pulumi.Int(5),
					},
				},
			},
			ZSide: &fabric.ConnectionZSideArgs{
				AccessPoint: &fabric.ConnectionZSideAccessPointArgs{
					Type:              pulumi.String(fabric.AccessPointTypeSP),
					AuthenticationKey: pulumi.String("<Azure_ExpressRouter_Auth_Key>"),
					PeeringType:       pulumi.String(fabric.AccessPointPeeringTypePrivate),
					Profile: &fabric.ConnectionZSideAccessPointProfileArgs{
						Type: pulumi.String(fabric.ProfileTypeL2Profile),
						Uuid: pulumi.String("<Azure_Service_Profile_UUID>"),
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
