import pulumi
import pulumi_equinix as equinix

test = equinix.metal.Vlan("test",
    description="test VLAN in SV",
    metro="sv",
    project_id=project_id)
test1 = equinix.metal.ReservedIpBlock("test1",
    project_id=project_id,
    metro="sv",
    quantity=8)
test_gateway = equinix.metal.Gateway("testGateway",
    project_id=project_id,
    vlan_id=test.id,
    ip_reservation_id=test_equinix_metal_reserved_ip_block["id"])
