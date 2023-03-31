import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const config = new pulumi.Config();
const projectId = config.require("projectId");
const metro = config.get("metro") || "DA";
const vrf = new equinix.metal.Vrf("vrf", {
    description: "VRF with ASN 65000 and a pool of address space",
    name: "example-vrf",
    metro: metro,
    localAsn: 65000,
    ipRanges: [
        "192.168.100.0/25",
        "192.168.200.0/25",
    ],
    projectId: projectId,
});
export const vrfId = vrf.id;
