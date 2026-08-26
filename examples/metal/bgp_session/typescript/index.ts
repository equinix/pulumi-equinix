import * as pulumi from "@pulumi/pulumi";
import * as _null from "@pulumi/null";

const bgpPassword = "955dB0b81Ef";
const projectId = "<UUID_of_your_project>";
const interfaceLo0 = `auto lo:0
iface lo:0 inet static
   address ${addr.address}
   netmask ${addr.netmask}
`;
const birdConf = `filter equinix_metal_bgp {
    if net = ${addr.address}/${addr.cidr} then accept;
}
router id ${test.network[2].address};
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
    neighbor ${test.network[2].gateway} as 65530;
    password "${bgpPassword}";
}
`;
const configureBird = new _null.Resource("configure_bird", {triggers: {
    bird_conf: birdConf,
    "interface": interfaceLo0,
}});
