import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const policyAttachment = new equinix.fabric.ConnectionRouteFilter("policyAttachment", {
    connectionId: "<connection_uuid>",
    routeFilterId: "<route_filter_policy_uuid>",
    direction: "INBOUND",
});
export const connectionRouteFilterId = policyAttachment.id;
export const connectionRouteFilterConnectionId = policyAttachment.connectionId;
export const connectionRouteFilterDirection = policyAttachment.direction;
export const connectionRouteFilterType = policyAttachment.type;
export const connectionRouteFilterAttachmentStatus = policyAttachment.attachmentStatus;
