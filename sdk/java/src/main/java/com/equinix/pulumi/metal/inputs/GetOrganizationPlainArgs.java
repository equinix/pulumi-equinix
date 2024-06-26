// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.metal.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetOrganizationPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetOrganizationPlainArgs Empty = new GetOrganizationPlainArgs();

    /**
     * Description string.
     * 
     */
    @Import(name="description")
    private @Nullable String description;

    /**
     * @return Description string.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The organization name.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return The organization name.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The UUID of the organization resource.
     * 
     * Exactly one of `name` or `organization_id` must be given.
     * 
     */
    @Import(name="organizationId")
    private @Nullable String organizationId;

    /**
     * @return The UUID of the organization resource.
     * 
     * Exactly one of `name` or `organization_id` must be given.
     * 
     */
    public Optional<String> organizationId() {
        return Optional.ofNullable(this.organizationId);
    }

    private GetOrganizationPlainArgs() {}

    private GetOrganizationPlainArgs(GetOrganizationPlainArgs $) {
        this.description = $.description;
        this.name = $.name;
        this.organizationId = $.organizationId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetOrganizationPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetOrganizationPlainArgs $;

        public Builder() {
            $ = new GetOrganizationPlainArgs();
        }

        public Builder(GetOrganizationPlainArgs defaults) {
            $ = new GetOrganizationPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description Description string.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable String description) {
            $.description = description;
            return this;
        }

        /**
         * @param name The organization name.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        /**
         * @param organizationId The UUID of the organization resource.
         * 
         * Exactly one of `name` or `organization_id` must be given.
         * 
         * @return builder
         * 
         */
        public Builder organizationId(@Nullable String organizationId) {
            $.organizationId = organizationId;
            return this;
        }

        public GetOrganizationPlainArgs build() {
            return $;
        }
    }

}
