// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a resource to attach elastic IP subnets to devices.
 *
 * To attach an IP subnet from a reserved block to a provisioned device, you must derive a subnet CIDR belonging to one of your reserved blocks in the same project and metro as the target device.
 *
 * For example, you have reserved IPv4 address block `147.229.10.152/30`, you can choose to assign either the whole block as one subnet to a device; or 2 subnets with CIDRs `147.229.10.152/31` and `147.229.10.154/31`; or 4 subnets with mask prefix length `32`. More about the elastic IP subnets is [here](https://metal.equinix.com/developers/docs/networking/elastic-ips/).
 *
 * Device and reserved block must be in the same metro.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as equinix from "@equinix-labs/pulumi-equinix";
 *
 * const config = new pulumi.Config();
 * const deviceId = config.require("deviceId");
 * const subnetCidr = config.get("subnetCidr") || "147.229.10.152/31";
 * const ipAttachResource = new equinix.metal.IpAttachment("ipAttach", {
 *     deviceId: deviceId,
 *     cidrNotation: subnetCidr,
 * });
 * export const ipAttach = ipAttachResource.id;
 * export const ipNetmask = ipAttachResource.netmask;
 * ```
 */
export class IpAttachment extends pulumi.CustomResource {
    /**
     * Get an existing IpAttachment resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: IpAttachmentState, opts?: pulumi.CustomResourceOptions): IpAttachment {
        return new IpAttachment(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'equinix:metal/ipAttachment:IpAttachment';

    /**
     * Returns true if the given object is an instance of IpAttachment.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is IpAttachment {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === IpAttachment.__pulumiType;
    }

    public /*out*/ readonly address!: pulumi.Output<string>;
    /**
     * Address family as integer. One of `4` or `6`.
     */
    public /*out*/ readonly addressFamily!: pulumi.Output<number>;
    /**
     * Length of CIDR prefix of the subnet as integer.
     */
    public /*out*/ readonly cidr!: pulumi.Output<number>;
    /**
     * CIDR notation of subnet from block reserved in the same project and metro as the device.
     */
    public readonly cidrNotation!: pulumi.Output<string>;
    /**
     * ID of device to which to assign the subnet.
     */
    public readonly deviceId!: pulumi.Output<string>;
    /**
     * IP address of gateway for the subnet.
     */
    public /*out*/ readonly gateway!: pulumi.Output<string>;
    /**
     * Flag indicating whether IP block is global, i.e. assignable in any location
     */
    public /*out*/ readonly global!: pulumi.Output<boolean>;
    public /*out*/ readonly manageable!: pulumi.Output<boolean>;
    public /*out*/ readonly management!: pulumi.Output<boolean>;
    /**
     * Subnet mask in decimal notation, e.g., `255.255.255.0`.
     */
    public /*out*/ readonly netmask!: pulumi.Output<string>;
    /**
     * Subnet network address.
     */
    public /*out*/ readonly network!: pulumi.Output<string>;
    /**
     * Boolean flag whether subnet is reachable from the Internet.
     */
    public /*out*/ readonly public!: pulumi.Output<boolean>;
    public /*out*/ readonly vrfId!: pulumi.Output<string>;

    /**
     * Create a IpAttachment resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: IpAttachmentArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: IpAttachmentArgs | IpAttachmentState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as IpAttachmentState | undefined;
            resourceInputs["address"] = state ? state.address : undefined;
            resourceInputs["addressFamily"] = state ? state.addressFamily : undefined;
            resourceInputs["cidr"] = state ? state.cidr : undefined;
            resourceInputs["cidrNotation"] = state ? state.cidrNotation : undefined;
            resourceInputs["deviceId"] = state ? state.deviceId : undefined;
            resourceInputs["gateway"] = state ? state.gateway : undefined;
            resourceInputs["global"] = state ? state.global : undefined;
            resourceInputs["manageable"] = state ? state.manageable : undefined;
            resourceInputs["management"] = state ? state.management : undefined;
            resourceInputs["netmask"] = state ? state.netmask : undefined;
            resourceInputs["network"] = state ? state.network : undefined;
            resourceInputs["public"] = state ? state.public : undefined;
            resourceInputs["vrfId"] = state ? state.vrfId : undefined;
        } else {
            const args = argsOrState as IpAttachmentArgs | undefined;
            if ((!args || args.cidrNotation === undefined) && !opts.urn) {
                throw new Error("Missing required property 'cidrNotation'");
            }
            if ((!args || args.deviceId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'deviceId'");
            }
            resourceInputs["cidrNotation"] = args ? args.cidrNotation : undefined;
            resourceInputs["deviceId"] = args ? args.deviceId : undefined;
            resourceInputs["address"] = undefined /*out*/;
            resourceInputs["addressFamily"] = undefined /*out*/;
            resourceInputs["cidr"] = undefined /*out*/;
            resourceInputs["gateway"] = undefined /*out*/;
            resourceInputs["global"] = undefined /*out*/;
            resourceInputs["manageable"] = undefined /*out*/;
            resourceInputs["management"] = undefined /*out*/;
            resourceInputs["netmask"] = undefined /*out*/;
            resourceInputs["network"] = undefined /*out*/;
            resourceInputs["public"] = undefined /*out*/;
            resourceInputs["vrfId"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(IpAttachment.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering IpAttachment resources.
 */
export interface IpAttachmentState {
    address?: pulumi.Input<string>;
    /**
     * Address family as integer. One of `4` or `6`.
     */
    addressFamily?: pulumi.Input<number>;
    /**
     * Length of CIDR prefix of the subnet as integer.
     */
    cidr?: pulumi.Input<number>;
    /**
     * CIDR notation of subnet from block reserved in the same project and metro as the device.
     */
    cidrNotation?: pulumi.Input<string>;
    /**
     * ID of device to which to assign the subnet.
     */
    deviceId?: pulumi.Input<string>;
    /**
     * IP address of gateway for the subnet.
     */
    gateway?: pulumi.Input<string>;
    /**
     * Flag indicating whether IP block is global, i.e. assignable in any location
     */
    global?: pulumi.Input<boolean>;
    manageable?: pulumi.Input<boolean>;
    management?: pulumi.Input<boolean>;
    /**
     * Subnet mask in decimal notation, e.g., `255.255.255.0`.
     */
    netmask?: pulumi.Input<string>;
    /**
     * Subnet network address.
     */
    network?: pulumi.Input<string>;
    /**
     * Boolean flag whether subnet is reachable from the Internet.
     */
    public?: pulumi.Input<boolean>;
    vrfId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a IpAttachment resource.
 */
export interface IpAttachmentArgs {
    /**
     * CIDR notation of subnet from block reserved in the same project and metro as the device.
     */
    cidrNotation: pulumi.Input<string>;
    /**
     * ID of device to which to assign the subnet.
     */
    deviceId: pulumi.Input<string>;
}
