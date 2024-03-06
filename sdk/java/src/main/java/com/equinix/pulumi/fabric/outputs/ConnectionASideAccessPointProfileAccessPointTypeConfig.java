// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ConnectionASideAccessPointProfileAccessPointTypeConfig {
    /**
     * @return Interface type
     * 
     */
    private @Nullable String type;
    /**
     * @return Equinix-assigned virtual gateway identifier
     * 
     */
    private @Nullable String uuid;

    private ConnectionASideAccessPointProfileAccessPointTypeConfig() {}
    /**
     * @return Interface type
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }
    /**
     * @return Equinix-assigned virtual gateway identifier
     * 
     */
    public Optional<String> uuid() {
        return Optional.ofNullable(this.uuid);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionASideAccessPointProfileAccessPointTypeConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String type;
        private @Nullable String uuid;
        public Builder() {}
        public Builder(ConnectionASideAccessPointProfileAccessPointTypeConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
    	      this.uuid = defaults.uuid;
        }

        @CustomType.Setter
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder uuid(@Nullable String uuid) {
            this.uuid = uuid;
            return this;
        }
        public ConnectionASideAccessPointProfileAccessPointTypeConfig build() {
            final var _resultValue = new ConnectionASideAccessPointProfileAccessPointTypeConfig();
            _resultValue.type = type;
            _resultValue.uuid = uuid;
            return _resultValue;
        }
    }
}
