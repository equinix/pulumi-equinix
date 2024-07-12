package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/fabric"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		_, err := fabric.NewServiceProfile(ctx, "newServiceProfile", &fabric.ServiceProfileArgs{
			Description: pulumi.String("Service Profile for Receiving Connections"),
			Name:        pulumi.String("Name Of Business + Use Case Tag"),
			Type:        pulumi.String(fabric.ProfileTypeL2Profile),
			Visibility:  pulumi.String(fabric.ProfileVisibilityPublic),
			Notifications: fabric.ServiceProfileNotificationArray{
				&fabric.ServiceProfileNotificationArgs{
					Emails: pulumi.StringArray{
						pulumi.String("someone@sample.com"),
					},
					Type: pulumi.String("BANDWIDTH_ALERT"),
				},
			},
			AllowedEmails: pulumi.StringArray{
				pulumi.String("test@equinix.com"),
				pulumi.String("testagain@equinix.com"),
			},
			Ports: fabric.ServiceProfilePortArray{
				&fabric.ServiceProfilePortArgs{
					Uuid: pulumi.String("c791f8cb-5cc9-cc90-8ce0-306a5c00a4ee"),
					Type: pulumi.String("XF_PORT"),
				},
			},
			AccessPointTypeConfigs: fabric.ServiceProfileAccessPointTypeConfigArray{
				&fabric.ServiceProfileAccessPointTypeConfigArgs{
					Type:                         pulumi.String(fabric.ProfileAccessPointTypeColo),
					AllowRemoteConnections:       pulumi.Bool(true),
					AllowCustomBandwidth:         pulumi.Bool(true),
					AllowBandwidthAutoApproval:   pulumi.Bool(false),
					ConnectionRedundancyRequired: pulumi.Bool(false),
					ConnectionLabel:              pulumi.String("Service Profile Tag1"),
					BandwidthAlertThreshold:      pulumi.Float64(10),
					SupportedBandwidths: pulumi.IntArray{
						pulumi.Int(100),
						pulumi.Int(500),
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
