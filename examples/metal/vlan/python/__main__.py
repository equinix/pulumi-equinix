import pulumi
import pulumi_equinix as equinix

config = pulumi.Config()
project_id = config.require("projectId")
metro = config.get("metro")
if metro is None:
    metro = "DA"
vxlan = config.require("vxlan")
vlan = equinix.metal.Vlan("vlan",
    description="VLAN in Dallas",
    project_id=project_id,
    metro=metro,
    vxlan=vxlan)
pulumi.export("vlanId", vlan.id)
