import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const config = new pulumi.Config();
const description = config.get("description") || "An user level API Key";
const readOnly = config.getBoolean("readOnly") || false;
const apiKey = new equinix.metal.UserApiKey("apiKey", {
    description: description,
    readOnly: readOnly,
});
export const apiKeyToken = apiKey.token;
