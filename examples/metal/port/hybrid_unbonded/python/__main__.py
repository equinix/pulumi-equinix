import pulumi
import pulumi_equinix as equinix

config = pulumi.Config()
port_id = config.require("portId")
port = equinix.metal.Port("port",
    port_id=port_id,
    bonded=False)
pulumi.export("portType", port.type)
