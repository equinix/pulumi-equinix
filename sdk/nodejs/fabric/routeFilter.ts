// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Fabric V4 API compatible resource allows creation and management of Equinix Fabric Route Filter Policy
 *
 * Additional Documentation:
 * * Getting Started: https://docs.equinix.com/en-us/Content/Interconnection/FCR/FCR-route-filters.htm
 * * API: https://developer.equinix.com/dev-docs/fabric/api-reference/fabric-v4-apis#route-filters
 */
export class RouteFilter extends pulumi.CustomResource {
    /**
     * Get an existing RouteFilter resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: RouteFilterState, opts?: pulumi.CustomResourceOptions): RouteFilter {
        return new RouteFilter(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'equinix:fabric/routeFilter:RouteFilter';

    /**
     * Returns true if the given object is an instance of RouteFilter.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is RouteFilter {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === RouteFilter.__pulumiType;
    }

    public /*out*/ readonly changeLogs!: pulumi.Output<outputs.fabric.RouteFilterChangeLog[]>;
    /**
     * An object with the details of the previous change applied on the Route Filter
     */
    public /*out*/ readonly changes!: pulumi.Output<outputs.fabric.RouteFilterChange[]>;
    /**
     * The number of Fabric Connections that this Route Filter is attached to
     */
    public /*out*/ readonly connectionsCount!: pulumi.Output<number>;
    /**
     * Optional description to add to the Route Filter you will be creating
     */
    public readonly description!: pulumi.Output<string>;
    /**
     * Route filter URI
     */
    public /*out*/ readonly href!: pulumi.Output<string>;
    /**
     * Name of the Route Filter
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The action that will be taken on ip ranges that don't match the rules present within the Route Filter
     */
    public /*out*/ readonly notMatchedRuleAction!: pulumi.Output<string>;
    /**
     * The Project object that contains projectId and href that is related to the Fabric Project containing connections the Route Filter can be attached to
     */
    public readonly project!: pulumi.Output<outputs.fabric.RouteFilterProject>;
    /**
     * The number of Route Filter Rules attached to this Route Filter
     */
    public /*out*/ readonly rulesCount!: pulumi.Output<number>;
    /**
     * State of the Route Filter in its lifecycle
     */
    public /*out*/ readonly state!: pulumi.Output<string>;
    /**
     * Route Filter Type. One of [ "BGP*IPv4*PREFIX*FILTER", "BGP*IPv6*PREFIX*FILTER" ]
     */
    public readonly type!: pulumi.Output<string>;
    /**
     * Equinix Assigned ID for Route Filter
     */
    public /*out*/ readonly uuid!: pulumi.Output<string>;

    /**
     * Create a RouteFilter resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: RouteFilterArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: RouteFilterArgs | RouteFilterState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as RouteFilterState | undefined;
            resourceInputs["changeLogs"] = state ? state.changeLogs : undefined;
            resourceInputs["changes"] = state ? state.changes : undefined;
            resourceInputs["connectionsCount"] = state ? state.connectionsCount : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["href"] = state ? state.href : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["notMatchedRuleAction"] = state ? state.notMatchedRuleAction : undefined;
            resourceInputs["project"] = state ? state.project : undefined;
            resourceInputs["rulesCount"] = state ? state.rulesCount : undefined;
            resourceInputs["state"] = state ? state.state : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
            resourceInputs["uuid"] = state ? state.uuid : undefined;
        } else {
            const args = argsOrState as RouteFilterArgs | undefined;
            if ((!args || args.project === undefined) && !opts.urn) {
                throw new Error("Missing required property 'project'");
            }
            if ((!args || args.type === undefined) && !opts.urn) {
                throw new Error("Missing required property 'type'");
            }
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["project"] = args ? args.project : undefined;
            resourceInputs["type"] = args ? args.type : undefined;
            resourceInputs["changeLogs"] = undefined /*out*/;
            resourceInputs["changes"] = undefined /*out*/;
            resourceInputs["connectionsCount"] = undefined /*out*/;
            resourceInputs["href"] = undefined /*out*/;
            resourceInputs["notMatchedRuleAction"] = undefined /*out*/;
            resourceInputs["rulesCount"] = undefined /*out*/;
            resourceInputs["state"] = undefined /*out*/;
            resourceInputs["uuid"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(RouteFilter.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering RouteFilter resources.
 */
export interface RouteFilterState {
    changeLogs?: pulumi.Input<pulumi.Input<inputs.fabric.RouteFilterChangeLog>[]>;
    /**
     * An object with the details of the previous change applied on the Route Filter
     */
    changes?: pulumi.Input<pulumi.Input<inputs.fabric.RouteFilterChange>[]>;
    /**
     * The number of Fabric Connections that this Route Filter is attached to
     */
    connectionsCount?: pulumi.Input<number>;
    /**
     * Optional description to add to the Route Filter you will be creating
     */
    description?: pulumi.Input<string>;
    /**
     * Route filter URI
     */
    href?: pulumi.Input<string>;
    /**
     * Name of the Route Filter
     */
    name?: pulumi.Input<string>;
    /**
     * The action that will be taken on ip ranges that don't match the rules present within the Route Filter
     */
    notMatchedRuleAction?: pulumi.Input<string>;
    /**
     * The Project object that contains projectId and href that is related to the Fabric Project containing connections the Route Filter can be attached to
     */
    project?: pulumi.Input<inputs.fabric.RouteFilterProject>;
    /**
     * The number of Route Filter Rules attached to this Route Filter
     */
    rulesCount?: pulumi.Input<number>;
    /**
     * State of the Route Filter in its lifecycle
     */
    state?: pulumi.Input<string>;
    /**
     * Route Filter Type. One of [ "BGP*IPv4*PREFIX*FILTER", "BGP*IPv6*PREFIX*FILTER" ]
     */
    type?: pulumi.Input<string>;
    /**
     * Equinix Assigned ID for Route Filter
     */
    uuid?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a RouteFilter resource.
 */
export interface RouteFilterArgs {
    /**
     * Optional description to add to the Route Filter you will be creating
     */
    description?: pulumi.Input<string>;
    /**
     * Name of the Route Filter
     */
    name?: pulumi.Input<string>;
    /**
     * The Project object that contains projectId and href that is related to the Fabric Project containing connections the Route Filter can be attached to
     */
    project: pulumi.Input<inputs.fabric.RouteFilterProject>;
    /**
     * Route Filter Type. One of [ "BGP*IPv4*PREFIX*FILTER", "BGP*IPv6*PREFIX*FILTER" ]
     */
    type: pulumi.Input<string>;
}