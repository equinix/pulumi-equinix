import * as pulumi from "@pulumi/pulumi";

const config = new pulumi.Config();
const deviceId = config.require("deviceId");
const networkType = config.get("networkType") || "hybrid";
export const deviceNetworkId = deviceNetwork.id;
