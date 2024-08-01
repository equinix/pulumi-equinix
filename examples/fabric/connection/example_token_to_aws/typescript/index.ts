import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const token2Aws = new equinix.fabric.Connection("token2aws", {
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
        serviceToken: {
            uuid: "<service_token_uuid>",
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
});
