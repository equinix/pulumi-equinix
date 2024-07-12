// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a resource to attach device ports to VLANs.
 *
 * Device and VLAN must be in the same metro.
 *
 * If you need this resource to add the port back to bond on removal, set `forceBond = true`.
 *
 * To learn more about Layer 2 networking in Equinix Metal, refer to
 *
 * * https://metal.equinix.com/developers/docs/networking/layer2/
 * * https://metal.equinix.com/developers/docs/networking/layer2-configs/
 *
 * ## Attribute Referece
 *
 * In addition to all arguments above, the following attributes are exported:
 *
 * * `id` - UUID of device port used in the assignment.
 * * `vlanId` - UUID of VLAN API resource.
 * * `portId` - UUID of device port.
 *
 * ## Example Usage
 * ### example 2
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as equinix from "@equinix-labs/pulumi-equinix";
 *
 * const test = new equinix.metal.Device("test", {
 *     hostname: "test",
 *     plan: equinix.metal.Plan.C3SmallX86,
 *     metro: "ny",
 *     operatingSystem: equinix.metal.OperatingSystem.Ubuntu20_04,
 *     billingCycle: equinix.metal.BillingCycle.Hourly,
 *     projectId: projectId,
 * });
 * const testDeviceNetworkType = new equinix.metal.DeviceNetworkType("testDeviceNetworkType", {
 *     deviceId: test.id,
 *     type: "layer2-individual",
 * });
 * const test1 = new equinix.metal.Vlan("test1", {
 *     description: "VLAN in New York",
 *     metro: "ny",
 *     projectId: projectId,
 * });
 * const test2 = new equinix.metal.Vlan("test2", {
 *     description: "VLAN in New Jersey",
 *     metro: "ny",
 *     projectId: projectId,
 * });
 * const test1PortVlanAttachment = new equinix.metal.PortVlanAttachment("test1PortVlanAttachment", {
 *     deviceId: testDeviceNetworkType.id,
 *     vlanVnid: test1.vxlan,
 *     portName: "eth1",
 * });
 * const test2PortVlanAttachment = new equinix.metal.PortVlanAttachment("test2PortVlanAttachment", {
 *     deviceId: testDeviceNetworkType.id,
 *     vlanVnid: test2.vxlan,
 *     portName: "eth1",
 *     native: true,
 * }, {
 *     dependsOn: [test1PortVlanAttachment],
 * });
 * ```
 * ### example 1
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as equinix from "@equinix-labs/pulumi-equinix";
 *
 * const test = new equinix.metal.Vlan("test", {
 *     description: "VLAN in New York",
 *     metro: "ny",
 *     projectId: projectId,
 * });
 * const testDevice = new equinix.metal.Device("testDevice", {
 *     hostname: "test",
 *     plan: equinix.metal.Plan.C3SmallX86,
 *     metro: "ny",
 *     operatingSystem: equinix.metal.OperatingSystem.Ubuntu20_04,
 *     billingCycle: equinix.metal.BillingCycle.Hourly,
 *     projectId: projectId,
 * });
 * const testDeviceNetworkType = new equinix.metal.DeviceNetworkType("testDeviceNetworkType", {
 *     deviceId: testDevice.id,
 *     type: "hybrid",
 * });
 * const testPortVlanAttachment = new equinix.metal.PortVlanAttachment("testPortVlanAttachment", {
 *     deviceId: testDeviceNetworkType.id,
 *     portName: "eth1",
 *     vlanVnid: test.vxlan,
 * });
 * ```
 */
export class PortVlanAttachment extends pulumi.CustomResource {
    /**
     * Get an existing PortVlanAttachment resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: PortVlanAttachmentState, opts?: pulumi.CustomResourceOptions): PortVlanAttachment {
        return new PortVlanAttachment(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'equinix:metal/portVlanAttachment:PortVlanAttachment';

    /**
     * Returns true if the given object is an instance of PortVlanAttachment.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is PortVlanAttachment {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === PortVlanAttachment.__pulumiType;
    }

    /**
     * ID of device to be assigned to the VLAN.
     */
    public readonly deviceId!: pulumi.Output<string>;
    /**
     * Add port back to the bond when this resource is removed. Default is `false`.
     */
    public readonly forceBond!: pulumi.Output<boolean | undefined>;
    /**
     * Mark this VLAN a native VLAN on the port. This can be used only if this assignment assigns second or further VLAN to the port. To ensure that this attachment is not first on a port, you can use `dependsOn` pointing to another `equinix.metal.PortVlanAttachment`, just like in the layer2-individual example above.
     */
    public readonly native!: pulumi.Output<boolean | undefined>;
    /**
     * UUID of device port
     */
    public /*out*/ readonly portId!: pulumi.Output<string>;
    /**
     * Name of network port to be assigned to the VLAN.
     */
    public readonly portName!: pulumi.Output<string>;
    /**
     * UUID of VLAN API resource
     */
    public /*out*/ readonly vlanId!: pulumi.Output<string>;
    /**
     * VXLAN Network Identifier.
     */
    public readonly vlanVnid!: pulumi.Output<number>;

    /**
     * Create a PortVlanAttachment resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: PortVlanAttachmentArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: PortVlanAttachmentArgs | PortVlanAttachmentState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as PortVlanAttachmentState | undefined;
            resourceInputs["deviceId"] = state ? state.deviceId : undefined;
            resourceInputs["forceBond"] = state ? state.forceBond : undefined;
            resourceInputs["native"] = state ? state.native : undefined;
            resourceInputs["portId"] = state ? state.portId : undefined;
            resourceInputs["portName"] = state ? state.portName : undefined;
            resourceInputs["vlanId"] = state ? state.vlanId : undefined;
            resourceInputs["vlanVnid"] = state ? state.vlanVnid : undefined;
        } else {
            const args = argsOrState as PortVlanAttachmentArgs | undefined;
            if ((!args || args.deviceId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'deviceId'");
            }
            if ((!args || args.portName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'portName'");
            }
            if ((!args || args.vlanVnid === undefined) && !opts.urn) {
                throw new Error("Missing required property 'vlanVnid'");
            }
            resourceInputs["deviceId"] = args ? args.deviceId : undefined;
            resourceInputs["forceBond"] = args ? args.forceBond : undefined;
            resourceInputs["native"] = args ? args.native : undefined;
            resourceInputs["portName"] = args ? args.portName : undefined;
            resourceInputs["vlanVnid"] = args ? args.vlanVnid : undefined;
            resourceInputs["portId"] = undefined /*out*/;
            resourceInputs["vlanId"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(PortVlanAttachment.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering PortVlanAttachment resources.
 */
export interface PortVlanAttachmentState {
    /**
     * ID of device to be assigned to the VLAN.
     */
    deviceId?: pulumi.Input<string>;
    /**
     * Add port back to the bond when this resource is removed. Default is `false`.
     */
    forceBond?: pulumi.Input<boolean>;
    /**
     * Mark this VLAN a native VLAN on the port. This can be used only if this assignment assigns second or further VLAN to the port. To ensure that this attachment is not first on a port, you can use `dependsOn` pointing to another `equinix.metal.PortVlanAttachment`, just like in the layer2-individual example above.
     */
    native?: pulumi.Input<boolean>;
    /**
     * UUID of device port
     */
    portId?: pulumi.Input<string>;
    /**
     * Name of network port to be assigned to the VLAN.
     */
    portName?: pulumi.Input<string>;
    /**
     * UUID of VLAN API resource
     */
    vlanId?: pulumi.Input<string>;
    /**
     * VXLAN Network Identifier.
     */
    vlanVnid?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a PortVlanAttachment resource.
 */
export interface PortVlanAttachmentArgs {
    /**
     * ID of device to be assigned to the VLAN.
     */
    deviceId: pulumi.Input<string>;
    /**
     * Add port back to the bond when this resource is removed. Default is `false`.
     */
    forceBond?: pulumi.Input<boolean>;
    /**
     * Mark this VLAN a native VLAN on the port. This can be used only if this assignment assigns second or further VLAN to the port. To ensure that this attachment is not first on a port, you can use `dependsOn` pointing to another `equinix.metal.PortVlanAttachment`, just like in the layer2-individual example above.
     */
    native?: pulumi.Input<boolean>;
    /**
     * Name of network port to be assigned to the VLAN.
     */
    portName: pulumi.Input<string>;
    /**
     * VXLAN Network Identifier.
     */
    vlanVnid: pulumi.Input<number>;
}
