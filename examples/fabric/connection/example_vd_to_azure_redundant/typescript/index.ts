import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const vd2AzurePrimary = new equinix.fabric.Connection("vd2azurePrimary", {
    name: "ConnectionName",
    type: equinix.fabric.ConnectionType.EVPL,
    redundancy: {
        priority: "PRIMARY",
    },
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
                type: "CLOUD",
                id: 7,
            },
        },
    },
    zSide: {
        accessPoint: {
            type: equinix.fabric.AccessPointType.SP,
            authenticationKey: "<Azure_ExpressRouter_Auth_Key>",
            peeringType: equinix.fabric.AccessPointPeeringType.Private,
            profile: {
                type: equinix.fabric.ProfileType.L2Profile,
                uuid: "<Azure_Service_Profile_UUID>",
            },
            location: {
                metroCode: equinix.index.Metro.SiliconValley,
            },
        },
    },
});
const vd2AzureSecondary = new equinix.fabric.Connection("vd2azureSecondary", {
    name: "ConnectionName",
    type: equinix.fabric.ConnectionType.EVPL,
    redundancy: {
        priority: "SECONDARY",
        group: vd2AzurePrimary.redundancy.apply(redundancy => redundancy?.group),
    },
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
                type: "CLOUD",
                id: 5,
            },
        },
    },
    zSide: {
        accessPoint: {
            type: equinix.fabric.AccessPointType.SP,
            authenticationKey: "<Azure_ExpressRouter_Auth_Key>",
            peeringType: equinix.fabric.AccessPointPeeringType.Private,
            profile: {
                type: equinix.fabric.ProfileType.L2Profile,
                uuid: "<Azure_Service_Profile_UUID>",
            },
            location: {
                metroCode: equinix.index.Metro.SiliconValley,
            },
        },
    },
});
