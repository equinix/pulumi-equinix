import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";
import * as fs from "fs";

const config = new pulumi.Config();
const projectId = config.require("projectId");
const sshKey = new equinix.metal.ProjectSshKey("sshKey", {
    projectId: projectId,
    name: "johnKent",
    publicKey: fs.readFileSync("/Users/John/.ssh/metal_rsa.pub", "utf8"),
});
export const sshKeyId = sshKey.id;
