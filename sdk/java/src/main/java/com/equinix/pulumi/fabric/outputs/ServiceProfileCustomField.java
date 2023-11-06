// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceProfileCustomField {
    /**
     * @return Required field
     * 
     */
    private @Nullable Boolean captureInEmail;
    /**
     * @return Data type
     * 
     */
    private String dataType;
    /**
     * @return Description
     * 
     */
    private @Nullable String description;
    /**
     * @return Label
     * 
     */
    private String label;
    /**
     * @return Options
     * 
     */
    private @Nullable List<String> options;
    /**
     * @return Required field
     * 
     */
    private Boolean required;

    private ServiceProfileCustomField() {}
    /**
     * @return Required field
     * 
     */
    public Optional<Boolean> captureInEmail() {
        return Optional.ofNullable(this.captureInEmail);
    }
    /**
     * @return Data type
     * 
     */
    public String dataType() {
        return this.dataType;
    }
    /**
     * @return Description
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return Label
     * 
     */
    public String label() {
        return this.label;
    }
    /**
     * @return Options
     * 
     */
    public List<String> options() {
        return this.options == null ? List.of() : this.options;
    }
    /**
     * @return Required field
     * 
     */
    public Boolean required() {
        return this.required;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceProfileCustomField defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean captureInEmail;
        private String dataType;
        private @Nullable String description;
        private String label;
        private @Nullable List<String> options;
        private Boolean required;
        public Builder() {}
        public Builder(ServiceProfileCustomField defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.captureInEmail = defaults.captureInEmail;
    	      this.dataType = defaults.dataType;
    	      this.description = defaults.description;
    	      this.label = defaults.label;
    	      this.options = defaults.options;
    	      this.required = defaults.required;
        }

        @CustomType.Setter
        public Builder captureInEmail(@Nullable Boolean captureInEmail) {
            this.captureInEmail = captureInEmail;
            return this;
        }
        @CustomType.Setter
        public Builder dataType(String dataType) {
            this.dataType = Objects.requireNonNull(dataType);
            return this;
        }
        @CustomType.Setter
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder label(String label) {
            this.label = Objects.requireNonNull(label);
            return this;
        }
        @CustomType.Setter
        public Builder options(@Nullable List<String> options) {
            this.options = options;
            return this;
        }
        public Builder options(String... options) {
            return options(List.of(options));
        }
        @CustomType.Setter
        public Builder required(Boolean required) {
            this.required = Objects.requireNonNull(required);
            return this;
        }
        public ServiceProfileCustomField build() {
            final var _resultValue = new ServiceProfileCustomField();
            _resultValue.captureInEmail = captureInEmail;
            _resultValue.dataType = dataType;
            _resultValue.description = description;
            _resultValue.label = label;
            _resultValue.options = options;
            _resultValue.required = required;
            return _resultValue;
        }
    }
}
