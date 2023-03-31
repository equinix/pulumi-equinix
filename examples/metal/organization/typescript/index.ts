import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const orgResource = new equinix.metal.Organization("org", {
    name: "Foo Organization",
    address: {
        address: "org street",
        city: "london",
        country: "GB",
        zipCode: "12345",
    },
    description: "An organization",
});
export const org = orgResource.id;
