import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const newServiceProfile = new equinix.fabric.ServiceProfile("newServiceProfile", {
    description: "Service Profile for Receiving Connections",
    name: "Name Of Business + Use Case Tag",
    type: equinix.fabric.ProfileType.L2Profile,
    visibility: equinix.fabric.ProfileVisibility.Public,
    notifications: [{
        emails: ["someone@sample.com"],
        type: "BANDWIDTH_ALERT",
    }],
    allowedEmails: [
        "test@equinix.com",
        "testagain@equinix.com",
    ],
    ports: [{
        uuid: "c791f8cb-5cc9-cc90-8ce0-306a5c00a4ee",
        type: "XF_PORT",
    }],
    accessPointTypeConfigs: [{
        type: equinix.fabric.ProfileAccessPointType.Colo,
        allowRemoteConnections: true,
        allowCustomBandwidth: true,
        allowBandwidthAutoApproval: false,
        connectionRedundancyRequired: false,
        connectionLabel: "Service Profile Tag1",
        bandwidthAlertThreshold: 10,
        supportedBandwidths: [
            100,
            500,
        ],
    }],
});
