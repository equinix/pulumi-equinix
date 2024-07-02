// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Provides a resource to allow users to manage Virtual Networks in their projects.
 *
 * To learn more about Layer 2 networking in Equinix Metal, refer to
 *
 * * https://metal.equinix.com/developers/docs/networking/layer2/
 * * https://metal.equinix.com/developers/docs/networking/layer2-configs/
 *
 * ## Example Usage
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as equinix from "@equinix-labs/pulumi-equinix";
 *
 * const config = new pulumi.Config();
 * const projectId = config.require("projectId");
 * const metro = config.get("metro") || "DA";
 * const vxlan = config.requireNumber("vxlan");
 * const vlan = new equinix.metal.Vlan("vlan", {
 *     description: "VLAN in Dallas",
 *     projectId: projectId,
 *     metro: metro,
 *     vxlan: vxlan,
 * });
 * export const vlanId = vlan.id;
 * ```
 *
 * ## Import
 *
 * This resource can be imported using an existing VLAN ID (UUID):
 *
 * ```sh
 * $ pulumi import equinix:metal/vlan:Vlan equinix_metal_vlan {existing_vlan_id}
 * ```
 */
export class Vlan extends pulumi.CustomResource {
    /**
     * Get an existing Vlan resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: VlanState, opts?: pulumi.CustomResourceOptions): Vlan {
        return new Vlan(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'equinix:metal/vlan:Vlan';

    /**
     * Returns true if the given object is an instance of Vlan.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Vlan {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Vlan.__pulumiType;
    }

    /**
     * Description string.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Facility where to create the VLAN. Use metro instead; read the facility to metro migration guide
     *
     * @deprecated Use metro instead of facility.  For more information, read the migration guide: https://registry.terraform.io/providers/equinix/equinix/latest/docs/guides/migration_guide_facilities_to_metros_devices
     */
    public readonly facility!: pulumi.Output<string>;
    /**
     * Metro in which to create the VLAN
     */
    public readonly metro!: pulumi.Output<string>;
    /**
     * ID of parent project.
     */
    public readonly projectId!: pulumi.Output<string>;
    /**
     * VLAN ID, must be unique in metro.
     */
    public readonly vxlan!: pulumi.Output<number>;

    /**
     * Create a Vlan resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: VlanArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: VlanArgs | VlanState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as VlanState | undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["facility"] = state ? state.facility : undefined;
            resourceInputs["metro"] = state ? state.metro : undefined;
            resourceInputs["projectId"] = state ? state.projectId : undefined;
            resourceInputs["vxlan"] = state ? state.vxlan : undefined;
        } else {
            const args = argsOrState as VlanArgs | undefined;
            if ((!args || args.projectId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'projectId'");
            }
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["facility"] = args ? args.facility : undefined;
            resourceInputs["metro"] = args ? args.metro : undefined;
            resourceInputs["projectId"] = args ? args.projectId : undefined;
            resourceInputs["vxlan"] = args ? args.vxlan : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Vlan.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Vlan resources.
 */
export interface VlanState {
    /**
     * Description string.
     */
    description?: pulumi.Input<string>;
    /**
     * Facility where to create the VLAN. Use metro instead; read the facility to metro migration guide
     *
     * @deprecated Use metro instead of facility.  For more information, read the migration guide: https://registry.terraform.io/providers/equinix/equinix/latest/docs/guides/migration_guide_facilities_to_metros_devices
     */
    facility?: pulumi.Input<string | enums.metal.Facility>;
    /**
     * Metro in which to create the VLAN
     */
    metro?: pulumi.Input<string>;
    /**
     * ID of parent project.
     */
    projectId?: pulumi.Input<string>;
    /**
     * VLAN ID, must be unique in metro.
     */
    vxlan?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a Vlan resource.
 */
export interface VlanArgs {
    /**
     * Description string.
     */
    description?: pulumi.Input<string>;
    /**
     * Facility where to create the VLAN. Use metro instead; read the facility to metro migration guide
     *
     * @deprecated Use metro instead of facility.  For more information, read the migration guide: https://registry.terraform.io/providers/equinix/equinix/latest/docs/guides/migration_guide_facilities_to_metros_devices
     */
    facility?: pulumi.Input<string | enums.metal.Facility>;
    /**
     * Metro in which to create the VLAN
     */
    metro?: pulumi.Input<string>;
    /**
     * ID of parent project.
     */
    projectId: pulumi.Input<string>;
    /**
     * VLAN ID, must be unique in metro.
     */
    vxlan?: pulumi.Input<number>;
}
