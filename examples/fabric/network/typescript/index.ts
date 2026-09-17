import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const newNetwork = new equinix.fabric.Network("new_network", {
    project: {
        projectId: "776847000642406",
    },
    notifications: [{
        type: "ALL",
        emails: [
            "example@equinix.com",
            "test1@equinix.com",
        ],
    }],
    name: "Network-SV",
    type: "EVPLAN",
    scope: "GLOBAL",
});
