package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/metal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		cfg := config.New(ctx, "")
		projectId := cfg.Require("projectId")
		connectionId := cfg.Require("connectionId")
		vlanId := cfg.Require("vlanId")
		portId := metal.LookupInterconnection(ctx, &metal.LookupInterconnectionArgs{
			ConnectionId: connectionId,
		}, nil).Ports[0].Id
		vc, err := metal.NewVirtualCircuit(ctx, "vc", &metal.VirtualCircuitArgs{
			ConnectionId: pulumi.String(connectionId),
			ProjectId:    pulumi.String(projectId),
			PortId:       *pulumi.String(portId),
			VlanId:       pulumi.String(vlanId),
			NniVlan:      pulumi.Int(1056),
		})
		if err != nil {
			return err
		}
		ctx.Export("vcStatus", vc.Status)
		ctx.Export("vcVnid", vc.Vnid)
		return nil
	})
}
