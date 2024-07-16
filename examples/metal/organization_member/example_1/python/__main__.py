import pulumi
import pulumi_equinix as equinix

member = equinix.metal.OrganizationMember("member",
    invitee="member@example.com",
    roles=["limited_collaborator"],
    projects_ids=[project_id],
    organization_id=organization_id)
