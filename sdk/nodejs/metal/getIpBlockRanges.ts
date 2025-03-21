// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Use this datasource to get CIDR expressions for allocated IP blocks of all the types in a project, optionally filtered by facility or metro.
 *
 * There are four types of IP blocks in Equinix: equinixMetalGlobal IPv4, public IPv4, private IPv4 and IPv6. Both global and public IPv4 are routable from the Internet. Public IPv4 blocks are allocated in a facility or metro, and addresses from it can only be assigned to devices in that location. Addresses from Global IPv4 block can be assigned to a device in any metro.
 *
 * The datasource has 4 list attributes: `globalIpv4`, `publicIpv4`, `privateIpv4` and `ipv6`, each listing CIDR notation (`<network>/<mask>`) of respective blocks from the project.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as equinix from "@equinix-labs/pulumi-equinix";
 *
 * const projectId = "<UUID_of_your_project>";
 * const test = equinix.metal.getIpBlockRanges({
 *     projectId: projectId,
 * });
 * export const out = test;
 * ```
 */
export function getIpBlockRanges(args: GetIpBlockRangesArgs, opts?: pulumi.InvokeOptions): Promise<GetIpBlockRangesResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("equinix:metal/getIpBlockRanges:getIpBlockRanges", {
        "facility": args.facility,
        "metro": args.metro,
        "projectId": args.projectId,
    }, opts);
}

/**
 * A collection of arguments for invoking getIpBlockRanges.
 */
export interface GetIpBlockRangesArgs {
    /**
     * Facility code filtering the IP blocks. Global IPv4 blocks will be listed anyway. If you omit this and metro, all the block from the project will be listed. Use metro instead; read the facility to metro migration guide
     *
     * @deprecated Use metro instead of facility.  For more information, read the migration guide: https://registry.terraform.io/providers/equinix/equinix/latest/docs/guides/migration_guide_facilities_to_metros_devices
     */
    facility?: string;
    /**
     * Metro code filtering the IP blocks. Global IPv4 blocks will be listed anyway. If you omit this and facility, all the block from the project will be listed.
     */
    metro?: string;
    /**
     * ID of the project from which to list the blocks.
     */
    projectId: string;
}

/**
 * A collection of values returned by getIpBlockRanges.
 */
export interface GetIpBlockRangesResult {
    /**
     * @deprecated Use metro instead of facility.  For more information, read the migration guide: https://registry.terraform.io/providers/equinix/equinix/latest/docs/guides/migration_guide_facilities_to_metros_devices
     */
    readonly facility?: string;
    /**
     * list of CIDR expressions for Global IPv4 blocks in the project.
     */
    readonly globalIpv4s: string[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * list of CIDR expressions for IPv6 blocks in the project.
     */
    readonly ipv6s: string[];
    readonly metro?: string;
    /**
     * list of CIDR expressions for Private IPv4 blocks in the project.
     */
    readonly privateIpv4s: string[];
    readonly projectId: string;
    /**
     * list of CIDR expressions for Public IPv4 blocks in the project.
     */
    readonly publicIpv4s: string[];
}
/**
 * Use this datasource to get CIDR expressions for allocated IP blocks of all the types in a project, optionally filtered by facility or metro.
 *
 * There are four types of IP blocks in Equinix: equinixMetalGlobal IPv4, public IPv4, private IPv4 and IPv6. Both global and public IPv4 are routable from the Internet. Public IPv4 blocks are allocated in a facility or metro, and addresses from it can only be assigned to devices in that location. Addresses from Global IPv4 block can be assigned to a device in any metro.
 *
 * The datasource has 4 list attributes: `globalIpv4`, `publicIpv4`, `privateIpv4` and `ipv6`, each listing CIDR notation (`<network>/<mask>`) of respective blocks from the project.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as equinix from "@equinix-labs/pulumi-equinix";
 *
 * const projectId = "<UUID_of_your_project>";
 * const test = equinix.metal.getIpBlockRanges({
 *     projectId: projectId,
 * });
 * export const out = test;
 * ```
 */
export function getIpBlockRangesOutput(args: GetIpBlockRangesOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetIpBlockRangesResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("equinix:metal/getIpBlockRanges:getIpBlockRanges", {
        "facility": args.facility,
        "metro": args.metro,
        "projectId": args.projectId,
    }, opts);
}

/**
 * A collection of arguments for invoking getIpBlockRanges.
 */
export interface GetIpBlockRangesOutputArgs {
    /**
     * Facility code filtering the IP blocks. Global IPv4 blocks will be listed anyway. If you omit this and metro, all the block from the project will be listed. Use metro instead; read the facility to metro migration guide
     *
     * @deprecated Use metro instead of facility.  For more information, read the migration guide: https://registry.terraform.io/providers/equinix/equinix/latest/docs/guides/migration_guide_facilities_to_metros_devices
     */
    facility?: pulumi.Input<string>;
    /**
     * Metro code filtering the IP blocks. Global IPv4 blocks will be listed anyway. If you omit this and facility, all the block from the project will be listed.
     */
    metro?: pulumi.Input<string>;
    /**
     * ID of the project from which to list the blocks.
     */
    projectId: pulumi.Input<string>;
}
