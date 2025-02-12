package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/fabric"
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/metal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		aSide := fabric.GetPortsOutput(ctx, fabric.GetPortsOutputArgs{
			Filter: &fabric.GetPortsFilterArgs{
				Name: pulumi.String("<name_of_port||port_prefix>"),
			},
		}, nil)
		example, err := metal.NewVlan(ctx, "example", &metal.VlanArgs{
			ProjectId: pulumi.String("<metal_project_id>"),
			Metro:     pulumi.String("FR"),
		})
		if err != nil {
			return err
		}
		exampleInterconnection, err := metal.NewInterconnection(ctx, "exampleInterconnection", &metal.InterconnectionArgs{
			Name:             pulumi.String("tf-metal-from-port"),
			ProjectId:        pulumi.String("<metal_project_id>"),
			Type:             pulumi.String("shared"),
			Redundancy:       pulumi.String("primary"),
			Metro:            pulumi.String("FR"),
			Speed:            pulumi.String("200Mbps"),
			ServiceTokenType: pulumi.String("z_side"),
			ContactEmail:     pulumi.String("username@example.com"),
			Vlans: pulumi.IntArray{
				example.Vxlan,
			},
		})
		if err != nil {
			return err
		}
		_, err = fabric.NewConnection(ctx, "exampleConnection", &fabric.ConnectionArgs{
			Name:      pulumi.String("tf-metal-from-port"),
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
					Type: pulumi.String(fabric.AccessPointTypeColo),
					Port: &fabric.ConnectionASideAccessPointPortArgs{
						Uuid: aSide.ApplyT(func(aSide fabric.GetPortsResult) (*string, error) {
							return &aSide.Data[0].Uuid, nil
						}).(pulumi.StringPtrOutput),
					},
					LinkProtocol: &fabric.ConnectionASideAccessPointLinkProtocolArgs{
						Type:    pulumi.String(fabric.AccessPointLinkProtocolTypeDot1q),
						VlanTag: pulumi.Int(1234),
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
