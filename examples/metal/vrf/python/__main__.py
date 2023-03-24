import pulumi
import pulumi_equinix as equinix

config = pulumi.Config()
project_id = config.require("projectId")
metro = config.get("metro")
if metro is None:
    metro = "DA"
vrf = equinix.metal.Vrf("vrf",
    description="VRF with ASN 65000 and a pool of address space",
    name="example-vrf",
    metro=metro,
    local_asn=65000,
    ip_ranges=[
        "192.168.100.0/25",
        "192.168.200.0/25",
    ],
    project_id=project_id)
pulumi.export("vrfId", vrf.id)
