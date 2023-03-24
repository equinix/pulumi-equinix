package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/metal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		cfg := config.New(ctx, "")
		organizationId := cfg.Require("organizationId")
		name := "Default Project"
		if param := cfg.Get("name"); param != "" {
			name = param
		}
		projectResource, err := metal.NewProject(ctx, "project", &metal.ProjectArgs{
			Name:           pulumi.String(name),
			OrganizationId: pulumi.String(organizationId),
		})
		if err != nil {
			return err
		}
		ctx.Export("projectId", projectResource.ID())
		return nil
	})
}
