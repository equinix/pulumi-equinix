import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";
import * as equinix from "@pulumi/equinix";

const sv = equinix.networkedge.getAccountOutput({
    metroCode: "SV",
});
const iNFOBLOXSV = new equinix.networkedge.Device("INFOBLOX-SV", {
    name: "TF_INFOBLOX",
    projectId: "XXXXXXXXXX",
    metroCode: sv.apply(sv => sv.metroCode),
    typeCode: "INFOBLOX-GRID-MEMBER",
    selfManaged: true,
    byol: true,
    packageCode: "STD",
    notifications: ["test@eq.com"],
    accountNumber: sv.apply(sv => sv.number),
    version: "9.0.5",
    hostname: "test",
    connectivity: "PRIVATE",
    coreCount: 8,
    termLength: 1,
    clusterDetails: {
        clusterName: "tf-infoblox-cluster",
        node0: {
            vendorConfiguration: {
                adminPassword: "Welcome@1",
                ipAddress: "192.168.1.35",
                subnetMaskIp: "255.255.255.0",
                gatewayIp: "192.168.1.1",
                hostname: "test",
            },
        },
        node1: {
            vendorConfiguration: {
                adminPassword: "Welcome@1",
                ipAddress: "192.168.1.35",
                subnetMaskIp: "255.255.255.0",
                gatewayIp: "192.168.1.1",
                hostname: "test",
            },
        },
    },
});
