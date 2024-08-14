import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";
import * as equinix from "@pulumi/equinix";

const zside = equinix.fabric.getServiceProfilesOutput({
    filter: {
        property: "/name",
        operator: "=",
        values: ["AWS Direct Connect"],
    },
});
const example1 = new equinix.metal.Vlan("example1", {
    projectId: myProjectId,
    metro: "SV",
});
const example = new equinix.metal.Interconnection("example", {
    name: "tf-port-to-metal-legacy",
    projectId: myProjectId,
    metro: "SV",
    redundancy: "primary",
    type: "shared_port_vlan",
    contactEmail: "username@example.com",
    vlans: [example1.vxlan],
});
const exampleConnection = new equinix.fabric.Connection("exampleConnection", {
    name: "tf-NIMF-metal-2-aws-legacy",
    type: equinix.fabric.ConnectionType.EVPL,
    notifications: [{
        type: equinix.fabric.NotificationsType.All,
        emails: "sername@example.com",
    }],
    project: {
        projectId: fabricProjectId,
    },
    bandwidth: 200,
    order: {
        purchaseOrderNumber: "1-323292",
    },
    aSide: {
        accessPoint: {
            type: "METAL_NETWORK",
            authenticationKey: example.authorizationCode,
        },
    },
    zSide: {
        accessPoint: {
            type: equinix.fabric.AccessPointType.SP,
            authenticationKey: awsAccountId,
            sellerRegion: "us-west-1",
            profile: {
                type: equinix.fabric.ProfileType.L2Profile,
                uuid: zside.apply(zside => zside.id),
            },
            location: {
                metroCode: equinix.index.Metro.SiliconValley,
            },
        },
    },
});
