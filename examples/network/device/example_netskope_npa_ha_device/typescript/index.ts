import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";
import * as equinix from "@pulumi/equinix";

const sv = equinix.networkedge.getAccountOutput({
    metroCode: "SV",
});
const netskopeNpa = new equinix.networkedge.Device("netskope-npa", {
    secondaryDevice: {
        name: "NETSKOPE-NPA-Sec",
        metroCode: sv.apply(sv => sv.metroCode),
        accountNumber: sv.apply(sv => sv.number),
        notifications: ["test@eq.com"],
        vendorConfiguration: {
            hostname: "test",
            privateCidrMask: "24",
            ipAddressType: "STATIC",
            ipAddress: "x.x.x.x",
            gatewayIp: "x.x.x.x",
            primaryNameServer: "x.x.x.x",
            secondaryNameServer: "x.x.x.x",
            dnsSearchDomain: "xxxxx",
        },
    },
    name: "NETSKOPE-NPA",
    projectId: "xxxxxxx",
    metroCode: sv.apply(sv => sv.metroCode),
    typeCode: "NETSKOPE-NPA",
    selfManaged: true,
    byol: true,
    interfaceCount: 1,
    packageCode: "STD",
    notifications: ["test@eq.com"],
    connectivity: "PRIVATE",
    accountNumber: sv.apply(sv => sv.number),
    version: "R138",
    coreCount: 2,
    termLength: 1,
    vendorConfiguration: {
        hostname: "test",
        privateCidrMask: "24",
        ipAddressType: "STATIC",
        ipAddress: "x.x.x.x",
        gatewayIp: "x.x.x.x",
        primaryNameServer: "x.x.x.x",
        secondaryNameServer: "x.x.x.x",
        dnsSearchDomain: "xxxxx",
    },
});
