import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const tfOrganization1 = new equinix.metal.Organization("tfOrganization1", {
    name: "foobar",
    description: "quux",
});
