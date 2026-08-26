import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const vd2Network = new equinix.fabric.Connection("vd2network", {
    order: {
        purchaseOrderNumber: "1-323292",
    },
    aSide: {
        accessPoint: {
            virtualDevice: {
                type: "EDGE",
                uuid: "<device_uuid>",
            },
            "interface": {
                type: "CLOUD",
                id: 7,
            },
            type: equinix.fabric.AccessPointType.VD,
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
    type: "EVPLAN_VC",
    bandwidth: 50,
});
