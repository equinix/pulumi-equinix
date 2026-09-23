package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/fabric"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		_, err := fabric.NewServiceToken(ctx, "test", &fabric.ServiceTokenArgs{
			Notifications: fabric.ServiceTokenNotificationArray{
				&fabric.ServiceTokenNotificationArgs{
					Type: pulumi.String("ALL"),
					Emails: pulumi.StringArray{
						pulumi.String("example@equinix.com"),
					},
				},
			},
			ServiceTokenConnections: fabric.ServiceTokenServiceTokenConnectionArray{
				&fabric.ServiceTokenServiceTokenConnectionArgs{
					ZSides: fabric.ServiceTokenServiceTokenConnectionZSideArray{
						&fabric.ServiceTokenServiceTokenConnectionZSideArgs{
							AccessPointSelectors: fabric.ServiceTokenServiceTokenConnectionZSideAccessPointSelectorArray{
								&fabric.ServiceTokenServiceTokenConnectionZSideAccessPointSelectorArgs{
									VirtualDevice: &fabric.ServiceTokenServiceTokenConnectionZSideAccessPointSelectorVirtualDeviceArgs{
										Type: pulumi.String("EDGE"),
										Uuid: pulumi.String("<device_uuid>"),
									},
									Interface: &fabric.ServiceTokenServiceTokenConnectionZSideAccessPointSelectorInterfaceArgs{
										Type: pulumi.String("NETWORK"),
									},
									Type: pulumi.String("VD"),
								},
							},
						},
					},
					Type: pulumi.String("EVPL_VC"),
					SupportedBandwidths: pulumi.IntArray{
						pulumi.Int(50),
						pulumi.Int(200),
						pulumi.Int(10000),
					},
				},
			},
			Type:               pulumi.String("VC_TOKEN"),
			Description:        pulumi.String("Zside VD Service Token"),
			ExpirationDateTime: pulumi.String("2025-01-18T06:43:49.986Z"),
		})
		if err != nil {
			return err
		}
		return nil
	})
}
