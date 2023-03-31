import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const config = new pulumi.Config();
const projectId = config.require("projectId");
const readOnly = config.getBoolean("readOnly") || false;
const apiKey = new equinix.metal.ProjectApiKey("apiKey", {
    projectId: projectId,
    description: "A project level API Key",
    readOnly: readOnly,
});
export const apiKeyToken = apiKey.token;
