// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.equinix.metal.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ConnectionServiceToken {
    private @Nullable String expiresAt;
    private @Nullable String id;
    private @Nullable String maxAllowedSpeed;
    private @Nullable String role;
    private @Nullable String state;
    /**
     * @return Connection type - dedicated or shared.
     * 
     */
    private @Nullable String type;

    private ConnectionServiceToken() {}
    public Optional<String> expiresAt() {
        return Optional.ofNullable(this.expiresAt);
    }
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    public Optional<String> maxAllowedSpeed() {
        return Optional.ofNullable(this.maxAllowedSpeed);
    }
    public Optional<String> role() {
        return Optional.ofNullable(this.role);
    }
    public Optional<String> state() {
        return Optional.ofNullable(this.state);
    }
    /**
     * @return Connection type - dedicated or shared.
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionServiceToken defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String expiresAt;
        private @Nullable String id;
        private @Nullable String maxAllowedSpeed;
        private @Nullable String role;
        private @Nullable String state;
        private @Nullable String type;
        public Builder() {}
        public Builder(ConnectionServiceToken defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expiresAt = defaults.expiresAt;
    	      this.id = defaults.id;
    	      this.maxAllowedSpeed = defaults.maxAllowedSpeed;
    	      this.role = defaults.role;
    	      this.state = defaults.state;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder expiresAt(@Nullable String expiresAt) {
            this.expiresAt = expiresAt;
            return this;
        }
        @CustomType.Setter
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder maxAllowedSpeed(@Nullable String maxAllowedSpeed) {
            this.maxAllowedSpeed = maxAllowedSpeed;
            return this;
        }
        @CustomType.Setter
        public Builder role(@Nullable String role) {
            this.role = role;
            return this;
        }
        @CustomType.Setter
        public Builder state(@Nullable String state) {
            this.state = state;
            return this;
        }
        @CustomType.Setter
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }
        public ConnectionServiceToken build() {
            final var o = new ConnectionServiceToken();
            o.expiresAt = expiresAt;
            o.id = id;
            o.maxAllowedSpeed = maxAllowedSpeed;
            o.role = role;
            o.state = state;
            o.type = type;
            return o;
        }
    }
}
