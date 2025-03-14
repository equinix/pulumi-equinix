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
		_, err = networkedge.NewDevice(ctx, "aristaHa", &networkedge.DeviceArgs{
			Name: pulumi.String("tf-arista-p"),
			MetroCode: pulumi.String(sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
				return &sv.MetroCode, nil
			}).(pulumi.StringPtrOutput)),
			TypeCode:     pulumi.String("ARISTA-ROUTER"),
			SelfManaged:  pulumi.Bool(true),
			Connectivity: pulumi.String("PRIVATE"),
			Byol:         pulumi.Bool(true),
			PackageCode:  pulumi.String("CloudEOS"),
			Notifications: pulumi.StringArray{
				pulumi.String("test@equinix.com"),
			},
			Hostname: pulumi.String("arista-p"),
			AccountNumber: pulumi.String(sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
				return &sv.Number, nil
			}).(pulumi.StringPtrOutput)),
			Version:             pulumi.String("4.29.0"),
			CoreCount:           pulumi.Int(4),
			TermLength:          pulumi.Int(12),
			AdditionalBandwidth: pulumi.Int(5),
			SshKey: &networkedge.DeviceSshKeyArgs{
				Username: pulumi.String("test-username"),
				KeyName:  testPublicKey.Name,
			},
			AclTemplateId: pulumi.String("c637a17b-7a6a-4486-924b-30e6c36904b0"),
			SecondaryDevice: &networkedge.DeviceSecondaryDeviceArgs{
				Name: pulumi.String("tf-arista-s"),
				MetroCode: sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
					return &sv.MetroCode, nil
				}).(pulumi.StringPtrOutput),
				Hostname: pulumi.String("arista-s"),
				Notifications: pulumi.StringArray{
					pulumi.String("test@eq.com"),
				},
				AccountNumber: sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
					return &sv.Number, nil
				}).(pulumi.StringPtrOutput),
				AclTemplateId: pulumi.String("fee5e2c0-6198-4ce6-9cbd-bbe6c1dbe138"),
			},
		})
		if err != nil {
			return err
		}
		return nil
	})
}
