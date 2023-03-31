import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const config = new pulumi.Config();
const projectId = config.require("projectId");
const web = new equinix.metal.Device("web", {
    hostname: "webserver1",
    plan: "c3.small.x86",
    operatingSystem: "ubuntu_20_04",
    metro: "sv",
    billingCycle: "hourly",
    projectId: projectId,
});
export const webPublicIp = pulumi.interpolate`http://${web.accessPublicIpv4}`;
