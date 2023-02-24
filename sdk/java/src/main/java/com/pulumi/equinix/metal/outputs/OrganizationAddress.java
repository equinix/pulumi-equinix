// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.equinix.metal.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OrganizationAddress {
    /**
     * @return Postal address.
     * 
     */
    private String address;
    /**
     * @return City name.
     * 
     */
    private String city;
    /**
     * @return Two letter country code (ISO 3166-1 alpha-2), e.g. US.
     * 
     */
    private String country;
    /**
     * @return State name.
     * 
     */
    private @Nullable String state;
    /**
     * @return Zip Code.
     * 
     */
    private String zipCode;

    private OrganizationAddress() {}
    /**
     * @return Postal address.
     * 
     */
    public String address() {
        return this.address;
    }
    /**
     * @return City name.
     * 
     */
    public String city() {
        return this.city;
    }
    /**
     * @return Two letter country code (ISO 3166-1 alpha-2), e.g. US.
     * 
     */
    public String country() {
        return this.country;
    }
    /**
     * @return State name.
     * 
     */
    public Optional<String> state() {
        return Optional.ofNullable(this.state);
    }
    /**
     * @return Zip Code.
     * 
     */
    public String zipCode() {
        return this.zipCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OrganizationAddress defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String address;
        private String city;
        private String country;
        private @Nullable String state;
        private String zipCode;
        public Builder() {}
        public Builder(OrganizationAddress defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.city = defaults.city;
    	      this.country = defaults.country;
    	      this.state = defaults.state;
    	      this.zipCode = defaults.zipCode;
        }

        @CustomType.Setter
        public Builder address(String address) {
            this.address = Objects.requireNonNull(address);
            return this;
        }
        @CustomType.Setter
        public Builder city(String city) {
            this.city = Objects.requireNonNull(city);
            return this;
        }
        @CustomType.Setter
        public Builder country(String country) {
            this.country = Objects.requireNonNull(country);
            return this;
        }
        @CustomType.Setter
        public Builder state(@Nullable String state) {
            this.state = state;
            return this;
        }
        @CustomType.Setter
        public Builder zipCode(String zipCode) {
            this.zipCode = Objects.requireNonNull(zipCode);
            return this;
        }
        public OrganizationAddress build() {
            final var o = new OrganizationAddress();
            o.address = address;
            o.city = city;
            o.country = country;
            o.state = state;
            o.zipCode = zipCode;
            return o;
        }
    }
}
