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
		_, err := networkedge.NewDevice(ctx, "cisco-FTD-SV", &networkedge.DeviceArgs{
			Name:      pulumi.String("TF_Cisco_NGFW_CLUSTER_ZNPD"),
			ProjectId: pulumi.String("XXXXXXX"),
			MetroCode: pulumi.String(sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
				return &sv.MetroCode, nil
			}).(pulumi.StringPtrOutput)),
			TypeCode:     pulumi.String("Cisco_NGFW"),
			SelfManaged:  pulumi.Bool(true),
			Connectivity: pulumi.String("PRIVATE"),
			Byol:         pulumi.Bool(true),
			PackageCode:  pulumi.String("FTDv10"),
			Notifications: pulumi.StringArray{
				pulumi.String("test@eq.com"),
			},
			AccountNumber: pulumi.String(sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
				return &sv.Number, nil
			}).(pulumi.StringPtrOutput)),
			Version:        pulumi.String("7.0.4-55"),
			Hostname:       pulumi.String("test"),
			CoreCount:      pulumi.Int(4),
			TermLength:     pulumi.Int(1),
			InterfaceCount: pulumi.Int(10),
			ClusterDetails: &networkedge.DeviceClusterDetailsArgs{
				ClusterName: pulumi.String("tf-ftd-cluster"),
				Node0: &networkedge.DeviceClusterDetailsNode0Args{
					VendorConfiguration: &networkedge.DeviceClusterDetailsNode0VendorConfigurationArgs{
						Hostname:       pulumi.String("test"),
						ActivationKey:  pulumi.String("XXXXX"),
						Controller1:    pulumi.String("X.X.X.X"),
						ManagementType: pulumi.String("FMC"),
					},
				},
				Node1: &networkedge.DeviceClusterDetailsNode1Args{
					VendorConfiguration: &networkedge.DeviceClusterDetailsNode1VendorConfigurationArgs{
						Hostname:       pulumi.String("test"),
						ManagementType: pulumi.String("FMC"),
					},
				},
			},
		})
		if err != nil {
			return err
		}
		return nil
	})
}
