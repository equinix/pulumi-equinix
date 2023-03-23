package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/metal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		cfg := config.New(ctx, "")
		deviceId := cfg.Require("deviceId")
		portName := "eth1"
		if param := cfg.Get("portName"); param != "" {
			portName = param
		}
		vxlanId := 1004
		if param := cfg.GetInt("vxlanId"); param != 0 {
			vxlanId = param
		}
		attach, err := metal.NewPortVlanAttachment(ctx, "attach", &metal.PortVlanAttachmentArgs{
			DeviceId: pulumi.String(deviceId),
			PortName: pulumi.String(portName),
			VlanVnid: pulumi.Int(vxlanId),
		})
		if err != nil {
			return err
		}
		ctx.Export("attachId", attach.ID())
		ctx.Export("portId", attach.PortId)
		return nil
	})
}
