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
		networkType := "hybrid"
		if param := cfg.Get("networkType"); param != "" {
			networkType = param
		}
		deviceNetwork, err := metal.NewDeviceNetworkType(ctx, "deviceNetwork", &metal.DeviceNetworkTypeArgs{
			DeviceId: pulumi.String(deviceId),
			Type:     pulumi.String(networkType),
		})
		if err != nil {
			return err
		}
		ctx.Export("deviceNetworkId", deviceNetwork.ID())
		return nil
	})
}
