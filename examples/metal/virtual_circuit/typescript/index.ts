import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix/pulumi-equinix";
import * as equinix from "@pulumi/equinix";

const config = new pulumi.Config();
const projectId = config.require("projectId");
const connectionId = config.require("connectionId");
const vlanId = config.require("vlanId");
const portId = equinix.metal.getInterconnection({
    connectionId: connectionId,
}).then(invoke => invoke.ports?.[0]?.id);
const vc = new equinix.metal.VirtualCircuit("vc", {
    connectionId: connectionId,
    projectId: projectId,
    portId: portId,
    vlanId: vlanId,
    nniVlan: 1056,
});
export const vcStatus = vc.status;
export const vcVnid = vc.vnid;
