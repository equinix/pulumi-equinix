import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const newNetwork = new equinix.fabric.Network("newNetwork", {
    name: "Network-SV",
    type: "EVPLAN",
    scope: "GLOBAL",
    notifications: [{
        type: "ALL",
        emails: [
            "example@equinix.com",
            "test1@equinix.com",
        ],
    }],
    project: {
        projectId: "776847000642406",
    },
});
