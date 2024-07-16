import pulumi
import pulumi_equinix as equinix

owner = equinix.metal.OrganizationMember("owner",
    invitee="admin@example.com",
    roles=["owner"],
    projects_ids=[],
    organization_id=organization_id)
