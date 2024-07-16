import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const example = new equinix.metal.ReservedIpBlock("example", {
    projectId: projectId,
    metro: "sv",
    quantity: 2,
});
const nodes = new equinix.metal.Device("nodes", {
    projectId: projectId,
    metro: "sv",
    plan: equinix.metal.Plan.C3SmallX86,
    operatingSystem: equinix.metal.OperatingSystem.Ubuntu20_04,
    hostname: "test",
    billingCycle: equinix.metal.BillingCycle.Hourly,
    ipAddresses: [
        {
            type: "public_ipv4",
            cidr: 31,
            reservationIds: [example.id],
        },
        {
            type: "private_ipv4",
        },
    ],
});
