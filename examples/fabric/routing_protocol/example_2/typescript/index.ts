import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const bgp = new equinix.fabric.RoutingProtocol("bgp", {
    bgpIpv4: {
        customerPeerIp: "190.1.1.2",
        enabled: true,
    },
    bgpIpv6: {
        customerPeerIp: "190::1:2",
        enabled: true,
    },
    connectionUuid: "<same_connection_id_as_first_equinix_fabric_routing_protocol>",
    type: "BGP",
    name: "bgp_rp",
    customerAsn: 4532,
});
