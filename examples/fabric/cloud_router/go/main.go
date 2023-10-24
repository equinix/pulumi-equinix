package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/fabric"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		cfg := config.New(ctx, "")
		metro := "FR"
		if param := cfg.Get("metro"); param != "" {
			metro = param
		}
		accountNum := cfg.RequireInt("accountNum")
		router, err := fabric.NewCloudRouter(ctx, "router", &fabric.CloudRouterArgs{
			Name: pulumi.String("My-Fabric-Cloud-Router"),
			Type: pulumi.String("XF_ROUTER"),
			Location: &fabric.CloudRouterLocationArgs{
				MetroCode: pulumi.String(metro),
			},
			Package: &fabric.CloudRouterPackageArgs{
				Code: pulumi.String("BASIC"),
			},
			Notifications: fabric.CloudRouterNotificationArray{
				&fabric.CloudRouterNotificationArgs{
					Type: pulumi.String("ALL"),
					Emails: pulumi.StringArray{
						pulumi.String("example@equinix.com"),
					},
				},
			},
			Account: &fabric.CloudRouterAccountArgs{
				AccountNumber: pulumi.Int(272010),
			},
		})
		if err != nil {
			return err
		}
		ctx.Export("routerId", router.ID())
		return nil
	})
}
