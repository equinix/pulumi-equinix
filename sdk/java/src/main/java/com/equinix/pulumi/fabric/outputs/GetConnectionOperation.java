// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.outputs;

import com.equinix.pulumi.fabric.outputs.GetConnectionOperationError;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetConnectionOperation {
    private String equinixStatus;
    private List<GetConnectionOperationError> errors;
    private String providerStatus;

    private GetConnectionOperation() {}
    public String equinixStatus() {
        return this.equinixStatus;
    }
    public List<GetConnectionOperationError> errors() {
        return this.errors;
    }
    public String providerStatus() {
        return this.providerStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConnectionOperation defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String equinixStatus;
        private List<GetConnectionOperationError> errors;
        private String providerStatus;
        public Builder() {}
        public Builder(GetConnectionOperation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.equinixStatus = defaults.equinixStatus;
    	      this.errors = defaults.errors;
    	      this.providerStatus = defaults.providerStatus;
        }

        @CustomType.Setter
        public Builder equinixStatus(String equinixStatus) {
            this.equinixStatus = Objects.requireNonNull(equinixStatus);
            return this;
        }
        @CustomType.Setter
        public Builder errors(List<GetConnectionOperationError> errors) {
            this.errors = Objects.requireNonNull(errors);
            return this;
        }
        public Builder errors(GetConnectionOperationError... errors) {
            return errors(List.of(errors));
        }
        @CustomType.Setter
        public Builder providerStatus(String providerStatus) {
            this.providerStatus = Objects.requireNonNull(providerStatus);
            return this;
        }
        public GetConnectionOperation build() {
            final var _resultValue = new GetConnectionOperation();
            _resultValue.equinixStatus = equinixStatus;
            _resultValue.errors = errors;
            _resultValue.providerStatus = providerStatus;
            return _resultValue;
        }
    }
}
