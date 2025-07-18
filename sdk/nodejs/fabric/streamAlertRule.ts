// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Fabric V4 API compatible resource allows creation and management of Equinix Fabric Stream Alert Rules'
 * }
 *
 * Additional Documentation:
 * * Getting Started: https://docs.equinix.com/en-us/Content/KnowledgeCenter/Fabric/GettingStarted/Integrating-with-Fabric-V4-APIs/IntegrateWithSink.htm
 * * API: https://developer.equinix.com/catalog/fabricv4#tag/Stream-Alert-Rules
 */
export class StreamAlertRule extends pulumi.CustomResource {
    /**
     * Get an existing StreamAlertRule resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: StreamAlertRuleState, opts?: pulumi.CustomResourceOptions): StreamAlertRule {
        return new StreamAlertRule(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'equinix:fabric/streamAlertRule:StreamAlertRule';

    /**
     * Returns true if the given object is an instance of StreamAlertRule.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is StreamAlertRule {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === StreamAlertRule.__pulumiType;
    }

    /**
     * Details of the last change on the stream resource
     */
    public /*out*/ readonly changeLog!: pulumi.Output<outputs.fabric.StreamAlertRuleChangeLog>;
    /**
     * Stream alert rule metric critical threshold
     */
    public readonly criticalThreshold!: pulumi.Output<string>;
    /**
     * Customer-provided stream alert rule description
     */
    public readonly description!: pulumi.Output<string>;
    /**
     * Stream alert rule enabled status
     */
    public readonly enabled!: pulumi.Output<boolean>;
    /**
     * Equinix assigned URI of the stream alert rule
     */
    public /*out*/ readonly href!: pulumi.Output<string>;
    /**
     * Stream alert rule metric name
     */
    public readonly metricName!: pulumi.Output<string>;
    /**
     * Customer-provided stream alert rule name
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Stream alert rule metric operand
     */
    public readonly operand!: pulumi.Output<string>;
    /**
     * Resource selector for the stream alert rule
     */
    public readonly resourceSelector!: pulumi.Output<outputs.fabric.StreamAlertRuleResourceSelector>;
    /**
     * Value representing provisioning status for the stream alert rule
     */
    public /*out*/ readonly state!: pulumi.Output<string>;
    /**
     * The stream UUID that contains this alert rule
     */
    public readonly streamId!: pulumi.Output<string>;
    public readonly timeouts!: pulumi.Output<outputs.fabric.StreamAlertRuleTimeouts | undefined>;
    /**
     * Type of the stream alert rule
     */
    public readonly type!: pulumi.Output<string>;
    /**
     * Equinix assigned unique identifier for the stream alert rule
     */
    public /*out*/ readonly uuid!: pulumi.Output<string>;
    /**
     * Stream alert rule metric warning threshold
     */
    public readonly warningThreshold!: pulumi.Output<string>;
    /**
     * Stream alert rule metric window size
     */
    public readonly windowSize!: pulumi.Output<string>;

    /**
     * Create a StreamAlertRule resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: StreamAlertRuleArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: StreamAlertRuleArgs | StreamAlertRuleState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as StreamAlertRuleState | undefined;
            resourceInputs["changeLog"] = state ? state.changeLog : undefined;
            resourceInputs["criticalThreshold"] = state ? state.criticalThreshold : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["enabled"] = state ? state.enabled : undefined;
            resourceInputs["href"] = state ? state.href : undefined;
            resourceInputs["metricName"] = state ? state.metricName : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["operand"] = state ? state.operand : undefined;
            resourceInputs["resourceSelector"] = state ? state.resourceSelector : undefined;
            resourceInputs["state"] = state ? state.state : undefined;
            resourceInputs["streamId"] = state ? state.streamId : undefined;
            resourceInputs["timeouts"] = state ? state.timeouts : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
            resourceInputs["uuid"] = state ? state.uuid : undefined;
            resourceInputs["warningThreshold"] = state ? state.warningThreshold : undefined;
            resourceInputs["windowSize"] = state ? state.windowSize : undefined;
        } else {
            const args = argsOrState as StreamAlertRuleArgs | undefined;
            if ((!args || args.criticalThreshold === undefined) && !opts.urn) {
                throw new Error("Missing required property 'criticalThreshold'");
            }
            if ((!args || args.description === undefined) && !opts.urn) {
                throw new Error("Missing required property 'description'");
            }
            if ((!args || args.metricName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'metricName'");
            }
            if ((!args || args.operand === undefined) && !opts.urn) {
                throw new Error("Missing required property 'operand'");
            }
            if ((!args || args.streamId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'streamId'");
            }
            if ((!args || args.type === undefined) && !opts.urn) {
                throw new Error("Missing required property 'type'");
            }
            if ((!args || args.warningThreshold === undefined) && !opts.urn) {
                throw new Error("Missing required property 'warningThreshold'");
            }
            if ((!args || args.windowSize === undefined) && !opts.urn) {
                throw new Error("Missing required property 'windowSize'");
            }
            resourceInputs["criticalThreshold"] = args ? args.criticalThreshold : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["enabled"] = args ? args.enabled : undefined;
            resourceInputs["metricName"] = args ? args.metricName : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["operand"] = args ? args.operand : undefined;
            resourceInputs["resourceSelector"] = args ? args.resourceSelector : undefined;
            resourceInputs["streamId"] = args ? args.streamId : undefined;
            resourceInputs["timeouts"] = args ? args.timeouts : undefined;
            resourceInputs["type"] = args ? args.type : undefined;
            resourceInputs["warningThreshold"] = args ? args.warningThreshold : undefined;
            resourceInputs["windowSize"] = args ? args.windowSize : undefined;
            resourceInputs["changeLog"] = undefined /*out*/;
            resourceInputs["href"] = undefined /*out*/;
            resourceInputs["state"] = undefined /*out*/;
            resourceInputs["uuid"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(StreamAlertRule.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering StreamAlertRule resources.
 */
export interface StreamAlertRuleState {
    /**
     * Details of the last change on the stream resource
     */
    changeLog?: pulumi.Input<inputs.fabric.StreamAlertRuleChangeLog>;
    /**
     * Stream alert rule metric critical threshold
     */
    criticalThreshold?: pulumi.Input<string>;
    /**
     * Customer-provided stream alert rule description
     */
    description?: pulumi.Input<string>;
    /**
     * Stream alert rule enabled status
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * Equinix assigned URI of the stream alert rule
     */
    href?: pulumi.Input<string>;
    /**
     * Stream alert rule metric name
     */
    metricName?: pulumi.Input<string>;
    /**
     * Customer-provided stream alert rule name
     */
    name?: pulumi.Input<string>;
    /**
     * Stream alert rule metric operand
     */
    operand?: pulumi.Input<string>;
    /**
     * Resource selector for the stream alert rule
     */
    resourceSelector?: pulumi.Input<inputs.fabric.StreamAlertRuleResourceSelector>;
    /**
     * Value representing provisioning status for the stream alert rule
     */
    state?: pulumi.Input<string>;
    /**
     * The stream UUID that contains this alert rule
     */
    streamId?: pulumi.Input<string>;
    timeouts?: pulumi.Input<inputs.fabric.StreamAlertRuleTimeouts>;
    /**
     * Type of the stream alert rule
     */
    type?: pulumi.Input<string>;
    /**
     * Equinix assigned unique identifier for the stream alert rule
     */
    uuid?: pulumi.Input<string>;
    /**
     * Stream alert rule metric warning threshold
     */
    warningThreshold?: pulumi.Input<string>;
    /**
     * Stream alert rule metric window size
     */
    windowSize?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a StreamAlertRule resource.
 */
export interface StreamAlertRuleArgs {
    /**
     * Stream alert rule metric critical threshold
     */
    criticalThreshold: pulumi.Input<string>;
    /**
     * Customer-provided stream alert rule description
     */
    description: pulumi.Input<string>;
    /**
     * Stream alert rule enabled status
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * Stream alert rule metric name
     */
    metricName: pulumi.Input<string>;
    /**
     * Customer-provided stream alert rule name
     */
    name?: pulumi.Input<string>;
    /**
     * Stream alert rule metric operand
     */
    operand: pulumi.Input<string>;
    /**
     * Resource selector for the stream alert rule
     */
    resourceSelector?: pulumi.Input<inputs.fabric.StreamAlertRuleResourceSelector>;
    /**
     * The stream UUID that contains this alert rule
     */
    streamId: pulumi.Input<string>;
    timeouts?: pulumi.Input<inputs.fabric.StreamAlertRuleTimeouts>;
    /**
     * Type of the stream alert rule
     */
    type: pulumi.Input<string>;
    /**
     * Stream alert rule metric warning threshold
     */
    warningThreshold: pulumi.Input<string>;
    /**
     * Stream alert rule metric window size
     */
    windowSize: pulumi.Input<string>;
}
