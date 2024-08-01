// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.metal;

import com.equinix.pulumi.Utilities;
import com.equinix.pulumi.metal.UserApiKeyArgs;
import com.equinix.pulumi.metal.inputs.UserApiKeyState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Use this resource to create Metal User API Key resources in Equinix Metal. Each API key contains a token which can be used for authentication in Equinix Metal HTTP API (in HTTP request header `X-Auth-Token`).
 * 
 * Read-only keys only allow to list and view existing resources, read-write keys can also be used to create resources.
 * 
 * ## Example Usage
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.equinix.metal.UserApiKey;
 * import com.pulumi.equinix.metal.UserApiKeyArgs;
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
 *         var test = new UserApiKey("test", UserApiKeyArgs.builder()
 *             .description("Read-only user key")
 *             .readOnly(true)
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * 
 */
@ResourceType(type="equinix:metal/userApiKey:UserApiKey")
public class UserApiKey extends com.pulumi.resources.CustomResource {
    /**
     * Description string for the User API Key resource.
     * * `read-only` - (Required) Flag indicating whether the API key shoud be read-only.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output<String> description;

    /**
     * @return Description string for the User API Key resource.
     * * `read-only` - (Required) Flag indicating whether the API key shoud be read-only.
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * Flag indicating whether the API key shoud be read-only
     * 
     */
    @Export(name="readOnly", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> readOnly;

    /**
     * @return Flag indicating whether the API key shoud be read-only
     * 
     */
    public Output<Boolean> readOnly() {
        return this.readOnly;
    }
    /**
     * API token which can be used in Equinix Metal API clients.
     * 
     */
    @Export(name="token", refs={String.class}, tree="[0]")
    private Output<String> token;

    /**
     * @return API token which can be used in Equinix Metal API clients.
     * 
     */
    public Output<String> token() {
        return this.token;
    }
    /**
     * UUID of the owner of the API key.
     * 
     */
    @Export(name="userId", refs={String.class}, tree="[0]")
    private Output<String> userId;

    /**
     * @return UUID of the owner of the API key.
     * 
     */
    public Output<String> userId() {
        return this.userId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public UserApiKey(String name) {
        this(name, UserApiKeyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public UserApiKey(String name, UserApiKeyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public UserApiKey(String name, UserApiKeyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("equinix:metal/userApiKey:UserApiKey", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()));
    }

    private UserApiKey(String name, Output<String> id, @Nullable UserApiKeyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("equinix:metal/userApiKey:UserApiKey", name, state, makeResourceOptions(options, id));
    }

    private static UserApiKeyArgs makeArgs(UserApiKeyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? UserApiKeyArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "token"
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
    public static UserApiKey get(String name, Output<String> id, @Nullable UserApiKeyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new UserApiKey(name, id, state, options);
    }
}
