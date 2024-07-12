import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const test = new equinix.metal.ProjectApiKey("test", {
    projectId: existingProjectId,
    description: "Read-only key scoped to a projct",
    readOnly: true,
});
