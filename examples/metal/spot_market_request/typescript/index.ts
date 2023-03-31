import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const config = new pulumi.Config();
const projectId = config.require("projectId");
const metro = config.get("metro") || "FR";
const request = new equinix.metal.SpotMarketRequest("request", {
    projectId: projectId,
    metro: metro,
    maxBidPrice: 0.75,
    devicesMin: 1,
    devicesMax: 1,
    instanceParameters: {
        hostname: "testspot",
        billingCycle: "hourly",
        operatingSystem: "ubuntu_20_04",
        plan: "c3.small.x86",
    },
});
export const requestId = request.id;
