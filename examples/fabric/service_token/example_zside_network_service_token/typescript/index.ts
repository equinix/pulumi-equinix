import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const test = new equinix.fabric.ServiceToken("test", {
    type: "VC_TOKEN",
    description: "Zside Network Service Token",
    expirationDateTime: "2025-01-18T06:43:49.986Z",
    serviceTokenConnections: [{
        type: "EVPL_VC",
        supportedBandwidths: [
            50,
            200,
            10000,
        ],
        zSides: [{
            accessPointSelectors: [{
                type: "NETWORK",
                network: {
                    uuid: "<network_uuid>",
                },
            }],
        }],
    }],
    notifications: [{
        type: "ALL",
        emails: ["example@equinix.com"],
    }],
});
