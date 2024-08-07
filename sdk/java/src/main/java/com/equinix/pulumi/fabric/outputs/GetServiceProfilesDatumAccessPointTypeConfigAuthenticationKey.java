// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetServiceProfilesDatumAccessPointTypeConfigAuthenticationKey {
    /**
     * @return Description of authorization key
     * 
     */
    private @Nullable String description;
    /**
     * @return Name of the parameter that must be provided to authorize the connection.
     * 
     */
    private @Nullable String label;
    /**
     * @return Requirement to configure an authentication key.
     * 
     */
    private @Nullable Boolean required;

    private GetServiceProfilesDatumAccessPointTypeConfigAuthenticationKey() {}
    /**
     * @return Description of authorization key
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return Name of the parameter that must be provided to authorize the connection.
     * 
     */
    public Optional<String> label() {
        return Optional.ofNullable(this.label);
    }
    /**
     * @return Requirement to configure an authentication key.
     * 
     */
    public Optional<Boolean> required() {
        return Optional.ofNullable(this.required);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceProfilesDatumAccessPointTypeConfigAuthenticationKey defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String description;
        private @Nullable String label;
        private @Nullable Boolean required;
        public Builder() {}
        public Builder(GetServiceProfilesDatumAccessPointTypeConfigAuthenticationKey defaults) {
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
        public GetServiceProfilesDatumAccessPointTypeConfigAuthenticationKey build() {
            final var _resultValue = new GetServiceProfilesDatumAccessPointTypeConfigAuthenticationKey();
            _resultValue.description = description;
            _resultValue.label = label;
            _resultValue.required = required;
            return _resultValue;
        }
    }
}
