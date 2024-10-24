import pulumi
import pulumi_equinix as equinix

policy_attachment = equinix.fabric.ConnectionRouteFilter("policyAttachment",
    connection_id="<connection_uuid>",
    route_filter_id="<route_filter_policy_uuid>",
    direction="INBOUND")
pulumi.export("connectionRouteFilterId", policy_attachment.id)
pulumi.export("connectionRouteFilterConnectionId", policy_attachment.connection_id)
pulumi.export("connectionRouteFilterDirection", policy_attachment.direction)
pulumi.export("connectionRouteFilterType", policy_attachment.type)
pulumi.export("connectionRouteFilterAttachmentStatus", policy_attachment.attachment_status)
