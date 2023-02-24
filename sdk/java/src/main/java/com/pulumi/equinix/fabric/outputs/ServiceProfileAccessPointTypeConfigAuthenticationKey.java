// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.equinix.fabric.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceProfileAccessPointTypeConfigAuthenticationKey {
    /**
     * @return User-provided service description
     * 
     */
    private @Nullable String description;
    private @Nullable String label;
    private @Nullable Boolean required;

    private ServiceProfileAccessPointTypeConfigAuthenticationKey() {}
    /**
     * @return User-provided service description
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    public Optional<String> label() {
        return Optional.ofNullable(this.label);
    }
    public Optional<Boolean> required() {
        return Optional.ofNullable(this.required);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceProfileAccessPointTypeConfigAuthenticationKey defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String description;
        private @Nullable String label;
        private @Nullable Boolean required;
        public Builder() {}
        public Builder(ServiceProfileAccessPointTypeConfigAuthenticationKey defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.label = defaults.label;
    	      this.required = defaults.required;
        }

        @CustomType.Setter
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder label(@Nullable String label) {
            this.label = label;
            return this;
        }
        @CustomType.Setter
        public Builder required(@Nullable Boolean required) {
            this.required = required;
            return this;
        }
        public ServiceProfileAccessPointTypeConfigAuthenticationKey build() {
            final var o = new ServiceProfileAccessPointTypeConfigAuthenticationKey();
            o.description = description;
            o.label = label;
            o.required = required;
            return o;
        }
    }
}
