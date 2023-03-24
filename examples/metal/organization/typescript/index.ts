import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix/pulumi-equinix";

const config = new pulumi.Config();
const deviceId = config.require("deviceId");
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
