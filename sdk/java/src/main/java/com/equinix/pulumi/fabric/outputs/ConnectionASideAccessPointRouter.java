// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ConnectionASideAccessPointRouter {
    /**
     * @return Unique Resource Identifier
     * 
     */
    private @Nullable String href;
    /**
     * @return Equinix-assigned virtual gateway identifier
     * 
     */
    private @Nullable String uuid;

    private ConnectionASideAccessPointRouter() {}
    /**
     * @return Unique Resource Identifier
     * 
     */
    public Optional<String> href() {
        return Optional.ofNullable(this.href);
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

    public static Builder builder(ConnectionASideAccessPointRouter defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String href;
        private @Nullable String uuid;
        public Builder() {}
        public Builder(ConnectionASideAccessPointRouter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.href = defaults.href;
    	      this.uuid = defaults.uuid;
        }

        @CustomType.Setter
        public Builder href(@Nullable String href) {
            this.href = href;
            return this;
        }
        @CustomType.Setter
        public Builder uuid(@Nullable String uuid) {
            this.uuid = uuid;
            return this;
        }
        public ConnectionASideAccessPointRouter build() {
            final var _resultValue = new ConnectionASideAccessPointRouter();
            _resultValue.href = href;
            _resultValue.uuid = uuid;
            return _resultValue;
        }
    }
}
