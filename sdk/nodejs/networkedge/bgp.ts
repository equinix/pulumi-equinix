// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Resource `equinix.networkedge.Bgp` allows creation and management of Equinix Network
 * Edge BGP peering configurations.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as equinix from "@equinix/pulumi-equinix";
 *
 * const test = new equinix.networkedge.Bgp("test", {
 *     authenticationKey: "secret",
 *     connectionId: "54014acf-9730-4b55-a791-459283d05fb1",
 *     localAsn: 12345,
 *     localIpAddress: "10.1.1.1/30",
 *     remoteAsn: 66123,
 *     remoteIpAddress: "10.1.1.2",
 * });
 * ```
 *
 * ## Import
 *
 * This resource can be imported using an existing ID
 *
 * ```sh
 *  $ pulumi import equinix:networkedge/bgp:Bgp example {existing_id}
 * ```
 */
export class Bgp extends pulumi.CustomResource {
    /**
     * Get an existing Bgp resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: BgpState, opts?: pulumi.CustomResourceOptions): Bgp {
        return new Bgp(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'equinix:networkedge/bgp:Bgp';

    /**
     * Returns true if the given object is an instance of Bgp.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Bgp {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Bgp.__pulumiType;
    }

    /**
     * shared key used for BGP peer authentication.
     */
    public readonly authenticationKey!: pulumi.Output<string | undefined>;
    /**
     * identifier of a connection established between.
     * network device and remote service provider that will be used for peering.
     */
    public readonly connectionId!: pulumi.Output<string>;
    /**
     * unique identifier of a network device that is a local peer in a given BGP peering
     * configuration.
     */
    public /*out*/ readonly deviceId!: pulumi.Output<string>;
    /**
     * Local ASN number.
     */
    public readonly localAsn!: pulumi.Output<number>;
    /**
     * IP address in CIDR format of a local device.
     */
    public readonly localIpAddress!: pulumi.Output<string>;
    /**
     * BGP peering configuration provisioning status, one of `PROVISIONING`,
     * `PENDING_UPDATE`, `PROVISIONED`, `FAILED`.
     */
    public /*out*/ readonly provisioningStatus!: pulumi.Output<string>;
    /**
     * Remote ASN number.
     */
    public readonly remoteAsn!: pulumi.Output<number>;
    /**
     * IP address of remote peer.
     */
    public readonly remoteIpAddress!: pulumi.Output<string>;
    /**
     * BGP peer state, one of `Idle`, `Connect`, `Active`, `OpenSent`, `OpenConfirm`,
     * `Established`.
     */
    public /*out*/ readonly state!: pulumi.Output<string>;
    /**
     * BGP peering configuration unique identifier.
     */
    public /*out*/ readonly uuid!: pulumi.Output<string>;

    /**
     * Create a Bgp resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: BgpArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: BgpArgs | BgpState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as BgpState | undefined;
            resourceInputs["authenticationKey"] = state ? state.authenticationKey : undefined;
            resourceInputs["connectionId"] = state ? state.connectionId : undefined;
            resourceInputs["deviceId"] = state ? state.deviceId : undefined;
            resourceInputs["localAsn"] = state ? state.localAsn : undefined;
            resourceInputs["localIpAddress"] = state ? state.localIpAddress : undefined;
            resourceInputs["provisioningStatus"] = state ? state.provisioningStatus : undefined;
            resourceInputs["remoteAsn"] = state ? state.remoteAsn : undefined;
            resourceInputs["remoteIpAddress"] = state ? state.remoteIpAddress : undefined;
            resourceInputs["state"] = state ? state.state : undefined;
            resourceInputs["uuid"] = state ? state.uuid : undefined;
        } else {
            const args = argsOrState as BgpArgs | undefined;
            if ((!args || args.connectionId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'connectionId'");
            }
            if ((!args || args.localAsn === undefined) && !opts.urn) {
                throw new Error("Missing required property 'localAsn'");
            }
            if ((!args || args.localIpAddress === undefined) && !opts.urn) {
                throw new Error("Missing required property 'localIpAddress'");
            }
            if ((!args || args.remoteAsn === undefined) && !opts.urn) {
                throw new Error("Missing required property 'remoteAsn'");
            }
            if ((!args || args.remoteIpAddress === undefined) && !opts.urn) {
                throw new Error("Missing required property 'remoteIpAddress'");
            }
            resourceInputs["authenticationKey"] = args ? args.authenticationKey : undefined;
            resourceInputs["connectionId"] = args ? args.connectionId : undefined;
            resourceInputs["localAsn"] = args ? args.localAsn : undefined;
            resourceInputs["localIpAddress"] = args ? args.localIpAddress : undefined;
            resourceInputs["remoteAsn"] = args ? args.remoteAsn : undefined;
            resourceInputs["remoteIpAddress"] = args ? args.remoteIpAddress : undefined;
            resourceInputs["deviceId"] = undefined /*out*/;
            resourceInputs["provisioningStatus"] = undefined /*out*/;
            resourceInputs["state"] = undefined /*out*/;
            resourceInputs["uuid"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Bgp.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Bgp resources.
 */
export interface BgpState {
    /**
     * shared key used for BGP peer authentication.
     */
    authenticationKey?: pulumi.Input<string>;
    /**
     * identifier of a connection established between.
     * network device and remote service provider that will be used for peering.
     */
    connectionId?: pulumi.Input<string>;
    /**
     * unique identifier of a network device that is a local peer in a given BGP peering
     * configuration.
     */
    deviceId?: pulumi.Input<string>;
    /**
     * Local ASN number.
     */
    localAsn?: pulumi.Input<number>;
    /**
     * IP address in CIDR format of a local device.
     */
    localIpAddress?: pulumi.Input<string>;
    /**
     * BGP peering configuration provisioning status, one of `PROVISIONING`,
     * `PENDING_UPDATE`, `PROVISIONED`, `FAILED`.
     */
    provisioningStatus?: pulumi.Input<string>;
    /**
     * Remote ASN number.
     */
    remoteAsn?: pulumi.Input<number>;
    /**
     * IP address of remote peer.
     */
    remoteIpAddress?: pulumi.Input<string>;
    /**
     * BGP peer state, one of `Idle`, `Connect`, `Active`, `OpenSent`, `OpenConfirm`,
     * `Established`.
     */
    state?: pulumi.Input<string>;
    /**
     * BGP peering configuration unique identifier.
     */
    uuid?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Bgp resource.
 */
export interface BgpArgs {
    /**
     * shared key used for BGP peer authentication.
     */
    authenticationKey?: pulumi.Input<string>;
    /**
     * identifier of a connection established between.
     * network device and remote service provider that will be used for peering.
     */
    connectionId: pulumi.Input<string>;
    /**
     * Local ASN number.
     */
    localAsn: pulumi.Input<number>;
    /**
     * IP address in CIDR format of a local device.
     */
    localIpAddress: pulumi.Input<string>;
    /**
     * Remote ASN number.
     */
    remoteAsn: pulumi.Input<number>;
    /**
     * IP address of remote peer.
     */
    remoteIpAddress: pulumi.Input<string>;
}
