package main

import (
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
		ctx.Export("deviceNetworkId", deviceNetwork.Id)
		return nil
	})
}
