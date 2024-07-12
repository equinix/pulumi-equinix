import pulumi
import pulumi_equinix as equinix

pxe1 = equinix.metal.Device("pxe1",
    hostname="tf.coreos2-pxe",
    plan=equinix.metal.Plan.C3_SMALL_X86,
    metro="sv",
    operating_system=equinix.metal.OperatingSystem.CUSTOM_IPXE,
    billing_cycle=equinix.metal.BillingCycle.HOURLY,
    project_id=project_id,
    ipxe_script_url="https://rawgit.com/cloudnativelabs/pxe/master/packet/coreos-stable-metal.ipxe",
    always_pxe=False,
    user_data=example["rendered"])
