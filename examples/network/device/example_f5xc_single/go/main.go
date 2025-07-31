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
		_, err := networkedge.NewDevice(ctx, "f5xc-single", &networkedge.DeviceArgs{
			Name:      pulumi.String("tf-f5xc"),
			ProjectId: pulumi.String("XXXXXX"),
			MetroCode: pulumi.String(sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
				return &sv.MetroCode, nil
			}).(pulumi.StringPtrOutput)),
			TypeCode:     pulumi.String("F5XC"),
			SelfManaged:  pulumi.Bool(true),
			Byol:         pulumi.Bool(true),
			Connectivity: pulumi.String("INTERNET-ACCESS"),
			PackageCode:  pulumi.String("STD"),
			Notifications: pulumi.StringArray{
				pulumi.String("john@equinix.com"),
				pulumi.String("marry@equinix.com"),
				pulumi.String("fred@equinix.com"),
			},
			TermLength: pulumi.Int(1),
			AccountNumber: pulumi.String(sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
				return &sv.Number, nil
			}).(pulumi.StringPtrOutput)),
			AclTemplateId:  pulumi.String("xxxx"),
			Version:        pulumi.String("9.2025.17"),
			InterfaceCount: pulumi.Int(8),
			CoreCount:      pulumi.Int(8),
			VendorConfiguration: pulumi.StringMap{
				"token":    pulumi.String("XXXXXXXXXX"),
				"hostname": pulumi.String("XXXX"),
			},
		})
		if err != nil {
			return err
		}
		return nil
	})
}
