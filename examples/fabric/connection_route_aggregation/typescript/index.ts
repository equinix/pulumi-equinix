import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const policyAttachment = new equinix.fabric.ConnectionRouteAggregation("policyAttachment", {
    routeAggregationId: "<route_aggregation_id>",
    connectionId: "<connection_id>",
});
export const connectionRouteAggregationId = policyAttachment.id;
export const connectionRouteAggregationConnectionId = policyAttachment.connectionId;
export const connectionRouteAggregationType = policyAttachment.type;
export const connectionRouteAggregationAttachmentStatus = policyAttachment.attachmentStatus;
