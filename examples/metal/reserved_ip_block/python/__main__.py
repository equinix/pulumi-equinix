import pulumi
import pulumi_equinix as equinix

config = pulumi.Config()
project_id = config.require("projectId")
metro = config.get("metro")
if metro is None:
    metro = "FR"
type = config.get("type")
if type is None:
    type = "public_ipv4"
quantity = config.get_int("quantity")
if quantity is None:
    quantity = 1
ip_block = equinix.metal.ReservedIpBlock("ipBlock",
    project_id=project_id,
    type=type,
    quantity=quantity,
    metro=metro)
pulumi.export("ipBlockId", ip_block.id)
pulumi.export("ipBlockSubent", ip_block.cidr_notation)
