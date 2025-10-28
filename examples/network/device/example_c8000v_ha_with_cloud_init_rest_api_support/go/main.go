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
		_, err := networkedge.NewDevice(ctx, "c8000v-byol", &networkedge.DeviceArgs{
			Name: pulumi.String("tf-c8000v-byol"),
			MetroCode: pulumi.String(sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
				return &sv.MetroCode, nil
			}).(pulumi.StringPtrOutput)),
			TypeCode:                pulumi.String("C8000V"),
			SelfManaged:             pulumi.Bool(true),
			Byol:                    pulumi.Bool(true),
			GenerateDefaultPassword: pulumi.Bool(true),
			PackageCode:             pulumi.String("network-essentials"),
			Notifications: pulumi.StringArray{
				pulumi.String("john@equinix.com"),
				pulumi.String("marry@equinix.com"),
				pulumi.String("fred@equinix.com"),
			},
			TermLength: pulumi.Int(12),
			AccountNumber: pulumi.String(sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
				return &sv.Number, nil
			}).(pulumi.StringPtrOutput)),
			Version:        pulumi.String("17.11.01a"),
			InterfaceCount: pulumi.Int(10),
			CoreCount:      pulumi.Int(2),
			Tier:           pulumi.Int(1),
			SshKey: &networkedge.DeviceSshKeyArgs{
				Username: pulumi.String("test"),
				KeyName:  pulumi.String("test-key"),
			},
			VendorConfiguration: pulumi.StringMap{
				"restApiSupportRequirement": pulumi.String("true"),
			},
			AclTemplateId: pulumi.String("0bff6e05-f0e7-44cd-804a-25b92b835f8b"),
			SecondaryDevice: &networkedge.DeviceSecondaryDeviceArgs{
				Name: pulumi.String("tf-c8000v-byol-secondary"),
				MetroCode: sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
					return &sv.MetroCode, nil
				}).(pulumi.StringPtrOutput),
				Hostname: pulumi.String("csr1000v-s"),
				Notifications: pulumi.StringArray{
					pulumi.String("john@equinix.com"),
					pulumi.String("marry@equinix.com"),
				},
				AccountNumber: sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
					return &sv.Number, nil
				}).(pulumi.StringPtrOutput),
				VendorConfiguration: pulumi.StringMap{
					"restApiSupportRequirement": pulumi.String("true"),
				},
				AclTemplateId: pulumi.String("0bff6e05-f0e7-44cd-804a-25b92b835f8b"),
			},
		})
		if err != nil {
			return err
		}
		return nil
	})
}
