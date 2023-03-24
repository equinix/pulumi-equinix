import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix/pulumi-equinix";

const config = new pulumi.Config();
const deviceId = config.require("deviceId");
const networkType = config.get("networkType") || "hybrid";
const deviceNetwork = new equinix.metal.DeviceNetworkType("deviceNetwork", {
    deviceId: deviceId,
    type: networkType,
});
export const deviceNetworkId = deviceNetwork.id;
