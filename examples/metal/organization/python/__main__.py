import pulumi
import pulumi_equinix as equinix

config = pulumi.Config()
device_id = config.require("deviceId")
org_resource = equinix.metal.Organization("org",
    name="Foo Organization",
    address=equinix.metal.OrganizationAddressArgs(
        address="org street",
        city="london",
        country="GB",
        zip_code="12345",
    ),
    description="An organization")
pulumi.export("org", org_resource.id)
