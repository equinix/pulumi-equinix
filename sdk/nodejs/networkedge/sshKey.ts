// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Resource `equinix.networkedge.SshKey` allows creation and management of Equinix Network Edge SSH keys.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as equinix from "@equinix-labs/pulumi-equinix";
 * import * as fs from "fs";
 *
 * const sshKey = new equinix.networkedge.SshKey("sshKey", {
 *     name: "johnKent",
 *     publicKey: fs.readFileSync("/Users/John/.ssh/ne_rsa.pub"),
 * });
 * export const sshKeyId = sshKey.id;
 * ```
 *
 * ## Import
 *
 * This resource can be imported using an existing ID:
 *
 * ```sh
 * $ pulumi import equinix:networkedge/sshKey:SshKey example {existing_id}
 * ```
 */
export class SshKey extends pulumi.CustomResource {
    /**
     * Get an existing SshKey resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SshKeyState, opts?: pulumi.CustomResourceOptions): SshKey {
        return new SshKey(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'equinix:networkedge/sshKey:SshKey';

    /**
     * Returns true if the given object is an instance of SshKey.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is SshKey {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === SshKey.__pulumiType;
    }

    /**
     * The name of SSH key used for identification.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Unique Identifier for the project resource where the SSH key is scoped to.If you
     * leave it out, the ssh key will be created under the default project id of your organization.
     */
    public readonly projectId!: pulumi.Output<string>;
    /**
     * The SSH public key. If this is a file, it can be read using the file
     * interpolation function.
     */
    public readonly publicKey!: pulumi.Output<string>;
    /**
     * The type of SSH key: `RSA` (default) or `DSA`.
     */
    public readonly type!: pulumi.Output<string | undefined>;
    /**
     * The unique identifier of the key
     */
    public /*out*/ readonly uuid!: pulumi.Output<string>;

    /**
     * Create a SshKey resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: SshKeyArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: SshKeyArgs | SshKeyState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as SshKeyState | undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["projectId"] = state ? state.projectId : undefined;
            resourceInputs["publicKey"] = state ? state.publicKey : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
            resourceInputs["uuid"] = state ? state.uuid : undefined;
        } else {
            const args = argsOrState as SshKeyArgs | undefined;
            if ((!args || args.publicKey === undefined) && !opts.urn) {
                throw new Error("Missing required property 'publicKey'");
            }
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["projectId"] = args ? args.projectId : undefined;
            resourceInputs["publicKey"] = args ? args.publicKey : undefined;
            resourceInputs["type"] = args ? args.type : undefined;
            resourceInputs["uuid"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(SshKey.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering SshKey resources.
 */
export interface SshKeyState {
    /**
     * The name of SSH key used for identification.
     */
    name?: pulumi.Input<string>;
    /**
     * Unique Identifier for the project resource where the SSH key is scoped to.If you
     * leave it out, the ssh key will be created under the default project id of your organization.
     */
    projectId?: pulumi.Input<string>;
    /**
     * The SSH public key. If this is a file, it can be read using the file
     * interpolation function.
     */
    publicKey?: pulumi.Input<string>;
    /**
     * The type of SSH key: `RSA` (default) or `DSA`.
     */
    type?: pulumi.Input<string>;
    /**
     * The unique identifier of the key
     */
    uuid?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a SshKey resource.
 */
export interface SshKeyArgs {
    /**
     * The name of SSH key used for identification.
     */
    name?: pulumi.Input<string>;
    /**
     * Unique Identifier for the project resource where the SSH key is scoped to.If you
     * leave it out, the ssh key will be created under the default project id of your organization.
     */
    projectId?: pulumi.Input<string>;
    /**
     * The SSH public key. If this is a file, it can be read using the file
     * interpolation function.
     */
    publicKey: pulumi.Input<string>;
    /**
     * The type of SSH key: `RSA` (default) or `DSA`.
     */
    type?: pulumi.Input<string>;
}
