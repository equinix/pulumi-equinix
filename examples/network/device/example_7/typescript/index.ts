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
const bluecatBddsHa = new equinix.networkedge.Device("bluecatBddsHa", {
    name: "tf-bluecat-bdds-p",
    metroCode: sv.apply(sv => sv.metroCode),
    typeCode: "BLUECAT",
    selfManaged: true,
    connectivity: "PRIVATE",
    byol: true,
    packageCode: "STD",
    notifications: ["test@equinix.com"],
    accountNumber: sv.apply(sv => sv.number),
    version: "9.6.0",
    coreCount: 2,
    termLength: 12,
    vendorConfiguration: {
        hostname: "test",
        privateAddress: "x.x.x.x",
        privateCidrMask: "24",
        privateGateway: "x.x.x.x",
        licenseKey: "xxxxx-xxxxx-xxxxx-xxxxx-xxxxx",
        licenseId: "xxxxxxxxxxxxxxx",
    },
    sshKey: {
        username: "test-username",
        keyName: testPublicKey.name,
    },
    secondaryDevice: {
        name: "tf-bluecat-bdds-s",
        metroCode: sv.apply(sv => sv.metroCode),
        notifications: ["test@eq.com"],
        accountNumber: sv.apply(sv => sv.number),
        vendorConfiguration: {
            hostname: "test",
            privateAddress: "x.x.x.x",
            privateCidrMask: "24",
            privateGateway: "x.x.x.x",
            licenseKey: "xxxxx-xxxxx-xxxxx-xxxxx-xxxxx",
            licenseId: "xxxxxxxxxxxxxxx",
        },
    },
});
