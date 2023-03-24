import pulumi
import pulumi_equinix as equinix

config = pulumi.Config()
device1_id = config.require("device1Id")
device2_id = config.require("device2Id")
ssh_user = equinix.networkedge.SshUser("sshUser",
    username="johnKent",
    device_ids=[
        device1_id,
        device2_id,
    ])
pulumi.export("sshUserId", ssh_user.id)
