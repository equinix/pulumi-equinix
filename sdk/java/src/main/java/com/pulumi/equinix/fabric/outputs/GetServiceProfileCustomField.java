// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.equinix.fabric.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetServiceProfileCustomField {
    private Boolean captureInEmail;
    private String dataType;
    /**
     * @return User-provided service description
     * 
     */
    private String description;
    private String label;
    private List<String> options;
    private Boolean required;

    private GetServiceProfileCustomField() {}
    public Boolean captureInEmail() {
        return this.captureInEmail;
    }
    public String dataType() {
        return this.dataType;
    }
    /**
     * @return User-provided service description
     * 
     */
    public String description() {
        return this.description;
    }
    public String label() {
        return this.label;
    }
    public List<String> options() {
        return this.options;
    }
    public Boolean required() {
        return this.required;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceProfileCustomField defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean captureInEmail;
        private String dataType;
        private String description;
        private String label;
        private List<String> options;
        private Boolean required;
        public Builder() {}
        public Builder(GetServiceProfileCustomField defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.captureInEmail = defaults.captureInEmail;
    	      this.dataType = defaults.dataType;
    	      this.description = defaults.description;
    	      this.label = defaults.label;
    	      this.options = defaults.options;
    	      this.required = defaults.required;
        }

        @CustomType.Setter
        public Builder captureInEmail(Boolean captureInEmail) {
            this.captureInEmail = Objects.requireNonNull(captureInEmail);
            return this;
        }
        @CustomType.Setter
        public Builder dataType(String dataType) {
            this.dataType = Objects.requireNonNull(dataType);
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder label(String label) {
            this.label = Objects.requireNonNull(label);
            return this;
        }
        @CustomType.Setter
        public Builder options(List<String> options) {
            this.options = Objects.requireNonNull(options);
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
        public GetServiceProfileCustomField build() {
            final var o = new GetServiceProfileCustomField();
            o.captureInEmail = captureInEmail;
            o.dataType = dataType;
            o.description = description;
            o.label = label;
            o.options = options;
            o.required = required;
            return o;
        }
    }
}
