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
		_, err := networkedge.NewDevice(ctx, "netskope-npa", &networkedge.DeviceArgs{
			SecondaryDevice: &networkedge.DeviceSecondaryDeviceArgs{
				Name: pulumi.String("NETSKOPE-NPA-Sec"),
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
					"hostname":            pulumi.String("test"),
					"privateCidrMask":     pulumi.String("24"),
					"ipAddressType":       pulumi.String("STATIC"),
					"ipAddress":           pulumi.String("x.x.x.x"),
					"gatewayIp":           pulumi.String("x.x.x.x"),
					"primaryNameServer":   pulumi.String("x.x.x.x"),
					"secondaryNameServer": pulumi.String("x.x.x.x"),
					"dnsSearchDomain":     pulumi.String("xxxxx"),
				},
			},
			Name:      pulumi.String("NETSKOPE-NPA"),
			ProjectId: pulumi.String("xxxxxxx"),
			MetroCode: pulumi.String(sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
				return &sv.MetroCode, nil
			}).(pulumi.StringPtrOutput)),
			TypeCode:       pulumi.String("NETSKOPE-NPA"),
			SelfManaged:    pulumi.Bool(true),
			Byol:           pulumi.Bool(true),
			InterfaceCount: pulumi.Int(1),
			PackageCode:    pulumi.String("STD"),
			Notifications: pulumi.StringArray{
				pulumi.String("test@eq.com"),
			},
			Connectivity: pulumi.String("PRIVATE"),
			AccountNumber: pulumi.String(sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
				return &sv.Number, nil
			}).(pulumi.StringPtrOutput)),
			Version:    pulumi.String("R138"),
			CoreCount:  pulumi.Int(2),
			TermLength: pulumi.Int(1),
			VendorConfiguration: pulumi.StringMap{
				"hostname":            pulumi.String("test"),
				"privateCidrMask":     pulumi.String("24"),
				"ipAddressType":       pulumi.String("STATIC"),
				"ipAddress":           pulumi.String("x.x.x.x"),
				"gatewayIp":           pulumi.String("x.x.x.x"),
				"primaryNameServer":   pulumi.String("x.x.x.x"),
				"secondaryNameServer": pulumi.String("x.x.x.x"),
				"dnsSearchDomain":     pulumi.String("xxxxx"),
			},
		})
		if err != nil {
			return err
		}
		return nil
	})
}
