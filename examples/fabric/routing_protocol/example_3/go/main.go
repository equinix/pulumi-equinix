package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/fabric"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		direct, err := fabric.NewRoutingProtocol(ctx, "direct", &fabric.RoutingProtocolArgs{
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
		_, err = fabric.NewRoutingProtocol(ctx, "bgp", &fabric.RoutingProtocolArgs{
			ConnectionUuid: pulumi.String("<same_connection_id_as_first_equinix_fabric_routing_protocol>"),
			Type:           pulumi.String("BGP"),
			Name:           pulumi.String("bgp_rp"),
			BgpIpv4: &fabric.RoutingProtocolBgpIpv4Args{
				CustomerPeerIp: pulumi.String("190.1.1.2"),
				Enabled:        pulumi.Bool(true),
			},
			BgpIpv6: &fabric.RoutingProtocolBgpIpv6Args{
				CustomerPeerIp: pulumi.String("190::1:2"),
				Enabled:        pulumi.Bool(true),
			},
			CustomerAsn: pulumi.Int(4532),
		}, pulumi.DependsOn([]pulumi.Resource{
			direct,
		}))
		if err != nil {
			return err
		}
		return nil
	})
}
