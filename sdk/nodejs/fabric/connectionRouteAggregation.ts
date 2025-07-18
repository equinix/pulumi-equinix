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
 * const policyAttachment = new equinix.fabric.ConnectionRouteAggregation("policyAttachment", {
 *     routeAggregationId: "<route_aggregation_id>",
 *     connectionId: "<connection_id>",
 * });
 * export const connectionRouteAggregationId = policyAttachment.id;
 * export const connectionRouteAggregationConnectionId = policyAttachment.connectionId;
 * export const connectionRouteAggregationType = policyAttachment.type;
 * export const connectionRouteAggregationAttachmentStatus = policyAttachment.attachmentStatus;
 * ```
 */
export class ConnectionRouteAggregation extends pulumi.CustomResource {
    /**
     * Get an existing ConnectionRouteAggregation resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ConnectionRouteAggregationState, opts?: pulumi.CustomResourceOptions): ConnectionRouteAggregation {
        return new ConnectionRouteAggregation(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'equinix:fabric/connectionRouteAggregation:ConnectionRouteAggregation';

    /**
     * Returns true if the given object is an instance of ConnectionRouteAggregation.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ConnectionRouteAggregation {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ConnectionRouteAggregation.__pulumiType;
    }

    /**
     * Status of the Route Aggregation Policy attachment lifecycle
     */
    public /*out*/ readonly attachmentStatus!: pulumi.Output<string>;
    /**
     * Equinix Assigned UUID of the Equinix Connection to attach the Route Aggregation Policy to
     */
    public readonly connectionId!: pulumi.Output<string>;
    /**
     * URI to the attached Route Aggregation Policy on the Connection
     */
    public /*out*/ readonly href!: pulumi.Output<string>;
    /**
     * UUID of the Route Aggregation to apply this Rule to
     */
    public readonly routeAggregationId!: pulumi.Output<string>;
    public readonly timeouts!: pulumi.Output<outputs.fabric.ConnectionRouteAggregationTimeouts | undefined>;
    /**
     * Route Aggregation Type. One of ["BGP*IPv4*PREFIX_AGGREGATION"]
     */
    public /*out*/ readonly type!: pulumi.Output<string>;
    /**
     * Equinix Assigned ID for Route Aggregation Policy
     */
    public /*out*/ readonly uuid!: pulumi.Output<string>;

    /**
     * Create a ConnectionRouteAggregation resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ConnectionRouteAggregationArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ConnectionRouteAggregationArgs | ConnectionRouteAggregationState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ConnectionRouteAggregationState | undefined;
            resourceInputs["attachmentStatus"] = state ? state.attachmentStatus : undefined;
            resourceInputs["connectionId"] = state ? state.connectionId : undefined;
            resourceInputs["href"] = state ? state.href : undefined;
            resourceInputs["routeAggregationId"] = state ? state.routeAggregationId : undefined;
            resourceInputs["timeouts"] = state ? state.timeouts : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
            resourceInputs["uuid"] = state ? state.uuid : undefined;
        } else {
            const args = argsOrState as ConnectionRouteAggregationArgs | undefined;
            if ((!args || args.connectionId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'connectionId'");
            }
            if ((!args || args.routeAggregationId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'routeAggregationId'");
            }
            resourceInputs["connectionId"] = args ? args.connectionId : undefined;
            resourceInputs["routeAggregationId"] = args ? args.routeAggregationId : undefined;
            resourceInputs["timeouts"] = args ? args.timeouts : undefined;
            resourceInputs["attachmentStatus"] = undefined /*out*/;
            resourceInputs["href"] = undefined /*out*/;
            resourceInputs["type"] = undefined /*out*/;
            resourceInputs["uuid"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ConnectionRouteAggregation.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ConnectionRouteAggregation resources.
 */
export interface ConnectionRouteAggregationState {
    /**
     * Status of the Route Aggregation Policy attachment lifecycle
     */
    attachmentStatus?: pulumi.Input<string>;
    /**
     * Equinix Assigned UUID of the Equinix Connection to attach the Route Aggregation Policy to
     */
    connectionId?: pulumi.Input<string>;
    /**
     * URI to the attached Route Aggregation Policy on the Connection
     */
    href?: pulumi.Input<string>;
    /**
     * UUID of the Route Aggregation to apply this Rule to
     */
    routeAggregationId?: pulumi.Input<string>;
    timeouts?: pulumi.Input<inputs.fabric.ConnectionRouteAggregationTimeouts>;
    /**
     * Route Aggregation Type. One of ["BGP*IPv4*PREFIX_AGGREGATION"]
     */
    type?: pulumi.Input<string>;
    /**
     * Equinix Assigned ID for Route Aggregation Policy
     */
    uuid?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ConnectionRouteAggregation resource.
 */
export interface ConnectionRouteAggregationArgs {
    /**
     * Equinix Assigned UUID of the Equinix Connection to attach the Route Aggregation Policy to
     */
    connectionId: pulumi.Input<string>;
    /**
     * UUID of the Route Aggregation to apply this Rule to
     */
    routeAggregationId: pulumi.Input<string>;
    timeouts?: pulumi.Input<inputs.fabric.ConnectionRouteAggregationTimeouts>;
}
