import pulumi

pulumi.export("connectionRouteAggregationId", policy_attachment["id"])
pulumi.export("connectionRouteAggregationConnectionId", policy_attachment["connectionId"])
pulumi.export("connectionRouteAggregationType", policy_attachment["type"])
pulumi.export("connectionRouteAggregationAttachmentStatus", policy_attachment["attachmentStatus"])
