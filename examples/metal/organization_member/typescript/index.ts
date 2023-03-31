import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const config = new pulumi.Config();
const organizationId = config.require("organizationId");
const projectId = config.require("projectId");
const userEmailAddress = config.require("userEmailAddress");
const member = new equinix.metal.OrganizationMember("member", {
    invitee: userEmailAddress,
    roles: ["limited_collaborator"],
    projectsIds: [projectId],
    organizationId: organizationId,
});
export const memberId = member.id;
export const memberState = member.state;
