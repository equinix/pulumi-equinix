import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix/pulumi-equinix";

const config = new pulumi.Config();
const portId = config.require("portId");
const org = new equinix.metal.Port("org", {
    portId: portId,
    bonded: true,
    layer2: true,
});
export const portType = port.type;
export const portBondedNetworkType = port.networkType;
