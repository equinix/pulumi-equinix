// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a resource to manage User SSH keys on your Equinix Metal user account. If you create a new device in a project, all the keys of the project's collaborators will be injected to the device.
 *
 * The link between User SSH key and device is implicit. If you want to make sure that a key will be copied to a device, you must ensure that the device resource `dependsOn` the key resource.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as fs from "fs";
 * import * as equinix from "@equinix/pulumi-equinix";
 *
 * // Create a new SSH key
 * const key1 = new equinix.metal.SshKey("key1", {publicKey: fs.readFileSync("/home/terraform/.ssh/id_rsa.pub")});
 * // Create new device with "key1" included. The device resource "depends_on" the
 * // key, in order to make sure the key is created before the device.
 * const test = new equinix.metal.Device("test", {
 *     hostname: "test-device",
 *     plan: "c3.small.x86",
 *     metro: "sv",
 *     operatingSystem: "ubuntu_20_04",
 *     billingCycle: "hourly",
 *     projectId: local.project_id,
 * }, {
 *     dependsOn: ["equinix_metal_ssh_key.key1"],
 * });
 * ```
 *
 * ## Import
 *
 * This resource can be imported using an existing SSH Key ID
 *
 * ```sh
 *  $ pulumi import equinix:metal/sshKey:SshKey equinix_metal_ssh_key {existing_sshkey_id}
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
    public static readonly __pulumiType = 'equinix:metal/sshKey:SshKey';

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
     * The timestamp for when the SSH key was created.
     */
    public /*out*/ readonly created!: pulumi.Output<string>;
    /**
     * The fingerprint of the SSH key.
     */
    public /*out*/ readonly fingerprint!: pulumi.Output<string>;
    /**
     * The name of the SSH key for identification
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The UUID of the Equinix Metal API User who owns this key.
     */
    public /*out*/ readonly ownerId!: pulumi.Output<string>;
    /**
     * The public key. If this is a file, it
     * can be read using the file interpolation function
     */
    public readonly publicKey!: pulumi.Output<string>;
    /**
     * The timestamp for the last time the SSH key was updated.
     */
    public /*out*/ readonly updated!: pulumi.Output<string>;

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
            resourceInputs["created"] = state ? state.created : undefined;
            resourceInputs["fingerprint"] = state ? state.fingerprint : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["ownerId"] = state ? state.ownerId : undefined;
            resourceInputs["publicKey"] = state ? state.publicKey : undefined;
            resourceInputs["updated"] = state ? state.updated : undefined;
        } else {
            const args = argsOrState as SshKeyArgs | undefined;
            if ((!args || args.publicKey === undefined) && !opts.urn) {
                throw new Error("Missing required property 'publicKey'");
            }
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["publicKey"] = args ? args.publicKey : undefined;
            resourceInputs["created"] = undefined /*out*/;
            resourceInputs["fingerprint"] = undefined /*out*/;
            resourceInputs["ownerId"] = undefined /*out*/;
            resourceInputs["updated"] = undefined /*out*/;
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
     * The timestamp for when the SSH key was created.
     */
    created?: pulumi.Input<string>;
    /**
     * The fingerprint of the SSH key.
     */
    fingerprint?: pulumi.Input<string>;
    /**
     * The name of the SSH key for identification
     */
    name?: pulumi.Input<string>;
    /**
     * The UUID of the Equinix Metal API User who owns this key.
     */
    ownerId?: pulumi.Input<string>;
    /**
     * The public key. If this is a file, it
     * can be read using the file interpolation function
     */
    publicKey?: pulumi.Input<string>;
    /**
     * The timestamp for the last time the SSH key was updated.
     */
    updated?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a SshKey resource.
 */
export interface SshKeyArgs {
    /**
     * The name of the SSH key for identification
     */
    name?: pulumi.Input<string>;
    /**
     * The public key. If this is a file, it
     * can be read using the file interpolation function
     */
    publicKey: pulumi.Input<string>;
}
