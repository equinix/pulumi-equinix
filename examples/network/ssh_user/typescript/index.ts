import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const config = new pulumi.Config();
const device1Id = config.require("device1Id");
const device2Id = config.require("device2Id");
const sshUser = new equinix.networkedge.SshUser("sshUser", {
    username: "johnKent",
    deviceIds: [
        device1Id,
        device2Id,
    ],
});
export const sshUserId = sshUser.id;
