import pulumi
import pulumi_equinix as equinix

two_elastic_addresses = equinix.metal.ReservedIpBlock("twoElasticAddresses",
    project_id=project_id,
    metro="sv",
    quantity=2)
test1 = equinix.metal.ReservedIpBlock("test1",
    project_id=project_id,
    type=equinix.metal.IpBlockType.PUBLIC_I_PV4,
    metro="sv",
    quantity=1)
test = equinix.metal.ReservedIpBlock("test",
    project_id=project_id,
    type=equinix.metal.IpBlockType.GLOBAL_I_PV4,
    quantity=1)
