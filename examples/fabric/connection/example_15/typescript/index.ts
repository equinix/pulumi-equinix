import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const epl = new equinix.fabric.Connection("epl", {
    name: "ConnectionName",
    type: "EVPLAN_VC",
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
            linkProtocol: {
                type: equinix.fabric.AccessPointLinkProtocolType.Dot1q,
                vlanSTag: 1976,
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
