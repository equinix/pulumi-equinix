// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.metal;

import com.equinix.pulumi.Utilities;
import com.equinix.pulumi.metal.SshKeyArgs;
import com.equinix.pulumi.metal.inputs.SshKeyState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a resource to manage User SSH keys on your Equinix Metal user account. If you create a new device in a project, all the keys of the project&#39;s collaborators will be injected to the device.
 * 
 * The link between User SSH key and device is implicit. If you want to make sure that a key will be copied to a device, you must ensure that the device resource `depends_on` the key resource.
 * 
 * ## Example Usage
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.equinix.metal.SshKey;
 * import com.pulumi.equinix.metal.SshKeyArgs;
 * import com.pulumi.std.StdFunctions;
 * import com.pulumi.std.inputs.FileArgs;
 * import com.pulumi.equinix.metal.Device;
 * import com.pulumi.equinix.metal.DeviceArgs;
 * import com.pulumi.resources.CustomResourceOptions;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var key1 = new SshKey("key1", SshKeyArgs.builder()
 *             .name("terraform-1")
 *             .publicKey(StdFunctions.file(FileArgs.builder()
 *                 .input("/home/terraform/.ssh/id_rsa.pub")
 *                 .build()).applyValue(_invoke -> _invoke.result()))
 *             .build());
 * 
 *         var test = new Device("test", DeviceArgs.builder()
 *             .hostname("test-device")
 *             .plan("c3.small.x86")
 *             .metro("sv")
 *             .operatingSystem("ubuntu_20_04")
 *             .billingCycle("hourly")
 *             .projectId(projectId)
 *             .build(), CustomResourceOptions.builder()
 *                 .dependsOn(key1)
 *                 .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * 
 * ## Import
 * 
 * This resource can be imported using an existing SSH Key ID:
 * 
 * ```sh
 * $ pulumi import equinix:metal/sshKey:SshKey equinix_metal_ssh_key {existing_sshkey_id}
 * ```
 * 
 */
@ResourceType(type="equinix:metal/sshKey:SshKey")
public class SshKey extends com.pulumi.resources.CustomResource {
    /**
     * The timestamp for when the SSH key was created.
     * 
     */
    @Export(name="created", refs={String.class}, tree="[0]")
    private Output<String> created;

    /**
     * @return The timestamp for when the SSH key was created.
     * 
     */
    public Output<String> created() {
        return this.created;
    }
    /**
     * The fingerprint of the SSH key.
     * 
     */
    @Export(name="fingerprint", refs={String.class}, tree="[0]")
    private Output<String> fingerprint;

    /**
     * @return The fingerprint of the SSH key.
     * 
     */
    public Output<String> fingerprint() {
        return this.fingerprint;
    }
    /**
     * The name of the SSH key for identification
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the SSH key for identification
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The UUID of the Equinix Metal API User who owns this key.
     * 
     */
    @Export(name="ownerId", refs={String.class}, tree="[0]")
    private Output<String> ownerId;

    /**
     * @return The UUID of the Equinix Metal API User who owns this key.
     * 
     */
    public Output<String> ownerId() {
        return this.ownerId;
    }
    /**
     * The public key. If this is a file, it can be read using the file interpolation function
     * 
     */
    @Export(name="publicKey", refs={String.class}, tree="[0]")
    private Output<String> publicKey;

    /**
     * @return The public key. If this is a file, it can be read using the file interpolation function
     * 
     */
    public Output<String> publicKey() {
        return this.publicKey;
    }
    /**
     * The timestamp for the last time the SSH key was updated.
     * 
     */
    @Export(name="updated", refs={String.class}, tree="[0]")
    private Output<String> updated;

    /**
     * @return The timestamp for the last time the SSH key was updated.
     * 
     */
    public Output<String> updated() {
        return this.updated;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SshKey(java.lang.String name) {
        this(name, SshKeyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SshKey(java.lang.String name, SshKeyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SshKey(java.lang.String name, SshKeyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("equinix:metal/sshKey:SshKey", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private SshKey(java.lang.String name, Output<java.lang.String> id, @Nullable SshKeyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("equinix:metal/sshKey:SshKey", name, state, makeResourceOptions(options, id), false);
    }

    private static SshKeyArgs makeArgs(SshKeyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? SshKeyArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .pluginDownloadURL("github://api.github.com/equinix")
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static SshKey get(java.lang.String name, Output<java.lang.String> id, @Nullable SshKeyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SshKey(name, id, state, options);
    }
}
