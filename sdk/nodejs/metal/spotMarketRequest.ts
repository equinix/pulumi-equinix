// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs, enums } from "../types";
import * as utilities from "../utilities";

/**
 * Provides an Equinix Metal Spot Market Request resource to allow you to
 * manage spot market requests on your account. For more detail on Spot Market,
 * see [this article in Equinix Metal documentation](https://metal.equinix.com/developers/docs/deploy/spot-market/).
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as equinix from "@equinix/pulumi-equinix";
 *
 * // Create a spot market request
 * const req = new equinix.metal.SpotMarketRequest("req", {
 *     projectId: local.project_id,
 *     maxBidPrice: 0.03,
 *     facilities: ["ny5"],
 *     devicesMin: 1,
 *     devicesMax: 1,
 *     instanceParameters: {
 *         hostname: "testspot",
 *         billingCycle: "hourly",
 *         operatingSystem: "ubuntu_20_04",
 *         plan: "c3.small.x86",
 *     },
 * });
 * ```
 *
 * ## Import
 *
 * This resource can be imported using an existing spot market request ID
 *
 * ```sh
 *  $ pulumi import equinix:metal/spotMarketRequest:SpotMarketRequest equinix_metal_spot_market_request {existing_spot_market_request_id}
 * ```
 */
export class SpotMarketRequest extends pulumi.CustomResource {
    /**
     * Get an existing SpotMarketRequest resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SpotMarketRequestState, opts?: pulumi.CustomResourceOptions): SpotMarketRequest {
        return new SpotMarketRequest(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'equinix:metal/spotMarketRequest:SpotMarketRequest';

    /**
     * Returns true if the given object is an instance of SpotMarketRequest.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is SpotMarketRequest {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === SpotMarketRequest.__pulumiType;
    }

    /**
     * Maximum number devices to be created.
     */
    public readonly devicesMax!: pulumi.Output<number>;
    /**
     * Miniumum number devices to be created.
     */
    public readonly devicesMin!: pulumi.Output<number>;
    /**
     * Facility IDs where devices should be created.
     */
    public readonly facilities!: pulumi.Output<string[]>;
    /**
     * Key/Value pairs of parameters for devices provisioned from
     * this request. Valid keys are: `billingCycle`, `plan`, `operatingSystem`, `hostname`,
     * `termintationTime`, `alwaysPxe`, `description`, `features`, `locked`, `projectSshKeys`,
     * `userSshKeys`, `userdata`, `customdata`, `ipxeScriptUrl`, `tags`. You can find each parameter
     * description in equinix.metal.Device docs.
     */
    public readonly instanceParameters!: pulumi.Output<outputs.metal.SpotMarketRequestInstanceParameters>;
    /**
     * Maximum price user is willing to pay per hour per device.
     */
    public readonly maxBidPrice!: pulumi.Output<number>;
    /**
     * Metro where devices should be created.
     */
    public readonly metro!: pulumi.Output<string | undefined>;
    /**
     * Project ID.
     */
    public readonly projectId!: pulumi.Output<string>;
    /**
     * On resource creation wait until all desired devices are active.
     * On resource destruction wait until devices are removed.
     */
    public readonly waitForDevices!: pulumi.Output<boolean | undefined>;

    /**
     * Create a SpotMarketRequest resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: SpotMarketRequestArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: SpotMarketRequestArgs | SpotMarketRequestState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as SpotMarketRequestState | undefined;
            resourceInputs["devicesMax"] = state ? state.devicesMax : undefined;
            resourceInputs["devicesMin"] = state ? state.devicesMin : undefined;
            resourceInputs["facilities"] = state ? state.facilities : undefined;
            resourceInputs["instanceParameters"] = state ? state.instanceParameters : undefined;
            resourceInputs["maxBidPrice"] = state ? state.maxBidPrice : undefined;
            resourceInputs["metro"] = state ? state.metro : undefined;
            resourceInputs["projectId"] = state ? state.projectId : undefined;
            resourceInputs["waitForDevices"] = state ? state.waitForDevices : undefined;
        } else {
            const args = argsOrState as SpotMarketRequestArgs | undefined;
            if ((!args || args.devicesMax === undefined) && !opts.urn) {
                throw new Error("Missing required property 'devicesMax'");
            }
            if ((!args || args.devicesMin === undefined) && !opts.urn) {
                throw new Error("Missing required property 'devicesMin'");
            }
            if ((!args || args.instanceParameters === undefined) && !opts.urn) {
                throw new Error("Missing required property 'instanceParameters'");
            }
            if ((!args || args.maxBidPrice === undefined) && !opts.urn) {
                throw new Error("Missing required property 'maxBidPrice'");
            }
            if ((!args || args.projectId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'projectId'");
            }
            resourceInputs["devicesMax"] = args ? args.devicesMax : undefined;
            resourceInputs["devicesMin"] = args ? args.devicesMin : undefined;
            resourceInputs["facilities"] = args ? args.facilities : undefined;
            resourceInputs["instanceParameters"] = args ? args.instanceParameters : undefined;
            resourceInputs["maxBidPrice"] = args ? args.maxBidPrice : undefined;
            resourceInputs["metro"] = args ? args.metro : undefined;
            resourceInputs["projectId"] = args ? args.projectId : undefined;
            resourceInputs["waitForDevices"] = args ? args.waitForDevices : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(SpotMarketRequest.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering SpotMarketRequest resources.
 */
export interface SpotMarketRequestState {
    /**
     * Maximum number devices to be created.
     */
    devicesMax?: pulumi.Input<number>;
    /**
     * Miniumum number devices to be created.
     */
    devicesMin?: pulumi.Input<number>;
    /**
     * Facility IDs where devices should be created.
     */
    facilities?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Key/Value pairs of parameters for devices provisioned from
     * this request. Valid keys are: `billingCycle`, `plan`, `operatingSystem`, `hostname`,
     * `termintationTime`, `alwaysPxe`, `description`, `features`, `locked`, `projectSshKeys`,
     * `userSshKeys`, `userdata`, `customdata`, `ipxeScriptUrl`, `tags`. You can find each parameter
     * description in equinix.metal.Device docs.
     */
    instanceParameters?: pulumi.Input<inputs.metal.SpotMarketRequestInstanceParameters>;
    /**
     * Maximum price user is willing to pay per hour per device.
     */
    maxBidPrice?: pulumi.Input<number>;
    /**
     * Metro where devices should be created.
     */
    metro?: pulumi.Input<string>;
    /**
     * Project ID.
     */
    projectId?: pulumi.Input<string>;
    /**
     * On resource creation wait until all desired devices are active.
     * On resource destruction wait until devices are removed.
     */
    waitForDevices?: pulumi.Input<boolean>;
}

/**
 * The set of arguments for constructing a SpotMarketRequest resource.
 */
export interface SpotMarketRequestArgs {
    /**
     * Maximum number devices to be created.
     */
    devicesMax: pulumi.Input<number>;
    /**
     * Miniumum number devices to be created.
     */
    devicesMin: pulumi.Input<number>;
    /**
     * Facility IDs where devices should be created.
     */
    facilities?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Key/Value pairs of parameters for devices provisioned from
     * this request. Valid keys are: `billingCycle`, `plan`, `operatingSystem`, `hostname`,
     * `termintationTime`, `alwaysPxe`, `description`, `features`, `locked`, `projectSshKeys`,
     * `userSshKeys`, `userdata`, `customdata`, `ipxeScriptUrl`, `tags`. You can find each parameter
     * description in equinix.metal.Device docs.
     */
    instanceParameters: pulumi.Input<inputs.metal.SpotMarketRequestInstanceParameters>;
    /**
     * Maximum price user is willing to pay per hour per device.
     */
    maxBidPrice: pulumi.Input<number>;
    /**
     * Metro where devices should be created.
     */
    metro?: pulumi.Input<string>;
    /**
     * Project ID.
     */
    projectId: pulumi.Input<string>;
    /**
     * On resource creation wait until all desired devices are active.
     * On resource destruction wait until devices are removed.
     */
    waitForDevices?: pulumi.Input<boolean>;
}
