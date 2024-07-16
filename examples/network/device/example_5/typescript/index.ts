import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";
import * as equinix from "@pulumi/equinix";

const sv = equinix.networkedge.getAccountOutput({
    name: "account-name",
    metroCode: "SV",
});
const vsrxSingle = new equinix.networkedge.Device("vsrxSingle", {
    name: "tf-c8kv-sdwan",
    metroCode: sv.apply(sv => sv.metroCode),
    typeCode: "VSRX",
    selfManaged: true,
    byol: true,
    packageCode: "STD",
    notifications: ["test@equinix.com"],
    hostname: "VSRX",
    accountNumber: sv.apply(sv => sv.number),
    version: "23.2R1.13",
    coreCount: 2,
    termLength: 12,
    additionalBandwidth: 5,
    projectId: "a86d7112-d740-4758-9c9c-31e66373746b",
    diverseDeviceId: "ed7891bd-15b4-4f72-ac56-d96cfdacddcc",
    sshKey: {
        username: "test-username",
        keyName: "valid-key-name",
    },
    aclTemplateId: "3e548c02-9164-4197-aa23-05b1f644883c",
});
