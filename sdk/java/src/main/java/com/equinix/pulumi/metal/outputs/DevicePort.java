// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.metal.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DevicePort {
    /**
     * @return Whether this port is part of a bond in bonded network setup.
     * 
     */
    private @Nullable Boolean bonded;
    /**
     * @return ID of the port.
     * 
     */
    private @Nullable String id;
    /**
     * @return MAC address assigned to the port.
     * 
     */
    private @Nullable String mac;
    /**
     * @return Name of the port (e.g. `eth0`, or `bond0`).
     * 
     */
    private @Nullable String name;
    /**
     * @return One of `private_ipv4`, `public_ipv4`, `public_ipv6`.
     * 
     */
    private @Nullable String type;

    private DevicePort() {}
    /**
     * @return Whether this port is part of a bond in bonded network setup.
     * 
     */
    public Optional<Boolean> bonded() {
        return Optional.ofNullable(this.bonded);
    }
    /**
     * @return ID of the port.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return MAC address assigned to the port.
     * 
     */
    public Optional<String> mac() {
        return Optional.ofNullable(this.mac);
    }
    /**
     * @return Name of the port (e.g. `eth0`, or `bond0`).
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return One of `private_ipv4`, `public_ipv4`, `public_ipv6`.
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DevicePort defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean bonded;
        private @Nullable String id;
        private @Nullable String mac;
        private @Nullable String name;
        private @Nullable String type;
        public Builder() {}
        public Builder(DevicePort defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bonded = defaults.bonded;
    	      this.id = defaults.id;
    	      this.mac = defaults.mac;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder bonded(@Nullable Boolean bonded) {
            this.bonded = bonded;
            return this;
        }
        @CustomType.Setter
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder mac(@Nullable String mac) {
            this.mac = mac;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }
        public DevicePort build() {
            final var _resultValue = new DevicePort();
            _resultValue.bonded = bonded;
            _resultValue.id = id;
            _resultValue.mac = mac;
            _resultValue.name = name;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
