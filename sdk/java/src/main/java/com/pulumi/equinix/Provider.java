// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.equinix;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.equinix.ProviderArgs;
import com.pulumi.equinix.Utilities;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * The provider type for the equinix package. By default, resources use package-wide configuration
 * settings, however an explicit `Provider` instance may be created and passed during resource
 * construction to achieve fine-grained programmatic control over provider settings. See the
 * [documentation](https://www.pulumi.com/docs/reference/programming-model/#providers) for more information.
 * 
 */
@ResourceType(type="pulumi:providers:equinix")
public class Provider extends com.pulumi.resources.ProviderResource {
    /**
     * The Equinix Metal API auth key for API operations
     * 
     */
    @Export(name="authToken", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> authToken;

    /**
     * @return The Equinix Metal API auth key for API operations
     * 
     */
    public Output<Optional<String>> authToken() {
        return Codegen.optional(this.authToken);
    }
    /**
     * API Consumer Key available under My Apps section in developer portal
     * 
     */
    @Export(name="clientId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> clientId;

    /**
     * @return API Consumer Key available under My Apps section in developer portal
     * 
     */
    public Output<Optional<String>> clientId() {
        return Codegen.optional(this.clientId);
    }
    /**
     * API Consumer secret available under My Apps section in developer portal
     * 
     */
    @Export(name="clientSecret", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> clientSecret;

    /**
     * @return API Consumer secret available under My Apps section in developer portal
     * 
     */
    public Output<Optional<String>> clientSecret() {
        return Codegen.optional(this.clientSecret);
    }
    /**
     * The Equinix API base URL to point out desired environment. Defaults to https://api.equinix.com
     * 
     */
    @Export(name="endpoint", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> endpoint;

    /**
     * @return The Equinix API base URL to point out desired environment. Defaults to https://api.equinix.com
     * 
     */
    public Output<Optional<String>> endpoint() {
        return Codegen.optional(this.endpoint);
    }
    /**
     * API token from the developer sandbox
     * 
     */
    @Export(name="token", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> token;

    /**
     * @return API token from the developer sandbox
     * 
     */
    public Output<Optional<String>> token() {
        return Codegen.optional(this.token);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Provider(String name) {
        this(name, ProviderArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Provider(String name, @Nullable ProviderArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Provider(String name, @Nullable ProviderArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("equinix", name, args == null ? ProviderArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

}
