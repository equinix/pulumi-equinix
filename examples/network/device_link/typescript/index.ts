import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const test = new equinix.networkedge.DeviceLink("test", {
    name: "test-link",
    subnet: "192.168.40.64/27",
    projectId: "a86d7112-d740-4758-9c9c-31e66373746b",
    devices: [
        {
            id: testEquinixNetworkDevice.uuid,
            asn: 22111,
            interfaceId: 6,
        },
        {
            id: testEquinixNetworkDevice.secondaryDevice[0].uuid,
            asn: 22333,
            interfaceId: 7,
        },
    ],
    links: [{
        accountNumber: testEquinixNetworkDevice.accountNumber,
        srcMetroCode: testEquinixNetworkDevice.metroCode,
        dstMetroCode: testEquinixNetworkDevice.secondaryDevice[0].metroCode,
        throughput: "50",
        throughputUnit: "Mbps",
    }],
});
