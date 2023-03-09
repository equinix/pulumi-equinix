// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Use this resource to create Metal User API Key resources in Equinix Metal. Each API key contains a
 * token which can be used for authentication in Equinix Metal HTTP API (in HTTP request header
 * `X-Auth-Token`).
 *
 * Read-only keys only allow to list and view existing resources, read-write keys can also be used to
 * create resources.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as equinix from "@equinix/pulumi-equinix";
 *
 * const test = new equinix.metal.UserApiKey("test", {
 *     description: "Read-only user key",
 *     readOnly: true,
 * });
 * ```
 */
export class UserApiKey extends pulumi.CustomResource {
    /**
     * Get an existing UserApiKey resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: UserApiKeyState, opts?: pulumi.CustomResourceOptions): UserApiKey {
        return new UserApiKey(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'equinix:metal/userApiKey:UserApiKey';

    /**
     * Returns true if the given object is an instance of UserApiKey.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is UserApiKey {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === UserApiKey.__pulumiType;
    }

    /**
     * Description string for the User API Key resource.
     * * `read-only` - (Required) Flag indicating whether the API key shoud be read-only.
     */
    public readonly description!: pulumi.Output<string>;
    /**
     * Flag indicating whether the API key shoud be read-only
     */
    public readonly readOnly!: pulumi.Output<boolean>;
    /**
     * API token which can be used in Equinix Metal API clients.
     */
    public /*out*/ readonly token!: pulumi.Output<string>;
    /**
     * UUID of the owner of the API key.
     */
    public /*out*/ readonly userId!: pulumi.Output<string>;

    /**
     * Create a UserApiKey resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: UserApiKeyArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: UserApiKeyArgs | UserApiKeyState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as UserApiKeyState | undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["readOnly"] = state ? state.readOnly : undefined;
            resourceInputs["token"] = state ? state.token : undefined;
            resourceInputs["userId"] = state ? state.userId : undefined;
        } else {
            const args = argsOrState as UserApiKeyArgs | undefined;
            if ((!args || args.description === undefined) && !opts.urn) {
                throw new Error("Missing required property 'description'");
            }
            if ((!args || args.readOnly === undefined) && !opts.urn) {
                throw new Error("Missing required property 'readOnly'");
            }
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["readOnly"] = args ? args.readOnly : undefined;
            resourceInputs["token"] = undefined /*out*/;
            resourceInputs["userId"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["token"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(UserApiKey.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering UserApiKey resources.
 */
export interface UserApiKeyState {
    /**
     * Description string for the User API Key resource.
     * * `read-only` - (Required) Flag indicating whether the API key shoud be read-only.
     */
    description?: pulumi.Input<string>;
    /**
     * Flag indicating whether the API key shoud be read-only
     */
    readOnly?: pulumi.Input<boolean>;
    /**
     * API token which can be used in Equinix Metal API clients.
     */
    token?: pulumi.Input<string>;
    /**
     * UUID of the owner of the API key.
     */
    userId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a UserApiKey resource.
 */
export interface UserApiKeyArgs {
    /**
     * Description string for the User API Key resource.
     * * `read-only` - (Required) Flag indicating whether the API key shoud be read-only.
     */
    description: pulumi.Input<string>;
    /**
     * Flag indicating whether the API key shoud be read-only
     */
    readOnly: pulumi.Input<boolean>;
}
