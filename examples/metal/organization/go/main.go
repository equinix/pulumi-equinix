package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/metal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		_, err := metal.NewOrganization(ctx, "tfOrganization1", &metal.OrganizationArgs{
			Name:        pulumi.String("foobar"),
			Description: pulumi.String("quux"),
		})
		if err != nil {
			return err
		}
		return nil
	})
}
