import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const test = new equinix.fabric.ServiceToken("test", {
    type: "VC_TOKEN",
    description: "Aside COLO Service Token",
    expirationDateTime: "2025-01-18T06:43:49.981Z",
    serviceTokenConnections: [{
        type: "EVPL_VC",
        bandwidthLimit: 1000,
        aSides: [{
            accessPointSelectors: [{
                type: "COLO",
                port: {
                    uuid: "<port_uuid>",
                },
                linkProtocol: {
                    type: "DOT1Q",
                    vlanTag: 2987,
                },
            }],
        }],
    }],
    notifications: [{
        type: "ALL",
        emails: [
            "example@equinix.com",
            "test1@equinix.com",
        ],
    }],
});
