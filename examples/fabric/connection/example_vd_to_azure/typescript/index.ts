import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const vd2Azure = new equinix.fabric.Connection("vd2azure", {
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
            profile: {
                type: equinix.fabric.ProfileType.L2Profile,
                uuid: "<Azure_Service_Profile_UUID>",
            },
            location: {
                metroCode: equinix.index.Metro.SiliconValley,
            },
            type: equinix.fabric.AccessPointType.SP,
            authenticationKey: "<Azure_ExpressRouter_Auth_Key>",
            peeringType: equinix.fabric.AccessPointPeeringType.Private,
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
    type: equinix.fabric.ConnectionType.EVPL,
    bandwidth: 50,
});
