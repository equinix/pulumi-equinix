import pulumi
import pulumi_equinix as equinix

example = equinix.metal.ReservedIpBlock("example",
    project_id=project_id,
    metro="sv",
    quantity=2)
nodes = equinix.metal.Device("nodes",
    project_id=project_id,
    metro="sv",
    plan=equinix.metal.Plan.C3_SMALL_X86,
    operating_system=equinix.metal.OperatingSystem.UBUNTU20_04,
    hostname="test",
    billing_cycle=equinix.metal.BillingCycle.HOURLY,
    ip_addresses=[
        {
            "type": "public_ipv4",
            "cidr": 31,
            "reservation_ids": [example.id],
        },
        {
            "type": "private_ipv4",
        },
    ])
