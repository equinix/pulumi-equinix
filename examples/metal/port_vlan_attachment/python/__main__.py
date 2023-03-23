import pulumi
import pulumi_equinix as equinix

config = pulumi.Config()
device_id = config.require("deviceId")
port_name = config.get("portName")
if port_name is None:
    port_name = "eth1"
vxlan_id = config.get_int("vxlanId")
if vxlan_id is None:
    vxlan_id = 1004
attach = equinix.metal.PortVlanAttachment("attach",
    device_id=device_id,
    port_name=port_name,
    vlan_vnid=vxlan_id)
pulumi.export("attachId", attach.id)
pulumi.export("portId", attach.port_id)
