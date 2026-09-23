import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const fcr2Network = new equinix.fabric.Connection("fcr2network", {
    order: {
        purchaseOrderNumber: "1-323292",
    },
    aSide: {
        accessPoint: {
            router: {
                uuid: "<cloud_router_uuid>",
            },
            type: "CLOUD_ROUTER",
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
    type: "IPWAN_VC",
    bandwidth: 50,
});
