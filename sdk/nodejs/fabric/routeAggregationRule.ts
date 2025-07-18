// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Fabric V4 API compatible resource allows creation and management of Equinix Fabric Route Aggregation
 *
 * Additional Documentation:
 * * API: https://developer.equinix.com/catalog/fabricv4#tag/Route-Aggregations
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as equinix from "@equinix-labs/pulumi-equinix";
 *
 * const raRule = new equinix.fabric.RouteAggregationRule("raRule", {
 *     routeAggregationId: "<route_aggregation_id>",
 *     description: "Route aggregation rule",
 *     prefix: "192.168.0.0/24",
 * });
 * export const routeAggregationRuleName = raRule.name;
 * export const routeAggregationRuleDescription = raRule.description;
 * export const routeAggregationRuleType = raRule.type;
 * export const routeAggregationRulePrefix = raRule.prefix;
 * export const routeAggregationRuleState = raRule.state;
 * ```
 */
export class RouteAggregationRule extends pulumi.CustomResource {
    /**
     * Get an existing RouteAggregationRule resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: RouteAggregationRuleState, opts?: pulumi.CustomResourceOptions): RouteAggregationRule {
        return new RouteAggregationRule(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'equinix:fabric/routeAggregationRule:RouteAggregationRule';

    /**
     * Returns true if the given object is an instance of RouteAggregationRule.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is RouteAggregationRule {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === RouteAggregationRule.__pulumiType;
    }

    /**
     * Current state of latest route aggregation rule change
     */
    public /*out*/ readonly change!: pulumi.Output<outputs.fabric.RouteAggregationRuleChange>;
    /**
     * Details of the last change on the stream resource
     */
    public /*out*/ readonly changeLog!: pulumi.Output<outputs.fabric.RouteAggregationRuleChangeLog>;
    /**
     * Customer-provided route aggregation rule description
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Equinix auto generated URI to the route aggregation rule resource
     */
    public /*out*/ readonly href!: pulumi.Output<string>;
    /**
     * Customer provided name of the route aggregation rule
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Customer-provided route aggregation rule prefix
     */
    public readonly prefix!: pulumi.Output<string>;
    /**
     * UUID of the Route Aggregation to apply this Rule to
     */
    public readonly routeAggregationId!: pulumi.Output<string>;
    /**
     * Value representing provisioning status for the route aggregation rule resource
     */
    public /*out*/ readonly state!: pulumi.Output<string>;
    public readonly timeouts!: pulumi.Output<outputs.fabric.RouteAggregationRuleTimeouts | undefined>;
    /**
     * Equinix defined Route Aggregation Type; BGP*IPv4*PREFIX*AGGREGATION, BGP*IPv6*PREFIX*AGGREGATION
     */
    public /*out*/ readonly type!: pulumi.Output<string>;
    /**
     * Equinix-assigned unique id for the route aggregation rule resource
     */
    public /*out*/ readonly uuid!: pulumi.Output<string>;

    /**
     * Create a RouteAggregationRule resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: RouteAggregationRuleArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: RouteAggregationRuleArgs | RouteAggregationRuleState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as RouteAggregationRuleState | undefined;
            resourceInputs["change"] = state ? state.change : undefined;
            resourceInputs["changeLog"] = state ? state.changeLog : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["href"] = state ? state.href : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["prefix"] = state ? state.prefix : undefined;
            resourceInputs["routeAggregationId"] = state ? state.routeAggregationId : undefined;
            resourceInputs["state"] = state ? state.state : undefined;
            resourceInputs["timeouts"] = state ? state.timeouts : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
            resourceInputs["uuid"] = state ? state.uuid : undefined;
        } else {
            const args = argsOrState as RouteAggregationRuleArgs | undefined;
            if ((!args || args.prefix === undefined) && !opts.urn) {
                throw new Error("Missing required property 'prefix'");
            }
            if ((!args || args.routeAggregationId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'routeAggregationId'");
            }
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["prefix"] = args ? args.prefix : undefined;
            resourceInputs["routeAggregationId"] = args ? args.routeAggregationId : undefined;
            resourceInputs["timeouts"] = args ? args.timeouts : undefined;
            resourceInputs["change"] = undefined /*out*/;
            resourceInputs["changeLog"] = undefined /*out*/;
            resourceInputs["href"] = undefined /*out*/;
            resourceInputs["state"] = undefined /*out*/;
            resourceInputs["type"] = undefined /*out*/;
            resourceInputs["uuid"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(RouteAggregationRule.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering RouteAggregationRule resources.
 */
export interface RouteAggregationRuleState {
    /**
     * Current state of latest route aggregation rule change
     */
    change?: pulumi.Input<inputs.fabric.RouteAggregationRuleChange>;
    /**
     * Details of the last change on the stream resource
     */
    changeLog?: pulumi.Input<inputs.fabric.RouteAggregationRuleChangeLog>;
    /**
     * Customer-provided route aggregation rule description
     */
    description?: pulumi.Input<string>;
    /**
     * Equinix auto generated URI to the route aggregation rule resource
     */
    href?: pulumi.Input<string>;
    /**
     * Customer provided name of the route aggregation rule
     */
    name?: pulumi.Input<string>;
    /**
     * Customer-provided route aggregation rule prefix
     */
    prefix?: pulumi.Input<string>;
    /**
     * UUID of the Route Aggregation to apply this Rule to
     */
    routeAggregationId?: pulumi.Input<string>;
    /**
     * Value representing provisioning status for the route aggregation rule resource
     */
    state?: pulumi.Input<string>;
    timeouts?: pulumi.Input<inputs.fabric.RouteAggregationRuleTimeouts>;
    /**
     * Equinix defined Route Aggregation Type; BGP*IPv4*PREFIX*AGGREGATION, BGP*IPv6*PREFIX*AGGREGATION
     */
    type?: pulumi.Input<string>;
    /**
     * Equinix-assigned unique id for the route aggregation rule resource
     */
    uuid?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a RouteAggregationRule resource.
 */
export interface RouteAggregationRuleArgs {
    /**
     * Customer-provided route aggregation rule description
     */
    description?: pulumi.Input<string>;
    /**
     * Customer provided name of the route aggregation rule
     */
    name?: pulumi.Input<string>;
    /**
     * Customer-provided route aggregation rule prefix
     */
    prefix: pulumi.Input<string>;
    /**
     * UUID of the Route Aggregation to apply this Rule to
     */
    routeAggregationId: pulumi.Input<string>;
    timeouts?: pulumi.Input<inputs.fabric.RouteAggregationRuleTimeouts>;
}
