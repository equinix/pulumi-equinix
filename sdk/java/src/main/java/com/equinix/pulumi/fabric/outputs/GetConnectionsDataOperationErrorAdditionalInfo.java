// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetConnectionsDataOperationErrorAdditionalInfo {
    /**
     * @return Property at which the error potentially occurred
     * 
     */
    private String property;
    /**
     * @return Reason for the error
     * 
     */
    private String reason;

    private GetConnectionsDataOperationErrorAdditionalInfo() {}
    /**
     * @return Property at which the error potentially occurred
     * 
     */
    public String property() {
        return this.property;
    }
    /**
     * @return Reason for the error
     * 
     */
    public String reason() {
        return this.reason;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConnectionsDataOperationErrorAdditionalInfo defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String property;
        private String reason;
        public Builder() {}
        public Builder(GetConnectionsDataOperationErrorAdditionalInfo defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.property = defaults.property;
    	      this.reason = defaults.reason;
        }

        @CustomType.Setter
        public Builder property(String property) {
            this.property = Objects.requireNonNull(property);
            return this;
        }
        @CustomType.Setter
        public Builder reason(String reason) {
            this.reason = Objects.requireNonNull(reason);
            return this;
        }
        public GetConnectionsDataOperationErrorAdditionalInfo build() {
            final var _resultValue = new GetConnectionsDataOperationErrorAdditionalInfo();
            _resultValue.property = property;
            _resultValue.reason = reason;
            return _resultValue;
        }
    }
}
