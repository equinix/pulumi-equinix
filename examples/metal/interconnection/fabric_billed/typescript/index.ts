import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const config = new pulumi.Config();
const projectId = config.require("projectId");
const metro = config.get("metro") || "SV";
const speedInMbps = config.getNumber("speedInMbps") || 200;
const connection = new equinix.metal.Interconnection("connection", {
    name: "fabric-port-to-metal",
    projectId: projectId,
    type: "shared",
    redundancy: "primary",
    metro: metro,
    speed: `${speedInMbps}Mbps`,
    serviceTokenType: "z_side",
});
export const connectionStatus = connection.status;
export const connectionTokens = connection.serviceTokens;
