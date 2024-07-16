import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const test = new equinix.metal.UserApiKey("test", {
    description: "Read-only user key",
    readOnly: true,
});
