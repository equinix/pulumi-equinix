package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/networkedge"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		_ = networkedge.GetAccountOutput(ctx, networkedge.GetAccountOutputArgs{
			MetroCode: pulumi.String("SV"),
			Name:      pulumi.String("account-name"),
		}, nil)
		_, err := networkedge.NewDevice(ctx, "FGVM-SV", &networkedge.DeviceArgs{
			Name:         pulumi.String("tf-fgvm-cluster-static-znpd"),
			MetroCode:    pulumi.String("DC"),
			TypeCode:     pulumi.String("FG-VM"),
			ProjectId:    pulumi.String("xxxxxxx"),
			SelfManaged:  pulumi.Bool(true),
			Connectivity: pulumi.String("PRIVATE"),
			Byol:         pulumi.Bool(true),
			PackageCode:  pulumi.String("VM02"),
			Notifications: pulumi.StringArray{
				pulumi.String("john@equinix.com"),
				pulumi.String("marry@equinix.com"),
				pulumi.String("fred@equinix.com"),
			},
			TermLength:     pulumi.Int(12),
			AccountNumber:  pulumi.Any(xxxxxx),
			Version:        pulumi.String("7.6.2"),
			InterfaceCount: pulumi.Int(10),
			CoreCount:      pulumi.Int(2),
			SshKey: &networkedge.DeviceSshKeyArgs{
				Username: pulumi.String("sanity1"),
				KeyName:  pulumi.String(""),
			},
			ClusterDetails: &networkedge.DeviceClusterDetailsArgs{
				ClusterName: pulumi.String("tf-fgvm--cluster"),
				Node0: &networkedge.DeviceClusterDetailsNode0Args{
					VendorConfiguration: &networkedge.DeviceClusterDetailsNode0VendorConfigurationArgs{
						IpAddress:             pulumi.String("x.x.x.x"),
						SubnetMaskIp:          pulumi.String("x.x.x.x"),
						GatewayIp:             pulumi.String("x.x.x.x"),
						ManagementInterfaceId: pulumi.String("5"),
						Hostname:              pulumi.String("test"),
						IpAddressType:         pulumi.String("STATIC"),
					},
				},
				Node1: &networkedge.DeviceClusterDetailsNode1Args{
					VendorConfiguration: &networkedge.DeviceClusterDetailsNode1VendorConfigurationArgs{
						IpAddress:             pulumi.String("x.x.x.x"),
						SubnetMaskIp:          pulumi.String("x.x.x.x"),
						GatewayIp:             pulumi.String("x.x.x.x"),
						ManagementInterfaceId: pulumi.String("5"),
						Hostname:              pulumi.String("test"),
						IpAddressType:         pulumi.String("STATIC"),
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
