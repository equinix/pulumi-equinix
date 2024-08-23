// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Use this data source to get Equinix Network Edge device software details for a given device type. For further details, check supported [Network Edge Vendors and Devices](https://docs.equinix.com/en-us/Content/Interconnection/NE/user-guide/NE-vendors-devices.htm).
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as equinix from "@equinix-labs/pulumi-equinix";
 *
 * const csrLatest1609 = equinix.networkedge.getDeviceSoftware({
 *     deviceType: "CSR1000V",
 *     mostRecent: true,
 *     packages: ["IPBASE"],
 *     versionRegex: "^16.09.+",
 * });
 * ```
 */
export function getDeviceSoftware(args: GetDeviceSoftwareArgs, opts?: pulumi.InvokeOptions): Promise<GetDeviceSoftwareResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("equinix:networkedge/getDeviceSoftware:getDeviceSoftware", {
        "deviceType": args.deviceType,
        "mostRecent": args.mostRecent,
        "packages": args.packages,
        "stable": args.stable,
        "versionRegex": args.versionRegex,
    }, opts);
}

/**
 * A collection of arguments for invoking getDeviceSoftware.
 */
export interface GetDeviceSoftwareArgs {
    /**
     * Code of a device type.
     */
    deviceType: string;
    /**
     * Boolean value to indicate that most recent version should be used *(in case when more than one result is returned)*.
     */
    mostRecent?: boolean;
    /**
     * Limits returned versions to those that are supported by given software package codes.
     */
    packages?: string[];
    /**
     * Boolean value to limit query results to stable versions only.
     */
    stable?: boolean;
    /**
     * A regex string to apply on returned versions and filter search results.
     */
    versionRegex?: string;
}

/**
 * A collection of values returned by getDeviceSoftware.
 */
export interface GetDeviceSoftwareResult {
    /**
     * Version release date.
     */
    readonly date: string;
    readonly deviceType: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Software image name.
     */
    readonly imageName: string;
    readonly mostRecent?: boolean;
    readonly packages: string[];
    /**
     * Link to version release notes.
     */
    readonly releaseNotesLink: string;
    readonly stable: boolean;
    /**
     * Version status.
     */
    readonly status: string;
    /**
     * Version number.
     */
    readonly version: string;
    readonly versionRegex?: string;
}
/**
 * Use this data source to get Equinix Network Edge device software details for a given device type. For further details, check supported [Network Edge Vendors and Devices](https://docs.equinix.com/en-us/Content/Interconnection/NE/user-guide/NE-vendors-devices.htm).
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as equinix from "@equinix-labs/pulumi-equinix";
 *
 * const csrLatest1609 = equinix.networkedge.getDeviceSoftware({
 *     deviceType: "CSR1000V",
 *     mostRecent: true,
 *     packages: ["IPBASE"],
 *     versionRegex: "^16.09.+",
 * });
 * ```
 */
export function getDeviceSoftwareOutput(args: GetDeviceSoftwareOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetDeviceSoftwareResult> {
    return pulumi.output(args).apply((a: any) => getDeviceSoftware(a, opts))
}

/**
 * A collection of arguments for invoking getDeviceSoftware.
 */
export interface GetDeviceSoftwareOutputArgs {
    /**
     * Code of a device type.
     */
    deviceType: pulumi.Input<string>;
    /**
     * Boolean value to indicate that most recent version should be used *(in case when more than one result is returned)*.
     */
    mostRecent?: pulumi.Input<boolean>;
    /**
     * Limits returned versions to those that are supported by given software package codes.
     */
    packages?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Boolean value to limit query results to stable versions only.
     */
    stable?: pulumi.Input<boolean>;
    /**
     * A regex string to apply on returned versions and filter search results.
     */
    versionRegex?: pulumi.Input<string>;
}