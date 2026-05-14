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
		_, err := networkedge.NewDevice(ctx, "six-wind-vsr", &networkedge.DeviceArgs{
			Name:      pulumi.String("6WIND-VSR"),
			ProjectId: pulumi.String("xxxxxxx"),
			MetroCode: pulumi.String(sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
				return &sv.MetroCode, nil
			}).(pulumi.StringPtrOutput)),
			TypeCode:       pulumi.String("6WIND-VSR"),
			SelfManaged:    pulumi.Bool(true),
			Byol:           pulumi.Bool(true),
			InterfaceCount: pulumi.Int(10),
			PackageCode:    pulumi.String("STD"),
			Notifications: pulumi.StringArray{
				pulumi.String("test@eq.com"),
			},
			AccountNumber: pulumi.String(sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
				return &sv.Number, nil
			}).(pulumi.StringPtrOutput)),
			Version:    pulumi.String("3.10.8"),
			CoreCount:  pulumi.Int(2),
			TermLength: pulumi.Int(1),
			VendorConfiguration: pulumi.StringMap{
				"hostname": pulumi.String("test"),
				"token":    pulumi.String("xxxx"),
			},
			SshKey: &networkedge.DeviceSshKeyArgs{
				Username: pulumi.String("xxxx"),
				KeyName:  pulumi.String("xxxxx"),
			},
			SecondaryDevice: &networkedge.DeviceSecondaryDeviceArgs{
				Name: pulumi.String("6WIND-VSR-Sec"),
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
					"token":    pulumi.String("xxxx"),
				},
			},
		})
		if err != nil {
			return err
		}
		return nil
	})
}
