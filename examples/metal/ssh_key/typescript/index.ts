import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";
import * as std from "@pulumi/std";

const key1 = new equinix.metal.SshKey("key1", {
    name: "terraform-1",
    publicKey: std.fileOutput({
        input: "/home/terraform/.ssh/id_rsa.pub",
    }).apply(invoke => invoke.result),
});
const test = new equinix.metal.Device("test", {
    hostname: "test-device",
    plan: equinix.metal.Plan.C3SmallX86,
    metro: "sv",
    operatingSystem: "ubuntu_24_04",
    billingCycle: equinix.metal.BillingCycle.Hourly,
    projectId: projectId,
}, {
    dependsOn: [key1],
});
