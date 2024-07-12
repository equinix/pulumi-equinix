import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const pxe1 = new equinix.metal.Device("pxe1", {
    hostname: "tf.coreos2-pxe",
    plan: equinix.metal.Plan.C3SmallX86,
    metro: "sv",
    operatingSystem: equinix.metal.OperatingSystem.CustomIPXE,
    billingCycle: equinix.metal.BillingCycle.Hourly,
    projectId: projectId,
    ipxeScriptUrl: "https://rawgit.com/cloudnativelabs/pxe/master/packet/coreos-stable-metal.ipxe",
    alwaysPxe: false,
    userData: userData,
    customData: customData,
    behavior: {
        allowChanges: [
            "custom_data",
            "user_data",
        ],
    },
});
