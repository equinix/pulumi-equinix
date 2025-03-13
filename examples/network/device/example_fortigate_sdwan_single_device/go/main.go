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
			Name:      pulumi.String("TF_FTNT-SDWAN"),
			ProjectId: pulumi.String("XXXXXXXXXX"),
			MetroCode: pulumi.String(sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
				return &sv.MetroCode, nil
			}).(pulumi.StringPtrOutput)),
			TypeCode:    pulumi.String("FG-SDWAN"),
			SelfManaged: pulumi.Bool(true),
			Byol:        pulumi.Bool(true),
			PackageCode: pulumi.String("VM02"),
			Notifications: pulumi.StringArray{
				pulumi.String("test@eq.com"),
			},
			AccountNumber: pulumi.String(sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
				return &sv.Number, nil
			}).(pulumi.StringPtrOutput)),
			Version:             pulumi.String("7.0.14"),
			Hostname:            pulumi.String("test"),
			CoreCount:           pulumi.Int(2),
			TermLength:          pulumi.Int(1),
			AdditionalBandwidth: pulumi.Int(50),
			AclTemplateId:       pulumi.String("XXXXXXXX"),
			VendorConfiguration: pulumi.StringMap{
				"adminPassword": pulumi.String("XXXXX"),
				"controller1":   pulumi.String("X.X.X.X"),
			},
		})
		if err != nil {
			return err
		}
		return nil
	})
}
