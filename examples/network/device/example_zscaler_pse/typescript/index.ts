import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";
import * as equinix from "@pulumi/equinix";

const sv = equinix.networkedge.getAccountOutput({
    metroCode: "SV",
});
const zscalerPseSingle = new equinix.networkedge.Device("zscaler-pse-single", {
    name: "tf-zscaler-pse",
    projectId: "XXXXXX",
    metroCode: sv.apply(sv => sv.metroCode),
    typeCode: "ZSCALER-PSE",
    selfManaged: true,
    byol: true,
    connectivity: "PRIVATE",
    packageCode: "STD",
    notifications: [
        "john@equinix.com",
        "marry@equinix.com",
        "fred@equinix.com",
    ],
    termLength: 12,
    accountNumber: sv.apply(sv => sv.number),
    version: "23.395.1",
    interfaceCount: 1,
    coreCount: 4,
    vendorConfiguration: {
        provisioningKey: "XXXXXXXXXX",
        hostname: "XXXX",
    },
    sshKey: {
        username: "test",
        keyName: "test-key",
    },
});
