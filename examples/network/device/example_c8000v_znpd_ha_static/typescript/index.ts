import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";
import * as equinix from "@pulumi/equinix";

const sv = equinix.networkedge.getAccountOutput({
    metroCode: "SV",
    name: "account-name",
});
const c8000VByol = new equinix.networkedge.Device("c8000v-byol", {
    name: "tf-c8000v-byol",
    metroCode: sv.apply(sv => sv.metroCode),
    typeCode: "C8000V",
    selfManaged: true,
    byol: true,
    packageCode: "network-essentials",
    connectivity: "PRIVATE",
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
        ipAddressType: "STATIC",
        ipAddress: "x.x.x.x",
        gatewayIp: "x.x.x.x",
        subnetMaskIp: "x.x.x.x",
        managementInterfaceId: "6",
    },
    secondaryDevice: {
        name: "tf-c8000v-byol-secondary",
        metroCode: sv.apply(sv => sv.metroCode),
        hostname: "csr8000v-s",
        notifications: [
            "john@equinix.com",
            "marry@equinix.com",
        ],
        accountNumber: sv.apply(sv => sv.number),
        vendorConfiguration: {
            restApiSupportRequirement: "true",
            ipAddressType: "STATIC",
            ipAddress: "x.x.x.x",
            gatewayIp: "x.x.x.x",
            subnetMaskIp: "x.x.x.x",
            managementInterfaceId: "6",
        },
    },
});
