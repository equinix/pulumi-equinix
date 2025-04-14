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
    connectivity: "PRIVATE",
    byol: true,
    packageCode: "STD",
    notifications: ["test@eq.com"],
    accountNumber: sv.apply(sv => sv.number),
    version: "9.0.5",
    coreCount: 8,
    termLength: 1,
    vendorConfiguration: {
        adminPassword: "X.X.X.X",
        ipAddress: "X.X.X.X",
        subnetMaskIp: "X.X.X.X",
        gatewayIp: "X.X.X.X",
    },
    secondaryDevice: {
        name: "TF_INFOBLOX-Sec",
        metroCode: sv.apply(sv => sv.metroCode),
        accountNumber: sv.apply(sv => sv.number),
        notifications: ["test@eq.com"],
        vendorConfiguration: {
            adminPassword: "X.X.X.X",
            ipAddress: "X.X.X.X",
            subnetMaskIp: "X.X.X.X",
            gatewayIp: "X.X.X.X",
        },
    },
});
