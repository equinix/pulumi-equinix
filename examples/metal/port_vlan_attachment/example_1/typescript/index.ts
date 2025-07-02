import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const test = new equinix.metal.Vlan("test", {
    description: "VLAN in New York",
    metro: "ny",
    projectId: projectId,
});
const testDevice = new equinix.metal.Device("testDevice", {
    hostname: "test",
    plan: equinix.metal.Plan.C3SmallX86,
    metro: "ny",
    operatingSystem: "ubuntu_24_04",
    billingCycle: equinix.metal.BillingCycle.Hourly,
    projectId: projectId,
});
const testDeviceNetworkType = new equinix.metal.DeviceNetworkType("testDeviceNetworkType", {
    deviceId: testDevice.id,
    type: "hybrid",
});
const testPortVlanAttachment = new equinix.metal.PortVlanAttachment("testPortVlanAttachment", {
    deviceId: testDeviceNetworkType.id,
    portName: "eth1",
    vlanVnid: test.vxlan,
});
