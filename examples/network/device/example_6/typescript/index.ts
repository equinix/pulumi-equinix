import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";
import * as equinix from "@pulumi/equinix";

const sv = equinix.networkedge.getAccountOutput({
    name: "account-name",
    metroCode: "SV",
});
const testPublicKey = new equinix.networkedge.SshKey("testPublicKey", {
    name: "key-name",
    publicKey: "ssh-dss key-value",
    type: "DSA",
});
const aristaHa = new equinix.networkedge.Device("aristaHa", {
    name: "tf-arista-p",
    metroCode: sv.apply(sv => sv.metroCode),
    typeCode: "ARISTA-ROUTER",
    selfManaged: true,
    connectivity: "PRIVATE",
    byol: true,
    packageCode: "CloudEOS",
    notifications: ["test@equinix.com"],
    hostname: "arista-p",
    accountNumber: sv.apply(sv => sv.number),
    version: "4.29.0",
    coreCount: 4,
    termLength: 12,
    additionalBandwidth: 5,
    sshKey: {
        username: "test-username",
        keyName: testPublicKey.name,
    },
    aclTemplateId: "c637a17b-7a6a-4486-924b-30e6c36904b0",
    secondaryDevice: {
        name: "tf-arista-s",
        metroCode: sv.apply(sv => sv.metroCode),
        hostname: "arista-s",
        notifications: ["test@eq.com"],
        accountNumber: sv.apply(sv => sv.number),
        aclTemplateId: "fee5e2c0-6198-4ce6-9cbd-bbe6c1dbe138",
    },
});
