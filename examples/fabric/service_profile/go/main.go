package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/fabric"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		profile, err := fabric.NewServiceProfile(ctx, "profile", &fabric.ServiceProfileArgs{
			Name:        pulumi.String("Example Cloud Provider"),
			Description: pulumi.String("50 to 500 Mbps Hosted Connection to Example Cloud"),
			Type:        pulumi.String("L2_PROFILE"),
			AccessPointTypeConfigs: fabric.ServiceProfileAccessPointTypeConfigArray{
				&fabric.ServiceProfileAccessPointTypeConfigArgs{
					Type: pulumi.String("COLO"),
					SupportedBandwidths: pulumi.IntArray{
						pulumi.Int(50),
						pulumi.Int(100),
						pulumi.Int(200),
						pulumi.Int(500),
					},
					AllowRemoteConnections:     pulumi.Bool(true),
					AllowCustomBandwidth:       pulumi.Bool(false),
					AllowBandwidthAutoApproval: pulumi.Bool(false),
					LinkProtocolConfig: &fabric.ServiceProfileAccessPointTypeConfigLinkProtocolConfigArgs{
						EncapsulationStrategy: pulumi.String("CTAGED"),
						ReuseVlanSTag:         pulumi.Bool(false),
						Encapsulation:         pulumi.String("DOT1Q"),
					},
					EnableAutoGenerateServiceKey: pulumi.Bool("false,"),
					ConnectionRedundancyRequired: pulumi.Bool("false,"),
					ApiConfig: &fabric.ServiceProfileAccessPointTypeConfigApiConfigArgs{
						ApiAvailable:     pulumi.Bool(true),
						IntegrationId:    pulumi.String("Example-Connect-01"),
						BandwidthFromApi: pulumi.Bool(false),
					},
					ConnectionLabel: pulumi.String("Virtual Circuit Name"),
					AuthenticationKey: &fabric.ServiceProfileAccessPointTypeConfigAuthenticationKeyArgs{
						Required: pulumi.Bool(true),
						Label:    pulumi.String("Example ACCOUNT ID"),
					},
				},
			},
			Account: &fabric.ServiceProfileAccountArgs{
				OrganizationName:       pulumi.String("Example Cloud"),
				GlobalOrganizationName: pulumi.String("Example Global"),
			},
			Metros:     nil,
			Visibility: pulumi.String("PUBLIC"),
			MarketingInfo: &fabric.ServiceProfileMarketingInfoArgs{
				Promotion: pulumi.Bool(true),
			},
		})
		if err != nil {
			return err
		}
		ctx.Export("profileId", profile.ID())
		return nil
	})
}
