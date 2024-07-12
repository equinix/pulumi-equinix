import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";
import * as std from "@pulumi/std";

const myblock = new equinix.metal.ReservedIpBlock("myblock", {
    projectId: projectId,
    metro: "ny",
    quantity: 2,
});
const firstAddressAssignment = new equinix.metal.IpAttachment("firstAddressAssignment", {
    deviceId: mydevice.id,
    cidrNotation: std.joinOutput({
        separator: "/",
        input: [
            std.cidrhostOutput({
                input: myblockMetalReservedIpBlock.cidrNotation,
                host: 0,
            }).apply(invoke => invoke.result),
            "32",
        ],
    }).apply(invoke => invoke.result),
});
