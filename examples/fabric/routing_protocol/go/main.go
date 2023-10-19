package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/fabric"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		cfg := config.New(ctx, "")
		connectionId := cfg.Require("connectionId")
		routingProtocol, err := fabric.NewRoutingProtocol(ctx, "RoutingProtocol", &fabric.RoutingProtocolArgs{
			ConnectionUuid: pulumi.String(connectionId),
			Name:           pulumi.String("My-Direct-route-1"),
			Type:           pulumi.String("DIRECT"),
			DirectIpv4: &fabric.RoutingProtocolDirectIpv4Args{
				EquinixIfaceIp: pulumi.String("192.168.100.1/30"),
			},
		})
		if err != nil {
			return err
		}
		ctx.Export("routingProtocolId", routingProtocol.ID())
		ctx.Export("routingProtocolState", routingProtocol.State)
		ctx.Export("routingProtocolEquinixAsn", routingProtocol.EquinixAsn)
		return nil
	})
}
