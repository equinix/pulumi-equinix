import pulumi
import pulumi_equinix as equinix

example = equinix.metal.Project("example", name="example")
example_vrf = equinix.metal.Vrf("exampleVrf",
    description="VRF with ASN 65000 and a pool of address space that includes 192.168.100.0/25",
    name="example-vrf",
    metro="da",
    local_asn=65000,
    ip_ranges=[
        "192.168.100.0/25",
        "192.168.200.0/25",
    ],
    project_id=example.id)
