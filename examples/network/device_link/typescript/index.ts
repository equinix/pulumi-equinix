import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";
import * as equinix from "@pulumi/equinix";

const config = new pulumi.Config();
const accountName = config.require("accountName");
const accountMetro = config.require("accountMetro");
const device1Id = config.require("device1Id");
const device2Id = config.require("device2Id");
const accountfNum = equinix.networkedge.getAccountOutput({
    name: accountName,
    metroCode: accountMetro,
}).apply(invoke => invoke.number);
const device1Metro = equinix.networkedge.getDeviceOutput({
    uuid: device1Id,
}).apply(invoke => invoke.metroCode);
const device2Metro = equinix.networkedge.getDeviceOutput({
    uuid: device2Id,
}).apply(invoke => invoke.metroCode);
const deviceLink = new equinix.networkedge.DeviceLink("deviceLink", {
    name: "test-link",
    subnet: "192.168.40.64/27",
    devices: [
        {
            id: "device1Id",
            asn: 22111,
            interfaceId: 6,
        },
        {
            id: "device2Id",
            asn: 22333,
            interfaceId: 7,
        },
    ],
    links: [{
        accountNumber: accountfNum,
        srcMetroCode: device1Metro,
        dstMetroCode: device2Metro,
        throughput: "50",
        throughputUnit: "Mbps",
    }],
});
export const status = deviceLink.status;
export const devices = deviceLink.devices;
