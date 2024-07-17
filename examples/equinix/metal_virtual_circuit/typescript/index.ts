import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";
import * as equinix from "@pulumi/equinix";

const projectId = "52000fb2-ee46-4673-93a8-de2c2bdba33c";
const connId = "73f12f29-3e19-43a0-8e90-ae81580db1e0";
const test = equinix.metal.getInterconnectionOutput({
    connectionId: connId,
});
const testVlan = new equinix.metal.Vlan("testVlan", {
    projectId: projectId,
    metro: test.apply(test => test.metro),
});
const testVirtualCircuit = new equinix.metal.VirtualCircuit("testVirtualCircuit", {
    connectionId: connId,
    projectId: projectId,
    portId: test.apply(test => test.ports?.[0]?.id),
    vlanId: testVlan.id,
    nniVlan: 1056,
});
