import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const existingProject = new equinix.metal.Project("existingProject", {
    name: "The name of the project (if different, will rewrite)",
    bgpConfig: {
        deploymentType: "local",
        md5: "C179c28c41a85b",
        asn: 65000,
    },
});
