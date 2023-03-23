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
		bgp, err := metal.NewBgpSession(ctx, "bgp", &metal.BgpSessionArgs{
			DeviceId:      pulumi.String(deviceId),
			AddressFamily: pulumi.String("ipv4"),
		})
		if err != nil {
			return err
		}
		ctx.Export("bgpSessionStatus", bgp.Status)
		return nil
	})
}
