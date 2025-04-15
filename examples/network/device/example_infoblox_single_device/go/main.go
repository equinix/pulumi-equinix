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
		_, err := networkedge.NewDevice(ctx, "INFOBLOX-SV", &networkedge.DeviceArgs{
			Name:      pulumi.String("TF_INFOBLOX"),
			ProjectId: pulumi.String("XXXXXXXXXX"),
			MetroCode: pulumi.String(sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
				return &sv.MetroCode, nil
			}).(pulumi.StringPtrOutput)),
			TypeCode:     pulumi.String("INFOBLOX-GRID-MEMBER"),
			SelfManaged:  pulumi.Bool(true),
			Byol:         pulumi.Bool(true),
			Connectivity: pulumi.String("PRIVATE"),
			PackageCode:  pulumi.String("STD"),
			Notifications: pulumi.StringArray{
				pulumi.String("test@eq.com"),
			},
			AccountNumber: pulumi.String(sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
				return &sv.Number, nil
			}).(pulumi.StringPtrOutput)),
			Version:    pulumi.String("9.0.5"),
			CoreCount:  pulumi.Int(8),
			TermLength: pulumi.Int(1),
			VendorConfiguration: pulumi.StringMap{
				"adminPassword": pulumi.String("xxxxxx"),
				"ipAddress":     pulumi.String("X.X.X.X"),
				"subnetMaskIp":  pulumi.String("X.X.X.X"),
				"gatewayIp":     pulumi.String("X.X.X.X"),
			},
		})
		if err != nil {
			return err
		}
		return nil
	})
}
