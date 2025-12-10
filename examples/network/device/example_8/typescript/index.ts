import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";
import * as std from "@pulumi/std";

const sv = equinix.networkedge.getAccountOutput({
    name: "account-name",
    metroCode: "SV",
});
const bluecatEdgeServicePointCloudinitPrimaryFile = new equinix.networkedge.NetworkFile("bluecatEdgeServicePointCloudinitPrimaryFile", {
    fileName: "TF-BLUECAT-ESP-cloud-init-file.txt",
    content: std.fileOutput({
        input: filepath,
    }).apply(invoke => invoke.result),
    metroCode: sv.apply(sv => sv.metroCode).apply((x) => equinix.index.Metro[x]),
    deviceTypeCode: "BLUECAT-EDGE-SERVICE-POINT",
    processType: equinix.networkedge.FileType.CloudInit,
    selfManaged: true,
    byol: true,
});
const bluecatEdgeServicePointCloudinitSecondaryFile = new equinix.networkedge.NetworkFile("bluecatEdgeServicePointCloudinitSecondaryFile", {
    fileName: "TF-BLUECAT-ESP-cloud-init-file.txt",
    content: std.fileOutput({
        input: filepath,
    }).apply(invoke => invoke.result),
    metroCode: sv.apply(sv => sv.metroCode).apply((x) => equinix.index.Metro[x]),
    deviceTypeCode: "BLUECAT-EDGE-SERVICE-POINT",
    processType: equinix.networkedge.FileType.CloudInit,
    selfManaged: true,
    byol: true,
});
const bluecatEdgeServicePointHa = new equinix.networkedge.Device("bluecatEdgeServicePointHa", {
    name: "tf-bluecat-edge-service-point-p",
    metroCode: sv.apply(sv => sv.metroCode),
    typeCode: "BLUECAT-EDGE-SERVICE-POINT",
    selfManaged: true,
    connectivity: "PRIVATE",
    byol: true,
    packageCode: "STD",
    notifications: ["test@equinix.com"],
    accountNumber: sv.apply(sv => sv.number),
    cloudInitFileId: bluecatEdgeServicePointCloudinitPrimaryFile.uuid,
    version: "4.6.3",
    coreCount: 4,
    termLength: 12,
    secondaryDevice: {
        name: "tf-bluecat-edge-service-point-s",
        metroCode: sv.apply(sv => sv.metroCode),
        notifications: ["test@eq.com"],
        accountNumber: sv.apply(sv => sv.number),
        cloudInitFileId: bluecatEdgeServicePointCloudinitSecondaryFile.uuid,
    },
});
