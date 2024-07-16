import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const member = new equinix.metal.OrganizationMember("member", {
    invitee: "member@example.com",
    roles: ["limited_collaborator"],
    projectsIds: [projectId],
    organizationId: organizationId,
});
