import pulumi
import pulumi_equinix as equinix
import pulumi_std as std

key1 = equinix.metal.SshKey("key1",
    name="terraform-1",
    public_key=std.file_output(input="/home/terraform/.ssh/id_rsa.pub").apply(lambda invoke: invoke.result))
test = equinix.metal.Device("test",
    hostname="test-device",
    plan=equinix.metal.Plan.C3_SMALL_X86,
    metro="sv",
    operating_system=equinix.metal.OperatingSystem.UBUNTU20_04,
    billing_cycle=equinix.metal.BillingCycle.HOURLY,
    project_id=project_id,
    opts = pulumi.ResourceOptions(depends_on=[key1]))
