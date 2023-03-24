import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix/pulumi-equinix";

const bgp = new equinix.networkedge.Bgp("bgp", {
    connectionId: "54014acf-9730-4b55-a791-459283d05fb1",
    localIpAddress: "10.1.1.1/30",
    localAsn: 12345,
    remoteIpAddress: "10.1.1.2",
    remoteAsn: 66123,
    authenticationKey: "secret",
});
export const state = bgp.state;
export const provisioningStatus = bgp.provisioningStatus;
