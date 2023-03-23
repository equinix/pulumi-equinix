import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix/pulumi-equinix";

const config = new pulumi.Config();
const organizationId = config.require("organizationId");
const name = config.get("name") || "Default Project";
const projectResource = new equinix.metal.Project("project", {
    name: name,
    organizationId: organizationId,
});
export const projectId = projectResource.id;
