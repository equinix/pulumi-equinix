import * as pulumi from "@pulumi/pulumi";
import * as _null from "@pulumi/null";
import * as equinix from "@equinix-labs/pulumi-equinix";

const bgpPassword = "955dB0b81Ef";
const projectId = "<UUID_of_your_project>";
const addr = new equinix.metal.ReservedIpBlock("addr", {
    projectId: projectId,
    metro: "ny",
    quantity: 1,
});
const interfaceLo0 = pulumi.interpolate`auto lo:0
iface lo:0 inet static
   address ${addr.address}
   netmask ${addr.netmask}
`;
const test = new equinix.metal.Device("test", {
    hostname: "terraform-test-bgp-sesh",
    plan: equinix.metal.Plan.C3SmallX86,
    metro: "ny",
    operatingSystem: equinix.metal.OperatingSystem.Ubuntu20_04,
    billingCycle: equinix.metal.BillingCycle.Hourly,
    projectId: projectId,
});
const birdConf = pulumi.all([addr.address, addr.cidr, test.network, test.network]).apply(([address, cidr, testNetwork, testNetwork1]) => `filter equinix_metal_bgp {
    if net = ${address}/${cidr} then accept;
}
router id ${testNetwork[2].address};
protocol direct {
    interface "lo";
}
protocol kernel {
    scan time 10;
    persist;
    import all;
    export all;
}
protocol device {
    scan time 10;
}
protocol bgp {
    export filter equinix_metal_bgp;
    local as 65000;
    neighbor ${testNetwork1[2].gateway} as 65530;
    password "${bgpPassword}";
}
`);
const testBgpSession = new equinix.metal.BgpSession("testBgpSession", {
    deviceId: test.id,
    addressFamily: "ipv4",
});
const configureBird = new _null.Resource("configureBird", {triggers: {
    bird_conf: birdConf,
    "interface": interfaceLo0,
}});
