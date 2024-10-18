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
		_, err := networkedge.NewDevice(ctx, "c8kvSingle", &networkedge.DeviceArgs{
			Name: pulumi.String("tf-c8kv"),
			MetroCode: pulumi.String(sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
				return &sv.MetroCode, nil
			}).(pulumi.StringPtrOutput)),
			TypeCode:    pulumi.String("C8000V"),
			SelfManaged: pulumi.Bool(true),
			Byol:        pulumi.Bool(true),
			PackageCode: pulumi.String("network-essentials"),
			Notifications: pulumi.StringArray{
				pulumi.String("test@equinix.com"),
			},
			Hostname: pulumi.String("C8KV"),
			AccountNumber: pulumi.String(sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
				return &sv.Number, nil
			}).(pulumi.StringPtrOutput)),
			Version:             pulumi.String("17.06.01a"),
			CoreCount:           pulumi.Int(2),
			TermLength:          pulumi.Int(12),
			LicenseToken:        pulumi.String("valid-license-token"),
			AdditionalBandwidth: pulumi.Int(5),
			SshKey: &networkedge.DeviceSshKeyArgs{
				Username: pulumi.String("test-username"),
				KeyName:  pulumi.String("valid-key-name"),
			},
			AclTemplateId: pulumi.String("3e548c02-9164-4197-aa23-05b1f644883c"),
		})
		if err != nil {
			return err
		}
		return nil
	})
}
