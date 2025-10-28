import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const sv = equinix.networkedge.getAccountOutput({
    metroCode: "SV",
});
const fTNTSDWANSV = new equinix.networkedge.Device("FTNT-SDWAN-SV", {
    name: "TF_VERSA-SDWAN",
    projectId: "XXXXXXXXX",
    metroCode: sv.apply(sv => sv.metroCode),
    typeCode: "VERSA_SDWAN",
    selfManaged: true,
    byol: true,
    packageCode: "FLEX_VNF_2",
    notifications: ["test@eq.com"],
    accountNumber: sv.apply(sv => sv.number),
    version: "21.2.3",
    coreCount: 2,
    termLength: 1,
    additionalBandwidth: 50,
    aclTemplateId: "XXXXXXXXX",
    vendorConfiguration: {
        controller1: "X.X.X.X",
        controller2: "X.X.X.X",
        localId: "test@test.com",
        remoteId: "test@test.com",
        serialNumber: "4",
    },
    secondaryDevice: {
        name: "Praveena_TF_VERSA",
        metroCode: sv.apply(sv => sv.metroCode),
        accountNumber: sv.apply(sv => sv.number),
        aclTemplateId: "XXXXXXXX",
        notifications: ["test@eq.com"],
        vendorConfiguration: {
            controller1: "X.X.X.X",
            controller2: "X.X.X.X",
            localId: "test@test.com",
            remoteId: "test@test.com",
            serialNumber: "4",
        },
    },
});
