import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";
import * as equinix from "@pulumi/equinix";

const sv = equinix.networkedge.getAccountOutput({
    metroCode: "SV",
});
const c8000VByolWithtoutDefaultPassword = new equinix.networkedge.Device("c8000v-byol-withtout-default-password", {
    name: "tf-c8000v-byol",
    metroCode: sv.apply(sv => sv.metroCode),
    typeCode: "C8000V",
    selfManaged: true,
    byol: true,
    generateDefaultPassword: false,
    packageCode: "network-essentials",
    notifications: [
        "john@equinix.com",
        "marry@equinix.com",
        "fred@equinix.com",
    ],
    termLength: 12,
    accountNumber: sv.apply(sv => sv.number),
    version: "17.11.01a",
    interfaceCount: 10,
    coreCount: 2,
    tier: 1,
    sshKey: {
        username: "test",
        keyName: "test-key",
    },
    aclTemplateId: "0bff6e05-f0e7-44cd-804a-25b92b835f8b",
});
