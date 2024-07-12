package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/networkedge"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		dc, err := networkedge.GetAccount(ctx, &networkedge.GetAccountArgs{
			MetroCode: "DC",
		}, nil)
		if err != nil {
			return err
		}
		sv, err := networkedge.GetAccount(ctx, &networkedge.GetAccountArgs{
			MetroCode: "SV",
		}, nil)
		if err != nil {
			return err
		}
		_, err = networkedge.NewDevice(ctx, "csr1000vHa", &networkedge.DeviceArgs{
			Name:           pulumi.String("tf-csr1000v-p"),
			Throughput:     pulumi.Int(500),
			ThroughputUnit: pulumi.String(networkedge.ThroughputUnitMbps),
			MetroCode:      pulumi.String(dc.MetroCode),
			TypeCode:       pulumi.String("CSR1000V"),
			SelfManaged:    pulumi.Bool(false),
			Connectivity:   pulumi.String("INTERNET-ACCESS"),
			Byol:           pulumi.Bool(false),
			PackageCode:    pulumi.String("SEC"),
			Notifications: pulumi.StringArray{
				pulumi.String("john@equinix.com"),
				pulumi.String("marry@equinix.com"),
				pulumi.String("fred@equinix.com"),
			},
			Hostname:      pulumi.String("csr1000v-p"),
			TermLength:    pulumi.Int(12),
			AccountNumber: pulumi.String(dc.Number),
			Version:       pulumi.String("16.09.05"),
			CoreCount:     pulumi.Int(2),
			SecondaryDevice: &networkedge.DeviceSecondaryDeviceArgs{
				Name:      pulumi.String("tf-csr1000v-s"),
				MetroCode: pulumi.String(sv.MetroCode),
				Hostname:  pulumi.String("csr1000v-s"),
				Notifications: pulumi.StringArray{
					pulumi.String("john@equinix.com"),
					pulumi.String("marry@equinix.com"),
				},
				AccountNumber: pulumi.String(sv.Number),
			},
		})
		if err != nil {
			return err
		}
		return nil
	})
}
