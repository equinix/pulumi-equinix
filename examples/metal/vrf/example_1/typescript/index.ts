import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const example = new equinix.metal.Project("example", {name: "example"});
const exampleVrf = new equinix.metal.Vrf("exampleVrf", {
    description: "VRF with ASN 65000 and a pool of address space that includes 192.168.100.0/25",
    name: "example-vrf",
    metro: "da",
    localAsn: 65000,
    ipRanges: [
        "192.168.100.0/25",
        "192.168.200.0/25",
    ],
    projectId: example.id,
});
