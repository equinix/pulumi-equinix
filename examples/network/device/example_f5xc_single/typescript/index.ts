import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";
import * as equinix from "@pulumi/equinix";

const sv = equinix.networkedge.getAccountOutput({
    metroCode: "SV",
});
const f5XcSingle = new equinix.networkedge.Device("f5xc-single", {
    name: "tf-f5xc",
    projectId: "XXXXXX",
    metroCode: sv.apply(sv => sv.metroCode),
    typeCode: "F5XC",
    selfManaged: true,
    byol: true,
    connectivity: "INTERNET-ACCESS",
    packageCode: "STD",
    notifications: [
        "john@equinix.com",
        "marry@equinix.com",
        "fred@equinix.com",
    ],
    termLength: 1,
    accountNumber: sv.apply(sv => sv.number),
    aclTemplateId: "xxxx",
    version: "9.2025.17",
    interfaceCount: 8,
    coreCount: 8,
    vendorConfiguration: {
        token: "XXXXXXXXXX",
        hostname: "XXXX",
    },
});
