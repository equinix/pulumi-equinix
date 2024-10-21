import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";
import * as equinix from "@pulumi/equinix";
import * as std from "@pulumi/std";

const config = new pulumi.Config();
const filepath = config.get("filepath") || "cloudInitFileFolder/TF-AVX-cloud-init-file.txt";
const sv = equinix.networkedge.getAccountOutput({
    metroCode: "SV",
});
const aviatrixCloudinitFile = new equinix.networkedge.NetworkFile("aviatrixCloudinitFile", {
    fileName: "TF-AVX-cloud-init-file.txt",
    content: std.fileOutput({
        input: filepath,
    }).apply(invoke => invoke.result),
    metroCode: sv.apply(sv => sv.metroCode).apply((x) => equinix.index.Metro[x]),
    deviceTypeCode: "AVIATRIX_TRANSIT_EDGE",
    processType: equinix.networkedge.FileType.CloudInit,
    selfManaged: true,
    byol: true,
});
const aviatrixTransitEdgeSingle = new equinix.networkedge.Device("aviatrix-transit-edge-single", {
    name: "tf-aviatrix",
    metroCode: sv.apply(sv => sv.metroCode),
    typeCode: "AVIATRIX_TRANSIT_EDGE",
    selfManaged: true,
    byol: true,
    packageCode: "STD",
    notifications: ["john@equinix.com"],
    termLength: 12,
    accountNumber: sv.apply(sv => sv.number),
    version: "7.2.a",
    coreCount: 2,
    cloudInitFileId: aviatrixCloudinitFile.uuid,
    aclTemplateId: "c06150ea-b604-4ad1-832a-d63936e9b938",
});
