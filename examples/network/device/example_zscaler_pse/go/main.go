package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/networkedge"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		sv := networkedge.GetAccountOutput(ctx, networkedge.GetAccountOutputArgs{
			MetroCode: pulumi.String("SV"),
		}, nil)
		_, err := networkedge.NewDevice(ctx, "zscaler-pse-single", &networkedge.DeviceArgs{
			Name:      pulumi.String("tf-zscaler-pse"),
			ProjectId: pulumi.String("XXXXXX"),
			MetroCode: pulumi.String(sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
				return &sv.MetroCode, nil
			}).(pulumi.StringPtrOutput)),
			TypeCode:     pulumi.String("ZSCALER-PSE"),
			SelfManaged:  pulumi.Bool(true),
			Byol:         pulumi.Bool(true),
			Connectivity: pulumi.String("PRIVATE"),
			PackageCode:  pulumi.String("STD"),
			Notifications: pulumi.StringArray{
				pulumi.String("john@equinix.com"),
				pulumi.String("marry@equinix.com"),
				pulumi.String("fred@equinix.com"),
			},
			TermLength: pulumi.Int(12),
			AccountNumber: pulumi.String(sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
				return &sv.Number, nil
			}).(pulumi.StringPtrOutput)),
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
