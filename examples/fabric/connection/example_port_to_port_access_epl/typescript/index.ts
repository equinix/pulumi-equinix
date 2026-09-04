import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const accessEplVc = new equinix.fabric.Connection("access_epl_vc", {
    order: {
        purchaseOrderNumber: "1-323292",
    },
    aSide: {
        accessPoint: {
            port: {
                uuid: "<aside_port_uuid>",
            },
            linkProtocol: {
                type: equinix.fabric.AccessPointLinkProtocolType.QinQ,
                vlanSTag: 1976,
            },
            type: equinix.fabric.AccessPointType.Colo,
        },
    },
    zSide: {
        accessPoint: {
            port: {
                uuid: "<zside_port_uuid>",
            },
            location: {
                metroCode: equinix.index.Metro.SiliconValley,
            },
            type: equinix.fabric.AccessPointType.Colo,
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
    type: equinix.fabric.ConnectionType.AccessEPL,
    bandwidth: 50,
});
