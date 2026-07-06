import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";
import * as equinix from "@pulumi/equinix";

const sv = equinix.networkedge.getAccountOutput({
    metroCode: "SV",
});
const niosXHa = new equinix.networkedge.Device("nios-x-ha", {
    name: "TF_INFOBLOX-NIOS-X",
    projectId: "xxxxxxx",
    metroCode: sv.apply(sv => sv.metroCode),
    typeCode: "INFOBLOX-NIOSX",
    selfManaged: true,
    connectivity: "INTERNET-ACCESS",
    byol: true,
    packageCode: "STD",
    notifications: ["test@eq.com"],
    accountNumber: sv.apply(sv => sv.number),
    version: "4.0",
    coreCount: 3,
    interfaceCount: 5,
    termLength: 1,
    vendorConfiguration: {
        hostname: "test",
        token: "xxxxx",
    },
    secondaryDevice: {
        name: "TF_INFOBLOX-NIOS-X-Sec",
        metroCode: sv.apply(sv => sv.metroCode),
        accountNumber: sv.apply(sv => sv.number),
        notifications: ["test@eq.com"],
        vendorConfiguration: {
            hostname: "test",
            token: "xxxxx",
        },
    },
});
