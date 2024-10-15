import pulumi

pulumi.export("connectionRouteFilterId", policy_attachment["id"])
pulumi.export("connectionRouteFilterConnectionId", policy_attachment["connectionId"])
pulumi.export("connectionRouteFilterDirection", policy_attachment["direction"])
pulumi.export("connectionRouteFilterType", policy_attachment["type"])
pulumi.export("connectionRouteFilterAttachmentStatus", policy_attachment["attachmentStatus"])
