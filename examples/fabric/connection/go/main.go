package main

import (
	"fmt"

	"github.com/equinix/pulumi-equinix/sdk/go/equinix/fabric"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		cfg := config.New(ctx, "")
		speedInMbps := 50
		if param := cfg.GetInt("speedInMbps"); param != 0 {
			speedInMbps = param
		}
		linkProtocolType := "QINQ"
		if param := cfg.Get("linkProtocolType"); param != "" {
			linkProtocolType = param
		}
		linkProtocolStag := 2019
		if param := cfg.GetInt("linkProtocolStag"); param != 0 {
			linkProtocolStag = param
		}
		linkProtocolCtag := 2112
		if param := cfg.GetInt("linkProtocolCtag"); param != 0 {
			linkProtocolCtag = param
		}
		portName := cfg.Require("portName")
		serviceProfileName := "AWS Direct Connect"
		if param := cfg.Get("serviceProfileName"); param != "" {
			serviceProfileName = param
		}
		serviceProfileRegion := "us-west-1"
		if param := cfg.Get("serviceProfileRegion"); param != "" {
			serviceProfileRegion = param
		}
		serviceProfileMetro := "SV"
		if param := cfg.Get("serviceProfileMetro"); param != "" {
			serviceProfileMetro = param
		}
		serviceProfileAuthKey := cfg.Require("serviceProfileAuthKey")
		serviceProfileId := fabric.GetServiceProfiles(ctx, &fabric.GetServiceProfilesArgs{
			Filter: fabric.GetServiceProfilesFilter{
				Property: pulumi.StringRef("/name"),
				Operator: pulumi.StringRef("="),
				Values: []string{
					serviceProfileName,
				},
			},
		}, nil).Data.Uuid
		portId := fabric.GetPorts(ctx, &fabric.GetPortsArgs{
			Filters: []fabric.GetPortsFilter{
				{
					Name: pulumi.StringRef(portName),
				},
			},
		}, nil).Data.Uuid
		colo2Aws, err := fabric.NewConnection(ctx, "colo2Aws", &fabric.ConnectionArgs{
			Name: pulumi.String("colo2Aws"),
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
						Uuid: fabric.GetPortsDatum(portId),
					},
					LinkProtocol: &fabric.ConnectionASideAccessPointLinkProtocolArgs{
						Type:     pulumi.String(linkProtocolType),
						VlanSTag: pulumi.Int(linkProtocolStag),
						VlanTag:  pulumi.Int(linkProtocolCtag),
					},
				},
			},
			ZSide: &fabric.ConnectionZSideArgs{
				AccessPoint: &fabric.ConnectionZSideAccessPointArgs{
					Type:              pulumi.String("SP"),
					AuthenticationKey: pulumi.String(serviceProfileAuthKey),
					SellerRegion:      pulumi.String(serviceProfileRegion),
					Profile: &fabric.ConnectionZSideAccessPointProfileArgs{
						Type: pulumi.String("L2_PROFILE"),
						Uuid: fabric.GetServiceProfilesDatum(serviceProfileId),
					},
					Location: &fabric.ConnectionZSideAccessPointLocationArgs{
						MetroCode: pulumi.String(serviceProfileMetro),
					},
				},
			},
		})
		if err != nil {
			return err
		}
		ctx.Export("connectionId", colo2Aws.ID().ApplyT(func(id string) (string, error) {
			return fmt.Sprintf("http://%v", id), nil
		}).(pulumi.StringOutput))
		return nil
	})
}
