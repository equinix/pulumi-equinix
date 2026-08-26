import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const test = new equinix.fabric.ServiceToken("test", {
    notifications: [{
        type: "ALL",
        emails: ["example@equinix.com"],
    }],
    serviceTokenConnections: [{
        zSides: [{
            accessPointSelectors: [{
                virtualDevice: {
                    type: "EDGE",
                    uuid: "<device_uuid>",
                },
                "interface": {
                    type: "NETWORK",
                },
                type: "VD",
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
    description: "Zside VD Service Token",
    expirationDateTime: "2025-01-18T06:43:49.986Z",
});
