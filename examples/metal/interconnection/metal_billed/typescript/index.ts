import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix/pulumi-equinix";

const config = new pulumi.Config();
const projectId = config.require("projectId");
const metro = config.get("metro") || "SV";
const speedInMbps = config.getNumber("speedInMbps") || 1000;
const connection = new equinix.metal.Interconnection("connection", {
    name: "metal-to-cloudprovider",
    projectId: projectId,
    type: "shared",
    redundancy: "primary",
    metro: metro,
    speed: `${speedInMbps}Mbps`,
    serviceTokenType: "a_side",
});
export const connectionStatus = connection.status;
export const connectionTokens = connection.serviceTokens;
