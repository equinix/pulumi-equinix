import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";
import * as equinix from "@pulumi/equinix";

const sv = equinix.networkedge.getAccountOutput({
    metroCode: "SV",
});
const vYOSAM = new equinix.networkedge.Device("VYOS-AM", {
    name: "TF_VYOS",
    projectId: "XXXXXXX",
    metroCode: sv.apply(sv => sv.metroCode),
    typeCode: "VYOS-ROUTER",
    selfManaged: true,
    byol: false,
    packageCode: "STD",
    notifications: ["test@eq.com"],
    accountNumber: sv.apply(sv => sv.number),
    version: "1.4.1-2501",
    hostname: "test",
    coreCount: 2,
    termLength: 1,
    additionalBandwidth: 50,
    aclTemplateId: "XXXXXXXX",
    sshKey: {
        username: "test",
        keyName: "xxxxxxxx",
    },
    secondaryDevice: {
        name: "TF_CHECKPOINT",
        metroCode: sv.apply(sv => sv.metroCode),
        accountNumber: sv.apply(sv => sv.number),
        hostname: "test",
        aclTemplateId: "XXXXXXXXXXX",
        notifications: ["test@eq.com"],
    },
});
