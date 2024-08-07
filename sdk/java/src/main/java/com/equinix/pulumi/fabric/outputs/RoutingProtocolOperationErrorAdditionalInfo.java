// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RoutingProtocolOperationErrorAdditionalInfo {
    /**
     * @return Property at which the error potentially occurred
     * 
     */
    private @Nullable String property;
    /**
     * @return Reason for the error
     * 
     */
    private @Nullable String reason;

    private RoutingProtocolOperationErrorAdditionalInfo() {}
    /**
     * @return Property at which the error potentially occurred
     * 
     */
    public Optional<String> property() {
        return Optional.ofNullable(this.property);
    }
    /**
     * @return Reason for the error
     * 
     */
    public Optional<String> reason() {
        return Optional.ofNullable(this.reason);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RoutingProtocolOperationErrorAdditionalInfo defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String property;
        private @Nullable String reason;
        public Builder() {}
        public Builder(RoutingProtocolOperationErrorAdditionalInfo defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.property = defaults.property;
    	      this.reason = defaults.reason;
        }

        @CustomType.Setter
        public Builder property(@Nullable String property) {

            this.property = property;
            return this;
        }
        @CustomType.Setter
        public Builder reason(@Nullable String reason) {

            this.reason = reason;
            return this;
        }
        public RoutingProtocolOperationErrorAdditionalInfo build() {
            final var _resultValue = new RoutingProtocolOperationErrorAdditionalInfo();
            _resultValue.property = property;
            _resultValue.reason = reason;
            return _resultValue;
        }
    }
}
