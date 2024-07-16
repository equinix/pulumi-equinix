import pulumi
import pulumi_equinix as equinix

tf_organization1 = equinix.metal.Organization("tfOrganization1",
    name="foobar",
    description="quux")
