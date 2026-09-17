import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const test = new equinix.networkedge.DeviceLink("test", {
    devices: [
        {
            id: testEquinixNetworkDevice.uuid,
            interfaceId: 6,
        },
        {
            id: testEquinixNetworkDevice.secondaryDevice[0].uuid,
            interfaceId: 7,
        },
    ],
    metroLinks: [
        {
            accountNumber: testEquinixNetworkDevice.accountNumber,
            metroCode: testEquinixNetworkDevice.metroCode,
            throughput: "50",
            throughputUnit: "Mbps",
        },
        {
            accountNumber: testEquinixNetworkDevice.secondaryDevice[0].accountNumber,
            metroCode: testEquinixNetworkDevice.secondaryDevice[0].metroCode,
            throughput: "50",
            throughputUnit: "Mbps",
        },
    ],
    name: "test-DLG",
    projectId: "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx",
});
