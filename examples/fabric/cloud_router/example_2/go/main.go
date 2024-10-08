package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/fabric"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		_, err := fabric.NewCloudRouter(ctx, "newCloudRouter", &fabric.CloudRouterArgs{
			Name: pulumi.String("Router-SV"),
			Type: pulumi.String("XF_ROUTER"),
			Notifications: fabric.CloudRouterNotificationArray{
				&fabric.CloudRouterNotificationArgs{
					Type: pulumi.String("ALL"),
					Emails: pulumi.StringArray{
						pulumi.String("example@equinix.com"),
						pulumi.String("test1@equinix.com"),
					},
				},
			},
			Order: &fabric.CloudRouterOrderArgs{
				PurchaseOrderNumber: pulumi.String("1-323292"),
			},
			Location: &fabric.CloudRouterLocationArgs{
				MetroCode: pulumi.String("SV"),
			},
			Package: &fabric.CloudRouterPackageArgs{
				Code: pulumi.String("STANDARD"),
			},
			Project: &fabric.CloudRouterProjectArgs{
				ProjectId: pulumi.String("776847000642406"),
			},
			MarketplaceSubscription: &fabric.CloudRouterMarketplaceSubscriptionArgs{
				Type: pulumi.String("AWS_MARKETPLACE_SUBSCRIPTION"),
				Uuid: pulumi.String("2823b8ae07-a2a2-45b4-a658-c3542bb24e9"),
			},
		})
		if err != nil {
			return err
		}
		return nil
	})
}
