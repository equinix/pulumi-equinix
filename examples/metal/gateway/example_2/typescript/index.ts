import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const test = new equinix.metal.Vlan("test", {
    description: "test VLAN in SV",
    metro: "sv",
    projectId: projectId,
});
const test1 = new equinix.metal.ReservedIpBlock("test1", {
    projectId: projectId,
    metro: "sv",
    quantity: 8,
});
const testGateway = new equinix.metal.Gateway("testGateway", {
    projectId: projectId,
    vlanId: test.id,
    ipReservationId: testEquinixMetalReservedIpBlock.id,
});
