// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs, enums } from "../types";
import * as utilities from "../utilities";

/**
 * Provides a resource to manage organization resource in Equinix Metal.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as equinix from "@equinix/pulumi-equinix";
 *
 * // Create a new Organization
 * const tfOrganization1 = new equinix.metal.Organization("tf_organization_1", {
 *     description: "quux",
 * });
 * ```
 *
 * ## Import
 *
 * This resource can be imported using an existing organization ID
 *
 * ```sh
 *  $ pulumi import equinix:metal/organization:Organization equinix_metal_organization {existing_organization_id}
 * ```
 */
export class Organization extends pulumi.CustomResource {
    /**
     * Get an existing Organization resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: OrganizationState, opts?: pulumi.CustomResourceOptions): Organization {
        return new Organization(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'equinix:metal/organization:Organization';

    /**
     * Returns true if the given object is an instance of Organization.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Organization {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Organization.__pulumiType;
    }

    /**
     * Postal address.
     */
    public readonly address!: pulumi.Output<outputs.metal.OrganizationAddress>;
    /**
     * The timestamp for when the organization was created.
     */
    public /*out*/ readonly created!: pulumi.Output<string>;
    /**
     * Description string.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Logo URL.
     */
    public readonly logo!: pulumi.Output<string | undefined>;
    /**
     * The name of the Organization.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Twitter handle.
     */
    public readonly twitter!: pulumi.Output<string | undefined>;
    /**
     * The timestamp for the last time the organization was updated.
     */
    public /*out*/ readonly updated!: pulumi.Output<string>;
    /**
     * Website link.
     */
    public readonly website!: pulumi.Output<string | undefined>;

    /**
     * Create a Organization resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: OrganizationArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: OrganizationArgs | OrganizationState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as OrganizationState | undefined;
            resourceInputs["address"] = state ? state.address : undefined;
            resourceInputs["created"] = state ? state.created : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["logo"] = state ? state.logo : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["twitter"] = state ? state.twitter : undefined;
            resourceInputs["updated"] = state ? state.updated : undefined;
            resourceInputs["website"] = state ? state.website : undefined;
        } else {
            const args = argsOrState as OrganizationArgs | undefined;
            if ((!args || args.address === undefined) && !opts.urn) {
                throw new Error("Missing required property 'address'");
            }
            resourceInputs["address"] = args ? args.address : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["logo"] = args ? args.logo : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["twitter"] = args ? args.twitter : undefined;
            resourceInputs["website"] = args ? args.website : undefined;
            resourceInputs["created"] = undefined /*out*/;
            resourceInputs["updated"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Organization.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Organization resources.
 */
export interface OrganizationState {
    /**
     * Postal address.
     */
    address?: pulumi.Input<inputs.metal.OrganizationAddress>;
    /**
     * The timestamp for when the organization was created.
     */
    created?: pulumi.Input<string>;
    /**
     * Description string.
     */
    description?: pulumi.Input<string>;
    /**
     * Logo URL.
     */
    logo?: pulumi.Input<string>;
    /**
     * The name of the Organization.
     */
    name?: pulumi.Input<string>;
    /**
     * Twitter handle.
     */
    twitter?: pulumi.Input<string>;
    /**
     * The timestamp for the last time the organization was updated.
     */
    updated?: pulumi.Input<string>;
    /**
     * Website link.
     */
    website?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Organization resource.
 */
export interface OrganizationArgs {
    /**
     * Postal address.
     */
    address: pulumi.Input<inputs.metal.OrganizationAddress>;
    /**
     * Description string.
     */
    description?: pulumi.Input<string>;
    /**
     * Logo URL.
     */
    logo?: pulumi.Input<string>;
    /**
     * The name of the Organization.
     */
    name?: pulumi.Input<string>;
    /**
     * Twitter handle.
     */
    twitter?: pulumi.Input<string>;
    /**
     * Website link.
     */
    website?: pulumi.Input<string>;
}
