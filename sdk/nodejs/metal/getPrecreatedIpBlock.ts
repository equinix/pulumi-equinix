// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Use this data source to get CIDR expression for precreated (management) IPv6 and IPv4 blocks in Equinix Metal.
 * You can then use the cidrsubnet TF builtin function to derive subnets.
 *
 * > For backward compatibility, this data source will also return reserved (elastic) IP blocks.
 *
 * > Precreated (management) IP blocks for a metro will not be available until first device is created in that metro.
 *
 * > Public IPv4 blocks auto-assigned (management) to a device cannot be retrieved. If you need that information, consider using the equinix.metal.Device data source instead.
 */
export function getPrecreatedIpBlock(args: GetPrecreatedIpBlockArgs, opts?: pulumi.InvokeOptions): Promise<GetPrecreatedIpBlockResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("equinix:metal/getPrecreatedIpBlock:getPrecreatedIpBlock", {
        "addressFamily": args.addressFamily,
        "facility": args.facility,
        "global": args.global,
        "metro": args.metro,
        "projectId": args.projectId,
        "public": args.public,
    }, opts);
}

/**
 * A collection of arguments for invoking getPrecreatedIpBlock.
 */
export interface GetPrecreatedIpBlockArgs {
    /**
     * 4 or 6, depending on which block you are looking for.
     */
    addressFamily: number;
    /**
     * Facility of the searched block. (for non-global blocks).
     */
    facility?: string;
    /**
     * Whether to look for global block. Default is false for backward compatibility.
     */
    global?: boolean;
    /**
     * Metro of the searched block (for non-global blocks).
     */
    metro?: string;
    /**
     * ID of the project where the searched block should be.
     */
    projectId: string;
    /**
     * Whether to look for public or private block.
     */
    public: boolean;
}

/**
 * A collection of values returned by getPrecreatedIpBlock.
 */
export interface GetPrecreatedIpBlockResult {
    readonly address: string;
    readonly addressFamily: number;
    readonly cidr: number;
    /**
     * CIDR notation of the looked up block.
     */
    readonly cidrNotation: string;
    readonly facility?: string;
    readonly gateway: string;
    readonly global?: boolean;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly manageable: boolean;
    readonly management: boolean;
    readonly metro?: string;
    readonly netmask: string;
    readonly network: string;
    readonly projectId: string;
    readonly public: boolean;
    readonly quantity: number;
    readonly type: string;
    readonly vrfId: string;
}
/**
 * Use this data source to get CIDR expression for precreated (management) IPv6 and IPv4 blocks in Equinix Metal.
 * You can then use the cidrsubnet TF builtin function to derive subnets.
 *
 * > For backward compatibility, this data source will also return reserved (elastic) IP blocks.
 *
 * > Precreated (management) IP blocks for a metro will not be available until first device is created in that metro.
 *
 * > Public IPv4 blocks auto-assigned (management) to a device cannot be retrieved. If you need that information, consider using the equinix.metal.Device data source instead.
 */
export function getPrecreatedIpBlockOutput(args: GetPrecreatedIpBlockOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetPrecreatedIpBlockResult> {
    return pulumi.output(args).apply((a: any) => getPrecreatedIpBlock(a, opts))
}

/**
 * A collection of arguments for invoking getPrecreatedIpBlock.
 */
export interface GetPrecreatedIpBlockOutputArgs {
    /**
     * 4 or 6, depending on which block you are looking for.
     */
    addressFamily: pulumi.Input<number>;
    /**
     * Facility of the searched block. (for non-global blocks).
     */
    facility?: pulumi.Input<string>;
    /**
     * Whether to look for global block. Default is false for backward compatibility.
     */
    global?: pulumi.Input<boolean>;
    /**
     * Metro of the searched block (for non-global blocks).
     */
    metro?: pulumi.Input<string>;
    /**
     * ID of the project where the searched block should be.
     */
    projectId: pulumi.Input<string>;
    /**
     * Whether to look for public or private block.
     */
    public: pulumi.Input<boolean>;
}
