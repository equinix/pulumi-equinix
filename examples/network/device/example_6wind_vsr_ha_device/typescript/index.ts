import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";
import * as equinix from "@pulumi/equinix";

const sv = equinix.networkedge.getAccountOutput({
    metroCode: "SV",
});
const sixWindVsr = new equinix.networkedge.Device("six-wind-vsr", {
    sshKey: {
        username: "xxxx",
        keyName: "xxxxx",
    },
    secondaryDevice: {
        name: "6WIND-VSR-Sec",
        metroCode: sv.apply(sv => sv.metroCode),
        accountNumber: sv.apply(sv => sv.number),
        notifications: ["test@eq.com"],
        vendorConfiguration: {
            hostname: "test",
            token: "xxxx",
        },
    },
    name: "6WIND-VSR",
    projectId: "xxxxxxx",
    metroCode: sv.apply(sv => sv.metroCode),
    typeCode: "6WIND-VSR",
    selfManaged: true,
    byol: true,
    interfaceCount: 10,
    packageCode: "STD",
    notifications: ["test@eq.com"],
    accountNumber: sv.apply(sv => sv.number),
    version: "3.10.8",
    coreCount: 2,
    termLength: 1,
    vendorConfiguration: {
        hostname: "test",
        token: "xxxx",
    },
});
