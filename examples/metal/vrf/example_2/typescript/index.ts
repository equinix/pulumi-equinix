import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const example = new equinix.metal.ReservedIpBlock("example", {
    description: "Reserved IP block (192.168.100.0/29) taken from on of the ranges in the VRF's pool of address space.",
    projectId: exampleEquinixMetalProject.id,
    metro: exampleEquinixMetalVrf.metro,
    type: "vrf",
    vrfId: exampleEquinixMetalVrf.id,
    cidr: 29,
    network: "192.168.100.0",
});
const exampleVlan = new equinix.metal.Vlan("exampleVlan", {
    description: "A VLAN for Layer2 and Hybrid Metal devices",
    metro: exampleEquinixMetalVrf.metro,
    projectId: exampleEquinixMetalProject.id,
});
const exampleGateway = new equinix.metal.Gateway("exampleGateway", {
    projectId: exampleEquinixMetalProject.id,
    vlanId: exampleVlan.id,
    ipReservationId: example.id,
});
