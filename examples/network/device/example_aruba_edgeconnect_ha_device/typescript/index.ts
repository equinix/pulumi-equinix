import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";
import * as equinix from "@pulumi/equinix";

const sv = equinix.networkedge.getAccountOutput({
    metroCode: "SV",
});
const aRUBAEDGECONNECTAM = new equinix.networkedge.Device("ARUBA-EDGECONNECT-AM", {
    name: "TF_Aruba_Edge_Connect",
    projectId: "XXXXX",
    metroCode: sv.apply(sv => sv.metroCode),
    typeCode: "EDGECONNECT-SDWAN",
    selfManaged: true,
    byol: true,
    packageCode: "EC-V",
    notifications: ["test@eq.com"],
    accountNumber: sv.apply(sv => sv.number),
    version: "9.4.2.3",
    coreCount: 2,
    termLength: 1,
    additionalBandwidth: 50,
    interfaceCount: 32,
    aclTemplateId: "XXXXXXX",
    vendorConfiguration: {
        accountKey: "xxxxx",
        accountName: "xxxx",
        applianceTag: "tests",
        hostname: "test",
    },
    secondaryDevice: {
        name: "TF_CHECKPOINT",
        metroCode: sv.apply(sv => sv.metroCode),
        accountNumber: sv.apply(sv => sv.number),
        aclTemplateId: "XXXXXXX",
        notifications: ["test@eq.com"],
        vendorConfiguration: {
            accountKey: "xxxxx",
            accountName: "xxxx",
            applianceTag: "test",
            hostname: "test",
        },
    },
});
