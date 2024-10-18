import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";
import * as equinix from "@pulumi/equinix";

const aSide = equinix.fabric.getPortsOutput({
    filter: {
        name: "<name_of_port||port_prefix>",
    },
});
const example = new equinix.metal.Interconnection("example", {
    name: "tf-metal-2-port",
    projectId: "<metal_project_id>",
    type: "shared",
    redundancy: "redundant",
    metro: "FR",
    speed: "1Gbps",
    serviceTokenType: "a_side",
    contactEmail: "username@example.com",
});
const exampleConnection = new equinix.fabric.Connection("exampleConnection", {
    name: "tf-metal-2-port",
    type: equinix.fabric.ConnectionType.EVPL,
    notifications: [{
        type: equinix.fabric.NotificationsType.All,
        emails: ["username@example.com"],
    }],
    project: {
        projectId: "<fabric_project_id>",
    },
    bandwidth: 100,
    order: {
        purchaseOrderNumber: "1-323292",
    },
    aSide: {
        serviceToken: {
            uuid: example.serviceTokens.apply(serviceTokens => serviceTokens[0].id),
        },
    },
    zSide: {
        accessPoint: {
            type: equinix.fabric.AccessPointType.Colo,
            port: {
                uuid: aSide.apply(aSide => aSide.data?.[0]?.uuid),
            },
            linkProtocol: {
                type: equinix.fabric.AccessPointLinkProtocolType.Dot1q,
                vlanTag: 1234,
            },
        },
    },
});
