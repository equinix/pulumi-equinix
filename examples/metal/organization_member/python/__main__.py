import pulumi
import pulumi_equinix as equinix

config = pulumi.Config()
organization_id = config.require("organizationId")
project_id = config.require("projectId")
user_email_address = config.require("userEmailAddress")
member = equinix.metal.OrganizationMember("member",
    invitee=user_email_address,
    roles=["limited_collaborator"],
    projects_ids=[project_id],
    organization_id=organization_id)
pulumi.export("memberId", member.id)
pulumi.export("memberState", member.state)
