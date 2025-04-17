// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Fabric V4 API compatible data resource that allow user to fetch Equinix Fabric Stream Attached Assets with filters and pagination details
 *
 * Additional Documentation:
 * * Getting Started: https://docs.equinix.com/en-us/Content/KnowledgeCenter/Fabric/GettingStarted/Integrating-with-Fabric-V4-APIs/IntegrateWithSink.htm
 * * API: https://developer.equinix.com/catalog/fabricv4#tag/Streams
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as equinix from "@equinix-labs/pulumi-equinix";
 *
 * const all = equinix.fabric.getStreamAttachments({
 *     filters: [{
 *         operator: "=",
 *         property: "<filter_property>",
 *         values: ["<list_of_values_to_filter>"],
 *     }],
 *     pagination: {
 *         limit: 100,
 *         offset: 0,
 *     },
 *     sorts: [{
 *         direction: "<DESC|ASC>",
 *         property: "/uuid",
 *     }],
 * });
 * ```
 */
export function getStreamAttachments(args: GetStreamAttachmentsArgs, opts?: pulumi.InvokeOptions): Promise<GetStreamAttachmentsResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("equinix:fabric/getStreamAttachments:getStreamAttachments", {
        "filters": args.filters,
        "pagination": args.pagination,
        "sorts": args.sorts,
    }, opts);
}

/**
 * A collection of arguments for invoking getStreamAttachments.
 */
export interface GetStreamAttachmentsArgs {
    /**
     * List of filters to apply to the stream attachment get request. Maximum of 8. All will be AND'd together with 1 of the 8 being a possible OR group of 3
     */
    filters?: inputs.fabric.GetStreamAttachmentsFilter[];
    /**
     * Pagination details for the returned streams list
     */
    pagination: inputs.fabric.GetStreamAttachmentsPagination;
    /**
     * The list of sort criteria for the stream assets search request
     */
    sorts?: inputs.fabric.GetStreamAttachmentsSort[];
}

/**
 * A collection of values returned by getStreamAttachments.
 */
export interface GetStreamAttachmentsResult {
    /**
     * Returned list of stream objects
     */
    readonly datas: outputs.fabric.GetStreamAttachmentsData[];
    /**
     * List of filters to apply to the stream attachment get request. Maximum of 8. All will be AND'd together with 1 of the 8 being a possible OR group of 3
     */
    readonly filters: outputs.fabric.GetStreamAttachmentsFilter[];
    /**
     * The unique identifier of the resource
     */
    readonly id: string;
    /**
     * Pagination details for the returned streams list
     */
    readonly pagination: outputs.fabric.GetStreamAttachmentsPagination;
    /**
     * The list of sort criteria for the stream assets search request
     */
    readonly sorts?: outputs.fabric.GetStreamAttachmentsSort[];
}
/**
 * Fabric V4 API compatible data resource that allow user to fetch Equinix Fabric Stream Attached Assets with filters and pagination details
 *
 * Additional Documentation:
 * * Getting Started: https://docs.equinix.com/en-us/Content/KnowledgeCenter/Fabric/GettingStarted/Integrating-with-Fabric-V4-APIs/IntegrateWithSink.htm
 * * API: https://developer.equinix.com/catalog/fabricv4#tag/Streams
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as equinix from "@equinix-labs/pulumi-equinix";
 *
 * const all = equinix.fabric.getStreamAttachments({
 *     filters: [{
 *         operator: "=",
 *         property: "<filter_property>",
 *         values: ["<list_of_values_to_filter>"],
 *     }],
 *     pagination: {
 *         limit: 100,
 *         offset: 0,
 *     },
 *     sorts: [{
 *         direction: "<DESC|ASC>",
 *         property: "/uuid",
 *     }],
 * });
 * ```
 */
export function getStreamAttachmentsOutput(args: GetStreamAttachmentsOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetStreamAttachmentsResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("equinix:fabric/getStreamAttachments:getStreamAttachments", {
        "filters": args.filters,
        "pagination": args.pagination,
        "sorts": args.sorts,
    }, opts);
}

/**
 * A collection of arguments for invoking getStreamAttachments.
 */
export interface GetStreamAttachmentsOutputArgs {
    /**
     * List of filters to apply to the stream attachment get request. Maximum of 8. All will be AND'd together with 1 of the 8 being a possible OR group of 3
     */
    filters?: pulumi.Input<pulumi.Input<inputs.fabric.GetStreamAttachmentsFilterArgs>[]>;
    /**
     * Pagination details for the returned streams list
     */
    pagination: pulumi.Input<inputs.fabric.GetStreamAttachmentsPaginationArgs>;
    /**
     * The list of sort criteria for the stream assets search request
     */
    sorts?: pulumi.Input<pulumi.Input<inputs.fabric.GetStreamAttachmentsSortArgs>[]>;
}
