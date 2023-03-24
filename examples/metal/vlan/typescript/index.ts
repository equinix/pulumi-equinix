import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix/pulumi-equinix";

const config = new pulumi.Config();
const projectId = config.require("projectId");
const metro = config.get("metro") || "DA";
const vxlan = config.require("vxlan");
const vlan = new equinix.metal.Vlan("vlan", {
    description: "VLAN in Dallas",
    projectId: projectId,
    metro: metro,
    vxlan: vxlan,
});
export const vlanId = vlan.id;
