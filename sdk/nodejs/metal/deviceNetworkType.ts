// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as equinix from "@equinix-labs/pulumi-equinix";
 *
 * const config = new pulumi.Config();
 * const deviceId = config.require("deviceId");
 * const networkType = config.get("networkType") || "hybrid";
 * const deviceNetwork = new equinix.metal.DeviceNetworkType("deviceNetwork", {
 *     deviceId: deviceId,
 *     type: networkType,
 * });
 * export const deviceNetworkId = deviceNetwork.id;
 * ```
 *
 * ## Import
 *
 * This resource can also be imported using existing device ID:
 *
 * ```sh
 * $ pulumi import equinix:metal/deviceNetworkType:DeviceNetworkType equinix_metal_device_network_type {existing device_id}
 * ```
 */
export class DeviceNetworkType extends pulumi.CustomResource {
    /**
     * Get an existing DeviceNetworkType resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: DeviceNetworkTypeState, opts?: pulumi.CustomResourceOptions): DeviceNetworkType {
        return new DeviceNetworkType(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'equinix:metal/deviceNetworkType:DeviceNetworkType';

    /**
     * Returns true if the given object is an instance of DeviceNetworkType.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is DeviceNetworkType {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === DeviceNetworkType.__pulumiType;
    }

    /**
     * The ID of the device on which the network type should be set.
     */
    public readonly deviceId!: pulumi.Output<string>;
    /**
     * Network type to set. Must be one of `layer3`, `hybrid`, `hybrid-bonded`, `layer2-individual`
     * and `layer2-bonded`.
     */
    public readonly type!: pulumi.Output<string>;

    /**
     * Create a DeviceNetworkType resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: DeviceNetworkTypeArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: DeviceNetworkTypeArgs | DeviceNetworkTypeState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as DeviceNetworkTypeState | undefined;
            resourceInputs["deviceId"] = state ? state.deviceId : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
        } else {
            const args = argsOrState as DeviceNetworkTypeArgs | undefined;
            if ((!args || args.deviceId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'deviceId'");
            }
            if ((!args || args.type === undefined) && !opts.urn) {
                throw new Error("Missing required property 'type'");
            }
            resourceInputs["deviceId"] = args ? args.deviceId : undefined;
            resourceInputs["type"] = args ? args.type : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(DeviceNetworkType.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering DeviceNetworkType resources.
 */
export interface DeviceNetworkTypeState {
    /**
     * The ID of the device on which the network type should be set.
     */
    deviceId?: pulumi.Input<string>;
    /**
     * Network type to set. Must be one of `layer3`, `hybrid`, `hybrid-bonded`, `layer2-individual`
     * and `layer2-bonded`.
     */
    type?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a DeviceNetworkType resource.
 */
export interface DeviceNetworkTypeArgs {
    /**
     * The ID of the device on which the network type should be set.
     */
    deviceId: pulumi.Input<string>;
    /**
     * Network type to set. Must be one of `layer3`, `hybrid`, `hybrid-bonded`, `layer2-individual`
     * and `layer2-bonded`.
     */
    type: pulumi.Input<string>;
}
