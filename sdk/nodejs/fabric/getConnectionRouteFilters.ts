// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Fabric V4 API compatible data resource that allow user to fetch all route filter policies attached to a fabric connection
 *
 * Additional Documentation:
 * * Getting Started: https://docs.equinix.com/en-us/Content/Interconnection/FCR/FCR-route-filters.htm
 * * API: https://developer.equinix.com/dev-docs/fabric/api-reference/fabric-v4-apis#route-filter-rules
 */
export function getConnectionRouteFilters(args: GetConnectionRouteFiltersArgs, opts?: pulumi.InvokeOptions): Promise<GetConnectionRouteFiltersResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("equinix:fabric/getConnectionRouteFilters:getConnectionRouteFilters", {
        "connectionId": args.connectionId,
    }, opts);
}

/**
 * A collection of arguments for invoking getConnectionRouteFilters.
 */
export interface GetConnectionRouteFiltersArgs {
    /**
     * Equinix Assigned UUID of the Equinix Connection to attach the Route Filter Policy to
     */
    connectionId: string;
}

/**
 * A collection of values returned by getConnectionRouteFilters.
 */
export interface GetConnectionRouteFiltersResult {
    /**
     * Equinix Assigned UUID of the Equinix Connection to attach the Route Filter Policy to
     */
    readonly connectionId: string;
    /**
     * The list of Rules attached to the given Route Filter Policy UUID
     */
    readonly datas: outputs.fabric.GetConnectionRouteFiltersData[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Pagination details for the Data Source Search Request
     */
    readonly paginations: outputs.fabric.GetConnectionRouteFiltersPagination[];
}
/**
 * Fabric V4 API compatible data resource that allow user to fetch all route filter policies attached to a fabric connection
 *
 * Additional Documentation:
 * * Getting Started: https://docs.equinix.com/en-us/Content/Interconnection/FCR/FCR-route-filters.htm
 * * API: https://developer.equinix.com/dev-docs/fabric/api-reference/fabric-v4-apis#route-filter-rules
 */
export function getConnectionRouteFiltersOutput(args: GetConnectionRouteFiltersOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetConnectionRouteFiltersResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("equinix:fabric/getConnectionRouteFilters:getConnectionRouteFilters", {
        "connectionId": args.connectionId,
    }, opts);
}

/**
 * A collection of arguments for invoking getConnectionRouteFilters.
 */
export interface GetConnectionRouteFiltersOutputArgs {
    /**
     * Equinix Assigned UUID of the Equinix Connection to attach the Route Filter Policy to
     */
    connectionId: pulumi.Input<string>;
}
