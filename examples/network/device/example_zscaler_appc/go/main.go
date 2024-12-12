package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/networkedge"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		sv, err := networkedge.GetAccount(ctx, &networkedge.GetAccountArgs{
			MetroCode: "SV",
		}, nil)
		if err != nil {
			return err
		}
		_, err = networkedge.NewDevice(ctx, "zscaler-appc-single", &networkedge.DeviceArgs{
			Name:         pulumi.String("tf-zscaler-appc"),
			ProjectId:    pulumi.String("XXXXXX"),
			MetroCode:    pulumi.String(sv.MetroCode),
			TypeCode:     pulumi.String("ZSCALER-APPC"),
			SelfManaged:  pulumi.Bool(true),
			Byol:         pulumi.Bool(true),
			Connectivity: pulumi.String("PRIVATE"),
			PackageCode:  pulumi.String("STD"),
			Notifications: pulumi.StringArray{
				pulumi.String("john@equinix.com"),
				pulumi.String("marry@equinix.com"),
				pulumi.String("fred@equinix.com"),
			},
			TermLength:     pulumi.Int(12),
			AccountNumber:  pulumi.String(sv.Number),
			Version:        pulumi.String("23.395.1"),
			InterfaceCount: pulumi.Int(1),
			CoreCount:      pulumi.Int(4),
			VendorConfiguration: pulumi.StringMap{
				"provisioningKey": pulumi.String("XXXXXXXXXX"),
				"hostname":        pulumi.String("XXXX"),
			},
			SshKey: &networkedge.DeviceSshKeyArgs{
				Username: pulumi.String("test"),
				KeyName:  pulumi.String("test-key"),
			},
		})
		if err != nil {
			return err
		}
		return nil
	})
}
