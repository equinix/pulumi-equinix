import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix/pulumi-equinix";

const config = new pulumi.Config();
const metro = config.get("metro") || "SV";
const networkFile = new equinix.networkedge.NetworkFile("networkFile", {
    fileName: "Aviatrix-ZTP-file",
    content: new pulumi.asset.FileAsset("./assets/aviatrix-cloud-init.txt"),
    metroCode: metro,
    deviceTypeCode: "AVIATRIX_EDGE",
    processType: "CLOUD_INIT",
    selfManaged: true,
    byol: true,
});
export const networkFileId = networkFile.id;
export const networkFileStatus = networkFile.status;
