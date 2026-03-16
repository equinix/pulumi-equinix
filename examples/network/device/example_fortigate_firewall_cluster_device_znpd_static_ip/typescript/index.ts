import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";
import * as equinix from "@pulumi/equinix";

const sv = equinix.networkedge.getAccountOutput({
    metroCode: "SV",
    name: "account-name",
});
const fGVMSV = new equinix.networkedge.Device("FGVM-SV", {
    name: "tf-fgvm-cluster-static-znpd",
    metroCode: "DC",
    typeCode: "FG-VM",
    projectId: "xxxxxxx",
    selfManaged: true,
    connectivity: "PRIVATE",
    byol: true,
    packageCode: "VM02",
    notifications: [
        "john@equinix.com",
        "marry@equinix.com",
        "fred@equinix.com",
    ],
    termLength: 12,
    accountNumber: xxxxxx,
    version: "7.6.2",
    interfaceCount: 10,
    coreCount: 2,
    sshKey: {
        username: "sanity1",
        keyName: "",
    },
    clusterDetails: {
        clusterName: "tf-fgvm--cluster",
        node0: {
            vendorConfiguration: {
                ipAddress: "x.x.x.x",
                subnetMaskIp: "x.x.x.x",
                gatewayIp: "x.x.x.x",
                managementInterfaceId: "5",
                hostname: "test",
                ipAddressType: "STATIC",
            },
        },
        node1: {
            vendorConfiguration: {
                ipAddress: "x.x.x.x",
                subnetMaskIp: "x.x.x.x",
                gatewayIp: "x.x.x.x",
                managementInterfaceId: "5",
                hostname: "test",
                ipAddressType: "STATIC",
            },
        },
    },
});
