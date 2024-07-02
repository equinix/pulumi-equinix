import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const config = new pulumi.Config();
const projectId = config.require("projectId");
const web = new equinix.metal.Device("web", {
    hostname: "webserver1",
    plan: equinix.metal.Plan.C3SmallX86,
    operatingSystem: equinix.metal.OperatingSystem.Ubuntu20_04,
    metro: "sv",
    billingCycle: equinix.metal.BillingCycle.Hourly,
    projectId: projectId,
});
export const webPublicIp = pulumi.interpolate`http://${web.accessPublicIpv4}`;
