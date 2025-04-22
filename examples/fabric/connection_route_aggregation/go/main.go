package main

import (
	"github.com/equinix/pulumi-equinix/sdk/go/equinix/fabric"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		policyAttachment, err := fabric.NewConnectionRouteAggregation(ctx, "policyAttachment", &fabric.ConnectionRouteAggregationArgs{
			RouteAggregationId: pulumi.String("<route_aggregation_id>"),
			ConnectionId:       pulumi.String("<connection_id>"),
		})
		if err != nil {
			return err
		}
		ctx.Export("connectionRouteAggregationId", policyAttachment.ID())
		ctx.Export("connectionRouteAggregationConnectionId", policyAttachment.ConnectionId)
		ctx.Export("connectionRouteAggregationType", policyAttachment.Type)
		ctx.Export("connectionRouteAggregationAttachmentStatus", policyAttachment.AttachmentStatus)
		return nil
	})
}
