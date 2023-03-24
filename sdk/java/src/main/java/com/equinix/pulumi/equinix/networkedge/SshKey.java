// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.equinix.networkedge;

import com.equinix.pulumi.equinix.Utilities;
import com.equinix.pulumi.equinix.networkedge.SshKeyArgs;
import com.equinix.pulumi.equinix.networkedge.inputs.SshKeyState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Resource `equinix.networkedge.SshKey` allows creation and management of Equinix Network Edge SSH keys.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.equinix.networkedge.SshKey;
 * import com.pulumi.equinix.networkedge.SshKeyArgs;
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
 *         var sshKey = new SshKey(&#34;sshKey&#34;, SshKeyArgs.builder()        
 *             .name(&#34;johnKent&#34;)
 *             .publicKey(Files.readString(Paths.get(&#34;/Users/John/.ssh/ne_rsa.pub&#34;)))
 *             .build());
 * 
 *         ctx.export(&#34;sshKeyId&#34;, sshKey.id());
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * This resource can be imported using an existing ID: &lt;break&gt;&lt;break&gt;```sh&lt;break&gt; $ pulumi import equinix:networkedge/sshKey:SshKey example {existing_id} &lt;break&gt;```&lt;break&gt;&lt;break&gt;
 * 
 */
@ResourceType(type="equinix:networkedge/sshKey:SshKey")
public class SshKey extends com.pulumi.resources.CustomResource {
    /**
     * The name of SSH key used for identification.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of SSH key used for identification.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The SSH public key. If this is a file, it can be read using the file
     * interpolation function.
     * 
     */
    @Export(name="publicKey", refs={String.class}, tree="[0]")
    private Output<String> publicKey;

    /**
     * @return The SSH public key. If this is a file, it can be read using the file
     * interpolation function.
     * 
     */
    public Output<String> publicKey() {
        return this.publicKey;
    }
    /**
     * The unique identifier of the key
     * 
     */
    @Export(name="uuid", refs={String.class}, tree="[0]")
    private Output<String> uuid;

    /**
     * @return The unique identifier of the key
     * 
     */
    public Output<String> uuid() {
        return this.uuid;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SshKey(String name) {
        this(name, SshKeyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SshKey(String name, SshKeyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SshKey(String name, SshKeyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("equinix:networkedge/sshKey:SshKey", name, args == null ? SshKeyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SshKey(String name, Output<String> id, @Nullable SshKeyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("equinix:networkedge/sshKey:SshKey", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
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
    public static SshKey get(String name, Output<String> id, @Nullable SshKeyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SshKey(name, id, state, options);
    }
}
