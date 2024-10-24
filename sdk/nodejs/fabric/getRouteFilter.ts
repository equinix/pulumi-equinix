// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Fabric V4 API compatible data resource that allow user to fetch route filter for a given UUID
 *
 * Additional Documentation:
 * * Getting Started: https://docs.equinix.com/en-us/Content/Interconnection/FCR/FCR-route-filters.htm
 * * API: https://developer.equinix.com/dev-docs/fabric/api-reference/fabric-v4-apis#route-filters
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as equinix from "@equinix-labs/pulumi-equinix";
 *
 * const rfPolicy = equinix.fabric.getRouteFilter({
 *     uuid: "<uuid_of_route_filter",
 * });
 * export const id = rfPolicy.then(rfPolicy => rfPolicy.id);
 * export const type = rfPolicy.then(rfPolicy => rfPolicy.type);
 * export const state = rfPolicy.then(rfPolicy => rfPolicy.state);
 * export const notMatchedRulesAction = rfPolicy.then(rfPolicy => rfPolicy.notMatchedRuleAction);
 * export const connectionsCount = rfPolicy.then(rfPolicy => rfPolicy.connectionsCount);
 * export const rulesCount = rfPolicy.then(rfPolicy => rfPolicy.rulesCount);
 * ```
 */
export function getRouteFilter(args: GetRouteFilterArgs, opts?: pulumi.InvokeOptions): Promise<GetRouteFilterResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("equinix:fabric/getRouteFilter:getRouteFilter", {
        "uuid": args.uuid,
    }, opts);
}

/**
 * A collection of arguments for invoking getRouteFilter.
 */
export interface GetRouteFilterArgs {
    /**
     * Equinix Assigned ID for Route Filter
     */
    uuid: string;
}

/**
 * A collection of values returned by getRouteFilter.
 */
export interface GetRouteFilterResult {
    readonly changeLogs: outputs.fabric.GetRouteFilterChangeLog[];
    /**
     * An object with the details of the previous change applied on the Route Filter
     */
    readonly changes: outputs.fabric.GetRouteFilterChange[];
    /**
     * The number of Fabric Connections that this Route Filter is attached to
     */
    readonly connectionsCount: number;
    /**
     * Optional description to add to the Route Filter you will be creating
     */
    readonly description: string;
    /**
     * Route filter URI
     */
    readonly href: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Name of the Route Filter
     */
    readonly name: string;
    /**
     * The action that will be taken on ip ranges that don't match the rules present within the Route Filter
     */
    readonly notMatchedRuleAction: string;
    /**
     * The Project object that contains projectId and href that is related to the Fabric Project containing connections the Route Filter can be attached to
     */
    readonly projects: outputs.fabric.GetRouteFilterProject[];
    /**
     * The number of Route Filter Rules attached to this Route Filter
     */
    readonly rulesCount: number;
    /**
     * State of the Route Filter in its lifecycle
     */
    readonly state: string;
    /**
     * Route Filter Type. One of [ "BGP*IPv4*PREFIX*FILTER", "BGP*IPv6*PREFIX*FILTER" ]
     */
    readonly type: string;
    /**
     * Equinix Assigned ID for Route Filter
     */
    readonly uuid: string;
}
/**
 * Fabric V4 API compatible data resource that allow user to fetch route filter for a given UUID
 *
 * Additional Documentation:
 * * Getting Started: https://docs.equinix.com/en-us/Content/Interconnection/FCR/FCR-route-filters.htm
 * * API: https://developer.equinix.com/dev-docs/fabric/api-reference/fabric-v4-apis#route-filters
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as equinix from "@equinix-labs/pulumi-equinix";
 *
 * const rfPolicy = equinix.fabric.getRouteFilter({
 *     uuid: "<uuid_of_route_filter",
 * });
 * export const id = rfPolicy.then(rfPolicy => rfPolicy.id);
 * export const type = rfPolicy.then(rfPolicy => rfPolicy.type);
 * export const state = rfPolicy.then(rfPolicy => rfPolicy.state);
 * export const notMatchedRulesAction = rfPolicy.then(rfPolicy => rfPolicy.notMatchedRuleAction);
 * export const connectionsCount = rfPolicy.then(rfPolicy => rfPolicy.connectionsCount);
 * export const rulesCount = rfPolicy.then(rfPolicy => rfPolicy.rulesCount);
 * ```
 */
export function getRouteFilterOutput(args: GetRouteFilterOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetRouteFilterResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("equinix:fabric/getRouteFilter:getRouteFilter", {
        "uuid": args.uuid,
    }, opts);
}

/**
 * A collection of arguments for invoking getRouteFilter.
 */
export interface GetRouteFilterOutputArgs {
    /**
     * Equinix Assigned ID for Route Filter
     */
    uuid: pulumi.Input<string>;
}
