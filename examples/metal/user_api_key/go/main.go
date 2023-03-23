package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/metal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		cfg := config.New(ctx, "")
		description := "An user level API Key"
		if param := cfg.Get("description"); param != "" {
			description = param
		}
		readOnly := false
		if param := cfg.GetBool("readOnly"); param {
			readOnly = param
		}
		apiKey, err := metal.NewUserApiKey(ctx, "apiKey", &metal.UserApiKeyArgs{
			Description: pulumi.String(description),
			ReadOnly:    pulumi.Bool(readOnly),
		})
		if err != nil {
			return err
		}
		ctx.Export("apiKeyToken", apiKey.Token)
		return nil
	})
}
