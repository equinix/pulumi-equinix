import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";
import * as equinix from "@pulumi/equinix";

const sv = equinix.networkedge.getAccountOutput({
    metroCode: "SV",
});
const infobloxSv = new equinix.networkedge.Device("INFOBLOX-SV", {
    clusterDetails: {
        node0: {
            vendorConfiguration: {
                adminPassword: "xxxxxxx",
                ipAddress: "X.X.X.X",
                subnetMaskIp: "X.X.X.X",
                gatewayIp: "X.X.X.X",
            },
        },
        node1: {
            vendorConfiguration: {
                adminPassword: "xxxxxxx",
                ipAddress: "X.X.X.X",
                subnetMaskIp: "X.X.X.X",
                gatewayIp: "X.X.X.X",
            },
        },
        clusterName: "tf-infoblox-cluster",
    },
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
    connectivity: "PRIVATE",
    coreCount: 8,
    termLength: 1,
});
