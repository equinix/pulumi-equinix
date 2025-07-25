// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Fabric V4 API compatible data source that allows user to fetch Equinix Fabric Stream Subscription by Stream Id and Subscription Id
 *
 * Additional Documentation:
 * * Getting Started: https://docs.equinix.com/en-us/Content/KnowledgeCenter/Fabric/GettingStarted/Integrating-with-Fabric-V4-APIs/IntegrateWithSink.htm
 * * API: https://developer.equinix.com/catalog/fabricv4#tag/Stream-Subscriptions
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as equinix from "@equinix-labs/pulumi-equinix";
 *
 * const byIds = equinix.fabric.getStreamSubscription({
 *     streamId: "<stream_id>",
 *     subscriptionId: "<subscription_id>",
 * });
 * ```
 */
export function getStreamSubscription(args: GetStreamSubscriptionArgs, opts?: pulumi.InvokeOptions): Promise<GetStreamSubscriptionResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("equinix:fabric/getStreamSubscription:getStreamSubscription", {
        "streamId": args.streamId,
        "subscriptionId": args.subscriptionId,
    }, opts);
}

/**
 * A collection of arguments for invoking getStreamSubscription.
 */
export interface GetStreamSubscriptionArgs {
    /**
     * The uuid of the stream that is the target of the stream subscription
     */
    streamId: string;
    /**
     * The uuid of the stream subscription
     */
    subscriptionId: string;
}

/**
 * A collection of values returned by getStreamSubscription.
 */
export interface GetStreamSubscriptionResult {
    /**
     * Details of the last change on the stream resource
     */
    readonly changeLog: outputs.fabric.GetStreamSubscriptionChangeLog;
    /**
     * Customer-provided stream subscription description
     */
    readonly description: string;
    /**
     * Stream subscription enabled status
     */
    readonly enabled: boolean;
    /**
     * Lists of events to be included/excluded on the stream subscription
     */
    readonly eventSelector: outputs.fabric.GetStreamSubscriptionEventSelector;
    /**
     * Equinix assigned URI of the stream subscription resource
     */
    readonly href: string;
    /**
     * The unique identifier of the resource
     */
    readonly id: string;
    /**
     * Lists of metrics to be included/excluded on the stream subscription
     */
    readonly metricSelector: outputs.fabric.GetStreamSubscriptionMetricSelector;
    /**
     * Customer-provided stream subscription name
     */
    readonly name: string;
    /**
     * The details of the subscriber to the Equinix Stream
     */
    readonly sink: outputs.fabric.GetStreamSubscriptionSink;
    /**
     * Value representing provisioning status for the stream resource
     */
    readonly state: string;
    /**
     * The uuid of the stream that is the target of the stream subscription
     */
    readonly streamId: string;
    /**
     * The uuid of the stream subscription
     */
    readonly subscriptionId: string;
    /**
     * Type of the stream subscription request
     */
    readonly type: string;
    /**
     * Equinix assigned unique identifier of the stream subscription resource
     */
    readonly uuid: string;
}
/**
 * Fabric V4 API compatible data source that allows user to fetch Equinix Fabric Stream Subscription by Stream Id and Subscription Id
 *
 * Additional Documentation:
 * * Getting Started: https://docs.equinix.com/en-us/Content/KnowledgeCenter/Fabric/GettingStarted/Integrating-with-Fabric-V4-APIs/IntegrateWithSink.htm
 * * API: https://developer.equinix.com/catalog/fabricv4#tag/Stream-Subscriptions
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as equinix from "@equinix-labs/pulumi-equinix";
 *
 * const byIds = equinix.fabric.getStreamSubscription({
 *     streamId: "<stream_id>",
 *     subscriptionId: "<subscription_id>",
 * });
 * ```
 */
export function getStreamSubscriptionOutput(args: GetStreamSubscriptionOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetStreamSubscriptionResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("equinix:fabric/getStreamSubscription:getStreamSubscription", {
        "streamId": args.streamId,
        "subscriptionId": args.subscriptionId,
    }, opts);
}

/**
 * A collection of arguments for invoking getStreamSubscription.
 */
export interface GetStreamSubscriptionOutputArgs {
    /**
     * The uuid of the stream that is the target of the stream subscription
     */
    streamId: pulumi.Input<string>;
    /**
     * The uuid of the stream subscription
     */
    subscriptionId: pulumi.Input<string>;
}
