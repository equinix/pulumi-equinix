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
		readOnly := false
		if param := cfg.GetBool("readOnly"); param {
			readOnly = param
		}
		apiKey, err := metal.NewProjectApiKey(ctx, "apiKey", &metal.ProjectApiKeyArgs{
			ProjectId:   pulumi.String(projectId),
			Description: pulumi.String("A project level API Key"),
			ReadOnly:    pulumi.Bool(readOnly),
		})
		if err != nil {
			return err
		}
		ctx.Export("apiKeyToken", apiKey.Token)
		return nil
	})
}
