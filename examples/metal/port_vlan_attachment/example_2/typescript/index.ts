import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const test = new equinix.metal.Device("test", {
    hostname: "test",
    plan: equinix.metal.Plan.C3SmallX86,
    metro: "ny",
    operatingSystem: equinix.metal.OperatingSystem.Ubuntu20_04,
    billingCycle: equinix.metal.BillingCycle.Hourly,
    projectId: projectId,
});
const testDeviceNetworkType = new equinix.metal.DeviceNetworkType("testDeviceNetworkType", {
    deviceId: test.id,
    type: "layer2-individual",
});
const test1 = new equinix.metal.Vlan("test1", {
    description: "VLAN in New York",
    metro: "ny",
    projectId: projectId,
});
const test2 = new equinix.metal.Vlan("test2", {
    description: "VLAN in New Jersey",
    metro: "ny",
    projectId: projectId,
});
const test1PortVlanAttachment = new equinix.metal.PortVlanAttachment("test1PortVlanAttachment", {
    deviceId: testDeviceNetworkType.id,
    vlanVnid: test1.vxlan,
    portName: "eth1",
});
const test2PortVlanAttachment = new equinix.metal.PortVlanAttachment("test2PortVlanAttachment", {
    deviceId: testDeviceNetworkType.id,
    vlanVnid: test2.vxlan,
    portName: "eth1",
    native: true,
}, {
    dependsOn: [test1PortVlanAttachment],
});
