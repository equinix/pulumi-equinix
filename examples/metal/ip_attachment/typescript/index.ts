import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const config = new pulumi.Config();
const deviceId = config.require("deviceId");
const subnetCidr = config.get("subnetCidr") || "147.229.10.152/31";
const ipAttachResource = new equinix.metal.IpAttachment("ipAttach", {
    deviceId: deviceId,
    cidrNotation: subnetCidr,
});
export const ipAttach = ipAttachResource.id;
export const ipNetmask = ipAttachResource.netmask;
