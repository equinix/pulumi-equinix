import pulumi
import pulumi_equinix as equinix

web1 = equinix.metal.Device("web1",
    hostname="tf.coreos2",
    plan=equinix.metal.Plan.C3_SMALL_X86,
    metro="ny",
    operating_system=equinix.metal.OperatingSystem.UBUNTU20_04,
    billing_cycle=equinix.metal.BillingCycle.HOURLY,
    project_id=project_id,
    ip_addresses=[{
        "type": "private_ipv4",
        "cidr": 30,
    }])
