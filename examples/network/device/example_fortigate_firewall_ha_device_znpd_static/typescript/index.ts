import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";
import * as equinix from "@pulumi/equinix";

const sv = equinix.networkedge.getAccountOutput({
    metroCode: "SV",
    name: "account-name",
});
const fTNTFIREWALLSV = new equinix.networkedge.Device("FTNT-FIREWALL-SV", {
    name: "TF_FTNT-FIREWALL",
    projectId: "XXXXXXXXXX",
    metroCode: sv.apply(sv => sv.metroCode),
    interfaceCount: 10,
    typeCode: "FG-VM",
    selfManaged: true,
    byol: true,
    connectivity: "PRIVATE",
    packageCode: "VM02",
    notifications: ["test@eq.com"],
    accountNumber: sv.apply(sv => sv.number),
    version: "7.6.3",
    hostname: "test",
    coreCount: 2,
    termLength: 1,
    vendorConfiguration: {
        gatewayIp: "X.X.X.X",
        ipAddress: "X.X.X.X",
        ipAddressType: "STATIC",
        subnetMaskIp: "x.x.x.x",
    },
    secondaryDevice: {
        name: "TF_FTNT-FIREWALL-secondary",
        metroCode: sv.apply(sv => sv.metroCode),
        hostname: "fg-vm-znpd",
        notifications: [
            "john@equinix.com",
            "marry@equinix.com",
        ],
        accountNumber: sv.apply(sv => sv.number),
        vendorConfiguration: {
            ipAddressType: "STATIC",
            ipAddress: "x.x.x.x",
            gatewayIp: "x.x.x.x",
            subnetMaskIp: "x.x.x.x",
            managementInterfaceId: "6",
        },
    },
});
