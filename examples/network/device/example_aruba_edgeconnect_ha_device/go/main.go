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
		_, err := networkedge.NewDevice(ctx, "ARUBA-EDGECONNECT-AM", &networkedge.DeviceArgs{
			Name:      pulumi.String("TF_Aruba_Edge_Connect"),
			ProjectId: pulumi.String("XXXXX"),
			MetroCode: pulumi.String(sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
				return &sv.MetroCode, nil
			}).(pulumi.StringPtrOutput)),
			TypeCode:    pulumi.String("EDGECONNECT-SDWAN"),
			SelfManaged: pulumi.Bool(true),
			Byol:        pulumi.Bool(true),
			PackageCode: pulumi.String("EC-V"),
			Notifications: pulumi.StringArray{
				pulumi.String("test@eq.com"),
			},
			AccountNumber: pulumi.String(sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
				return &sv.Number, nil
			}).(pulumi.StringPtrOutput)),
			Version:             pulumi.String("9.4.2.3"),
			CoreCount:           pulumi.Int(2),
			TermLength:          pulumi.Int(1),
			AdditionalBandwidth: pulumi.Int(50),
			InterfaceCount:      pulumi.Int(32),
			AclTemplateId:       pulumi.String("XXXXXXX"),
			VendorConfiguration: pulumi.StringMap{
				"accountKey":   pulumi.String("xxxxx"),
				"accountName":  pulumi.String("xxxx"),
				"applianceTag": pulumi.String("tests"),
				"hostname":     pulumi.String("test"),
			},
			SecondaryDevice: &networkedge.DeviceSecondaryDeviceArgs{
				Name: pulumi.String("TF_CHECKPOINT"),
				MetroCode: sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
					return &sv.MetroCode, nil
				}).(pulumi.StringPtrOutput),
				AccountNumber: sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
					return &sv.Number, nil
				}).(pulumi.StringPtrOutput),
				AclTemplateId: pulumi.String("XXXXXXX"),
				Notifications: pulumi.StringArray{
					pulumi.String("test@eq.com"),
				},
				VendorConfiguration: pulumi.StringMap{
					"accountKey":   pulumi.String("xxxxx"),
					"accountName":  pulumi.String("xxxx"),
					"applianceTag": pulumi.String("test"),
					"hostname":     pulumi.String("test"),
				},
			},
		})
		if err != nil {
			return err
		}
		return nil
	})
}
