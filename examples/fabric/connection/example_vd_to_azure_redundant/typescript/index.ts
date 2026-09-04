import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const vd2AzurePrimary = new equinix.fabric.Connection("vd2azure_primary", {
    redundancy: {
        priority: "PRIMARY",
    },
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
const vd2AzureSecondary = new equinix.fabric.Connection("vd2azure_secondary", {
    redundancy: {
        priority: "SECONDARY",
        group: vd2AzurePrimary.redundancy.apply(redundancy => redundancy?.group),
    },
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
                id: 5,
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
