import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix/pulumi-equinix";

const config = new pulumi.Config();
const portId = config.require("portId");
const vlanId = config.require("vlanId");
const port = new equinix.metal.Port("portBond0", {
    portId: portId,
    bonded: true,
    layer2: false,
    vlanIds: [vlanId],
});
export const portType = port.type;
export const portBondedNetworkType = port.networkType;
