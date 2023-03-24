import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix/pulumi-equinix";
import * as fs from "fs";

const config = new pulumi.Config();
const metro = config.get("metro") || "SV";
const networkFile = new equinix.networkedge.NetworkFile("networkFile", {
    fileName: "Aviatrix-ZTP-file",
    content: fs.readFileSync("./../assets/aviatrix-cloud-init.txt"),
    metroCode: metro,
    deviceTypeCode: "AVIATRIX_EDGE",
    processType: "CLOUD_INIT",
    selfManaged: true,
    byol: true,
});
export const networkFileId = networkFile.id;
export const networkFileStatus = networkFile.status;
