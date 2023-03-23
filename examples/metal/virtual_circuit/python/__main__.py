import pulumi
import pulumi_equinix as equinix

config = pulumi.Config()
project_id = config.require("projectId")
connection_id = config.require("connectionId")
vlan_id = config.require("vlanId")
port_id = equinix.metal.get_interconnection(connection_id=connection_id).ports[0].id
vc = equinix.metal.VirtualCircuit("vc",
    connection_id=connection_id,
    project_id=project_id,
    port_id=port_id,
    vlan_id=vlan_id,
    nni_vlan=1056)
pulumi.export("vcStatus", vc.status)
pulumi.export("vcVnid", vc.vnid)
