import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const port2Alibaba = new equinix.fabric.Connection("port2alibaba", {
    redundancy: {
        priority: "PRIMARY",
    },
    order: {
        purchaseOrderNumber: "1-323929",
    },
    aSide: {
        accessPoint: {
            port: {
                uuid: "<aside_port_uuid>",
            },
            linkProtocol: {
                type: equinix.fabric.AccessPointLinkProtocolType.Dot1q,
                vlanTag: 2019,
            },
            type: equinix.fabric.AccessPointType.Colo,
        },
    },
    zSide: {
        accessPoint: {
            profile: {
                type: equinix.fabric.ProfileType.L2Profile,
                uuid: "<service_profile_uuid>",
            },
            location: {
                metroCode: equinix.index.Metro.SiliconValley,
            },
            type: equinix.fabric.AccessPointType.SP,
            authenticationKey: "<alibaba_account_id>",
            sellerRegion: "us-west-1",
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
