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
    connectivity: "PRIVATE",
    coreCount: 8,
    termLength: 1,
    clusterDetails: {
        clusterName: "tf-infoblox-cluster",
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
    },
});
