package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/networkedge"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		sv := networkedge.GetAccountOutput(ctx, networkedge.GetAccountOutputArgs{
			MetroCode: pulumi.String("SV"),
			Name:      pulumi.String("account-name"),
		}, nil)
		_, err := networkedge.NewDevice(ctx, "FTNT-FIREWALL-SV", &networkedge.DeviceArgs{
			Name:      pulumi.String("TF_FTNT-FIREWALL"),
			ProjectId: pulumi.String("XXXXXXXXXX"),
			MetroCode: pulumi.String(sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
				return &sv.MetroCode, nil
			}).(pulumi.StringPtrOutput)),
			InterfaceCount: pulumi.Int(10),
			TypeCode:       pulumi.String("FG-VM"),
			SelfManaged:    pulumi.Bool(true),
			Byol:           pulumi.Bool(true),
			Connectivity:   pulumi.String("PRIVATE"),
			PackageCode:    pulumi.String("VM02"),
			Notifications: pulumi.StringArray{
				pulumi.String("test@eq.com"),
			},
			AccountNumber: pulumi.String(sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
				return &sv.Number, nil
			}).(pulumi.StringPtrOutput)),
			Version:    pulumi.String("7.6.3"),
			Hostname:   pulumi.String("test"),
			CoreCount:  pulumi.Int(2),
			TermLength: pulumi.Int(1),
			VendorConfiguration: pulumi.StringMap{
				"gatewayIp":     pulumi.String("X.X.X.X"),
				"ipAddress":     pulumi.String("X.X.X.X"),
				"ipAddressType": pulumi.String("STATIC"),
				"subnetMaskIp":  pulumi.String("x.x.x.x"),
			},
			SecondaryDevice: &networkedge.DeviceSecondaryDeviceArgs{
				Name: pulumi.String("TF_FTNT-FIREWALL-secondary"),
				MetroCode: sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
					return &sv.MetroCode, nil
				}).(pulumi.StringPtrOutput),
				Hostname: pulumi.String("fg-vm-znpd"),
				Notifications: pulumi.StringArray{
					pulumi.String("john@equinix.com"),
					pulumi.String("marry@equinix.com"),
				},
				AccountNumber: sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
					return &sv.Number, nil
				}).(pulumi.StringPtrOutput),
				VendorConfiguration: pulumi.StringMap{
					"ipAddressType":         pulumi.String("STATIC"),
					"ipAddress":             pulumi.String("x.x.x.x"),
					"gatewayIp":             pulumi.String("x.x.x.x"),
					"subnetMaskIp":          pulumi.String("x.x.x.x"),
					"managementInterfaceId": pulumi.String("6"),
				},
			},
		})
		if err != nil {
			return err
		}
		return nil
	})
}
