import pulumi
import pulumi_equinix as equinix
import pulumi_std as std

myblock = equinix.metal.ReservedIpBlock("myblock",
    project_id=project_id,
    metro="ny",
    quantity=2)
first_address_assignment = equinix.metal.IpAttachment("firstAddressAssignment",
    device_id=mydevice["id"],
    cidr_notation=std.join_output(separator="/",
        input=[
            std.cidrhost_output(input=myblock_metal_reserved_ip_block["cidrNotation"],
                host=0).apply(lambda invoke: invoke.result),
            "32",
        ]).apply(lambda invoke: invoke.result))
