package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/fabric"
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/metal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		example1, err := metal.NewVlan(ctx, "example1", &metal.VlanArgs{
			ProjectId: pulumi.Any(myProjectId),
			Metro:     pulumi.String("SV"),
		})
		if err != nil {
			return err
		}
		example, err := metal.NewInterconnection(ctx, "example", &metal.InterconnectionArgs{
			Name:         pulumi.String("tf-port-to-metal-legacy"),
			ProjectId:    pulumi.Any(myProjectId),
			Metro:        pulumi.String("SV"),
			Redundancy:   pulumi.String("primary"),
			Type:         pulumi.String("shared_port_vlan"),
			ContactEmail: pulumi.String("username@example.com"),
			Vlans: pulumi.IntArray{
				example1.Vxlan,
			},
		})
		if err != nil {
			return err
		}
		_, err = fabric.NewConnection(ctx, "exampleConnection", &fabric.ConnectionArgs{
			Name: pulumi.String("tf-NIMF-metal-2-aws-legacy"),
			Type: pulumi.String("IP_VC"),
			Notifications: fabric.ConnectionNotificationArray{
				&fabric.ConnectionNotificationArgs{
					Type:   pulumi.String(fabric.NotificationsTypeAll),
					Emails: pulumi.StringArray("sername@example.com"),
				},
			},
			Project: &fabric.ConnectionProjectArgs{
				ProjectId: pulumi.Any(fabricProjectId),
			},
			Bandwidth: pulumi.Int(200),
			Order: &fabric.ConnectionOrderArgs{
				PurchaseOrderNumber: pulumi.String("1-323292"),
			},
			ASide: &fabric.ConnectionASideArgs{
				AccessPoint: &fabric.ConnectionASideAccessPointArgs{
					Type: pulumi.String("CLOUD_ROUTER"),
					Router: &fabric.ConnectionASideAccessPointRouterArgs{
						Uuid: pulumi.Any(cloudRouterUuid),
					},
				},
			},
			ZSide: &fabric.ConnectionZSideArgs{
				AccessPoint: &fabric.ConnectionZSideAccessPointArgs{
					Type:              pulumi.String("METAL_NETWORK"),
					AuthenticationKey: example.AuthorizationCode,
				},
			},
		})
		if err != nil {
			return err
		}
		return nil
	})
}
