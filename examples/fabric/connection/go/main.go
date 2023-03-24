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
		speedInMbps := 50
		if param := cfg.GetInt("speedInMbps"); param != 0 {
			speedInMbps = param
		}
		fabricPortName := cfg.Require("fabricPortName")
		awsRegion := "eu-central-1"
		if param := cfg.Get("awsRegion"); param != "" {
			awsRegion = param
		}
		awsAccountId := cfg.Require("awsAccountId")
		serviceProfileId := fabric.GetServiceProfiles(ctx, &fabric.GetServiceProfilesArgs{
			Filter: fabric.GetServiceProfilesFilter{
				Property: pulumi.StringRef("/name"),
				Operator: pulumi.StringRef("="),
				Values: []string{
					"AWS Direct Connect",
				},
			},
		}, nil).Data[0].Uuid
		portId := fabric.GetPorts(ctx, &fabric.GetPortsArgs{
			Filter: fabric.GetPortsFilter{
				Name: pulumi.StringRef(fabricPortName),
			},
		}, nil).Data[0].Uuid
		colo2Aws, err := fabric.NewConnection(ctx, "colo2Aws", &fabric.ConnectionArgs{
			Name: pulumi.String("Pulumi-colo2Aws"),
			Type: pulumi.String("EVPL_VC"),
			Notifications: fabric.ConnectionNotificationArray{
				&fabric.ConnectionNotificationArgs{
					Type: pulumi.String("ALL"),
					Emails: pulumi.StringArray{
						pulumi.String("example@equinix.com"),
					},
				},
			},
			Bandwidth: pulumi.Int(speedInMbps),
			Redundancy: &fabric.ConnectionRedundancyArgs{
				Priority: pulumi.String("PRIMARY"),
			},
			ASide: &fabric.ConnectionASideArgs{
				AccessPoint: &fabric.ConnectionASideAccessPointArgs{
					Type: pulumi.String("COLO"),
					Port: &fabric.ConnectionASideAccessPointPortArgs{
						Uuid: *pulumi.String(portId),
					},
					LinkProtocol: &fabric.ConnectionASideAccessPointLinkProtocolArgs{
						Type:    pulumi.String("DOT1Q"),
						VlanTag: pulumi.Int(1234),
					},
				},
			},
			ZSide: &fabric.ConnectionZSideArgs{
				AccessPoint: &fabric.ConnectionZSideAccessPointArgs{
					Type:              pulumi.String("SP"),
					AuthenticationKey: pulumi.String(awsAccountId),
					SellerRegion:      pulumi.String(awsRegion),
					Profile: &fabric.ConnectionZSideAccessPointProfileArgs{
						Type: pulumi.String("L2_PROFILE"),
						Uuid: *pulumi.String(serviceProfileId),
					},
					Location: &fabric.ConnectionZSideAccessPointLocationArgs{
						MetroCode: pulumi.String(metro),
					},
				},
			},
		})
		if err != nil {
			return err
		}
		ctx.Export("connectionId", colo2Aws.ID())
		ctx.Export("connectionStatus", colo2Aws.Operation.ApplyT(func(operation fabric.ConnectionOperation) (*string, error) {
			return &operation.EquinixStatus, nil
		}).(pulumi.StringPtrOutput))
		ctx.Export("connectionProviderStatus", colo2Aws.Operation.ApplyT(func(operation fabric.ConnectionOperation) (*string, error) {
			return &operation.ProviderStatus, nil
		}).(pulumi.StringPtrOutput))
		ctx.Export("awsDirectConnectId", colo2Aws.ZSide.ApplyT(func(zSide fabric.ConnectionZSide) (*string, error) {
			return &zSide.AccessPoint.ProviderConnectionId, nil
		}).(pulumi.StringPtrOutput))
		return nil
	})
}
