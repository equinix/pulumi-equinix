// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.outputs;

import com.equinix.pulumi.fabric.outputs.RoutingProtocolOperationError;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class RoutingProtocolOperation {
    /**
     * @return Errors occurred
     * 
     */
    private @Nullable List<RoutingProtocolOperationError> errors;

    private RoutingProtocolOperation() {}
    /**
     * @return Errors occurred
     * 
     */
    public List<RoutingProtocolOperationError> errors() {
        return this.errors == null ? List.of() : this.errors;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RoutingProtocolOperation defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<RoutingProtocolOperationError> errors;
        public Builder() {}
        public Builder(RoutingProtocolOperation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.errors = defaults.errors;
        }

        @CustomType.Setter
        public Builder errors(@Nullable List<RoutingProtocolOperationError> errors) {

            this.errors = errors;
            return this;
        }
        public Builder errors(RoutingProtocolOperationError... errors) {
            return errors(List.of(errors));
        }
        public RoutingProtocolOperation build() {
            final var _resultValue = new RoutingProtocolOperation();
            _resultValue.errors = errors;
            return _resultValue;
        }
    }
}
