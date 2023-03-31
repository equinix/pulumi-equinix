import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const config = new pulumi.Config();
const projectId = config.require("projectId");
const metro = config.get("metro") || "FR";
const type = config.get("type") || "public_ipv4";
const quantity = config.getNumber("quantity") || 1;
const ipBlock = new equinix.metal.ReservedIpBlock("ipBlock", {
    projectId: projectId,
    type: type,
    quantity: quantity,
    metro: metro,
});
export const ipBlockId = ipBlock.id;
export const ipBlockSubent = ipBlock.cidrNotation;
