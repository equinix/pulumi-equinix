import pulumi
import pulumi_equinix as equinix

config = pulumi.Config()
port_id = config.require("portId")
vlan_id = config.require("vlanId")
port_bond0 = equinix.metal.Port("portBond0",
    port_id=port_id,
    bonded=True,
    layer2=False,
    vlan_ids=[vlan_id])
pulumi.export("portType", port["type"])
pulumi.export("portBondedNetworkType", port["networkType"])
