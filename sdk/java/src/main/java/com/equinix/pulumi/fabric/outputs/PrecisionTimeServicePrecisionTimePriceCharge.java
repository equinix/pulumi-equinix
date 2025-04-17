// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PrecisionTimeServicePrecisionTimePriceCharge {
    /**
     * @return Offering price
     * 
     */
    private @Nullable Double price;
    /**
     * @return Price charge type; MONTHLY*RECURRING, NON*RECURRING
     * 
     */
    private @Nullable String type;

    private PrecisionTimeServicePrecisionTimePriceCharge() {}
    /**
     * @return Offering price
     * 
     */
    public Optional<Double> price() {
        return Optional.ofNullable(this.price);
    }
    /**
     * @return Price charge type; MONTHLY*RECURRING, NON*RECURRING
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrecisionTimeServicePrecisionTimePriceCharge defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Double price;
        private @Nullable String type;
        public Builder() {}
        public Builder(PrecisionTimeServicePrecisionTimePriceCharge defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.price = defaults.price;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder price(@Nullable Double price) {

            this.price = price;
            return this;
        }
        @CustomType.Setter
        public Builder type(@Nullable String type) {

            this.type = type;
            return this;
        }
        public PrecisionTimeServicePrecisionTimePriceCharge build() {
            final var _resultValue = new PrecisionTimeServicePrecisionTimePriceCharge();
            _resultValue.price = price;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
