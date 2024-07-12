import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const test = new equinix.metal.Vlan("test", {
    description: "test VLAN in SV",
    metro: "sv",
    projectId: projectId,
});
const testGateway = new equinix.metal.Gateway("testGateway", {
    projectId: projectId,
    vlanId: test.id,
    privateIpv4SubnetSize: 8,
});
