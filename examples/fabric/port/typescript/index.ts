import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const order = new equinix.fabric.Port("order", {
    type: "XF_PORT",
    connectivitySourceType: "COLO",
    location: {
        metroCode: "TR",
    },
    settings: {
        packageType: "STANDARD",
        sharedPortType: false,
    },
    encapsulation: {
        type: "DOT1Q",
        tagProtocolId: "33024",
    },
    account: {
        accountNumber: "<account_number>",
    },
    project: {
        projectId: "<project_id>",
    },
    redundancy: {
        priority: "PRIMARY",
    },
    lagEnabled: true,
    physicalPorts: [{
        type: "XF_PHYSICAL_PORT",
        demarcationPoint: {
            ibx: "TR2",
            cageUniqueSpaceId: "TR2:01:002087",
            cabinetUniqueSpaceId: "Demarc",
            patchPanel: "PP:Demarc:00002087",
            connectorType: "SC",
        },
    }],
    physicalPortsSpeed: 1000,
    physicalPortsType: "1000BASE_LX",
    physicalPortsCount: 1,
    demarcationPointIbx: "TR2",
    notifications: [
        {
            type: "TECHNICAL",
            registeredUsers: ["<username>"],
        },
        {
            type: "NOTIFICATION",
            registeredUsers: ["<username>"],
        },
    ],
    additionalInfos: [{
        key: "lagType",
        value: "New",
    }],
});
