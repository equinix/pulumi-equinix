import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix/pulumi-equinix";
import * as fs from "fs";

const sshKey = new equinix.networkedge.SshKey("sshKey", {
    name: "johnKent",
    publicKey: fs.readFileSync("/Users/John/.ssh/ne_rsa.pub"),
});
export const sshKeyId = sshKey.id;
