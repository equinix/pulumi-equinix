import pulumi
import pulumi_equinix as equinix

web1 = equinix.metal.Device("web1",
    hostname="tf.coreos2",
    plan=equinix.metal.Plan.C3_SMALL_X86,
    metro="sv",
    operating_system="ubuntu_24_04",
    billing_cycle=equinix.metal.BillingCycle.HOURLY,
    project_id=project_id)
