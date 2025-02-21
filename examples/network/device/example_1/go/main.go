package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/networkedge"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		dc := networkedge.GetAccountOutput(ctx, networkedge.GetAccountOutputArgs{
			MetroCode: pulumi.String("DC"),
		}, nil)
		sv := networkedge.GetAccountOutput(ctx, networkedge.GetAccountOutputArgs{
			MetroCode: pulumi.String("SV"),
		}, nil)
		_, err := networkedge.NewDevice(ctx, "csr1000vHa", &networkedge.DeviceArgs{
			Name:           pulumi.String("tf-csr1000v-p"),
			Throughput:     pulumi.Int(500),
			ThroughputUnit: pulumi.String(networkedge.ThroughputUnitMbps),
			MetroCode: pulumi.String(dc.ApplyT(func(dc networkedge.GetAccountResult) (*string, error) {
				return &dc.MetroCode, nil
			}).(pulumi.StringPtrOutput)),
			TypeCode:     pulumi.String("CSR1000V"),
			SelfManaged:  pulumi.Bool(false),
			Connectivity: pulumi.String("INTERNET-ACCESS"),
			Byol:         pulumi.Bool(false),
			PackageCode:  pulumi.String("SEC"),
			Notifications: pulumi.StringArray{
				pulumi.String("john@equinix.com"),
				pulumi.String("marry@equinix.com"),
				pulumi.String("fred@equinix.com"),
			},
			Hostname:   pulumi.String("csr1000v-p"),
			TermLength: pulumi.Int(12),
			AccountNumber: pulumi.String(dc.ApplyT(func(dc networkedge.GetAccountResult) (*string, error) {
				return &dc.Number, nil
			}).(pulumi.StringPtrOutput)),
			Version:   pulumi.String("16.09.05"),
			CoreCount: pulumi.Int(2),
			SecondaryDevice: &networkedge.DeviceSecondaryDeviceArgs{
				Name: pulumi.String("tf-csr1000v-s"),
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
			},
		})
		if err != nil {
			return err
		}
		return nil
	})
}
