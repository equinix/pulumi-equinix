// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.networkedge;

import com.equinix.pulumi.Utilities;
import com.equinix.pulumi.networkedge.SshUserArgs;
import com.equinix.pulumi.networkedge.inputs.SshUserState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Resource `equinix.networkedge.SshUser` allows creation and management of Equinix Network
 * Edge SSH users.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.equinix.pulumi.networkedge.SshUser;
 * import com.equinix.pulumi.networkedge.SshUserArgs;
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
 *         final var config = ctx.config();
 *         final var device1Id = config.get(&#34;device1Id&#34;).get();
 *         final var device2Id = config.get(&#34;device2Id&#34;).get();
 *         var sshUser = new SshUser(&#34;sshUser&#34;, SshUserArgs.builder()        
 *             .username(&#34;johnKent&#34;)
 *             .deviceIds(            
 *                 device1Id,
 *                 device2Id)
 *             .build());
 * 
 *         ctx.export(&#34;sshUserId&#34;, sshUser.id());
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * This resource can be imported using an existing ID:&lt;break&gt;&lt;break&gt; ```sh&lt;break&gt; $ pulumi import equinix:networkedge/sshUser:SshUser example {existing_id} &lt;break&gt;```&lt;break&gt;&lt;break&gt;
 * 
 */
@ResourceType(type="equinix:networkedge/sshUser:SshUser")
public class SshUser extends com.pulumi.resources.CustomResource {
    /**
     * list of device identifiers to which user will have access.
     * 
     */
    @Export(name="deviceIds", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> deviceIds;

    /**
     * @return list of device identifiers to which user will have access.
     * 
     */
    public Output<List<String>> deviceIds() {
        return this.deviceIds;
    }
    /**
     * SSH user password.
     * 
     */
    @Export(name="password", refs={String.class}, tree="[0]")
    private Output<String> password;

    /**
     * @return SSH user password.
     * 
     */
    public Output<String> password() {
        return this.password;
    }
    /**
     * SSH user login name.
     * 
     */
    @Export(name="username", refs={String.class}, tree="[0]")
    private Output<String> username;

    /**
     * @return SSH user login name.
     * 
     */
    public Output<String> username() {
        return this.username;
    }
    /**
     * SSH user unique identifier.
     * 
     */
    @Export(name="uuid", refs={String.class}, tree="[0]")
    private Output<String> uuid;

    /**
     * @return SSH user unique identifier.
     * 
     */
    public Output<String> uuid() {
        return this.uuid;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SshUser(String name) {
        this(name, SshUserArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SshUser(String name, SshUserArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SshUser(String name, SshUserArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("equinix:networkedge/sshUser:SshUser", name, args == null ? SshUserArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SshUser(String name, Output<String> id, @Nullable SshUserState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("equinix:networkedge/sshUser:SshUser", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "password"
            ))
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
    public static SshUser get(String name, Output<String> id, @Nullable SshUserState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SshUser(name, id, state, options);
    }
}
