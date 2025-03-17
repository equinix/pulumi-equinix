import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";
import * as equinix from "@pulumi/equinix";

const sv = equinix.networkedge.getAccountOutput({
    metroCode: "SV",
});
const ciscoFTDSV = new equinix.networkedge.Device("cisco-FTD-SV", {
    name: "TF_Cisco_NGFW_CLUSTER_ZNPD",
    projectId: "XXXXXXX",
    metroCode: sv.apply(sv => sv.metroCode),
    typeCode: "Cisco_NGFW",
    selfManaged: true,
    connectivity: "PRIVATE",
    byol: true,
    packageCode: "FTDv10",
    notifications: ["test@eq.com"],
    accountNumber: sv.apply(sv => sv.number),
    version: "7.0.4-55",
    hostname: "test",
    coreCount: 4,
    termLength: 1,
    interfaceCount: 10,
    clusterDetails: {
        clusterName: "tf-ftd-cluster",
        node0: {
            vendorConfiguration: {
                hostname: "test",
                activationKey: "XXXXX",
                controller1: "X.X.X.X",
                managementType: "FMC",
            },
        },
        node1: {
            vendorConfiguration: {
                hostname: "test",
                managementType: "FMC",
            },
        },
    },
});
