import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";
import * as equinix from "@pulumi/equinix";

const sv = equinix.networkedge.getAccountOutput({
    metroCode: "SV",
});
const c8000VByol = new equinix.networkedge.Device("c8000v-byol", {
    name: "tf-c8000v-byol",
    metroCode: sv.apply(sv => sv.metroCode),
    typeCode: "C8000V",
    selfManaged: true,
    byol: true,
    generateDefaultPassword: true,
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
    vendorConfiguration: {
        restApiSupportRequirement: "true",
    },
    aclTemplateId: "0bff6e05-f0e7-44cd-804a-25b92b835f8b",
    secondaryDevice: {
        name: "tf-c8000v-byol-secondary",
        metroCode: sv.apply(sv => sv.metroCode),
        hostname: "csr1000v-s",
        notifications: [
            "john@equinix.com",
            "marry@equinix.com",
        ],
        accountNumber: sv.apply(sv => sv.number),
        vendorConfiguration: {
            restApiSupportRequirement: "true",
        },
        aclTemplateId: "0bff6e05-f0e7-44cd-804a-25b92b835f8b",
    },
});
