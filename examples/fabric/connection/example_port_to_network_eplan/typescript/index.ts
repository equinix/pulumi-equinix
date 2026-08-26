import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const eplan = new equinix.fabric.Connection("eplan", {
    order: {
        purchaseOrderNumber: "1-323292",
    },
    aSide: {
        accessPoint: {
            port: {
                uuid: "<aside_port_uuid>",
            },
            type: equinix.fabric.AccessPointType.Colo,
        },
    },
    zSide: {
        accessPoint: {
            network: {
                uuid: "<network_uuid>",
            },
            type: equinix.fabric.AccessPointType.Network,
        },
    },
    notifications: [{
        type: equinix.fabric.NotificationsType.All,
        emails: [
            "example@equinix.com",
            "test1@equinix.com",
        ],
    }],
    name: "ConnectionName",
    type: "EPLAN_VC",
    bandwidth: 50,
});
