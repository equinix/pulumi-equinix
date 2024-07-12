import pulumi
import pulumi_equinix as equinix

john = equinix.networkedge.SshUser("john",
    username="john",
    password="secret",
    device_ids=[
        "csr1000v-ha-uuid",
        "csr1000v-ha-redundant-uuid",
    ])
