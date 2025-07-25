// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ConnectionASideAccessPointNetwork {
    /**
     * @return Unique Resource Identifier
     * 
     */
    private @Nullable String href;
    /**
     * @return Equinix-assigned Network identifier
     * 
     */
    private String uuid;

    private ConnectionASideAccessPointNetwork() {}
    /**
     * @return Unique Resource Identifier
     * 
     */
    public Optional<String> href() {
        return Optional.ofNullable(this.href);
    }
    /**
     * @return Equinix-assigned Network identifier
     * 
     */
    public String uuid() {
        return this.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionASideAccessPointNetwork defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String href;
        private String uuid;
        public Builder() {}
        public Builder(ConnectionASideAccessPointNetwork defaults) {
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
        public Builder uuid(String uuid) {
            if (uuid == null) {
              throw new MissingRequiredPropertyException("ConnectionASideAccessPointNetwork", "uuid");
            }
            this.uuid = uuid;
            return this;
        }
        public ConnectionASideAccessPointNetwork build() {
            final var _resultValue = new ConnectionASideAccessPointNetwork();
            _resultValue.href = href;
            _resultValue.uuid = uuid;
            return _resultValue;
        }
    }
}
