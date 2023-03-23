import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix/pulumi-equinix";

const config = new pulumi.Config();
const deviceId = config.require("deviceId");
const portName = config.get("portName") || "eth1";
const vxlanId = config.getNumber("vxlanId") || 1004;
const attach = new equinix.metal.PortVlanAttachment("attach", {
    deviceId: deviceId,
    portName: portName,
    vlanVnid: vxlanId,
});
export const attachId = attach.id;
export const portId = attach.portId;
