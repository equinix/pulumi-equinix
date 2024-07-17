import pulumi
import pulumi_equinix as equinix

project_id = "52000fb2-ee46-4673-93a8-de2c2bdba33c"
conn_id = "73f12f29-3e19-43a0-8e90-ae81580db1e0"
test = equinix.metal.get_interconnection_output(connection_id=conn_id)
test_vlan = equinix.metal.Vlan("testVlan",
    project_id=project_id,
    metro=test.metro)
test_virtual_circuit = equinix.metal.VirtualCircuit("testVirtualCircuit",
    connection_id=conn_id,
    project_id=project_id,
    port_id=test.ports[0].id,
    vlan_id=test_vlan.id,
    nni_vlan=1056)
