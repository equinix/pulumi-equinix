import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const vd2Port = new equinix.fabric.Connection("vd2port", {
    name: "ConnectionName",
    type: equinix.fabric.ConnectionType.EVPL,
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
            type: equinix.fabric.AccessPointType.VD,
            virtualDevice: {
                type: "EDGE",
                uuid: "<device_uuid>",
            },
            "interface": {
                type: "NETWORK",
                id: 7,
            },
        },
    },
    zSide: {
        accessPoint: {
            type: equinix.fabric.AccessPointType.Colo,
            port: {
                uuid: "<zside_port_uuid>",
            },
            linkProtocol: {
                type: equinix.fabric.AccessPointLinkProtocolType.Dot1q,
                vlanSTag: 3711,
            },
            location: {
                metroCode: equinix.index.Metro.SiliconValley,
            },
        },
    },
});
