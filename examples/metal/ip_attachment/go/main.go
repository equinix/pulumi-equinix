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
		subnetCidr := "147.229.10.152/31"
		if param := cfg.Get("subnetCidr"); param != "" {
			subnetCidr = param
		}
		ipAttachResource, err := metal.NewIpAttachment(ctx, "ipAttach", &metal.IpAttachmentArgs{
			DeviceId:     pulumi.String(deviceId),
			CidrNotation: pulumi.String(subnetCidr),
		})
		if err != nil {
			return err
		}
		ctx.Export("ipAttach", ipAttachResource.ID())
		ctx.Export("ipNetmask", ipAttachResource.Netmask)
		return nil
	})
}
