package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/networkedge"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		sv, err := networkedge.GetAccount(ctx, &networkedge.GetAccountArgs{
			Name:      pulumi.StringRef("account-name"),
			MetroCode: "SV",
		}, nil)
		if err != nil {
			return err
		}
		_, err = networkedge.NewDevice(ctx, "vsrxSingle", &networkedge.DeviceArgs{
			Name:        pulumi.String("tf-c8kv-sdwan"),
			MetroCode:   pulumi.String(sv.MetroCode),
			TypeCode:    pulumi.String("VSRX"),
			SelfManaged: pulumi.Bool(true),
			Byol:        pulumi.Bool(true),
			PackageCode: pulumi.String("STD"),
			Notifications: pulumi.StringArray{
				pulumi.String("test@equinix.com"),
			},
			Hostname:            pulumi.String("VSRX"),
			AccountNumber:       pulumi.String(sv.Number),
			Version:             pulumi.String("23.2R1.13"),
			CoreCount:           pulumi.Int(2),
			TermLength:          pulumi.Int(12),
			AdditionalBandwidth: pulumi.Int(5),
			ProjectId:           pulumi.String("a86d7112-d740-4758-9c9c-31e66373746b"),
			DiverseDeviceId:     pulumi.String("ed7891bd-15b4-4f72-ac56-d96cfdacddcc"),
			SshKey: &networkedge.DeviceSshKeyArgs{
				Username: pulumi.String("test-username"),
				KeyName:  pulumi.String("valid-key-name"),
			},
			AclTemplateId: pulumi.String("3e548c02-9164-4197-aa23-05b1f644883c"),
		})
		if err != nil {
			return err
		}
		return nil
	})
}
