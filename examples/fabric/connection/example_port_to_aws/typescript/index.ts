import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const port2Aws = new equinix.fabric.Connection("port2aws", {
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
    redundancy: {
        priority: "PRIMARY",
    },
    order: {
        purchaseOrderNumber: "1-323929",
    },
    aSide: {
        accessPoint: {
            type: equinix.fabric.AccessPointType.Colo,
            port: {
                uuid: "<aside_port_uuid>",
            },
            linkProtocol: {
                type: equinix.fabric.AccessPointLinkProtocolType.QinQ,
                vlanSTag: 2019,
                vlanCTag: 2112,
            },
        },
    },
    zSide: {
        accessPoint: {
            type: equinix.fabric.AccessPointType.SP,
            authenticationKey: "<aws_account_id>",
            sellerRegion: "us-west-1",
            profile: {
                type: equinix.fabric.ProfileType.L2Profile,
                uuid: "<service_profile_uuid>",
            },
            location: {
                metroCode: equinix.index.Metro.SiliconValley,
            },
        },
    },
    additionalInfo: [
        {
            key: "accessKey",
            value: "<aws_access_key>",
        },
        {
            key: "secretKey",
            value: "<aws_secret_key>",
        },
    ],
});
