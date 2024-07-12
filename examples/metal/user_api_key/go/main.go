package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/metal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		_, err := metal.NewUserApiKey(ctx, "test", &metal.UserApiKeyArgs{
			Description: pulumi.String("Read-only user key"),
			ReadOnly:    pulumi.Bool(true),
		})
		if err != nil {
			return err
		}
		return nil
	})
}
