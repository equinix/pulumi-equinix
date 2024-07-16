package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/fabric"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		_, err := fabric.NewRoutingProtocol(ctx, "direct", &fabric.RoutingProtocolArgs{
			ConnectionUuid: pulumi.String("<some_id>"),
			Type:           pulumi.String("DIRECT"),
			Name:           pulumi.String("direct_rp"),
			DirectIpv4: &fabric.RoutingProtocolDirectIpv4Args{
				EquinixIfaceIp: pulumi.String("190.1.1.1/30"),
			},
			DirectIpv6: &fabric.RoutingProtocolDirectIpv6Args{
				EquinixIfaceIp: pulumi.String("190::1:1/126"),
			},
		})
		if err != nil {
			return err
		}
		return nil
	})
}
