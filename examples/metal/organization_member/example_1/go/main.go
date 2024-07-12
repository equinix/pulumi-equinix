package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/metal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		_, err := metal.NewOrganizationMember(ctx, "member", &metal.OrganizationMemberArgs{
			Invitee: pulumi.String("member@example.com"),
			Roles: pulumi.StringArray{
				pulumi.String("limited_collaborator"),
			},
			ProjectsIds: pulumi.StringArray{
				projectId,
			},
			OrganizationId: pulumi.Any(organizationId),
		})
		if err != nil {
			return err
		}
		return nil
	})
}
