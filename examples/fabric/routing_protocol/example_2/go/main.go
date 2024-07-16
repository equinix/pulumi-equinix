package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/fabric"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		_, err := fabric.NewRoutingProtocol(ctx, "bgp", &fabric.RoutingProtocolArgs{
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
		})
		if err != nil {
			return err
		}
		return nil
	})
}
