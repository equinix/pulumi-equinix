import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";
import * as equinix from "@pulumi/equinix";

const config = new pulumi.Config();
const accountName = config.require("accountName");
const licenseToken = config.require("licenseToken");
const sshUserName = config.require("sshUserName");
const sshKeyName = config.require("sshKeyName");
const aclTemplateId = config.require("aclTemplateId");
const metro = config.get("metro") || "SV";
const devicePackageCode = config.get("devicePackageCode") || "network-essentials";
const deviceVersion = config.get("deviceVersion") || "17.06.01a";
const sizeInCores = config.getNumber("sizeInCores") || 2;
const termLength = config.getNumber("termLength") || 6;
const additionalBandwidth = config.getNumber("additionalBandwidth") || 5;
const accountNum = equinix.networkedge.getAccountOutput({
    name: accountName,
    metroCode: metro,
}).apply(invoke => invoke.number);
const c8KRouter = new equinix.networkedge.Device("c8kRouter", {
    name: "catalystRouter",
    metroCode: metro,
    typeCode: "C8000V",
    selfManaged: true,
    byol: true,
    packageCode: devicePackageCode,
    notifications: ["example@equinix.com"],
    hostname: "C8KV",
    accountNumber: accountNum,
    version: deviceVersion,
    coreCount: sizeInCores,
    termLength: termLength,
    licenseToken: licenseToken,
    additionalBandwidth: additionalBandwidth,
    sshKey: {
        username: sshUserName,
        keyName: sshKeyName,
    },
    aclTemplateId: aclTemplateId,
});
export const routerId = c8KRouter.id;
export const provisionStatus = c8KRouter.status;
export const licenseStatus = c8KRouter.licenseStatus;
export const sshIpAddress = c8KRouter.sshIpAddress;
