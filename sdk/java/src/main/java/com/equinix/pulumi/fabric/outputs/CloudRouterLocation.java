// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CloudRouterLocation {
    /**
     * @return IBX Code
     * 
     */
    private @Nullable String ibx;
    /**
     * @return Access point metro code
     * 
     */
    private @Nullable String metroCode;
    /**
     * @return Access point metro name
     * 
     */
    private @Nullable String metroName;
    /**
     * @return Access point region
     * 
     */
    private @Nullable String region;

    private CloudRouterLocation() {}
    /**
     * @return IBX Code
     * 
     */
    public Optional<String> ibx() {
        return Optional.ofNullable(this.ibx);
    }
    /**
     * @return Access point metro code
     * 
     */
    public Optional<String> metroCode() {
        return Optional.ofNullable(this.metroCode);
    }
    /**
     * @return Access point metro name
     * 
     */
    public Optional<String> metroName() {
        return Optional.ofNullable(this.metroName);
    }
    /**
     * @return Access point region
     * 
     */
    public Optional<String> region() {
        return Optional.ofNullable(this.region);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CloudRouterLocation defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String ibx;
        private @Nullable String metroCode;
        private @Nullable String metroName;
        private @Nullable String region;
        public Builder() {}
        public Builder(CloudRouterLocation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ibx = defaults.ibx;
    	      this.metroCode = defaults.metroCode;
    	      this.metroName = defaults.metroName;
    	      this.region = defaults.region;
        }

        @CustomType.Setter
        public Builder ibx(@Nullable String ibx) {

            this.ibx = ibx;
            return this;
        }
        @CustomType.Setter
        public Builder metroCode(@Nullable String metroCode) {

            this.metroCode = metroCode;
            return this;
        }
        @CustomType.Setter
        public Builder metroName(@Nullable String metroName) {

            this.metroName = metroName;
            return this;
        }
        @CustomType.Setter
        public Builder region(@Nullable String region) {

            this.region = region;
            return this;
        }
        public CloudRouterLocation build() {
            final var _resultValue = new CloudRouterLocation();
            _resultValue.ibx = ibx;
            _resultValue.metroCode = metroCode;
            _resultValue.metroName = metroName;
            _resultValue.region = region;
            return _resultValue;
        }
    }
}
