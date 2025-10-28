import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const sv = equinix.networkedge.getAccountOutput({
    metroCode: "SV",
});
const cHECKPOINTSV = new equinix.networkedge.Device("CHECKPOINT-SV", {
    name: "TF_CHECKPOINT",
    projectId: "XXXX",
    metroCode: sv.apply(sv => sv.metroCode),
    typeCode: "CGUARD",
    selfManaged: true,
    byol: true,
    packageCode: "STD",
    notifications: ["test@eq.com"],
    accountNumber: sv.apply(sv => sv.number),
    version: "R81.20",
    hostname: "test",
    coreCount: 2,
    termLength: 1,
    additionalBandwidth: 5,
    aclTemplateId: "XXXXXXX",
    sshKey: {
        username: "XXXXX",
        keyName: "XXXXXX",
    },
});
