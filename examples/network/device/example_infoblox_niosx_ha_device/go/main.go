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
		_, err := networkedge.NewDevice(ctx, "nios-x-ha", &networkedge.DeviceArgs{
			SecondaryDevice: &networkedge.DeviceSecondaryDeviceArgs{
				Name: pulumi.String("TF_INFOBLOX-NIOS-X-Sec"),
				MetroCode: sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
					return &sv.MetroCode, nil
				}).(pulumi.StringPtrOutput),
				AccountNumber: sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
					return &sv.Number, nil
				}).(pulumi.StringPtrOutput),
				Notifications: pulumi.StringArray{
					pulumi.String("test@eq.com"),
				},
				VendorConfiguration: pulumi.StringMap{
					"hostname": pulumi.String("test"),
					"token":    pulumi.String("xxxxx"),
				},
			},
			Name:      pulumi.String("TF_INFOBLOX-NIOS-X"),
			ProjectId: pulumi.String("xxxxxxx"),
			MetroCode: pulumi.String(sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
				return &sv.MetroCode, nil
			}).(pulumi.StringPtrOutput)),
			TypeCode:     pulumi.String("INFOBLOX-NIOSX"),
			SelfManaged:  pulumi.Bool(true),
			Connectivity: pulumi.String("INTERNET-ACCESS"),
			Byol:         pulumi.Bool(true),
			PackageCode:  pulumi.String("STD"),
			Notifications: pulumi.StringArray{
				pulumi.String("test@eq.com"),
			},
			AccountNumber: pulumi.String(sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
				return &sv.Number, nil
			}).(pulumi.StringPtrOutput)),
			Version:        pulumi.String("4.0"),
			CoreCount:      pulumi.Int(3),
			InterfaceCount: pulumi.Int(5),
			TermLength:     pulumi.Int(1),
			VendorConfiguration: pulumi.StringMap{
				"hostname": pulumi.String("test"),
				"token":    pulumi.String("xxxxx"),
			},
		})
		if err != nil {
			return err
		}
		return nil
	})
}
