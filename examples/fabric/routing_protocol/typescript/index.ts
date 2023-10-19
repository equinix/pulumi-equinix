import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const config = new pulumi.Config();
const connectionId = config.require("connectionId");
const routingProtocol = new equinix.fabric.RoutingProtocol("RoutingProtocol", {
    connectionUuid: connectionId,
    name: "My-Direct-route-1",
    type: "DIRECT",
    directIpv4: {
        equinixIfaceIp: "192.168.100.1/30",
    },
});
export const routingProtocolId = routingProtocol.id;
export const routingProtocolState = routingProtocol.state;
export const routingProtocolEquinixAsn = routingProtocol.equinixAsn;
