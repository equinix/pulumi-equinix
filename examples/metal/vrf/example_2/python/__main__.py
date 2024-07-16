import pulumi
import pulumi_equinix as equinix

example = equinix.metal.ReservedIpBlock("example",
    description="Reserved IP block (192.168.100.0/29) taken from on of the ranges in the VRF's pool of address space.",
    project_id=example_equinix_metal_project["id"],
    metro=example_equinix_metal_vrf["metro"],
    type="vrf",
    vrf_id=example_equinix_metal_vrf["id"],
    cidr=29,
    network="192.168.100.0")
example_vlan = equinix.metal.Vlan("exampleVlan",
    description="A VLAN for Layer2 and Hybrid Metal devices",
    metro=example_equinix_metal_vrf["metro"],
    project_id=example_equinix_metal_project["id"])
example_gateway = equinix.metal.Gateway("exampleGateway",
    project_id=example_equinix_metal_project["id"],
    vlan_id=example_vlan.id,
    ip_reservation_id=example.id)
