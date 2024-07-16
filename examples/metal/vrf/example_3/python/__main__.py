import pulumi
import pulumi_equinix as equinix

example_virtual_circuit = equinix.metal.VirtualCircuit("exampleVirtualCircuit",
    name="example-vc",
    description="Virtual Circuit",
    connection_id=example["id"],
    project_id=example_equinix_metal_project["id"],
    port_id=example["ports"][0]["id"],
    nni_vlan=1024,
    vrf_id=example_equinix_metal_vrf["id"],
    peer_asn=65530,
    subnet="192.168.100.16/31",
    metal_ip="192.168.100.16",
    customer_ip="192.168.100.17")
