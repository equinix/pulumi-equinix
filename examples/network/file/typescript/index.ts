import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";
import * as std from "@pulumi/std";

const config = new pulumi.Config();
const filepath = config.get("filepath") || "fileFolder/fileName.txt";
const testFile = new equinix.networkedge.NetworkFile("test-file", {
    fileName: "fileName.txt",
    content: std.fileOutput({
        input: filepath,
    }).apply(invoke => invoke.result),
    metroCode: equinix.index.Metro.SiliconValley,
    deviceTypeCode: "AVIATRIX_EDGE",
    processType: equinix.networkedge.FileType.CloudInit,
    selfManaged: true,
    byol: true,
});
