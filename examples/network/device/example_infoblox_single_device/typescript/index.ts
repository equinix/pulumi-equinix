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
    connectivity: "PRIVATE",
    packageCode: "STD",
    notifications: ["test@eq.com"],
    accountNumber: sv.apply(sv => sv.number),
    version: "9.0.5",
    hostname: "test",
    coreCount: 8,
    termLength: 1,
    vendorConfiguration: {
        adminPassword: "X.X.X.X",
        ipAddress: "X.X.X.X",
        subnetMaskIp: "X.X.X.X",
        gatewayIp: "X.X.X.X",
    },
});
