import pulumi
import pulumi_equinix as equinix

config = pulumi.Config()
device_id = config.require("deviceId")
network_type = config.get("networkType")
if network_type is None:
    network_type = "hybrid"
device_network = equinix.metal.DeviceNetworkType("deviceNetwork",
    device_id=device_id,
    type=network_type)
pulumi.export("deviceNetworkId", device_network.id)
