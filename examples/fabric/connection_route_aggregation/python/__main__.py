import pulumi
import pulumi_equinix as equinix

policy_attachment = equinix.fabric.ConnectionRouteAggregation("policyAttachment",
    route_aggregation_id="<route_aggregation_id>",
    connection_id="<connection_id>")
pulumi.export("connectionRouteAggregationId", policy_attachment.id)
pulumi.export("connectionRouteAggregationConnectionId", policy_attachment.connection_id)
pulumi.export("connectionRouteAggregationType", policy_attachment.type)
pulumi.export("connectionRouteAggregationAttachmentStatus", policy_attachment.attachment_status)
