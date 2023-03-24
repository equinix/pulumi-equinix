import pulumi
import pulumi_equinix as equinix

config = pulumi.Config()
device_id = config.require("deviceId")
subnet_cidr = config.get("subnetCidr")
if subnet_cidr is None:
    subnet_cidr = "147.229.10.152/31"
ip_attach_resource = equinix.metal.IpAttachment("ipAttach",
    device_id=device_id,
    cidr_notation=subnet_cidr)
pulumi.export("ipAttach", ip_attach_resource.id)
pulumi.export("ipNetmask", ip_attach_resource.netmask)
