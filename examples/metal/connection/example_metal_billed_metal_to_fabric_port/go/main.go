package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/fabric"
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/metal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		aSide, err := fabric.GetPorts(ctx, &fabric.GetPortsArgs{
			Filter: fabric.GetPortsFilter{
				Name: "<name_of_port||port_prefix>",
			},
		}, nil)
		if err != nil {
			return err
		}
		example, err := metal.NewInterconnection(ctx, "example", &metal.InterconnectionArgs{
			Name:             pulumi.String("tf-metal-2-port"),
			ProjectId:        pulumi.String("<metal_project_id>"),
			Type:             pulumi.String("shared"),
			Redundancy:       pulumi.String("redundant"),
			Metro:            pulumi.String("FR"),
			Speed:            pulumi.String("1Gbps"),
			ServiceTokenType: pulumi.String("a_side"),
			ContactEmail:     pulumi.String("username@example.com"),
		})
		if err != nil {
			return err
		}
		_, err = fabric.NewConnection(ctx, "exampleConnection", &fabric.ConnectionArgs{
			Name: pulumi.String("tf-metal-2-port"),
			Type: pulumi.String(fabric.ConnectionTypeEVPL),
			Notifications: fabric.ConnectionNotificationArray{
				&fabric.ConnectionNotificationArgs{
					Type: pulumi.String(fabric.NotificationsTypeAll),
					Emails: pulumi.StringArray{
						pulumi.String("username@example.com"),
					},
				},
			},
			Project: &fabric.ConnectionProjectArgs{
				ProjectId: pulumi.String("<fabric_project_id>"),
			},
			Bandwidth: pulumi.Int(100),
			Order: &fabric.ConnectionOrderArgs{
				PurchaseOrderNumber: pulumi.String("1-323292"),
			},
			ASide: &fabric.ConnectionASideArgs{
				ServiceToken: &fabric.ConnectionASideServiceTokenArgs{
					Uuid: example.ServiceTokens.ApplyT(func(serviceTokens []metal.InterconnectionServiceToken) (*string, error) {
						return &serviceTokens[0].Id, nil
					}).(pulumi.StringPtrOutput),
				},
			},
			ZSide: &fabric.ConnectionZSideArgs{
				AccessPoint: &fabric.ConnectionZSideAccessPointArgs{
					Type: pulumi.String(fabric.AccessPointTypeColo),
					Port: &fabric.ConnectionZSideAccessPointPortArgs{
						Uuid: pulumi.String(aSide.Data[0].Uuid),
					},
					LinkProtocol: &fabric.ConnectionZSideAccessPointLinkProtocolArgs{
						Type:    pulumi.String(fabric.AccessPointLinkProtocolTypeDot1q),
						VlanTag: pulumi.Int(1234),
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
