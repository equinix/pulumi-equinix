// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***


export const AclProtocolType = {
    IP: "IP",
    TCP: "TCP",
    UDP: "UDP",
} as const;

export type AclProtocolType = (typeof AclProtocolType)[keyof typeof AclProtocolType];

export const FileType = {
    License: "LICENSE",
    CloudInit: "CLOUD_INIT",
} as const;

export type FileType = (typeof FileType)[keyof typeof FileType];

export const ThroughputUnit = {
    Mbps: "Mbps",
    Gbps: "Gbps",
} as const;

export type ThroughputUnit = (typeof ThroughputUnit)[keyof typeof ThroughputUnit];
