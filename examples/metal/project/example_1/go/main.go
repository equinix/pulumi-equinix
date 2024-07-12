package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/metal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		_, err := metal.NewProject(ctx, "tfProject1", &metal.ProjectArgs{
			Name: pulumi.String("Terraform Fun"),
		})
		if err != nil {
			return err
		}
		return nil
	})
}
