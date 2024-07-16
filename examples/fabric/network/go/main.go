package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/fabric"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		_, err := fabric.NewNetwork(ctx, "newNetwork", &fabric.NetworkArgs{
			Name:  pulumi.String("Network-SV"),
			Type:  pulumi.String("EVPLAN"),
			Scope: pulumi.String("GLOBAL"),
			Notifications: fabric.NetworkNotificationArray{
				&fabric.NetworkNotificationArgs{
					Type: pulumi.String("ALL"),
					Emails: pulumi.StringArray{
						pulumi.String("example@equinix.com"),
						pulumi.String("test1@equinix.com"),
					},
				},
			},
			Project: &fabric.NetworkProjectArgs{
				ProjectId: pulumi.String("776847000642406"),
			},
		})
		if err != nil {
			return err
		}
		return nil
	})
}
