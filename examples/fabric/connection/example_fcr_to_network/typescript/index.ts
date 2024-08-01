import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const fcr2Network = new equinix.fabric.Connection("fcr2network", {
    name: "ConnectionName",
    type: "IPWAN_VC",
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
            type: "CLOUD_ROUTER",
            router: {
                uuid: "<cloud_router_uuid>",
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
