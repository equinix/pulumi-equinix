import pulumi
import pulumi_equinix as equinix
import pulumi_null as null

bgp_password = "955dB0b81Ef"
project_id = "<UUID_of_your_project>"
addr = equinix.metal.ReservedIpBlock("addr",
    project_id=project_id,
    metro="ny",
    quantity=1)
interface_lo0 = pulumi.Output.all(
    address=addr.address,
    netmask=addr.netmask
).apply(lambda resolved_outputs: f"""auto lo:0
iface lo:0 inet static
   address {resolved_outputs['address']}
   netmask {resolved_outputs['netmask']}
""")

test = equinix.metal.Device("test",
    hostname="terraform-test-bgp-sesh",
    plan=equinix.metal.Plan.C3_SMALL_X86,
    metro="ny",
    operating_system=equinix.metal.OperatingSystem.UBUNTU20_04,
    billing_cycle=equinix.metal.BillingCycle.HOURLY,
    project_id=project_id)
bird_conf = pulumi.Output.all(
    address=addr.address,
    cidr=addr.cidr,
    testNetwork=test.network,
    testNetwork1=test.network
).apply(lambda resolved_outputs: f"""filter equinix_metal_bgp {{
    if net = {resolved_outputs['address']}/{resolved_outputs['cidr']} then accept;
}}
router id {test_network[2].address};
protocol direct {{
    interface "lo";
}}
protocol kernel {{
    scan time 10;
    persist;
    import all;
    export all;
}}
protocol device {{
    scan time 10;
}}
protocol bgp {{
    export filter equinix_metal_bgp;
    local as 65000;
    neighbor {test_network1[2].gateway} as 65530;
    password "{bgp_password}";
}}
""")

test_bgp_session = equinix.metal.BgpSession("testBgpSession",
    device_id=test.id,
    address_family="ipv4")
configure_bird = null.Resource("configureBird", triggers={
    "bird_conf": bird_conf,
    "interface": interface_lo0,
})
