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
		_, err := networkedge.NewDevice(ctx, "INFOBLOX-SV", &networkedge.DeviceArgs{
			Name:      pulumi.String("TF_INFOBLOX"),
			ProjectId: pulumi.String("XXXXXXXXXX"),
			MetroCode: pulumi.String(sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
				return &sv.MetroCode, nil
			}).(pulumi.StringPtrOutput)),
			TypeCode:    pulumi.String("INFOBLOX-GRID-MEMBER"),
			SelfManaged: pulumi.Bool(true),
			Byol:        pulumi.Bool(true),
			PackageCode: pulumi.String("STD"),
			Notifications: pulumi.StringArray{
				pulumi.String("test@eq.com"),
			},
			AccountNumber: pulumi.String(sv.ApplyT(func(sv networkedge.GetAccountResult) (*string, error) {
				return &sv.Number, nil
			}).(pulumi.StringPtrOutput)),
			Version:      pulumi.String("9.0.5"),
			Hostname:     pulumi.String("test"),
			Connectivity: pulumi.String("PRIVATE"),
			CoreCount:    pulumi.Int(8),
			TermLength:   pulumi.Int(1),
			ClusterDetails: &networkedge.DeviceClusterDetailsArgs{
				ClusterName: pulumi.String("tf-infoblox-cluster"),
				Node0: &networkedge.DeviceClusterDetailsNode0Args{
					VendorConfiguration: &networkedge.DeviceClusterDetailsNode0VendorConfigurationArgs{
						AdminPassword: pulumi.String("Welcome@1"),
						IpAddress:     pulumi.String("192.168.1.35"),
						SubnetMaskIp:  pulumi.String("255.255.255.0"),
						GatewayIp:     pulumi.String("192.168.1.1"),
						Hostname:      pulumi.String("test"),
					},
				},
				Node1: &networkedge.DeviceClusterDetailsNode1Args{
					VendorConfiguration: &networkedge.DeviceClusterDetailsNode1VendorConfigurationArgs{
						AdminPassword: pulumi.String("Welcome@1"),
						IpAddress:     pulumi.String("192.168.1.35"),
						SubnetMaskIp:  pulumi.String("255.255.255.0"),
						GatewayIp:     pulumi.String("192.168.1.1"),
						Hostname:      pulumi.String("test"),
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
