import pulumi

config = pulumi.Config()
device_id = config.require("deviceId")
network_type = config.get("networkType")
if network_type is None:
    network_type = "hybrid"
pulumi.export("deviceNetworkId", device_network["id"])
