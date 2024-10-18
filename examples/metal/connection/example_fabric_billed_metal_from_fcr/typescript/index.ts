import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const example1 = new equinix.metal.Vlan("example1", {
    projectId: "<metal_project_id>",
    metro: "SV",
});
const example = new equinix.metal.Interconnection("example", {
    name: "tf-metal-from-fcr",
    projectId: "<metal_project_id>",
    metro: "SV",
    redundancy: "primary",
    type: "shared_port_vlan",
    contactEmail: "username@example.com",
    speed: "200Mbps",
    vlans: [example1.vxlan],
});
const exampleConnection = new equinix.fabric.Connection("exampleConnection", {
    name: "tf-metal-from-fcr",
    type: "IP_VC",
    bandwidth: 200,
    notifications: [{
        type: equinix.fabric.NotificationsType.All,
        emails: ["username@example.com"],
    }],
    project: {
        projectId: "<fabric_project_id>",
    },
    aSide: {
        accessPoint: {
            type: "CLOUD_ROUTER",
            router: {
                uuid: exampleEquinixFabricCloudRouter.id,
            },
        },
    },
    zSide: {
        accessPoint: {
            type: "METAL_NETWORK",
            authenticationKey: example.authorizationCode,
        },
    },
});
