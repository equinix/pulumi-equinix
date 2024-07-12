import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";
import * as equinix from "@pulumi/equinix";

const sv = equinix.networkedge.getAccountOutput({
    name: "account-name",
    metroCode: "SV",
});
const c8KvSingle = new equinix.networkedge.Device("c8kvSingle", {
    name: "tf-c8kv",
    metroCode: sv.apply(sv => sv.metroCode),
    typeCode: "C8000V",
    selfManaged: true,
    byol: true,
    packageCode: "network-essentials",
    notifications: ["test@equinix.com"],
    hostname: "C8KV",
    accountNumber: sv.apply(sv => sv.number),
    version: "17.06.01a",
    coreCount: 2,
    termLength: 12,
    licenseToken: "valid-license-token",
    additionalBandwidth: 5,
    sshKey: {
        username: "test-username",
        keyName: "valid-key-name",
    },
    aclTemplateId: "3e548c02-9164-4197-aa23-05b1f644883c",
});
