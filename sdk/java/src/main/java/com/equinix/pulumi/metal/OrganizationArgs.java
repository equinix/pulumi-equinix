// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.metal;

import com.equinix.pulumi.metal.inputs.OrganizationAddressArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OrganizationArgs extends com.pulumi.resources.ResourceArgs {

    public static final OrganizationArgs Empty = new OrganizationArgs();

    /**
     * An object that has the address information. See Address below for more details.
     * 
     */
    @Import(name="address")
    private @Nullable Output<OrganizationAddressArgs> address;

    /**
     * @return An object that has the address information. See Address below for more details.
     * 
     */
    public Optional<Output<OrganizationAddressArgs>> address() {
        return Optional.ofNullable(this.address);
    }

    /**
     * Description string.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Description string.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Logo URL.
     * 
     * @deprecated
     * The default (empty string) is the only valid value. Support for this field has been removed from the API
     * 
     */
    @Deprecated /* The default (empty string) is the only valid value. Support for this field has been removed from the API */
    @Import(name="logo")
    private @Nullable Output<String> logo;

    /**
     * @return Logo URL.
     * 
     * @deprecated
     * The default (empty string) is the only valid value. Support for this field has been removed from the API
     * 
     */
    @Deprecated /* The default (empty string) is the only valid value. Support for this field has been removed from the API */
    public Optional<Output<String>> logo() {
        return Optional.ofNullable(this.logo);
    }

    /**
     * The name of the Organization.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the Organization.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Twitter handle.
     * 
     */
    @Import(name="twitter")
    private @Nullable Output<String> twitter;

    /**
     * @return Twitter handle.
     * 
     */
    public Optional<Output<String>> twitter() {
        return Optional.ofNullable(this.twitter);
    }

    /**
     * Website link.
     * 
     */
    @Import(name="website")
    private @Nullable Output<String> website;

    /**
     * @return Website link.
     * 
     */
    public Optional<Output<String>> website() {
        return Optional.ofNullable(this.website);
    }

    private OrganizationArgs() {}

    private OrganizationArgs(OrganizationArgs $) {
        this.address = $.address;
        this.description = $.description;
        this.logo = $.logo;
        this.name = $.name;
        this.twitter = $.twitter;
        this.website = $.website;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OrganizationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OrganizationArgs $;

        public Builder() {
            $ = new OrganizationArgs();
        }

        public Builder(OrganizationArgs defaults) {
            $ = new OrganizationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param address An object that has the address information. See Address below for more details.
         * 
         * @return builder
         * 
         */
        public Builder address(@Nullable Output<OrganizationAddressArgs> address) {
            $.address = address;
            return this;
        }

        /**
         * @param address An object that has the address information. See Address below for more details.
         * 
         * @return builder
         * 
         */
        public Builder address(OrganizationAddressArgs address) {
            return address(Output.of(address));
        }

        /**
         * @param description Description string.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description string.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param logo Logo URL.
         * 
         * @return builder
         * 
         * @deprecated
         * The default (empty string) is the only valid value. Support for this field has been removed from the API
         * 
         */
        @Deprecated /* The default (empty string) is the only valid value. Support for this field has been removed from the API */
        public Builder logo(@Nullable Output<String> logo) {
            $.logo = logo;
            return this;
        }

        /**
         * @param logo Logo URL.
         * 
         * @return builder
         * 
         * @deprecated
         * The default (empty string) is the only valid value. Support for this field has been removed from the API
         * 
         */
        @Deprecated /* The default (empty string) is the only valid value. Support for this field has been removed from the API */
        public Builder logo(String logo) {
            return logo(Output.of(logo));
        }

        /**
         * @param name The name of the Organization.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the Organization.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param twitter Twitter handle.
         * 
         * @return builder
         * 
         */
        public Builder twitter(@Nullable Output<String> twitter) {
            $.twitter = twitter;
            return this;
        }

        /**
         * @param twitter Twitter handle.
         * 
         * @return builder
         * 
         */
        public Builder twitter(String twitter) {
            return twitter(Output.of(twitter));
        }

        /**
         * @param website Website link.
         * 
         * @return builder
         * 
         */
        public Builder website(@Nullable Output<String> website) {
            $.website = website;
            return this;
        }

        /**
         * @param website Website link.
         * 
         * @return builder
         * 
         */
        public Builder website(String website) {
            return website(Output.of(website));
        }

        public OrganizationArgs build() {
            return $;
        }
    }

}
