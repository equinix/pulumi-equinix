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
		_, err := networkedge.NewDevice(ctx, "FTNT-SDWAN-SV", &networkedge.DeviceArgs{
			Name:      pulumi.String("TF_VERSA-SDWAN"),
			ProjectId: pulumi.String("XXXXXXXXX"),
			MetroCode: pulumi.String(sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
				return &sv.MetroCode, nil
			}).(pulumi.StringPtrOutput)),
			TypeCode:    pulumi.String("VERSA_SDWAN"),
			SelfManaged: pulumi.Bool(true),
			Byol:        pulumi.Bool(true),
			PackageCode: pulumi.String("FLEX_VNF_2"),
			Notifications: pulumi.StringArray{
				pulumi.String("test@eq.com"),
			},
			AccountNumber: pulumi.String(sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
				return &sv.Number, nil
			}).(pulumi.StringPtrOutput)),
			Version:             pulumi.String("21.2.3"),
			CoreCount:           pulumi.Int(2),
			TermLength:          pulumi.Int(1),
			AdditionalBandwidth: pulumi.Int(50),
			AclTemplateId:       pulumi.String("XXXXXXXXX"),
			VendorConfiguration: pulumi.StringMap{
				"controller1":  pulumi.String("X.X.X.X"),
				"controller2":  pulumi.String("X.X.X.X"),
				"localId":      pulumi.String("test@test.com"),
				"remoteId":     pulumi.String("test@test.com"),
				"serialNumber": pulumi.String("4"),
			},
			SecondaryDevice: &networkedge.DeviceSecondaryDeviceArgs{
				Name: pulumi.String("Praveena_TF_VERSA"),
				MetroCode: sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
					return &sv.MetroCode, nil
				}).(pulumi.StringPtrOutput),
				AccountNumber: sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
					return &sv.Number, nil
				}).(pulumi.StringPtrOutput),
				AclTemplateId: pulumi.String("XXXXXXXX"),
				Notifications: pulumi.StringArray{
					pulumi.String("test@eq.com"),
				},
				VendorConfiguration: pulumi.StringMap{
					"controller1":  pulumi.String("X.X.X.X"),
					"controller2":  pulumi.String("X.X.X.X"),
					"localId":      pulumi.String("test@test.com"),
					"remoteId":     pulumi.String("test@test.com"),
					"serialNumber": pulumi.String("4"),
				},
			},
		})
		if err != nil {
			return err
		}
		return nil
	})
}
