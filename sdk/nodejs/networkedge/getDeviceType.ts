// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Use this data source to get Equinix Network Edge device type details. For further details, check supported [Network Edge Vendors and Devices](https://docs.equinix.com/en-us/Content/Interconnection/NE/user-guide/NE-vendors-devices.htm).
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as equinix from "@equinix-labs/pulumi-equinix";
 *
 * const ciscoRouter = equinix.networkedge.getDeviceType({
 *     category: "Router",
 *     metroCodes: [
 *         "DC",
 *         "SV",
 *     ],
 *     vendor: "Cisco",
 * });
 * ```
 */
export function getDeviceType(args?: GetDeviceTypeArgs, opts?: pulumi.InvokeOptions): Promise<GetDeviceTypeResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("equinix:networkedge/getDeviceType:getDeviceType", {
        "category": args.category,
        "metroCodes": args.metroCodes,
        "name": args.name,
        "vendor": args.vendor,
    }, opts);
}

/**
 * A collection of arguments for invoking getDeviceType.
 */
export interface GetDeviceTypeArgs {
    /**
     * Device type category. One of: `Router`, `Firewall`, `SDWAN`.
     */
    category?: string;
    /**
     * List of metro codes where device type has to be available
     */
    metroCodes?: string[];
    /**
     * Device type name.
     */
    name?: string;
    /**
     * Device type vendor i.e. `Cisco`, `Juniper Networks`, `VERSA Networks`.
     */
    vendor?: string;
}

/**
 * A collection of values returned by getDeviceType.
 */
export interface GetDeviceTypeResult {
    readonly category: string;
    /**
     * Device type short code, unique identifier of a network device type
     */
    readonly code: string;
    /**
     * Device type textual description
     */
    readonly description: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly metroCodes: string[];
    readonly name: string;
    readonly vendor: string;
}
/**
 * Use this data source to get Equinix Network Edge device type details. For further details, check supported [Network Edge Vendors and Devices](https://docs.equinix.com/en-us/Content/Interconnection/NE/user-guide/NE-vendors-devices.htm).
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as equinix from "@equinix-labs/pulumi-equinix";
 *
 * const ciscoRouter = equinix.networkedge.getDeviceType({
 *     category: "Router",
 *     metroCodes: [
 *         "DC",
 *         "SV",
 *     ],
 *     vendor: "Cisco",
 * });
 * ```
 */
export function getDeviceTypeOutput(args?: GetDeviceTypeOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetDeviceTypeResult> {
    return pulumi.output(args).apply((a: any) => getDeviceType(a, opts))
}

/**
 * A collection of arguments for invoking getDeviceType.
 */
export interface GetDeviceTypeOutputArgs {
    /**
     * Device type category. One of: `Router`, `Firewall`, `SDWAN`.
     */
    category?: pulumi.Input<string>;
    /**
     * List of metro codes where device type has to be available
     */
    metroCodes?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Device type name.
     */
    name?: pulumi.Input<string>;
    /**
     * Device type vendor i.e. `Cisco`, `Juniper Networks`, `VERSA Networks`.
     */
    vendor?: pulumi.Input<string>;
}
