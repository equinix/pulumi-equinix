import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const req = new equinix.metal.SpotMarketRequest("req", {
    projectId: projectId,
    maxBidPrice: 0.03,
    metro: "ny",
    devicesMin: 1,
    devicesMax: 1,
    instanceParameters: {
        hostname: "testspot",
        billingCycle: "hourly",
        operatingSystem: "ubuntu_24_04",
        plan: "c3.small.x86",
    },
});
