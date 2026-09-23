import * as pulumi from "@pulumi/pulumi";
import * as equinix from "@equinix-labs/pulumi-equinix";

const ptp = new equinix.fabric.PrecisionTimeService("ptp", {
    type: "PTP",
    name: "tf_acc_eptptp_PFCR",
    "package": {
        code: "PTP_STANDARD",
    },
    connections: [{
        uuid: "<connection_id>",
    }],
    ipv4: {
        primary: "191.168.254.241",
        secondary: "191.168.254.242",
        networkMask: "255.255.255.240",
        defaultGateway: "191.168.254.254",
    },
});
export const eptServiceId = ptp.id;
export const eptServiceName = ptp.name;
export const eptServiceState = ptp.state;
export const eptServiceType = ptp.type;
export const eptServiceConnection = ptp.connections;
export const eptServiceIpv4 = ptp.ipv4;
