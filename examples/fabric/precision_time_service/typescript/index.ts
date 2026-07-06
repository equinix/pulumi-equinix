import * as pulumi from "@pulumi/pulumi";

export const eptServiceId = ptp.id;
export const eptServiceName = ptp.name;
export const eptServiceState = ptp.state;
export const eptServiceType = ptp.type;
export const eptServiceConnection = ptp.connections;
export const eptServiceIpv4 = ptp.ipv4;
