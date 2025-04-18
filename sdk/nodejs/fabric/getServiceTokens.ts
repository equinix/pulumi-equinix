// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Fabric V4 API compatible data resource that allow user to fetch service token for a given search data set
 *
 * Additional documentation:
 * * Getting Started: https://docs.equinix.com/en-us/Content/Interconnection/Fabric/service%20tokens/Fabric-Service-Tokens.htm
 * * API: https://docs.equinix.com/en-us/Content/KnowledgeCenter/Fabric/GettingStarted/Integrating-with-Fabric-V4-APIs/ConnectUsingServiceToken.htm
 */
export function getServiceTokens(args: GetServiceTokensArgs, opts?: pulumi.InvokeOptions): Promise<GetServiceTokensResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("equinix:fabric/getServiceTokens:getServiceTokens", {
        "filters": args.filters,
        "pagination": args.pagination,
    }, opts);
}

/**
 * A collection of arguments for invoking getServiceTokens.
 */
export interface GetServiceTokensArgs {
    /**
     * Filters for the Data Source Search Request
     */
    filters: inputs.fabric.GetServiceTokensFilter[];
    /**
     * Pagination details for the Data Source Search Request
     */
    pagination?: inputs.fabric.GetServiceTokensPagination;
}

/**
 * A collection of values returned by getServiceTokens.
 */
export interface GetServiceTokensResult {
    /**
     * List of Service Tokens
     */
    readonly datas: outputs.fabric.GetServiceTokensData[];
    /**
     * Filters for the Data Source Search Request
     */
    readonly filters: outputs.fabric.GetServiceTokensFilter[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Pagination details for the Data Source Search Request
     */
    readonly pagination?: outputs.fabric.GetServiceTokensPagination;
}
/**
 * Fabric V4 API compatible data resource that allow user to fetch service token for a given search data set
 *
 * Additional documentation:
 * * Getting Started: https://docs.equinix.com/en-us/Content/Interconnection/Fabric/service%20tokens/Fabric-Service-Tokens.htm
 * * API: https://docs.equinix.com/en-us/Content/KnowledgeCenter/Fabric/GettingStarted/Integrating-with-Fabric-V4-APIs/ConnectUsingServiceToken.htm
 */
export function getServiceTokensOutput(args: GetServiceTokensOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetServiceTokensResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("equinix:fabric/getServiceTokens:getServiceTokens", {
        "filters": args.filters,
        "pagination": args.pagination,
    }, opts);
}

/**
 * A collection of arguments for invoking getServiceTokens.
 */
export interface GetServiceTokensOutputArgs {
    /**
     * Filters for the Data Source Search Request
     */
    filters: pulumi.Input<pulumi.Input<inputs.fabric.GetServiceTokensFilterArgs>[]>;
    /**
     * Pagination details for the Data Source Search Request
     */
    pagination?: pulumi.Input<inputs.fabric.GetServiceTokensPaginationArgs>;
}
