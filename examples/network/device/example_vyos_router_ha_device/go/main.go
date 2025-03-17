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
		_, err := networkedge.NewDevice(ctx, "VYOS-AM", &networkedge.DeviceArgs{
			Name:      pulumi.String("TF_VYOS"),
			ProjectId: pulumi.String("XXXXXXX"),
			MetroCode: pulumi.String(sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
				return &sv.MetroCode, nil
			}).(pulumi.StringPtrOutput)),
			TypeCode:    pulumi.String("VYOS-ROUTER"),
			SelfManaged: pulumi.Bool(true),
			Byol:        pulumi.Bool(false),
			PackageCode: pulumi.String("STD"),
			Notifications: pulumi.StringArray{
				pulumi.String("test@eq.com"),
			},
			AccountNumber: pulumi.String(sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
				return &sv.Number, nil
			}).(pulumi.StringPtrOutput)),
			Version:             pulumi.String("1.4.1-2501"),
			Hostname:            pulumi.String("test"),
			CoreCount:           pulumi.Int(2),
			TermLength:          pulumi.Int(1),
			AdditionalBandwidth: pulumi.Int(50),
			AclTemplateId:       pulumi.String("XXXXXXXX"),
			SshKey: &networkedge.DeviceSshKeyArgs{
				Username: pulumi.String("test"),
				KeyName:  pulumi.String("xxxxxxxx"),
			},
			SecondaryDevice: &networkedge.DeviceSecondaryDeviceArgs{
				Name: pulumi.String("TF_CHECKPOINT"),
				MetroCode: sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
					return &sv.MetroCode, nil
				}).(pulumi.StringPtrOutput),
				AccountNumber: sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
					return &sv.Number, nil
				}).(pulumi.StringPtrOutput),
				Hostname:      pulumi.String("test"),
				AclTemplateId: pulumi.String("XXXXXXXXXXX"),
				Notifications: pulumi.StringArray{
					pulumi.String("test@eq.com"),
				},
			},
		})
		if err != nil {
			return err
		}
		return nil
	})
}
