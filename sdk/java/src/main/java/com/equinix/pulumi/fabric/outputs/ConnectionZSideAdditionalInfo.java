// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ConnectionZSideAdditionalInfo {
    /**
     * @return Additional information key
     * 
     */
    private @Nullable String key;
    /**
     * @return Additional information value
     * 
     */
    private @Nullable String value;

    private ConnectionZSideAdditionalInfo() {}
    /**
     * @return Additional information key
     * 
     */
    public Optional<String> key() {
        return Optional.ofNullable(this.key);
    }
    /**
     * @return Additional information value
     * 
     */
    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionZSideAdditionalInfo defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String key;
        private @Nullable String value;
        public Builder() {}
        public Builder(ConnectionZSideAdditionalInfo defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder key(@Nullable String key) {

            this.key = key;
            return this;
        }
        @CustomType.Setter
        public Builder value(@Nullable String value) {

            this.value = value;
            return this;
        }
        public ConnectionZSideAdditionalInfo build() {
            final var _resultValue = new ConnectionZSideAdditionalInfo();
            _resultValue.key = key;
            _resultValue.value = value;
            return _resultValue;
        }
    }
}
