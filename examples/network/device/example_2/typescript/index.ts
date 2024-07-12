import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";
import * as equinix from "@pulumi/equinix";

const sv = equinix.networkedge.getAccountOutput({
    metroCode: "SV",
});
const panwCluster = new equinix.networkedge.Device("panwCluster", {
    name: "tf-panw",
    metroCode: sv.apply(sv => sv.metroCode),
    typeCode: "PA-VM",
    selfManaged: true,
    byol: true,
    packageCode: "VM100",
    notifications: [
        "john@equinix.com",
        "marry@equinix.com",
        "fred@equinix.com",
    ],
    termLength: 12,
    accountNumber: sv.apply(sv => sv.number),
    version: "10.1.3",
    interfaceCount: 10,
    coreCount: 2,
    sshKey: {
        username: "test",
        keyName: "test-key",
    },
    aclTemplateId: "0bff6e05-f0e7-44cd-804a-25b92b835f8b",
    clusterDetails: {
        clusterName: "tf-panw-cluster",
        node0: {
            vendorConfiguration: {
                hostname: "panw-node0",
            },
            licenseToken: "licenseToken",
        },
        node1: {
            vendorConfiguration: {
                hostname: "panw-node1",
            },
            licenseToken: "licenseToken",
        },
    },
});
