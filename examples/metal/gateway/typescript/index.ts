import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix/pulumi-equinix";

const config = new pulumi.Config();
const projectId = config.require("projectId");
const vlanId = config.require("vlanId");
const gateway = new equinix.metal.Gateway("gateway", {
    projectId: projectId,
    vlanId: vlanId,
    privateIpv4SubnetSize: 8,
});
export const gatewayState = gateway.state;
