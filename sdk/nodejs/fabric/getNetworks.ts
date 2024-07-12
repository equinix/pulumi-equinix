// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Fabric V4 API compatible data resource that allow user to fetch Fabric Network for a given UUID
 *
 * Additional documentation:
 * * Getting Started: https://docs.equinix.com/en-us/Content/Interconnection/Fabric/IMPLEMENTATION/fabric-networks-implement.htm
 * * API: https://developer.equinix.com/dev-docs/fabric/api-reference/fabric-v4-apis#fabric-networks
 */
export function getNetworks(args: GetNetworksArgs, opts?: pulumi.InvokeOptions): Promise<GetNetworksResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("equinix:fabric/getNetworks:getNetworks", {
        "filters": args.filters,
        "outerOperator": args.outerOperator,
        "pagination": args.pagination,
        "sorts": args.sorts,
    }, opts);
}

/**
 * A collection of arguments for invoking getNetworks.
 */
export interface GetNetworksArgs {
    /**
     * Filters for the Data Source Search Request
     */
    filters: inputs.fabric.GetNetworksFilter[];
    /**
     * Determines if the filter list will be grouped by AND or by OR. One of [AND, OR]
     */
    outerOperator: string;
    /**
     * Pagination details for the Data Source Search Request
     */
    pagination?: inputs.fabric.GetNetworksPagination;
    /**
     * Filters for the Data Source Search Request
     */
    sorts?: inputs.fabric.GetNetworksSort[];
}

/**
 * A collection of values returned by getNetworks.
 */
export interface GetNetworksResult {
    /**
     * List of Cloud Routers
     */
    readonly datas: outputs.fabric.GetNetworksData[];
    /**
     * Filters for the Data Source Search Request
     */
    readonly filters: outputs.fabric.GetNetworksFilter[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Determines if the filter list will be grouped by AND or by OR. One of [AND, OR]
     */
    readonly outerOperator: string;
    /**
     * Pagination details for the Data Source Search Request
     */
    readonly pagination?: outputs.fabric.GetNetworksPagination;
    /**
     * Filters for the Data Source Search Request
     */
    readonly sorts?: outputs.fabric.GetNetworksSort[];
}
/**
 * Fabric V4 API compatible data resource that allow user to fetch Fabric Network for a given UUID
 *
 * Additional documentation:
 * * Getting Started: https://docs.equinix.com/en-us/Content/Interconnection/Fabric/IMPLEMENTATION/fabric-networks-implement.htm
 * * API: https://developer.equinix.com/dev-docs/fabric/api-reference/fabric-v4-apis#fabric-networks
 */
export function getNetworksOutput(args: GetNetworksOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetNetworksResult> {
    return pulumi.output(args).apply((a: any) => getNetworks(a, opts))
}

/**
 * A collection of arguments for invoking getNetworks.
 */
export interface GetNetworksOutputArgs {
    /**
     * Filters for the Data Source Search Request
     */
    filters: pulumi.Input<pulumi.Input<inputs.fabric.GetNetworksFilterArgs>[]>;
    /**
     * Determines if the filter list will be grouped by AND or by OR. One of [AND, OR]
     */
    outerOperator: pulumi.Input<string>;
    /**
     * Pagination details for the Data Source Search Request
     */
    pagination?: pulumi.Input<inputs.fabric.GetNetworksPaginationArgs>;
    /**
     * Filters for the Data Source Search Request
     */
    sorts?: pulumi.Input<pulumi.Input<inputs.fabric.GetNetworksSortArgs>[]>;
}
