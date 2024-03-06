// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.outputs;

import com.equinix.pulumi.fabric.outputs.RoutingProtocolOperationErrorAdditionalInfo;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RoutingProtocolOperationError {
    /**
     * @return Pricing error additional Info
     * 
     */
    private @Nullable List<RoutingProtocolOperationErrorAdditionalInfo> additionalInfos;
    /**
     * @return CorrelationId
     * 
     */
    private @Nullable String correlationId;
    /**
     * @return Details
     * 
     */
    private @Nullable String details;
    /**
     * @return Error  code
     * 
     */
    private @Nullable String errorCode;
    /**
     * @return Error Message
     * 
     */
    private @Nullable String errorMessage;
    /**
     * @return Help
     * 
     */
    private @Nullable String help;

    private RoutingProtocolOperationError() {}
    /**
     * @return Pricing error additional Info
     * 
     */
    public List<RoutingProtocolOperationErrorAdditionalInfo> additionalInfos() {
        return this.additionalInfos == null ? List.of() : this.additionalInfos;
    }
    /**
     * @return CorrelationId
     * 
     */
    public Optional<String> correlationId() {
        return Optional.ofNullable(this.correlationId);
    }
    /**
     * @return Details
     * 
     */
    public Optional<String> details() {
        return Optional.ofNullable(this.details);
    }
    /**
     * @return Error  code
     * 
     */
    public Optional<String> errorCode() {
        return Optional.ofNullable(this.errorCode);
    }
    /**
     * @return Error Message
     * 
     */
    public Optional<String> errorMessage() {
        return Optional.ofNullable(this.errorMessage);
    }
    /**
     * @return Help
     * 
     */
    public Optional<String> help() {
        return Optional.ofNullable(this.help);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RoutingProtocolOperationError defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<RoutingProtocolOperationErrorAdditionalInfo> additionalInfos;
        private @Nullable String correlationId;
        private @Nullable String details;
        private @Nullable String errorCode;
        private @Nullable String errorMessage;
        private @Nullable String help;
        public Builder() {}
        public Builder(RoutingProtocolOperationError defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalInfos = defaults.additionalInfos;
    	      this.correlationId = defaults.correlationId;
    	      this.details = defaults.details;
    	      this.errorCode = defaults.errorCode;
    	      this.errorMessage = defaults.errorMessage;
    	      this.help = defaults.help;
        }

        @CustomType.Setter
        public Builder additionalInfos(@Nullable List<RoutingProtocolOperationErrorAdditionalInfo> additionalInfos) {
            this.additionalInfos = additionalInfos;
            return this;
        }
        public Builder additionalInfos(RoutingProtocolOperationErrorAdditionalInfo... additionalInfos) {
            return additionalInfos(List.of(additionalInfos));
        }
        @CustomType.Setter
        public Builder correlationId(@Nullable String correlationId) {
            this.correlationId = correlationId;
            return this;
        }
        @CustomType.Setter
        public Builder details(@Nullable String details) {
            this.details = details;
            return this;
        }
        @CustomType.Setter
        public Builder errorCode(@Nullable String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        @CustomType.Setter
        public Builder errorMessage(@Nullable String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        @CustomType.Setter
        public Builder help(@Nullable String help) {
            this.help = help;
            return this;
        }
        public RoutingProtocolOperationError build() {
            final var _resultValue = new RoutingProtocolOperationError();
            _resultValue.additionalInfos = additionalInfos;
            _resultValue.correlationId = correlationId;
            _resultValue.details = details;
            _resultValue.errorCode = errorCode;
            _resultValue.errorMessage = errorMessage;
            _resultValue.help = help;
            return _resultValue;
        }
    }
}
