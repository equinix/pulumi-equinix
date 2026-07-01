import * as pulumi from "@pulumi/pulumi";

export const connectionRouteFilterId = policyAttachment.id;
export const connectionRouteFilterConnectionId = policyAttachment.connectionId;
export const connectionRouteFilterDirection = policyAttachment.direction;
export const connectionRouteFilterType = policyAttachment.type;
export const connectionRouteFilterAttachmentStatus = policyAttachment.attachmentStatus;
