import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const web1 = new equinix.metal.Device("web1", {
    hostname: "tf.coreos2",
    plan: equinix.metal.Plan.C3SmallX86,
    metro: "sv",
    operatingSystem: equinix.metal.OperatingSystem.Ubuntu20_04,
    billingCycle: equinix.metal.BillingCycle.Hourly,
    projectId: projectId,
});
