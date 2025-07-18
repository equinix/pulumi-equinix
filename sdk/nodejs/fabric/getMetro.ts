// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as equinix from "@equinix-labs/pulumi-equinix";
 *
 * const metro = equinix.fabric.getMetro({
 *     metroCode: "<metro_code>",
 * });
 * export const type = metro.then(metro => metro.type);
 * export const metroCode = metro.then(metro => metro.metroCode);
 * export const region = metro.then(metro => metro.region);
 * export const name = metro.then(metro => metro.name);
 * export const equinixAsn = metro.then(metro => metro.equinixAsn);
 * export const localVcBandwidthMax = metro.then(metro => metro.localVcBandwidthMax);
 * export const geoCoordinates = metro.then(metro => metro.geoCoordinates);
 * export const connectedMetros = metro.then(metro => metro.connectedMetros);
 * export const geoScopes = metro.then(metro => metro.geoScopes);
 * ```
 */
export function getMetro(args: GetMetroArgs, opts?: pulumi.InvokeOptions): Promise<GetMetroResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("equinix:fabric/getMetro:getMetro", {
        "metroCode": args.metroCode,
    }, opts);
}

/**
 * A collection of arguments for invoking getMetro.
 */
export interface GetMetroArgs {
    /**
     * The metro code this data source should retrieve
     */
    metroCode: string;
}

/**
 * A collection of values returned by getMetro.
 */
export interface GetMetroResult {
    /**
     * Code assigned to an Equinix IBX data center in a specified metropolitan area
     */
    readonly code: string;
    /**
     * Arrays of objects containing latency data for the specified metro
     */
    readonly connectedMetros: outputs.fabric.GetMetroConnectedMetro[];
    /**
     * Autonomous system number (ASN) for a specified Fabric metro. The ASN is a unique identifier that carries the network routing protocol and exchanges that data with other internal systems via border gateway protocol.
     */
    readonly equinixAsn: number;
    /**
     * Geographic location data of Fabric Metro
     */
    readonly geoCoordinates: outputs.fabric.GetMetroGeoCoordinates;
    /**
     * List of supported geographic boundaries of a Fabric Metro. Example values: CANADA, CONUS.
     */
    readonly geoScopes: string[];
    /**
     * The canonical URL at which the resource resides
     */
    readonly href: string;
    /**
     * The unique identifier of the resource
     */
    readonly id: string;
    /**
     * This field holds Max Connection speed within the metro.
     */
    readonly localVcBandwidthMax: number;
    /**
     * The metro code this data source should retrieve
     */
    readonly metroCode: string;
    /**
     * Name of the region in which the data center is located
     */
    readonly name: string;
    /**
     * Board geographical area in which the data center is located
     */
    readonly region: string;
    /**
     * Indicator of a fabric metro
     */
    readonly type: string;
}
/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as equinix from "@equinix-labs/pulumi-equinix";
 *
 * const metro = equinix.fabric.getMetro({
 *     metroCode: "<metro_code>",
 * });
 * export const type = metro.then(metro => metro.type);
 * export const metroCode = metro.then(metro => metro.metroCode);
 * export const region = metro.then(metro => metro.region);
 * export const name = metro.then(metro => metro.name);
 * export const equinixAsn = metro.then(metro => metro.equinixAsn);
 * export const localVcBandwidthMax = metro.then(metro => metro.localVcBandwidthMax);
 * export const geoCoordinates = metro.then(metro => metro.geoCoordinates);
 * export const connectedMetros = metro.then(metro => metro.connectedMetros);
 * export const geoScopes = metro.then(metro => metro.geoScopes);
 * ```
 */
export function getMetroOutput(args: GetMetroOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetMetroResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("equinix:fabric/getMetro:getMetro", {
        "metroCode": args.metroCode,
    }, opts);
}

/**
 * A collection of arguments for invoking getMetro.
 */
export interface GetMetroOutputArgs {
    /**
     * The metro code this data source should retrieve
     */
    metroCode: pulumi.Input<string>;
}
