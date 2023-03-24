// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Provides an Equinix Metal project resource to allow you manage devices
 * in your projects.
 *
 * > **NOTE:** Keep in mind that Equinix Metal invoicing is per project, so creating many
 * `equinix.metal.Project` resources will affect the rendered invoice. If you want to keep your
 * Equinix Metal bill simple and easy to review, please re-use your existing projects.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as equinix from "@equinix/pulumi-equinix";
 *
 * const config = new pulumi.Config();
 * const organizationId = config.require("organizationId");
 * const name = config.get("name") || "Default Project";
 * const projectResource = new equinix.metal.Project("project", {
 *     name: name,
 *     organizationId: organizationId,
 * });
 * export const projectId = projectResource.id;
 * ```
 *
 * ## Import
 *
 * This resource can be imported using an existing project ID: <break><break>```sh<break> $ pulumi import equinix:metal/project:Project equinix_metal_project {existing_project_id} <break>```<break><break>
 */
export class Project extends pulumi.CustomResource {
    /**
     * Get an existing Project resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ProjectState, opts?: pulumi.CustomResourceOptions): Project {
        return new Project(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'equinix:metal/project:Project';

    /**
     * Returns true if the given object is an instance of Project.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Project {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Project.__pulumiType;
    }

    /**
     * Enable or disable [Backend Transfer](https://metal.equinix.com/developers/docs/networking/backend-transfer/), default is `false`.
     */
    public readonly backendTransfer!: pulumi.Output<boolean | undefined>;
    /**
     * Optional BGP settings. Refer to [Equinix Metal guide for BGP](https://metal.equinix.com/developers/docs/networking/local-global-bgp/).
     */
    public readonly bgpConfig!: pulumi.Output<outputs.metal.ProjectBgpConfig | undefined>;
    /**
     * The timestamp for when the project was created.
     */
    public /*out*/ readonly created!: pulumi.Output<string>;
    /**
     * The name of the project.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The UUID of organization under which you want to create the project. If you
     * leave it out, the project will be create under your the default organization of your account.
     */
    public readonly organizationId!: pulumi.Output<string>;
    /**
     * The UUID of payment method for this project. The payment method and the
     * project need to belong to the same organization (passed with `organizationId`, or default).
     */
    public readonly paymentMethodId!: pulumi.Output<string>;
    /**
     * The timestamp for the last time the project was updated.
     */
    public /*out*/ readonly updated!: pulumi.Output<string>;

    /**
     * Create a Project resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: ProjectArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ProjectArgs | ProjectState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ProjectState | undefined;
            resourceInputs["backendTransfer"] = state ? state.backendTransfer : undefined;
            resourceInputs["bgpConfig"] = state ? state.bgpConfig : undefined;
            resourceInputs["created"] = state ? state.created : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["organizationId"] = state ? state.organizationId : undefined;
            resourceInputs["paymentMethodId"] = state ? state.paymentMethodId : undefined;
            resourceInputs["updated"] = state ? state.updated : undefined;
        } else {
            const args = argsOrState as ProjectArgs | undefined;
            resourceInputs["backendTransfer"] = args ? args.backendTransfer : undefined;
            resourceInputs["bgpConfig"] = args ? args.bgpConfig : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["organizationId"] = args ? args.organizationId : undefined;
            resourceInputs["paymentMethodId"] = args ? args.paymentMethodId : undefined;
            resourceInputs["created"] = undefined /*out*/;
            resourceInputs["updated"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Project.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Project resources.
 */
export interface ProjectState {
    /**
     * Enable or disable [Backend Transfer](https://metal.equinix.com/developers/docs/networking/backend-transfer/), default is `false`.
     */
    backendTransfer?: pulumi.Input<boolean>;
    /**
     * Optional BGP settings. Refer to [Equinix Metal guide for BGP](https://metal.equinix.com/developers/docs/networking/local-global-bgp/).
     */
    bgpConfig?: pulumi.Input<inputs.metal.ProjectBgpConfig>;
    /**
     * The timestamp for when the project was created.
     */
    created?: pulumi.Input<string>;
    /**
     * The name of the project.
     */
    name?: pulumi.Input<string>;
    /**
     * The UUID of organization under which you want to create the project. If you
     * leave it out, the project will be create under your the default organization of your account.
     */
    organizationId?: pulumi.Input<string>;
    /**
     * The UUID of payment method for this project. The payment method and the
     * project need to belong to the same organization (passed with `organizationId`, or default).
     */
    paymentMethodId?: pulumi.Input<string>;
    /**
     * The timestamp for the last time the project was updated.
     */
    updated?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Project resource.
 */
export interface ProjectArgs {
    /**
     * Enable or disable [Backend Transfer](https://metal.equinix.com/developers/docs/networking/backend-transfer/), default is `false`.
     */
    backendTransfer?: pulumi.Input<boolean>;
    /**
     * Optional BGP settings. Refer to [Equinix Metal guide for BGP](https://metal.equinix.com/developers/docs/networking/local-global-bgp/).
     */
    bgpConfig?: pulumi.Input<inputs.metal.ProjectBgpConfig>;
    /**
     * The name of the project.
     */
    name?: pulumi.Input<string>;
    /**
     * The UUID of organization under which you want to create the project. If you
     * leave it out, the project will be create under your the default organization of your account.
     */
    organizationId?: pulumi.Input<string>;
    /**
     * The UUID of payment method for this project. The payment method and the
     * project need to belong to the same organization (passed with `organizationId`, or default).
     */
    paymentMethodId?: pulumi.Input<string>;
}
