import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const test = new equinix.fabric.ServiceToken("test", {
    notifications: [{
        type: "ALL",
        emails: [
            "example@equinix.com",
            "test1@equinix.com",
        ],
    }],
    serviceTokenConnections: [{
        zSides: [{
            accessPointSelectors: [{
                port: {
                    uuid: "<port_uuid>",
                },
                linkProtocol: {
                    type: "DOT1Q",
                    vlanTag: 2087,
                },
                type: "COLO",
            }],
        }],
        type: "EVPL_VC",
        supportedBandwidths: [
            50,
            200,
            10000,
        ],
    }],
    type: "VC_TOKEN",
    description: "Zside COLO Service Token",
    expirationDateTime: "2025-01-18T06:43:49.981Z",
});
