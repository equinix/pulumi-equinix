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
    typeCode: "FG-VM",
    interfaceCount: 10,
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
        ipAddressType: "NO_IP_ADDRESS",
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
            ipAddressType: "NO_IP_ADDRESS",
        },
    },
});
