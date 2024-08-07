// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.metal.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OrganizationAddressArgs extends com.pulumi.resources.ResourceArgs {

    public static final OrganizationAddressArgs Empty = new OrganizationAddressArgs();

    /**
     * Postal address.
     * 
     */
    @Import(name="address", required=true)
    private Output<String> address;

    /**
     * @return Postal address.
     * 
     */
    public Output<String> address() {
        return this.address;
    }

    /**
     * City name.
     * 
     */
    @Import(name="city", required=true)
    private Output<String> city;

    /**
     * @return City name.
     * 
     */
    public Output<String> city() {
        return this.city;
    }

    /**
     * Two letter country code (ISO 3166-1 alpha-2), e.g. US.
     * 
     */
    @Import(name="country", required=true)
    private Output<String> country;

    /**
     * @return Two letter country code (ISO 3166-1 alpha-2), e.g. US.
     * 
     */
    public Output<String> country() {
        return this.country;
    }

    /**
     * State name.
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return State name.
     * 
     */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * Zip Code.
     * 
     */
    @Import(name="zipCode", required=true)
    private Output<String> zipCode;

    /**
     * @return Zip Code.
     * 
     */
    public Output<String> zipCode() {
        return this.zipCode;
    }

    private OrganizationAddressArgs() {}

    private OrganizationAddressArgs(OrganizationAddressArgs $) {
        this.address = $.address;
        this.city = $.city;
        this.country = $.country;
        this.state = $.state;
        this.zipCode = $.zipCode;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OrganizationAddressArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OrganizationAddressArgs $;

        public Builder() {
            $ = new OrganizationAddressArgs();
        }

        public Builder(OrganizationAddressArgs defaults) {
            $ = new OrganizationAddressArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param address Postal address.
         * 
         * @return builder
         * 
         */
        public Builder address(Output<String> address) {
            $.address = address;
            return this;
        }

        /**
         * @param address Postal address.
         * 
         * @return builder
         * 
         */
        public Builder address(String address) {
            return address(Output.of(address));
        }

        /**
         * @param city City name.
         * 
         * @return builder
         * 
         */
        public Builder city(Output<String> city) {
            $.city = city;
            return this;
        }

        /**
         * @param city City name.
         * 
         * @return builder
         * 
         */
        public Builder city(String city) {
            return city(Output.of(city));
        }

        /**
         * @param country Two letter country code (ISO 3166-1 alpha-2), e.g. US.
         * 
         * @return builder
         * 
         */
        public Builder country(Output<String> country) {
            $.country = country;
            return this;
        }

        /**
         * @param country Two letter country code (ISO 3166-1 alpha-2), e.g. US.
         * 
         * @return builder
         * 
         */
        public Builder country(String country) {
            return country(Output.of(country));
        }

        /**
         * @param state State name.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state State name.
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        /**
         * @param zipCode Zip Code.
         * 
         * @return builder
         * 
         */
        public Builder zipCode(Output<String> zipCode) {
            $.zipCode = zipCode;
            return this;
        }

        /**
         * @param zipCode Zip Code.
         * 
         * @return builder
         * 
         */
        public Builder zipCode(String zipCode) {
            return zipCode(Output.of(zipCode));
        }

        public OrganizationAddressArgs build() {
            if ($.address == null) {
                throw new MissingRequiredPropertyException("OrganizationAddressArgs", "address");
            }
            if ($.city == null) {
                throw new MissingRequiredPropertyException("OrganizationAddressArgs", "city");
            }
            if ($.country == null) {
                throw new MissingRequiredPropertyException("OrganizationAddressArgs", "country");
            }
            if ($.zipCode == null) {
                throw new MissingRequiredPropertyException("OrganizationAddressArgs", "zipCode");
            }
            return $;
        }
    }

}
