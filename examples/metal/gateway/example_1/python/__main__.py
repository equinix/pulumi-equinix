import pulumi
import pulumi_equinix as equinix

test = equinix.metal.Vlan("test",
    description="test VLAN in SV",
    metro="sv",
    project_id=project_id)
test_gateway = equinix.metal.Gateway("testGateway",
    project_id=project_id,
    vlan_id=test.id,
    private_ipv4_subnet_size=8)
