import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const example = new equinix.metal.Vrf("example", {
    name: "tf-metal-from-ne",
    metro: "FR",
    localAsn: 65001,
    ipRanges: ["10.99.1.0/24"],
    projectId: test.id,
});
const exampleInterconnection = new equinix.metal.Interconnection("exampleInterconnection", {
    name: "tf-metal-from-ne",
    projectId: "<metal_project_id>",
    type: "shared",
    redundancy: "primary",
    metro: "FR",
    speed: "200Mbps",
    serviceTokenType: "z_side",
    contactEmail: "username@example.com",
    vrfs: [example.vxlan],
});
const exampleConnection = new equinix.fabric.Connection("exampleConnection", {
    name: "tf-metal-from-ne",
    type: equinix.fabric.ConnectionType.EVPL,
    bandwidth: 200,
    notifications: [{
        type: equinix.fabric.NotificationsType.All,
        emails: ["username@example.com"],
    }],
    order: {
        purchaseOrderNumber: "1-323292",
    },
    project: {
        projectId: "<fabric_project_id>",
    },
    aSide: {
        accessPoint: {
            type: equinix.fabric.AccessPointType.VD,
            virtualDevice: {
                type: "EDGE",
                uuid: exampleEquinixNetworkDevice.id,
            },
        },
    },
    zSide: {
        serviceToken: {
            uuid: exampleInterconnection.serviceTokens.apply(serviceTokens => serviceTokens[0].id),
        },
    },
});
