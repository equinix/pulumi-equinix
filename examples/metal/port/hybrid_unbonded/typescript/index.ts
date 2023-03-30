import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix/pulumi-equinix";

const config = new pulumi.Config();
const portId = config.require("portId");
const port = new equinix.metal.Port("port", {
    portId: portId,
    bonded: false,
});
export const portType = port.type;
