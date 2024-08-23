// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.metal.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetOrganizationAddress {
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
    private String state;
    /**
     * @return Zip Code.
     * 
     */
    private String zipCode;

    private GetOrganizationAddress() {}
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
    public String state() {
        return this.state;
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

    public static Builder builder(GetOrganizationAddress defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String address;
        private String city;
        private String country;
        private String state;
        private String zipCode;
        public Builder() {}
        public Builder(GetOrganizationAddress defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.city = defaults.city;
    	      this.country = defaults.country;
    	      this.state = defaults.state;
    	      this.zipCode = defaults.zipCode;
        }

        @CustomType.Setter
        public Builder address(String address) {
            if (address == null) {
              throw new MissingRequiredPropertyException("GetOrganizationAddress", "address");
            }
            this.address = address;
            return this;
        }
        @CustomType.Setter
        public Builder city(String city) {
            if (city == null) {
              throw new MissingRequiredPropertyException("GetOrganizationAddress", "city");
            }
            this.city = city;
            return this;
        }
        @CustomType.Setter
        public Builder country(String country) {
            if (country == null) {
              throw new MissingRequiredPropertyException("GetOrganizationAddress", "country");
            }
            this.country = country;
            return this;
        }
        @CustomType.Setter
        public Builder state(String state) {
            if (state == null) {
              throw new MissingRequiredPropertyException("GetOrganizationAddress", "state");
            }
            this.state = state;
            return this;
        }
        @CustomType.Setter
        public Builder zipCode(String zipCode) {
            if (zipCode == null) {
              throw new MissingRequiredPropertyException("GetOrganizationAddress", "zipCode");
            }
            this.zipCode = zipCode;
            return this;
        }
        public GetOrganizationAddress build() {
            final var _resultValue = new GetOrganizationAddress();
            _resultValue.address = address;
            _resultValue.city = city;
            _resultValue.country = country;
            _resultValue.state = state;
            _resultValue.zipCode = zipCode;
            return _resultValue;
        }
    }
}