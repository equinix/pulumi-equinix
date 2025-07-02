import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const web1 = new equinix.metal.Device("web1", {
    hostname: "tf.coreos2",
    plan: equinix.metal.Plan.C3SmallX86,
    metro: "ny",
    operatingSystem: "ubuntu_24_04",
    billingCycle: equinix.metal.BillingCycle.Hourly,
    projectId: projectId,
    ipAddresses: [{
        type: "private_ipv4",
        cidr: 30,
    }],
});
