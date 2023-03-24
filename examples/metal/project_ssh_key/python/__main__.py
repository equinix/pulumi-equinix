import pulumi
import pulumi_equinix as equinix

config = pulumi.Config()
project_id = config.require("projectId")
ssh_key = equinix.metal.ProjectSshKey("sshKey",
    project_id=project_id,
    name="johnKent",
    public_key=(lambda path: open(path).read())("/Users/John/.ssh/metal_rsa.pub"))
pulumi.export("sshKeyId", ssh_key.id)
