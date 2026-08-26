import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const evplan = new equinix.fabric.Connection("evplan", {
    order: {
        purchaseOrderNumber: "1-323292",
    },
    aSide: {
        accessPoint: {
            port: {
                uuid: "<aside_port_uuid>",
            },
            linkProtocol: {
                type: equinix.fabric.AccessPointLinkProtocolType.Dot1q,
                vlanSTag: 1976,
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
    type: "EVPLAN_VC",
    bandwidth: 50,
});
