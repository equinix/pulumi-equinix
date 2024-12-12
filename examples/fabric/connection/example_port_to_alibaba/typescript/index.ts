import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const port2Alibaba = new equinix.fabric.Connection("port2alibaba", {
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
                type: equinix.fabric.AccessPointLinkProtocolType.Dot1q,
                vlanTag: 2019,
            },
        },
    },
    zSide: {
        accessPoint: {
            type: equinix.fabric.AccessPointType.SP,
            authenticationKey: "<alibaba_account_id>",
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
