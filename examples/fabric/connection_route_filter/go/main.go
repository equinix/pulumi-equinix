package main

import (
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		ctx.Export("connectionRouteFilterId", policyAttachment.Id)
		ctx.Export("connectionRouteFilterConnectionId", policyAttachment.ConnectionId)
		ctx.Export("connectionRouteFilterDirection", policyAttachment.Direction)
		ctx.Export("connectionRouteFilterType", policyAttachment.Type)
		ctx.Export("connectionRouteFilterAttachmentStatus", policyAttachment.AttachmentStatus)
		return nil
	})
}
