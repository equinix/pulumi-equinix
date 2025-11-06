import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const aSide = equinix.fabric.getPortsOutput({
    filter: {
        name: "<name_of_port||port_prefix>",
    },
});
const example = new equinix.metal.Vlan("example", {
    projectId: "<metal_project_id>",
    metro: "FR",
});
const exampleInterconnection = new equinix.metal.Interconnection("exampleInterconnection", {
    name: "tf-metal-from-port",
    projectId: "<metal_project_id>",
    type: "shared",
    redundancy: "primary",
    metro: "FR",
    speed: "200Mbps",
    serviceTokenType: "z_side",
    contactEmail: "username@example.com",
    vlans: [example.vxlan],
});
const exampleConnection = new equinix.fabric.Connection("exampleConnection", {
    name: "tf-metal-from-port",
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
    zSide: {
        serviceToken: {
            uuid: exampleInterconnection.serviceTokens.apply(serviceTokens => serviceTokens[0].id),
        },
    },
});
