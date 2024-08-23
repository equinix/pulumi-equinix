// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.metal.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetSpotMarketPriceResult {
    /**
     * @deprecated
     * Use metro instead of facility.  For more information, read the migration guide: https://registry.terraform.io/providers/equinix/equinix/latest/docs/guides/migration_guide_facilities_to_metros_devices
     * 
     */
    @Deprecated /* Use metro instead of facility.  For more information, read the migration guide: https://registry.terraform.io/providers/equinix/equinix/latest/docs/guides/migration_guide_facilities_to_metros_devices */
    private @Nullable String facility;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private @Nullable String metro;
    private String plan;
    /**
     * @return Current spot market price for given plan in given facility.
     * 
     */
    private Double price;

    private GetSpotMarketPriceResult() {}
    /**
     * @deprecated
     * Use metro instead of facility.  For more information, read the migration guide: https://registry.terraform.io/providers/equinix/equinix/latest/docs/guides/migration_guide_facilities_to_metros_devices
     * 
     */
    @Deprecated /* Use metro instead of facility.  For more information, read the migration guide: https://registry.terraform.io/providers/equinix/equinix/latest/docs/guides/migration_guide_facilities_to_metros_devices */
    public Optional<String> facility() {
        return Optional.ofNullable(this.facility);
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public Optional<String> metro() {
        return Optional.ofNullable(this.metro);
    }
    public String plan() {
        return this.plan;
    }
    /**
     * @return Current spot market price for given plan in given facility.
     * 
     */
    public Double price() {
        return this.price;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSpotMarketPriceResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String facility;
        private String id;
        private @Nullable String metro;
        private String plan;
        private Double price;
        public Builder() {}
        public Builder(GetSpotMarketPriceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.facility = defaults.facility;
    	      this.id = defaults.id;
    	      this.metro = defaults.metro;
    	      this.plan = defaults.plan;
    	      this.price = defaults.price;
        }

        @CustomType.Setter
        public Builder facility(@Nullable String facility) {

            this.facility = facility;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetSpotMarketPriceResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder metro(@Nullable String metro) {

            this.metro = metro;
            return this;
        }
        @CustomType.Setter
        public Builder plan(String plan) {
            if (plan == null) {
              throw new MissingRequiredPropertyException("GetSpotMarketPriceResult", "plan");
            }
            this.plan = plan;
            return this;
        }
        @CustomType.Setter
        public Builder price(Double price) {
            if (price == null) {
              throw new MissingRequiredPropertyException("GetSpotMarketPriceResult", "price");
            }
            this.price = price;
            return this;
        }
        public GetSpotMarketPriceResult build() {
            final var _resultValue = new GetSpotMarketPriceResult();
            _resultValue.facility = facility;
            _resultValue.id = id;
            _resultValue.metro = metro;
            _resultValue.plan = plan;
            _resultValue.price = price;
            return _resultValue;
        }
    }
}