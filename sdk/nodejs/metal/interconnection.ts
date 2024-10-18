// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Use this resource to request the creation an Interconnection asset to connect with other parties using [Equinix Fabric - software-defined interconnections](https://metal.equinix.com/developers/docs/networking/fabric/).
 *
 * ## Example Usage
 * ### example fabric billed metal from fabric port
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as equinix from "@equinix-labs/pulumi-equinix";
 *
 * const aSide = equinix.fabric.getPortsOutput({
 *     filter: {
 *         name: "<name_of_port||port_prefix>",
 *     },
 * });
 * const example = new equinix.metal.Vlan("example", {
 *     projectId: "<metal_project_id>",
 *     metro: "FR",
 * });
 * const exampleInterconnection = new equinix.metal.Interconnection("exampleInterconnection", {
 *     name: "tf-metal-from-port",
 *     projectId: "<metal_project_id>",
 *     type: "shared",
 *     redundancy: "primary",
 *     metro: "FR",
 *     speed: "200Mbps",
 *     serviceTokenType: "z_side",
 *     contactEmail: "username@example.com",
 *     vlans: [example.vxlan],
 * });
 * const exampleConnection = new equinix.fabric.Connection("exampleConnection", {
 *     name: "tf-metal-from-port",
 *     type: equinix.fabric.ConnectionType.EVPL,
 *     bandwidth: 200,
 *     notifications: [{
 *         type: equinix.fabric.NotificationsType.All,
 *         emails: ["username@example.com"],
 *     }],
 *     order: {
 *         purchaseOrderNumber: "1-323292",
 *     },
 *     project: {
 *         projectId: "<fabric_project_id>",
 *     },
 *     aSide: {
 *         accessPoint: {
 *             type: equinix.fabric.AccessPointType.Colo,
 *             port: {
 *                 uuid: aSide.apply(aSide => aSide.data?.[0]?.uuid),
 *             },
 *             linkProtocol: {
 *                 type: equinix.fabric.AccessPointLinkProtocolType.Dot1q,
 *                 vlanTag: 1234,
 *             },
 *         },
 *     },
 *     zSide: {
 *         serviceToken: {
 *             uuid: exampleInterconnection.serviceTokens.apply(serviceTokens => serviceTokens[0].id),
 *         },
 *     },
 * });
 * ```
 * ### example fabric billed metal from fcr
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as equinix from "@equinix-labs/pulumi-equinix";
 *
 * const example1 = new equinix.metal.Vlan("example1", {
 *     projectId: "<metal_project_id>",
 *     metro: "SV",
 * });
 * const example = new equinix.metal.Interconnection("example", {
 *     name: "tf-metal-from-fcr",
 *     projectId: "<metal_project_id>",
 *     metro: "SV",
 *     redundancy: "primary",
 *     type: "shared_port_vlan",
 *     contactEmail: "username@example.com",
 *     speed: "200Mbps",
 *     vlans: [example1.vxlan],
 * });
 * const exampleConnection = new equinix.fabric.Connection("exampleConnection", {
 *     name: "tf-metal-from-fcr",
 *     type: "IP_VC",
 *     bandwidth: 200,
 *     notifications: [{
 *         type: equinix.fabric.NotificationsType.All,
 *         emails: ["username@example.com"],
 *     }],
 *     project: {
 *         projectId: "<fabric_project_id>",
 *     },
 *     aSide: {
 *         accessPoint: {
 *             type: "CLOUD_ROUTER",
 *             router: {
 *                 uuid: exampleEquinixFabricCloudRouter.id,
 *             },
 *         },
 *     },
 *     zSide: {
 *         accessPoint: {
 *             type: "METAL_NETWORK",
 *             authenticationKey: example.authorizationCode,
 *         },
 *     },
 * });
 * ```
 * ### example fabric billed metal from network edge
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as equinix from "@equinix-labs/pulumi-equinix";
 *
 * const example = new equinix.metal.Vrf("example", {
 *     name: "tf-metal-from-ne",
 *     metro: "FR",
 *     localAsn: 65001,
 *     ipRanges: ["10.99.1.0/24"],
 *     projectId: test.id,
 * });
 * const exampleInterconnection = new equinix.metal.Interconnection("exampleInterconnection", {
 *     name: "tf-metal-from-ne",
 *     projectId: "<metal_project_id>",
 *     type: "shared",
 *     redundancy: "primary",
 *     metro: "FR",
 *     speed: "200Mbps",
 *     serviceTokenType: "z_side",
 *     contactEmail: "username@example.com",
 *     vrfs: [example.vxlan],
 * });
 * const exampleConnection = new equinix.fabric.Connection("exampleConnection", {
 *     name: "tf-metal-from-ne",
 *     type: equinix.fabric.ConnectionType.EVPL,
 *     bandwidth: 200,
 *     notifications: [{
 *         type: equinix.fabric.NotificationsType.All,
 *         emails: ["username@example.com"],
 *     }],
 *     order: {
 *         purchaseOrderNumber: "1-323292",
 *     },
 *     project: {
 *         projectId: "<fabric_project_id>",
 *     },
 *     aSide: {
 *         accessPoint: {
 *             type: equinix.fabric.AccessPointType.VD,
 *             virtualDevice: {
 *                 type: "EDGE",
 *                 uuid: exampleEquinixNetworkDevice.id,
 *             },
 *         },
 *     },
 *     zSide: {
 *         serviceToken: {
 *             uuid: exampleInterconnection.serviceTokens.apply(serviceTokens => serviceTokens[0].id),
 *         },
 *     },
 * });
 * ```
 * ### example metal billed metal to fabric port
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as equinix from "@equinix-labs/pulumi-equinix";
 *
 * const aSide = equinix.fabric.getPortsOutput({
 *     filter: {
 *         name: "<name_of_port||port_prefix>",
 *     },
 * });
 * const example = new equinix.metal.Interconnection("example", {
 *     name: "tf-metal-2-port",
 *     projectId: "<metal_project_id>",
 *     type: "shared",
 *     redundancy: "redundant",
 *     metro: "FR",
 *     speed: "1Gbps",
 *     serviceTokenType: "a_side",
 *     contactEmail: "username@example.com",
 * });
 * const exampleConnection = new equinix.fabric.Connection("exampleConnection", {
 *     name: "tf-metal-2-port",
 *     type: equinix.fabric.ConnectionType.EVPL,
 *     notifications: [{
 *         type: equinix.fabric.NotificationsType.All,
 *         emails: ["username@example.com"],
 *     }],
 *     project: {
 *         projectId: "<fabric_project_id>",
 *     },
 *     bandwidth: 100,
 *     order: {
 *         purchaseOrderNumber: "1-323292",
 *     },
 *     aSide: {
 *         serviceToken: {
 *             uuid: example.serviceTokens.apply(serviceTokens => serviceTokens[0].id),
 *         },
 *     },
 *     zSide: {
 *         accessPoint: {
 *             type: equinix.fabric.AccessPointType.Colo,
 *             port: {
 *                 uuid: aSide.apply(aSide => aSide.data?.[0]?.uuid),
 *             },
 *             linkProtocol: {
 *                 type: equinix.fabric.AccessPointLinkProtocolType.Dot1q,
 *                 vlanTag: 1234,
 *             },
 *         },
 *     },
 * });
 * ```
 */
export class Interconnection extends pulumi.CustomResource {
    /**
     * Get an existing Interconnection resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: InterconnectionState, opts?: pulumi.CustomResourceOptions): Interconnection {
        return new Interconnection(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'equinix:metal/interconnection:Interconnection';

    /**
     * Returns true if the given object is an instance of Interconnection.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Interconnection {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Interconnection.__pulumiType;
    }

    /**
     * Only used with Fabric Shared connection. Fabric uses this token to be able to give more detailed information about the Metal end of the network, when viewing resources from within Fabric.
     */
    public /*out*/ readonly authorizationCode!: pulumi.Output<string>;
    /**
     * The preferred email used for communication and notifications about the Equinix Fabric interconnection
     */
    public readonly contactEmail!: pulumi.Output<string>;
    /**
     * Description of the connection resource
     */
    public readonly description!: pulumi.Output<string>;
    /**
     * Facility where the connection will be created
     *
     * @deprecated Use metro instead of facility. For more information, read the migration guide.
     */
    public readonly facility!: pulumi.Output<string>;
    /**
     * Metro where the connection will be created
     */
    public readonly metro!: pulumi.Output<string>;
    /**
     * Mode for connections in IBX facilities with the dedicated type - standard or tunnel
     */
    public readonly mode!: pulumi.Output<string>;
    /**
     * Name of the connection resource
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * ID of the organization responsible for the connection. Applicable with type "dedicated"
     */
    public readonly organizationId!: pulumi.Output<string>;
    /**
     * List of connection ports - primary (`ports[0]`) and secondary (`ports[1]`)
     */
    public /*out*/ readonly ports!: pulumi.Output<outputs.metal.InterconnectionPort[]>;
    /**
     * ID of the project where the connection is scoped to. Required with type "shared"
     */
    public readonly projectId!: pulumi.Output<string | undefined>;
    /**
     * Connection redundancy - redundant or primary
     */
    public readonly redundancy!: pulumi.Output<string>;
    /**
     * Only used with shared connection. Type of service token to use for the connection, a*side or z*side
     */
    public readonly serviceTokenType!: pulumi.Output<string | undefined>;
    /**
     * Only used with shared connection. List of service tokens required to continue the setup process with equinix*fabric*connection or from the [Equinix Fabric Portal](https://fabric.equinix.com/dashboard)
     */
    public /*out*/ readonly serviceTokens!: pulumi.Output<outputs.metal.InterconnectionServiceToken[]>;
    /**
     * Connection speed -  Values must be in the format '\n\nMbps' or '\n\nGpbs', for example '100Mbps' or '50Gbps'.  Actual supported values will depend on the connection type and whether the connection uses VLANs or VRF.
     */
    public readonly speed!: pulumi.Output<string>;
    /**
     * Status of the connection resource
     */
    public /*out*/ readonly status!: pulumi.Output<string>;
    /**
     * Tags attached to the connection
     */
    public readonly tags!: pulumi.Output<string[] | undefined>;
    /**
     * Only used with shared connection. Fabric Token required to continue the setup process with equinix*fabric*connection or from the [Equinix Fabric Portal](https://fabric.equinix.com/dashboard)
     *
     * @deprecated If your organization already has connection service tokens enabled, use `serviceTokens` instead
     */
    public /*out*/ readonly token!: pulumi.Output<string>;
    /**
     * Connection type - dedicated, shared or shared*port*vlan
     */
    public readonly type!: pulumi.Output<string>;
    /**
     * Only used with shared connection. VLANs to attach. Pass one vlan for Primary/Single connection and two vlans for Redundant connection
     */
    public readonly vlans!: pulumi.Output<number[] | undefined>;
    /**
     * Only used with shared connection. VRFs to attach. Pass one VRF for Primary/Single connection and two VRFs for Redundant connection
     */
    public readonly vrfs!: pulumi.Output<string[] | undefined>;

    /**
     * Create a Interconnection resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: InterconnectionArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: InterconnectionArgs | InterconnectionState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as InterconnectionState | undefined;
            resourceInputs["authorizationCode"] = state ? state.authorizationCode : undefined;
            resourceInputs["contactEmail"] = state ? state.contactEmail : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["facility"] = state ? state.facility : undefined;
            resourceInputs["metro"] = state ? state.metro : undefined;
            resourceInputs["mode"] = state ? state.mode : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["organizationId"] = state ? state.organizationId : undefined;
            resourceInputs["ports"] = state ? state.ports : undefined;
            resourceInputs["projectId"] = state ? state.projectId : undefined;
            resourceInputs["redundancy"] = state ? state.redundancy : undefined;
            resourceInputs["serviceTokenType"] = state ? state.serviceTokenType : undefined;
            resourceInputs["serviceTokens"] = state ? state.serviceTokens : undefined;
            resourceInputs["speed"] = state ? state.speed : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["token"] = state ? state.token : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
            resourceInputs["vlans"] = state ? state.vlans : undefined;
            resourceInputs["vrfs"] = state ? state.vrfs : undefined;
        } else {
            const args = argsOrState as InterconnectionArgs | undefined;
            if ((!args || args.redundancy === undefined) && !opts.urn) {
                throw new Error("Missing required property 'redundancy'");
            }
            if ((!args || args.type === undefined) && !opts.urn) {
                throw new Error("Missing required property 'type'");
            }
            resourceInputs["contactEmail"] = args ? args.contactEmail : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["facility"] = args ? args.facility : undefined;
            resourceInputs["metro"] = args ? args.metro : undefined;
            resourceInputs["mode"] = args ? args.mode : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["organizationId"] = args ? args.organizationId : undefined;
            resourceInputs["projectId"] = args ? args.projectId : undefined;
            resourceInputs["redundancy"] = args ? args.redundancy : undefined;
            resourceInputs["serviceTokenType"] = args ? args.serviceTokenType : undefined;
            resourceInputs["speed"] = args ? args.speed : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["type"] = args ? args.type : undefined;
            resourceInputs["vlans"] = args ? args.vlans : undefined;
            resourceInputs["vrfs"] = args ? args.vrfs : undefined;
            resourceInputs["authorizationCode"] = undefined /*out*/;
            resourceInputs["ports"] = undefined /*out*/;
            resourceInputs["serviceTokens"] = undefined /*out*/;
            resourceInputs["status"] = undefined /*out*/;
            resourceInputs["token"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Interconnection.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Interconnection resources.
 */
export interface InterconnectionState {
    /**
     * Only used with Fabric Shared connection. Fabric uses this token to be able to give more detailed information about the Metal end of the network, when viewing resources from within Fabric.
     */
    authorizationCode?: pulumi.Input<string>;
    /**
     * The preferred email used for communication and notifications about the Equinix Fabric interconnection
     */
    contactEmail?: pulumi.Input<string>;
    /**
     * Description of the connection resource
     */
    description?: pulumi.Input<string>;
    /**
     * Facility where the connection will be created
     *
     * @deprecated Use metro instead of facility. For more information, read the migration guide.
     */
    facility?: pulumi.Input<string>;
    /**
     * Metro where the connection will be created
     */
    metro?: pulumi.Input<string>;
    /**
     * Mode for connections in IBX facilities with the dedicated type - standard or tunnel
     */
    mode?: pulumi.Input<string>;
    /**
     * Name of the connection resource
     */
    name?: pulumi.Input<string>;
    /**
     * ID of the organization responsible for the connection. Applicable with type "dedicated"
     */
    organizationId?: pulumi.Input<string>;
    /**
     * List of connection ports - primary (`ports[0]`) and secondary (`ports[1]`)
     */
    ports?: pulumi.Input<pulumi.Input<inputs.metal.InterconnectionPort>[]>;
    /**
     * ID of the project where the connection is scoped to. Required with type "shared"
     */
    projectId?: pulumi.Input<string>;
    /**
     * Connection redundancy - redundant or primary
     */
    redundancy?: pulumi.Input<string>;
    /**
     * Only used with shared connection. Type of service token to use for the connection, a*side or z*side
     */
    serviceTokenType?: pulumi.Input<string>;
    /**
     * Only used with shared connection. List of service tokens required to continue the setup process with equinix*fabric*connection or from the [Equinix Fabric Portal](https://fabric.equinix.com/dashboard)
     */
    serviceTokens?: pulumi.Input<pulumi.Input<inputs.metal.InterconnectionServiceToken>[]>;
    /**
     * Connection speed -  Values must be in the format '\n\nMbps' or '\n\nGpbs', for example '100Mbps' or '50Gbps'.  Actual supported values will depend on the connection type and whether the connection uses VLANs or VRF.
     */
    speed?: pulumi.Input<string>;
    /**
     * Status of the connection resource
     */
    status?: pulumi.Input<string>;
    /**
     * Tags attached to the connection
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Only used with shared connection. Fabric Token required to continue the setup process with equinix*fabric*connection or from the [Equinix Fabric Portal](https://fabric.equinix.com/dashboard)
     *
     * @deprecated If your organization already has connection service tokens enabled, use `serviceTokens` instead
     */
    token?: pulumi.Input<string>;
    /**
     * Connection type - dedicated, shared or shared*port*vlan
     */
    type?: pulumi.Input<string>;
    /**
     * Only used with shared connection. VLANs to attach. Pass one vlan for Primary/Single connection and two vlans for Redundant connection
     */
    vlans?: pulumi.Input<pulumi.Input<number>[]>;
    /**
     * Only used with shared connection. VRFs to attach. Pass one VRF for Primary/Single connection and two VRFs for Redundant connection
     */
    vrfs?: pulumi.Input<pulumi.Input<string>[]>;
}

/**
 * The set of arguments for constructing a Interconnection resource.
 */
export interface InterconnectionArgs {
    /**
     * The preferred email used for communication and notifications about the Equinix Fabric interconnection
     */
    contactEmail?: pulumi.Input<string>;
    /**
     * Description of the connection resource
     */
    description?: pulumi.Input<string>;
    /**
     * Facility where the connection will be created
     *
     * @deprecated Use metro instead of facility. For more information, read the migration guide.
     */
    facility?: pulumi.Input<string>;
    /**
     * Metro where the connection will be created
     */
    metro?: pulumi.Input<string>;
    /**
     * Mode for connections in IBX facilities with the dedicated type - standard or tunnel
     */
    mode?: pulumi.Input<string>;
    /**
     * Name of the connection resource
     */
    name?: pulumi.Input<string>;
    /**
     * ID of the organization responsible for the connection. Applicable with type "dedicated"
     */
    organizationId?: pulumi.Input<string>;
    /**
     * ID of the project where the connection is scoped to. Required with type "shared"
     */
    projectId?: pulumi.Input<string>;
    /**
     * Connection redundancy - redundant or primary
     */
    redundancy: pulumi.Input<string>;
    /**
     * Only used with shared connection. Type of service token to use for the connection, a*side or z*side
     */
    serviceTokenType?: pulumi.Input<string>;
    /**
     * Connection speed -  Values must be in the format '\n\nMbps' or '\n\nGpbs', for example '100Mbps' or '50Gbps'.  Actual supported values will depend on the connection type and whether the connection uses VLANs or VRF.
     */
    speed?: pulumi.Input<string>;
    /**
     * Tags attached to the connection
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Connection type - dedicated, shared or shared*port*vlan
     */
    type: pulumi.Input<string>;
    /**
     * Only used with shared connection. VLANs to attach. Pass one vlan for Primary/Single connection and two vlans for Redundant connection
     */
    vlans?: pulumi.Input<pulumi.Input<number>[]>;
    /**
     * Only used with shared connection. VRFs to attach. Pass one VRF for Primary/Single connection and two VRFs for Redundant connection
     */
    vrfs?: pulumi.Input<pulumi.Input<string>[]>;
}
