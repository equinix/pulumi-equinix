// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.equinix.fabric.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetConnectionASideAccessPointProfileAccessPointTypeConfigAuthenticationKey {
    /**
     * @return Customer-provided connection description
     * 
     */
    private String description;
    private String label;
    private Boolean required;

    private GetConnectionASideAccessPointProfileAccessPointTypeConfigAuthenticationKey() {}
    /**
     * @return Customer-provided connection description
     * 
     */
    public String description() {
        return this.description;
    }
    public String label() {
        return this.label;
    }
    public Boolean required() {
        return this.required;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConnectionASideAccessPointProfileAccessPointTypeConfigAuthenticationKey defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String description;
        private String label;
        private Boolean required;
        public Builder() {}
        public Builder(GetConnectionASideAccessPointProfileAccessPointTypeConfigAuthenticationKey defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.label = defaults.label;
    	      this.required = defaults.required;
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
        public Builder required(Boolean required) {
            this.required = Objects.requireNonNull(required);
            return this;
        }
        public GetConnectionASideAccessPointProfileAccessPointTypeConfigAuthenticationKey build() {
            final var o = new GetConnectionASideAccessPointProfileAccessPointTypeConfigAuthenticationKey();
            o.description = description;
            o.label = label;
            o.required = required;
            return o;
        }
    }
}
