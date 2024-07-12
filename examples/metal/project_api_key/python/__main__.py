import pulumi
import pulumi_equinix as equinix

test = equinix.metal.ProjectApiKey("test",
    project_id=existing_project_id,
    description="Read-only key scoped to a projct",
    read_only=True)
