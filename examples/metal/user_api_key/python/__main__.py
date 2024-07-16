import pulumi
import pulumi_equinix as equinix

test = equinix.metal.UserApiKey("test",
    description="Read-only user key",
    read_only=True)
