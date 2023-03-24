package main

import (
	"os"

	"github.com/equinix/pulumi-equinix/sdk/go/equinix/metal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func readFileOrPanic(path string) pulumi.StringPtrInput {
	data, err := os.ReadFile(path)
	if err != nil {
		panic(err.Error())
	}
	return pulumi.String(string(data))
}

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		sshKey, err := metal.NewSshKey(ctx, "sshKey", &metal.SshKeyArgs{
			Name:      pulumi.String("johnKent"),
			PublicKey: readFileOrPanic("/Users/John/.ssh/metal_rsa.pub"),
		})
		if err != nil {
			return err
		}
		ctx.Export("sshKeyId", sshKey.ID())
		return nil
	})
}
