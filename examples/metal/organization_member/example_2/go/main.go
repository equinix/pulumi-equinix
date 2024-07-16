package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/metal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		_, err := metal.NewOrganizationMember(ctx, "owner", &metal.OrganizationMemberArgs{
			Invitee: pulumi.String("admin@example.com"),
			Roles: pulumi.StringArray{
				pulumi.String("owner"),
			},
			ProjectsIds:    pulumi.StringArray{},
			OrganizationId: pulumi.Any(organizationId),
		})
		if err != nil {
			return err
		}
		return nil
	})
}
