package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/networkedge"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		cfg := config.New(ctx, "")
		device1Id := cfg.Require("device1Id")
		device2Id := cfg.Require("device2Id")
		sshUser, err := networkedge.NewSshUser(ctx, "sshUser", &networkedge.SshUserArgs{
			Username: pulumi.String("johnKent"),
			DeviceIds: pulumi.StringArray{
				pulumi.String(device1Id),
				pulumi.String(device2Id),
			},
		})
		if err != nil {
			return err
		}
		ctx.Export("sshUserId", sshUser.ID())
		return nil
	})
}
