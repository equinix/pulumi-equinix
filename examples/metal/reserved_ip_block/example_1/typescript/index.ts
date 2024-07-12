import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const twoElasticAddresses = new equinix.metal.ReservedIpBlock("twoElasticAddresses", {
    projectId: projectId,
    metro: "sv",
    quantity: 2,
});
const test1 = new equinix.metal.ReservedIpBlock("test1", {
    projectId: projectId,
    type: equinix.metal.IpBlockType.PublicIPv4,
    metro: "sv",
    quantity: 1,
});
const test = new equinix.metal.ReservedIpBlock("test", {
    projectId: projectId,
    type: equinix.metal.IpBlockType.GlobalIPv4,
    quantity: 1,
});
