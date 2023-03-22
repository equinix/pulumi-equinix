package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/networkedge"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		cfg := config.New(ctx, "")
		accountName := cfg.Require("accountName")
		licenseToken := cfg.Require("licenseToken")
		sshUserName := cfg.Require("sshUserName")
		sshKeyName := cfg.Require("sshKeyName")
		aclTemplateId := cfg.Require("aclTemplateId")
		metro := "SV"
		if param := cfg.Get("metro"); param != "" {
			metro = param
		}
		devicePackageCode := "network-essentials"
		if param := cfg.Get("devicePackageCode"); param != "" {
			devicePackageCode = param
		}
		deviceVersion := "17.06.01a"
		if param := cfg.Get("deviceVersion"); param != "" {
			deviceVersion = param
		}
		sizeInCores := 2
		if param := cfg.GetInt("sizeInCores"); param != 0 {
			sizeInCores = param
		}
		termLength := 6
		if param := cfg.GetInt("termLength"); param != 0 {
			termLength = param
		}
		additionalBandwidth := 5
		if param := cfg.GetInt("additionalBandwidth"); param != 0 {
			additionalBandwidth = param
		}
		accountNum := networkedge.GetAccount(ctx, &networkedge.GetAccountArgs{
			Name:      pulumi.StringRef(accountName),
			MetroCode: metro,
		}, nil).Number
		c8KRouter, err := networkedge.NewDevice(ctx, "c8kRouter", &networkedge.DeviceArgs{
			Name:        pulumi.String("catalystRouter"),
			MetroCode:   pulumi.String(metro),
			TypeCode:    pulumi.String("C8000V"),
			SelfManaged: pulumi.Bool(true),
			Byol:        pulumi.Bool(true),
			PackageCode: pulumi.String(devicePackageCode),
			Notifications: pulumi.StringArray{
				pulumi.String("example@equinix.com"),
			},
			Hostname:            pulumi.String("C8KV"),
			AccountNumber:       *pulumi.String(accountNum),
			Version:             pulumi.Any(version),
			CoreCount:           pulumi.Int(sizeInCores),
			TermLength:          pulumi.Int(termLength),
			LicenseToken:        pulumi.String(licenseToken),
			AdditionalBandwidth: pulumi.Int(additionalBandwidth),
			SshKey: &networkedge.DeviceSshKeyArgs{
				Username: pulumi.String(sshUserName),
				KeyName:  pulumi.String(sshKeyName),
			},
			AclTemplateId: pulumi.String(aclTemplateId),
		})
		if err != nil {
			return err
		}
		ctx.Export("routerId", c8KRouter.ID())
		ctx.Export("provisionStatus", c8KRouter.Status)
		ctx.Export("licenseStatus", c8KRouter.LicenseStatus)
		ctx.Export("sshIpAddress", c8KRouter.SshIpAddress)
		return nil
	})
}
