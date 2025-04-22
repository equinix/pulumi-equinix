package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/fabric"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		ptp, err := fabric.NewPrecisionTimeService(ctx, "ptp", &fabric.PrecisionTimeServiceArgs{
			Type: pulumi.String("PTP"),
			Name: pulumi.String("tf_acc_eptptp_PFCR"),
			Package: &fabric.PrecisionTimeServicePackageArgs{
				Code: pulumi.String("PTP_STANDARD"),
			},
			Connections: fabric.PrecisionTimeServiceConnectionArray{
				&fabric.PrecisionTimeServiceConnectionArgs{
					Uuid: pulumi.String("<connection_id>"),
				},
			},
			Ipv4: &fabric.PrecisionTimeServiceIpv4Args{
				Primary:        pulumi.String("191.168.254.241"),
				Secondary:      pulumi.String("191.168.254.242"),
				NetworkMask:    pulumi.String("255.255.255.240"),
				DefaultGateway: pulumi.String("191.168.254.254"),
			},
		})
		if err != nil {
			return err
		}
		ctx.Export("eptServiceId", ptp.ID())
		ctx.Export("eptServiceName", ptp.Name)
		ctx.Export("eptServiceState", ptp.State)
		ctx.Export("eptServiceType", ptp.Type)
		ctx.Export("eptServiceConnection", ptp.Connections)
		ctx.Export("eptServiceIpv4", ptp.Ipv4)
		return nil
	})
}
