import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const newCloudRouter = new equinix.fabric.CloudRouter("new_cloud_router", {
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
    marketplaceSubscription: {
        type: "AWS_MARKETPLACE_SUBSCRIPTION",
        uuid: "2823b8ae07-a2a2-45b4-a658-c3542bb24e9",
    },
    notifications: [{
        type: "ALL",
        emails: [
            "example@equinix.com",
            "test1@equinix.com",
        ],
    }],
    name: "Router-SV",
    type: "XF_ROUTER",
});
