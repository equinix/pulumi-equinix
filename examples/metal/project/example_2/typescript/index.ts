import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const tfProject1 = new equinix.metal.Project("tfProject1", {
    name: "tftest",
    bgpConfig: {
        deploymentType: "local",
        md5: "C179c28c41a85b",
        asn: 65000,
    },
});
