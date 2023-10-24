// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ConnectionASideAccessPointVirtualDevice {
    /**
     * @return Unique Resource Identifier
     * 
     */
    private @Nullable String href;
    /**
     * @return Interface type
     * 
     */
    private @Nullable String type;
    /**
     * @return Equinix-assigned interface identifier
     * 
     */
    private @Nullable String uuid;

    private ConnectionASideAccessPointVirtualDevice() {}
    /**
     * @return Unique Resource Identifier
     * 
     */
    public Optional<String> href() {
        return Optional.ofNullable(this.href);
    }
    /**
     * @return Interface type
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }
    /**
     * @return Equinix-assigned interface identifier
     * 
     */
    public Optional<String> uuid() {
        return Optional.ofNullable(this.uuid);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionASideAccessPointVirtualDevice defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String href;
        private @Nullable String type;
        private @Nullable String uuid;
        public Builder() {}
        public Builder(ConnectionASideAccessPointVirtualDevice defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.href = defaults.href;
    	      this.type = defaults.type;
    	      this.uuid = defaults.uuid;
        }

        @CustomType.Setter
        public Builder href(@Nullable String href) {
            this.href = href;
            return this;
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
        public ConnectionASideAccessPointVirtualDevice build() {
            final var o = new ConnectionASideAccessPointVirtualDevice();
            o.href = href;
            o.type = type;
            o.uuid = uuid;
            return o;
        }
    }
}
