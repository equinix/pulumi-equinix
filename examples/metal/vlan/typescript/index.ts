import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const vlan1 = new equinix.metal.Vlan("vlan1", {
    description: "VLAN in New Jersey",
    metro: "sv",
    projectId: projectId,
    vxlan: 1040,
});
