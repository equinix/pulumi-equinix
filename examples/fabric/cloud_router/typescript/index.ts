import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const newCloudRouter = new equinix.fabric.CloudRouter("newCloudRouter", {
    name: "Router-SV",
    type: "XF_ROUTER",
    notifications: [{
        type: "ALL",
        emails: [
            "example@equinix.com",
            "test1@equinix.com",
        ],
    }],
    order: {
        purchaseOrderNumber: "1-323292",
    },
    location: {
        metroCode: "SV",
    },
    "package": {
        code: "STANDARD",
    },
    project: {
        projectId: "776847000642406",
    },
    account: {
        accountNumber: 203612,
    },
});
