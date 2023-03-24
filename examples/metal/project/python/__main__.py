import pulumi
import pulumi_equinix as equinix

config = pulumi.Config()
organization_id = config.require("organizationId")
name = config.get("name")
if name is None:
    name = "Default Project"
project_resource = equinix.metal.Project("project",
    name=name,
    organization_id=organization_id)
pulumi.export("projectId", project_resource.id)
