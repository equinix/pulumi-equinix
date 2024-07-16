import pulumi
import pulumi_equinix as equinix

vlan1 = equinix.metal.Vlan("vlan1",
    description="VLAN in New Jersey",
    metro="sv",
    project_id=project_id,
    vxlan=1040)
