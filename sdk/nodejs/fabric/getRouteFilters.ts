// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Fabric V4 API compatible data resource that allow user to fetch route filter for a given search data set
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
 * const rfPolicies = equinix.fabric.getRouteFilters({
 *     filters: [
 *         {
 *             property: "/type",
 *             operator: "=",
 *             values: ["BGP_IPv4_PREFIX_FILTER"],
 *         },
 *         {
 *             property: "/state",
 *             operator: "=",
 *             values: ["PROVISIONED"],
 *         },
 *         {
 *             property: "/project/projectId",
 *             operator: "=",
 *             values: ["<project_id>"],
 *         },
 *     ],
 *     pagination: {
 *         offset: 0,
 *         limit: 5,
 *         total: 25,
 *     },
 *     sorts: [{
 *         direction: "ASC",
 *         property: "/name",
 *     }],
 * });
 * export const firstRfUuid = rfPolicies.then(rfPolicies => rfPolicies.datas?.[0]?.uuid);
 * export const type = rfPolicies.then(rfPolicies => rfPolicies.datas?.[0]?.type);
 * export const state = rfPolicies.then(rfPolicies => rfPolicies.datas?.[0]?.state);
 * export const notMatchedRuleAction = rfPolicies.then(rfPolicies => rfPolicies.datas?.[0]?.notMatchedRuleAction);
 * export const connectionsCount = rfPolicies.then(rfPolicies => rfPolicies.datas?.[0]?.connectionsCount);
 * export const rulesCount = rfPolicies.then(rfPolicies => rfPolicies.datas?.[0]?.rulesCount);
 * ```
 */
export function getRouteFilters(args: GetRouteFiltersArgs, opts?: pulumi.InvokeOptions): Promise<GetRouteFiltersResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("equinix:fabric/getRouteFilters:getRouteFilters", {
        "filters": args.filters,
        "pagination": args.pagination,
        "sorts": args.sorts,
    }, opts);
}

/**
 * A collection of arguments for invoking getRouteFilters.
 */
export interface GetRouteFiltersArgs {
    /**
     * Filters for the Data Source Search Request. Maximum of 8 total filters.
     */
    filters: inputs.fabric.GetRouteFiltersFilter[];
    /**
     * Pagination details for the Data Source Search Request
     */
    pagination?: inputs.fabric.GetRouteFiltersPagination;
    /**
     * Filters for the Data Source Search Request
     */
    sorts?: inputs.fabric.GetRouteFiltersSort[];
}

/**
 * A collection of values returned by getRouteFilters.
 */
export interface GetRouteFiltersResult {
    /**
     * List of Route Filters
     */
    readonly datas: outputs.fabric.GetRouteFiltersData[];
    /**
     * Filters for the Data Source Search Request. Maximum of 8 total filters.
     */
    readonly filters: outputs.fabric.GetRouteFiltersFilter[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Pagination details for the Data Source Search Request
     */
    readonly pagination?: outputs.fabric.GetRouteFiltersPagination;
    /**
     * Filters for the Data Source Search Request
     */
    readonly sorts?: outputs.fabric.GetRouteFiltersSort[];
}
/**
 * Fabric V4 API compatible data resource that allow user to fetch route filter for a given search data set
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
 * const rfPolicies = equinix.fabric.getRouteFilters({
 *     filters: [
 *         {
 *             property: "/type",
 *             operator: "=",
 *             values: ["BGP_IPv4_PREFIX_FILTER"],
 *         },
 *         {
 *             property: "/state",
 *             operator: "=",
 *             values: ["PROVISIONED"],
 *         },
 *         {
 *             property: "/project/projectId",
 *             operator: "=",
 *             values: ["<project_id>"],
 *         },
 *     ],
 *     pagination: {
 *         offset: 0,
 *         limit: 5,
 *         total: 25,
 *     },
 *     sorts: [{
 *         direction: "ASC",
 *         property: "/name",
 *     }],
 * });
 * export const firstRfUuid = rfPolicies.then(rfPolicies => rfPolicies.datas?.[0]?.uuid);
 * export const type = rfPolicies.then(rfPolicies => rfPolicies.datas?.[0]?.type);
 * export const state = rfPolicies.then(rfPolicies => rfPolicies.datas?.[0]?.state);
 * export const notMatchedRuleAction = rfPolicies.then(rfPolicies => rfPolicies.datas?.[0]?.notMatchedRuleAction);
 * export const connectionsCount = rfPolicies.then(rfPolicies => rfPolicies.datas?.[0]?.connectionsCount);
 * export const rulesCount = rfPolicies.then(rfPolicies => rfPolicies.datas?.[0]?.rulesCount);
 * ```
 */
export function getRouteFiltersOutput(args: GetRouteFiltersOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetRouteFiltersResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("equinix:fabric/getRouteFilters:getRouteFilters", {
        "filters": args.filters,
        "pagination": args.pagination,
        "sorts": args.sorts,
    }, opts);
}

/**
 * A collection of arguments for invoking getRouteFilters.
 */
export interface GetRouteFiltersOutputArgs {
    /**
     * Filters for the Data Source Search Request. Maximum of 8 total filters.
     */
    filters: pulumi.Input<pulumi.Input<inputs.fabric.GetRouteFiltersFilterArgs>[]>;
    /**
     * Pagination details for the Data Source Search Request
     */
    pagination?: pulumi.Input<inputs.fabric.GetRouteFiltersPaginationArgs>;
    /**
     * Filters for the Data Source Search Request
     */
    sorts?: pulumi.Input<pulumi.Input<inputs.fabric.GetRouteFiltersSortArgs>[]>;
}
