import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const exampleVirtualCircuit = new equinix.metal.VirtualCircuit("exampleVirtualCircuit", {
    name: "example-vc",
    description: "Virtual Circuit",
    connectionId: example.id,
    projectId: exampleEquinixMetalProject.id,
    portId: example.ports[0].id,
    nniVlan: 1024,
    vrfId: exampleEquinixMetalVrf.id,
    peerAsn: 65530,
    subnet: "192.168.100.16/31",
    metalIp: "192.168.100.16",
    customerIp: "192.168.100.17",
});
