package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/fabric"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		policyAttachment, err := fabric.NewConnectionRouteFilter(ctx, "policyAttachment", &fabric.ConnectionRouteFilterArgs{
			ConnectionId:  pulumi.String("<connection_uuid>"),
			RouteFilterId: pulumi.String("<route_filter_policy_uuid>"),
			Direction:     pulumi.String("INBOUND"),
		})
		if err != nil {
			return err
		}
		ctx.Export("connectionRouteFilterId", policyAttachment.ID())
		ctx.Export("connectionRouteFilterConnectionId", policyAttachment.ConnectionId)
		ctx.Export("connectionRouteFilterDirection", policyAttachment.Direction)
		ctx.Export("connectionRouteFilterType", policyAttachment.Type)
		ctx.Export("connectionRouteFilterAttachmentStatus", policyAttachment.AttachmentStatus)
		return nil
	})
}
