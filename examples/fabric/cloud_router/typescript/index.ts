import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const config = new pulumi.Config();
const metro = config.get("metro") || "FR";
const accountNum = config.requireNumber("accountNum");
const router = new equinix.fabric.CloudRouter("router", {
    name: "My-Fabric-Cloud-Router",
    type: "XF_ROUTER",
    location: {
        metroCode: metro,
    },
    "package": {
        code: "BASIC",
    },
    notifications: [{
        type: "ALL",
        emails: ["example@equinix.com"],
    }],
    account: {
        accountNumber: 272010,
    },
});
export const routerId = router.id;
