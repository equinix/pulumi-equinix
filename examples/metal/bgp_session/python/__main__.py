import pulumi
import pulumi_equinix as equinix

config = pulumi.Config()
device_id = config.require("deviceId")
bgp = equinix.metal.BgpSession("bgp",
    device_id=device_id,
    address_family="ipv4")
pulumi.export("bgpSessionStatus", bgp.status)
