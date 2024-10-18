package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/networkedge"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		sv := networkedge.GetAccountOutput(ctx, networkedge.GetAccountOutputArgs{
			Name:      pulumi.String("account-name"),
			MetroCode: pulumi.String("SV"),
		}, nil)
		testPublicKey, err := networkedge.NewSshKey(ctx, "testPublicKey", &networkedge.SshKeyArgs{
			Name:      pulumi.String("key-name"),
			PublicKey: pulumi.String("ssh-dss key-value"),
			Type:      pulumi.String("DSA"),
		})
		if err != nil {
			return err
		}
		_, err = networkedge.NewDevice(ctx, "bluecatBddsHa", &networkedge.DeviceArgs{
			Name: pulumi.String("tf-bluecat-bdds-p"),
			MetroCode: pulumi.String(sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
				return &sv.MetroCode, nil
			}).(pulumi.StringPtrOutput)),
			TypeCode:     pulumi.String("BLUECAT"),
			SelfManaged:  pulumi.Bool(true),
			Connectivity: pulumi.String("PRIVATE"),
			Byol:         pulumi.Bool(true),
			PackageCode:  pulumi.String("STD"),
			Notifications: pulumi.StringArray{
				pulumi.String("test@equinix.com"),
			},
			AccountNumber: pulumi.String(sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
				return &sv.Number, nil
			}).(pulumi.StringPtrOutput)),
			Version:    pulumi.String("9.6.0"),
			CoreCount:  pulumi.Int(2),
			TermLength: pulumi.Int(12),
			VendorConfiguration: pulumi.StringMap{
				"hostname":        pulumi.String("test"),
				"privateAddress":  pulumi.String("x.x.x.x"),
				"privateCidrMask": pulumi.String("24"),
				"privateGateway":  pulumi.String("x.x.x.x"),
				"licenseKey":      pulumi.String("xxxxx-xxxxx-xxxxx-xxxxx-xxxxx"),
				"licenseId":       pulumi.String("xxxxxxxxxxxxxxx"),
			},
			SshKey: &networkedge.DeviceSshKeyArgs{
				Username: pulumi.String("test-username"),
				KeyName:  testPublicKey.Name,
			},
			SecondaryDevice: &networkedge.DeviceSecondaryDeviceArgs{
				Name: pulumi.String("tf-bluecat-bdds-s"),
				MetroCode: sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
					return &sv.MetroCode, nil
				}).(pulumi.StringPtrOutput),
				Notifications: pulumi.StringArray{
					pulumi.String("test@eq.com"),
				},
				AccountNumber: sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
					return &sv.Number, nil
				}).(pulumi.StringPtrOutput),
				VendorConfiguration: pulumi.StringMap{
					"hostname":        pulumi.String("test"),
					"privateAddress":  pulumi.String("x.x.x.x"),
					"privateCidrMask": pulumi.String("24"),
					"privateGateway":  pulumi.String("x.x.x.x"),
					"licenseKey":      pulumi.String("xxxxx-xxxxx-xxxxx-xxxxx-xxxxx"),
					"licenseId":       pulumi.String("xxxxxxxxxxxxxxx"),
				},
			},
		})
		if err != nil {
			return err
		}
		return nil
	})
}
