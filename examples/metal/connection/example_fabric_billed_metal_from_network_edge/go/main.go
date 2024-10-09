package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/fabric"
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/metal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		example, err := metal.NewVrf(ctx, "example", &metal.VrfArgs{
			Name:     pulumi.String("tf-metal-from-ne"),
			Metro:    pulumi.String("FR"),
			LocalAsn: pulumi.Int(65001),
			IpRanges: pulumi.StringArray{
				pulumi.String("10.99.1.0/24"),
			},
			ProjectId: pulumi.Any(test.Id),
		})
		if err != nil {
			return err
		}
		exampleInterconnection, err := metal.NewInterconnection(ctx, "exampleInterconnection", &metal.InterconnectionArgs{
			Name:             pulumi.String("tf-metal-from-ne"),
			ProjectId:        pulumi.String("<metal_project_id>"),
			Type:             pulumi.String("shared"),
			Redundancy:       pulumi.String("primary"),
			Metro:            pulumi.String("FR"),
			Speed:            pulumi.String("200Mbps"),
			ServiceTokenType: pulumi.String("z_side"),
			ContactEmail:     pulumi.String("username@example.com"),
			Vrfs: pulumi.StringArray{
				example.Vxlan,
			},
		})
		if err != nil {
			return err
		}
		_, err = fabric.NewConnection(ctx, "exampleConnection", &fabric.ConnectionArgs{
			Name:      pulumi.String("tf-metal-from-ne"),
			Type:      pulumi.String(fabric.ConnectionTypeEVPL),
			Bandwidth: pulumi.Int(200),
			Notifications: fabric.ConnectionNotificationArray{
				&fabric.ConnectionNotificationArgs{
					Type: pulumi.String(fabric.NotificationsTypeAll),
					Emails: pulumi.StringArray{
						pulumi.String("username@example.com"),
					},
				},
			},
			Order: &fabric.ConnectionOrderArgs{
				PurchaseOrderNumber: pulumi.String("1-323292"),
			},
			Project: &fabric.ConnectionProjectArgs{
				ProjectId: pulumi.String("<fabric_project_id>"),
			},
			ASide: &fabric.ConnectionASideArgs{
				AccessPoint: &fabric.ConnectionASideAccessPointArgs{
					Type: pulumi.String(fabric.AccessPointTypeVD),
					VirtualDevice: &fabric.ConnectionASideAccessPointVirtualDeviceArgs{
						Type: pulumi.String("EDGE"),
						Uuid: pulumi.Any(exampleEquinixNetworkDevice.Id),
					},
				},
			},
			ZSide: &fabric.ConnectionZSideArgs{
				ServiceToken: &fabric.ConnectionZSideServiceTokenArgs{
					Uuid: exampleInterconnection.ServiceTokens.ApplyT(func(serviceTokens []metal.InterconnectionServiceToken) (*string, error) {
						return &serviceTokens[0].Id, nil
					}).(pulumi.StringPtrOutput),
				},
			},
		})
		if err != nil {
			return err
		}
		return nil
	})
}
