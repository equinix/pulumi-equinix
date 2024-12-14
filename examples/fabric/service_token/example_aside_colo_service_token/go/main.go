package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/fabric"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		_, err := fabric.NewServiceToken(ctx, "test", &fabric.ServiceTokenArgs{
			Type:               pulumi.String("VC_TOKEN"),
			Description:        pulumi.String("Aside COLO Service Token"),
			ExpirationDateTime: pulumi.String("2025-01-18T06:43:49.981Z"),
			ServiceTokenConnections: fabric.ServiceTokenServiceTokenConnectionArray{
				&fabric.ServiceTokenServiceTokenConnectionArgs{
					Type:           pulumi.String("EVPL_VC"),
					BandwidthLimit: pulumi.Int(1000),
					ASides: fabric.ServiceTokenServiceTokenConnectionASideArray{
						&fabric.ServiceTokenServiceTokenConnectionASideArgs{
							AccessPointSelectors: fabric.ServiceTokenServiceTokenConnectionASideAccessPointSelectorArray{
								&fabric.ServiceTokenServiceTokenConnectionASideAccessPointSelectorArgs{
									Type: pulumi.String("COLO"),
									Port: &fabric.ServiceTokenServiceTokenConnectionASideAccessPointSelectorPortArgs{
										Uuid: pulumi.String("<port_uuid>"),
									},
									LinkProtocol: &fabric.ServiceTokenServiceTokenConnectionASideAccessPointSelectorLinkProtocolArgs{
										Type:    pulumi.String("DOT1Q"),
										VlanTag: pulumi.Int(2987),
									},
								},
							},
						},
					},
				},
			},
			Notifications: fabric.ServiceTokenNotificationArray{
				&fabric.ServiceTokenNotificationArgs{
					Type: pulumi.String("ALL"),
					Emails: pulumi.StringArray{
						pulumi.String("example@equinix.com"),
						pulumi.String("test1@equinix.com"),
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
