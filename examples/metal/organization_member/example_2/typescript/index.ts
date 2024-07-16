import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const owner = new equinix.metal.OrganizationMember("owner", {
    invitee: "admin@example.com",
    roles: ["owner"],
    projectsIds: [],
    organizationId: organizationId,
});
