import pulumi
import pulumi_equinix as equinix

config = pulumi.Config()
project_id = config.require("projectId")
vlan_id = config.require("vlanId")
gateway = equinix.metal.Gateway("gateway",
    project_id=project_id,
    vlan_id=vlan_id,
    private_ipv4_subnet_size=8)
pulumi.export("gatewayState", gateway.state)
