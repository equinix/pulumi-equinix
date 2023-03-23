import pulumi
import pulumi_equinix as equinix

ssh_key = equinix.metal.SshKey("sshKey",
    name="johnKent",
    public_key=(lambda path: open(path).read())("/Users/John/.ssh/metal_rsa.pub"))
pulumi.export("sshKeyId", ssh_key.id)
