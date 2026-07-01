package main

import (
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		ctx.Export("connectionRouteAggregationId", policyAttachment.Id)
		ctx.Export("connectionRouteAggregationConnectionId", policyAttachment.ConnectionId)
		ctx.Export("connectionRouteAggregationType", policyAttachment.Type)
		ctx.Export("connectionRouteAggregationAttachmentStatus", policyAttachment.AttachmentStatus)
		return nil
	})
}
