import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const direct = new equinix.fabric.RoutingProtocol("direct", {
    connectionUuid: "<some_id>",
    type: "DIRECT",
    name: "direct_rp",
    directIpv4: {
        equinixIfaceIp: "190.1.1.1/30",
    },
    directIpv6: {
        equinixIfaceIp: "190::1:1/126",
    },
});
