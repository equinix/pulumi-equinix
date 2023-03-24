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
		projectId := cfg.Require("projectId")
		userEmailAddress := cfg.Require("userEmailAddress")
		member, err := metal.NewOrganizationMember(ctx, "member", &metal.OrganizationMemberArgs{
			Invitee: pulumi.String(userEmailAddress),
			Roles: pulumi.StringArray{
				pulumi.String("limited_collaborator"),
			},
			ProjectsIds: pulumi.StringArray{
				pulumi.String(projectId),
			},
			OrganizationId: pulumi.String(organizationId),
		})
		if err != nil {
			return err
		}
		ctx.Export("memberId", member.ID())
		ctx.Export("memberState", member.State)
		return nil
	})
}
