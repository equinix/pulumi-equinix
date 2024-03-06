// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Fabric V4 API compatible resource allows creation and management of Equinix Fabric connection
 *
 * API documentation can be found here - https://developer.equinix.com/dev-docs/fabric/api-reference/fabric-v4-apis#routing-protocols
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as equinix from "@equinix-labs/pulumi-equinix";
 *
 * const config = new pulumi.Config();
 * const connectionId = config.require("connectionId");
 * const routingProtocol = new equinix.fabric.RoutingProtocol("RoutingProtocol", {
 *     connectionUuid: connectionId,
 *     name: "My-Direct-route-1",
 *     type: "DIRECT",
 *     directIpv4: {
 *         equinixIfaceIp: "192.168.100.1/30",
 *     },
 * });
 * export const routingProtocolId = routingProtocol.id;
 * export const routingProtocolState = routingProtocol.state;
 * export const routingProtocolEquinixAsn = routingProtocol.equinixAsn;
 * ```
 */
export class RoutingProtocol extends pulumi.CustomResource {
    /**
     * Get an existing RoutingProtocol resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: RoutingProtocolState, opts?: pulumi.CustomResourceOptions): RoutingProtocol {
        return new RoutingProtocol(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'equinix:fabric/routingProtocol:RoutingProtocol';

    /**
     * Returns true if the given object is an instance of RoutingProtocol.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is RoutingProtocol {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === RoutingProtocol.__pulumiType;
    }

    /**
     * Bidirectional Forwarding Detection
     */
    public readonly bfd!: pulumi.Output<outputs.fabric.RoutingProtocolBfd | undefined>;
    /**
     * BGP authorization key
     */
    public readonly bgpAuthKey!: pulumi.Output<string | undefined>;
    /**
     * Routing Protocol BGP IPv4
     */
    public readonly bgpIpv4!: pulumi.Output<outputs.fabric.RoutingProtocolBgpIpv4 | undefined>;
    /**
     * Routing Protocol BGP IPv6
     */
    public readonly bgpIpv6!: pulumi.Output<outputs.fabric.RoutingProtocolBgpIpv6 | undefined>;
    /**
     * Captures Routing Protocol lifecycle change information
     */
    public /*out*/ readonly changeLogs!: pulumi.Output<outputs.fabric.RoutingProtocolChangeLog[]>;
    /**
     * Routing Protocol configuration Changes
     */
    public /*out*/ readonly changes!: pulumi.Output<outputs.fabric.RoutingProtocolChange[]>;
    /**
     * Connection URI associated with Routing Protocol
     */
    public readonly connectionUuid!: pulumi.Output<string>;
    /**
     * Customer-provided ASN
     */
    public readonly customerAsn!: pulumi.Output<number | undefined>;
    /**
     * Customer-provided Fabric Routing Protocol description
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Routing Protocol Direct IPv4
     */
    public readonly directIpv4!: pulumi.Output<outputs.fabric.RoutingProtocolDirectIpv4 | undefined>;
    /**
     * Routing Protocol Direct IPv6
     */
    public readonly directIpv6!: pulumi.Output<outputs.fabric.RoutingProtocolDirectIpv6 | undefined>;
    /**
     * Equinix ASN
     */
    public /*out*/ readonly equinixAsn!: pulumi.Output<number>;
    /**
     * Routing Protocol URI information
     */
    public /*out*/ readonly href!: pulumi.Output<string>;
    /**
     * Routing Protocol name. An alpha-numeric 24 characters string which can include only hyphens and underscores
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Routing Protocol type-specific operational data
     */
    public /*out*/ readonly operations!: pulumi.Output<outputs.fabric.RoutingProtocolOperation[]>;
    /**
     * Routing Protocol overall state
     */
    public /*out*/ readonly state!: pulumi.Output<string>;
    /**
     * Defines the routing protocol type like BGP or DIRECT
     */
    public readonly type!: pulumi.Output<string | undefined>;
    /**
     * Equinix-assigned routing protocol identifier
     */
    public readonly uuid!: pulumi.Output<string>;

    /**
     * Create a RoutingProtocol resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: RoutingProtocolArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: RoutingProtocolArgs | RoutingProtocolState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as RoutingProtocolState | undefined;
            resourceInputs["bfd"] = state ? state.bfd : undefined;
            resourceInputs["bgpAuthKey"] = state ? state.bgpAuthKey : undefined;
            resourceInputs["bgpIpv4"] = state ? state.bgpIpv4 : undefined;
            resourceInputs["bgpIpv6"] = state ? state.bgpIpv6 : undefined;
            resourceInputs["changeLogs"] = state ? state.changeLogs : undefined;
            resourceInputs["changes"] = state ? state.changes : undefined;
            resourceInputs["connectionUuid"] = state ? state.connectionUuid : undefined;
            resourceInputs["customerAsn"] = state ? state.customerAsn : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["directIpv4"] = state ? state.directIpv4 : undefined;
            resourceInputs["directIpv6"] = state ? state.directIpv6 : undefined;
            resourceInputs["equinixAsn"] = state ? state.equinixAsn : undefined;
            resourceInputs["href"] = state ? state.href : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["operations"] = state ? state.operations : undefined;
            resourceInputs["state"] = state ? state.state : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
            resourceInputs["uuid"] = state ? state.uuid : undefined;
        } else {
            const args = argsOrState as RoutingProtocolArgs | undefined;
            if ((!args || args.connectionUuid === undefined) && !opts.urn) {
                throw new Error("Missing required property 'connectionUuid'");
            }
            resourceInputs["bfd"] = args ? args.bfd : undefined;
            resourceInputs["bgpAuthKey"] = args ? args.bgpAuthKey : undefined;
            resourceInputs["bgpIpv4"] = args ? args.bgpIpv4 : undefined;
            resourceInputs["bgpIpv6"] = args ? args.bgpIpv6 : undefined;
            resourceInputs["connectionUuid"] = args ? args.connectionUuid : undefined;
            resourceInputs["customerAsn"] = args ? args.customerAsn : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["directIpv4"] = args ? args.directIpv4 : undefined;
            resourceInputs["directIpv6"] = args ? args.directIpv6 : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["type"] = args ? args.type : undefined;
            resourceInputs["uuid"] = args ? args.uuid : undefined;
            resourceInputs["changeLogs"] = undefined /*out*/;
            resourceInputs["changes"] = undefined /*out*/;
            resourceInputs["equinixAsn"] = undefined /*out*/;
            resourceInputs["href"] = undefined /*out*/;
            resourceInputs["operations"] = undefined /*out*/;
            resourceInputs["state"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(RoutingProtocol.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering RoutingProtocol resources.
 */
export interface RoutingProtocolState {
    /**
     * Bidirectional Forwarding Detection
     */
    bfd?: pulumi.Input<inputs.fabric.RoutingProtocolBfd>;
    /**
     * BGP authorization key
     */
    bgpAuthKey?: pulumi.Input<string>;
    /**
     * Routing Protocol BGP IPv4
     */
    bgpIpv4?: pulumi.Input<inputs.fabric.RoutingProtocolBgpIpv4>;
    /**
     * Routing Protocol BGP IPv6
     */
    bgpIpv6?: pulumi.Input<inputs.fabric.RoutingProtocolBgpIpv6>;
    /**
     * Captures Routing Protocol lifecycle change information
     */
    changeLogs?: pulumi.Input<pulumi.Input<inputs.fabric.RoutingProtocolChangeLog>[]>;
    /**
     * Routing Protocol configuration Changes
     */
    changes?: pulumi.Input<pulumi.Input<inputs.fabric.RoutingProtocolChange>[]>;
    /**
     * Connection URI associated with Routing Protocol
     */
    connectionUuid?: pulumi.Input<string>;
    /**
     * Customer-provided ASN
     */
    customerAsn?: pulumi.Input<number>;
    /**
     * Customer-provided Fabric Routing Protocol description
     */
    description?: pulumi.Input<string>;
    /**
     * Routing Protocol Direct IPv4
     */
    directIpv4?: pulumi.Input<inputs.fabric.RoutingProtocolDirectIpv4>;
    /**
     * Routing Protocol Direct IPv6
     */
    directIpv6?: pulumi.Input<inputs.fabric.RoutingProtocolDirectIpv6>;
    /**
     * Equinix ASN
     */
    equinixAsn?: pulumi.Input<number>;
    /**
     * Routing Protocol URI information
     */
    href?: pulumi.Input<string>;
    /**
     * Routing Protocol name. An alpha-numeric 24 characters string which can include only hyphens and underscores
     */
    name?: pulumi.Input<string>;
    /**
     * Routing Protocol type-specific operational data
     */
    operations?: pulumi.Input<pulumi.Input<inputs.fabric.RoutingProtocolOperation>[]>;
    /**
     * Routing Protocol overall state
     */
    state?: pulumi.Input<string>;
    /**
     * Defines the routing protocol type like BGP or DIRECT
     */
    type?: pulumi.Input<string>;
    /**
     * Equinix-assigned routing protocol identifier
     */
    uuid?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a RoutingProtocol resource.
 */
export interface RoutingProtocolArgs {
    /**
     * Bidirectional Forwarding Detection
     */
    bfd?: pulumi.Input<inputs.fabric.RoutingProtocolBfd>;
    /**
     * BGP authorization key
     */
    bgpAuthKey?: pulumi.Input<string>;
    /**
     * Routing Protocol BGP IPv4
     */
    bgpIpv4?: pulumi.Input<inputs.fabric.RoutingProtocolBgpIpv4>;
    /**
     * Routing Protocol BGP IPv6
     */
    bgpIpv6?: pulumi.Input<inputs.fabric.RoutingProtocolBgpIpv6>;
    /**
     * Connection URI associated with Routing Protocol
     */
    connectionUuid: pulumi.Input<string>;
    /**
     * Customer-provided ASN
     */
    customerAsn?: pulumi.Input<number>;
    /**
     * Customer-provided Fabric Routing Protocol description
     */
    description?: pulumi.Input<string>;
    /**
     * Routing Protocol Direct IPv4
     */
    directIpv4?: pulumi.Input<inputs.fabric.RoutingProtocolDirectIpv4>;
    /**
     * Routing Protocol Direct IPv6
     */
    directIpv6?: pulumi.Input<inputs.fabric.RoutingProtocolDirectIpv6>;
    /**
     * Routing Protocol name. An alpha-numeric 24 characters string which can include only hyphens and underscores
     */
    name?: pulumi.Input<string>;
    /**
     * Defines the routing protocol type like BGP or DIRECT
     */
    type?: pulumi.Input<string>;
    /**
     * Equinix-assigned routing protocol identifier
     */
    uuid?: pulumi.Input<string>;
}
