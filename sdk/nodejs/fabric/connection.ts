// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

export class Connection extends pulumi.CustomResource {
    /**
     * Get an existing Connection resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ConnectionState, opts?: pulumi.CustomResourceOptions): Connection {
        return new Connection(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'equinix:fabric/connection:Connection';

    /**
     * Returns true if the given object is an instance of Connection.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Connection {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Connection.__pulumiType;
    }

    /**
     * Requester or Customer side connection configuration object of the multi-segment connection
     */
    public readonly aSides!: pulumi.Output<outputs.fabric.ConnectionASide[]>;
    /**
     * Customer account information that is associated with this connection
     */
    public /*out*/ readonly accounts!: pulumi.Output<outputs.fabric.ConnectionAccount[]>;
    /**
     * Connection additional information
     */
    public readonly additionalInfos!: pulumi.Output<outputs.fabric.ConnectionAdditionalInfo[] | undefined>;
    /**
     * Connection bandwidth in Mbps
     */
    public readonly bandwidth!: pulumi.Output<number>;
    /**
     * Captures connection lifecycle change information
     */
    public /*out*/ readonly changeLogs!: pulumi.Output<outputs.fabric.ConnectionChangeLog[]>;
    /**
     * Connection directionality from the requester point of view
     */
    public /*out*/ readonly direction!: pulumi.Output<string>;
    /**
     * Connection URI information
     */
    public /*out*/ readonly href!: pulumi.Output<string>;
    /**
     * Connection property derived from access point locations
     */
    public /*out*/ readonly isRemote!: pulumi.Output<boolean>;
    /**
     * Connection name. An alpha-numeric 24 characters string which can include only hyphens and underscores
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Preferences for notifications on connection configuration or status changes
     */
    public readonly notifications!: pulumi.Output<outputs.fabric.ConnectionNotification[]>;
    /**
     * Connection type-specific operational data
     */
    public /*out*/ readonly operations!: pulumi.Output<outputs.fabric.ConnectionOperation[]>;
    /**
     * Order related to this connection information
     */
    public readonly orders!: pulumi.Output<outputs.fabric.ConnectionOrder[] | undefined>;
    /**
     * Project information
     */
    public readonly projects!: pulumi.Output<outputs.fabric.ConnectionProject[] | undefined>;
    /**
     * Redundancy Information
     */
    public readonly redundancies!: pulumi.Output<outputs.fabric.ConnectionRedundancy[] | undefined>;
    /**
     * Connection overall state
     */
    public /*out*/ readonly state!: pulumi.Output<string>;
    /**
     * Defines the connection type like VG*VC, EVPL*VC, EPL*VC, EC*VC, GW*VC, ACCESS*EPL_VC
     */
    public readonly type!: pulumi.Output<string>;
    /**
     * Destination or Provider side connection configuration object of the multi-segment connection
     */
    public readonly zSides!: pulumi.Output<outputs.fabric.ConnectionZSide[]>;

    /**
     * Create a Connection resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ConnectionArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ConnectionArgs | ConnectionState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ConnectionState | undefined;
            resourceInputs["aSides"] = state ? state.aSides : undefined;
            resourceInputs["accounts"] = state ? state.accounts : undefined;
            resourceInputs["additionalInfos"] = state ? state.additionalInfos : undefined;
            resourceInputs["bandwidth"] = state ? state.bandwidth : undefined;
            resourceInputs["changeLogs"] = state ? state.changeLogs : undefined;
            resourceInputs["direction"] = state ? state.direction : undefined;
            resourceInputs["href"] = state ? state.href : undefined;
            resourceInputs["isRemote"] = state ? state.isRemote : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["notifications"] = state ? state.notifications : undefined;
            resourceInputs["operations"] = state ? state.operations : undefined;
            resourceInputs["orders"] = state ? state.orders : undefined;
            resourceInputs["projects"] = state ? state.projects : undefined;
            resourceInputs["redundancies"] = state ? state.redundancies : undefined;
            resourceInputs["state"] = state ? state.state : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
            resourceInputs["zSides"] = state ? state.zSides : undefined;
        } else {
            const args = argsOrState as ConnectionArgs | undefined;
            if ((!args || args.aSides === undefined) && !opts.urn) {
                throw new Error("Missing required property 'aSides'");
            }
            if ((!args || args.bandwidth === undefined) && !opts.urn) {
                throw new Error("Missing required property 'bandwidth'");
            }
            if ((!args || args.notifications === undefined) && !opts.urn) {
                throw new Error("Missing required property 'notifications'");
            }
            if ((!args || args.type === undefined) && !opts.urn) {
                throw new Error("Missing required property 'type'");
            }
            if ((!args || args.zSides === undefined) && !opts.urn) {
                throw new Error("Missing required property 'zSides'");
            }
            resourceInputs["aSides"] = args ? args.aSides : undefined;
            resourceInputs["additionalInfos"] = args ? args.additionalInfos : undefined;
            resourceInputs["bandwidth"] = args ? args.bandwidth : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["notifications"] = args ? args.notifications : undefined;
            resourceInputs["orders"] = args ? args.orders : undefined;
            resourceInputs["projects"] = args ? args.projects : undefined;
            resourceInputs["redundancies"] = args ? args.redundancies : undefined;
            resourceInputs["type"] = args ? args.type : undefined;
            resourceInputs["zSides"] = args ? args.zSides : undefined;
            resourceInputs["accounts"] = undefined /*out*/;
            resourceInputs["changeLogs"] = undefined /*out*/;
            resourceInputs["direction"] = undefined /*out*/;
            resourceInputs["href"] = undefined /*out*/;
            resourceInputs["isRemote"] = undefined /*out*/;
            resourceInputs["operations"] = undefined /*out*/;
            resourceInputs["state"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Connection.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Connection resources.
 */
export interface ConnectionState {
    /**
     * Requester or Customer side connection configuration object of the multi-segment connection
     */
    aSides?: pulumi.Input<pulumi.Input<inputs.fabric.ConnectionASide>[]>;
    /**
     * Customer account information that is associated with this connection
     */
    accounts?: pulumi.Input<pulumi.Input<inputs.fabric.ConnectionAccount>[]>;
    /**
     * Connection additional information
     */
    additionalInfos?: pulumi.Input<pulumi.Input<inputs.fabric.ConnectionAdditionalInfo>[]>;
    /**
     * Connection bandwidth in Mbps
     */
    bandwidth?: pulumi.Input<number>;
    /**
     * Captures connection lifecycle change information
     */
    changeLogs?: pulumi.Input<pulumi.Input<inputs.fabric.ConnectionChangeLog>[]>;
    /**
     * Connection directionality from the requester point of view
     */
    direction?: pulumi.Input<string>;
    /**
     * Connection URI information
     */
    href?: pulumi.Input<string>;
    /**
     * Connection property derived from access point locations
     */
    isRemote?: pulumi.Input<boolean>;
    /**
     * Connection name. An alpha-numeric 24 characters string which can include only hyphens and underscores
     */
    name?: pulumi.Input<string>;
    /**
     * Preferences for notifications on connection configuration or status changes
     */
    notifications?: pulumi.Input<pulumi.Input<inputs.fabric.ConnectionNotification>[]>;
    /**
     * Connection type-specific operational data
     */
    operations?: pulumi.Input<pulumi.Input<inputs.fabric.ConnectionOperation>[]>;
    /**
     * Order related to this connection information
     */
    orders?: pulumi.Input<pulumi.Input<inputs.fabric.ConnectionOrder>[]>;
    /**
     * Project information
     */
    projects?: pulumi.Input<pulumi.Input<inputs.fabric.ConnectionProject>[]>;
    /**
     * Redundancy Information
     */
    redundancies?: pulumi.Input<pulumi.Input<inputs.fabric.ConnectionRedundancy>[]>;
    /**
     * Connection overall state
     */
    state?: pulumi.Input<string>;
    /**
     * Defines the connection type like VG*VC, EVPL*VC, EPL*VC, EC*VC, GW*VC, ACCESS*EPL_VC
     */
    type?: pulumi.Input<string | enums.fabric.ConnectionType>;
    /**
     * Destination or Provider side connection configuration object of the multi-segment connection
     */
    zSides?: pulumi.Input<pulumi.Input<inputs.fabric.ConnectionZSide>[]>;
}

/**
 * The set of arguments for constructing a Connection resource.
 */
export interface ConnectionArgs {
    /**
     * Requester or Customer side connection configuration object of the multi-segment connection
     */
    aSides: pulumi.Input<pulumi.Input<inputs.fabric.ConnectionASide>[]>;
    /**
     * Connection additional information
     */
    additionalInfos?: pulumi.Input<pulumi.Input<inputs.fabric.ConnectionAdditionalInfo>[]>;
    /**
     * Connection bandwidth in Mbps
     */
    bandwidth: pulumi.Input<number>;
    /**
     * Connection name. An alpha-numeric 24 characters string which can include only hyphens and underscores
     */
    name?: pulumi.Input<string>;
    /**
     * Preferences for notifications on connection configuration or status changes
     */
    notifications: pulumi.Input<pulumi.Input<inputs.fabric.ConnectionNotification>[]>;
    /**
     * Order related to this connection information
     */
    orders?: pulumi.Input<pulumi.Input<inputs.fabric.ConnectionOrder>[]>;
    /**
     * Project information
     */
    projects?: pulumi.Input<pulumi.Input<inputs.fabric.ConnectionProject>[]>;
    /**
     * Redundancy Information
     */
    redundancies?: pulumi.Input<pulumi.Input<inputs.fabric.ConnectionRedundancy>[]>;
    /**
     * Defines the connection type like VG*VC, EVPL*VC, EPL*VC, EC*VC, GW*VC, ACCESS*EPL_VC
     */
    type: pulumi.Input<string | enums.fabric.ConnectionType>;
    /**
     * Destination or Provider side connection configuration object of the multi-segment connection
     */
    zSides: pulumi.Input<pulumi.Input<inputs.fabric.ConnectionZSide>[]>;
}
