import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const config = new pulumi.Config();
const deviceId = config.require("deviceId");
const bgp = new equinix.metal.BgpSession("bgp", {
    deviceId: deviceId,
    addressFamily: "ipv4",
});
export const bgpSessionStatus = bgp.status;
