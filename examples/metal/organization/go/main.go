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
		orgResource, err := metal.NewOrganization(ctx, "org", &metal.OrganizationArgs{
			Name: pulumi.String("Foo Organization"),
			Address: &metal.OrganizationAddressArgs{
				Address: pulumi.String("org street"),
				City:    pulumi.String("london"),
				Country: pulumi.String("GB"),
				ZipCode: pulumi.String("12345"),
			},
			Description: pulumi.String("An organization"),
		})
		if err != nil {
			return err
		}
		ctx.Export("org", orgResource.ID())
		return nil
	})
}
