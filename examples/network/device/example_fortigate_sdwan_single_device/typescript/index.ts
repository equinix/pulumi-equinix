import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";
import * as equinix from "@pulumi/equinix";

const sv = equinix.networkedge.getAccountOutput({
    metroCode: "SV",
});
const fTNTSDWANSV = new equinix.networkedge.Device("FTNT-SDWAN-SV", {
    name: "TF_FTNT-SDWAN",
    projectId: "XXXXXXXXXX",
    metroCode: sv.apply(sv => sv.metroCode),
    typeCode: "FG-SDWAN",
    selfManaged: true,
    byol: true,
    packageCode: "VM02",
    notifications: ["test@eq.com"],
    accountNumber: sv.apply(sv => sv.number),
    version: "7.0.14",
    hostname: "test",
    coreCount: 2,
    termLength: 1,
    additionalBandwidth: 50,
    aclTemplateId: "XXXXXXXX",
    vendorConfiguration: {
        adminPassword: "XXXXX",
        controller1: "X.X.X.X",
    },
});
