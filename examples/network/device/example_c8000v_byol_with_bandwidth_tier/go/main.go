package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/networkedge"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		sv, err := networkedge.GetAccount(ctx, &networkedge.GetAccountArgs{
			MetroCode: "SV",
		}, nil)
		if err != nil {
			return err
		}
		_, err = networkedge.NewDevice(ctx, "c8000v-byol-tier", &networkedge.DeviceArgs{
			Name:        pulumi.String("tf-c8000v-byol"),
			MetroCode:   pulumi.String(sv.MetroCode),
			TypeCode:    pulumi.String("C8000V"),
			SelfManaged: pulumi.Bool(true),
			Byol:        pulumi.Bool(true),
			PackageCode: pulumi.String("VM100"),
			Notifications: pulumi.StringArray{
				pulumi.String("john@equinix.com"),
				pulumi.String("marry@equinix.com"),
				pulumi.String("fred@equinix.com"),
			},
			TermLength:     pulumi.Int(12),
			AccountNumber:  pulumi.String(sv.Number),
			Version:        pulumi.String("17.11.01a"),
			InterfaceCount: pulumi.Int(10),
			CoreCount:      pulumi.Int(2),
			Tier:           pulumi.Int(1),
			SshKey: &networkedge.DeviceSshKeyArgs{
				Username: pulumi.String("test"),
				KeyName:  pulumi.String("test-key"),
			},
			AclTemplateId: pulumi.String("0bff6e05-f0e7-44cd-804a-25b92b835f8b"),
		})
		if err != nil {
			return err
		}
		return nil
	})
}
