package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/metal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		_, err := metal.NewVirtualCircuit(ctx, "exampleVirtualCircuit", &metal.VirtualCircuitArgs{
			Name:         pulumi.String("example-vc"),
			Description:  pulumi.String("Virtual Circuit"),
			ConnectionId: pulumi.Any(example.Id),
			ProjectId:    pulumi.Any(exampleEquinixMetalProject.Id),
			PortId:       pulumi.Any(example.Ports[0].Id),
			NniVlan:      pulumi.Int(1024),
			VrfId:        pulumi.Any(exampleEquinixMetalVrf.Id),
			PeerAsn:      pulumi.Int(65530),
			Subnet:       pulumi.String("192.168.100.16/31"),
			MetalIp:      pulumi.String("192.168.100.16"),
			CustomerIp:   pulumi.String("192.168.100.17"),
		})
		if err != nil {
			return err
		}
		return nil
	})
}
