import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const eplan = new equinix.fabric.Connection("eplan", {
    name: "ConnectionName",
    type: "EPLAN_VC",
    notifications: [{
        type: equinix.fabric.NotificationsType.All,
        emails: [
            "example@equinix.com",
            "test1@equinix.com",
        ],
    }],
    bandwidth: 50,
    order: {
        purchaseOrderNumber: "1-323292",
    },
    aSide: {
        accessPoint: {
            type: equinix.fabric.AccessPointType.Colo,
            port: {
                uuid: "<aside_port_uuid>",
            },
        },
    },
    zSide: {
        accessPoint: {
            type: equinix.fabric.AccessPointType.Network,
            network: {
                uuid: "<network_uuid>",
            },
        },
    },
});
