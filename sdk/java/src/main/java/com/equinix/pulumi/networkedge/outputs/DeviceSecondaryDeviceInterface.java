// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.networkedge.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DeviceSecondaryDeviceInterface {
    /**
     * @return interface management type (Equinix Managed or empty).
     * 
     */
    private @Nullable String assignedType;
    /**
     * @return interface identifier.
     * 
     */
    private @Nullable Integer id;
    /**
     * @return interface IP address.
     * 
     */
    private @Nullable String ipAddress;
    /**
     * @return interface MAC address.
     * 
     */
    private @Nullable String macAddress;
    /**
     * @return Device name.
     * 
     */
    private @Nullable String name;
    /**
     * @return interface operational status. One of `up`, `down`.
     * 
     */
    private @Nullable String operationalStatus;
    /**
     * @return interface status. One of `AVAILABLE`, `RESERVED`, `ASSIGNED`.
     * 
     */
    private @Nullable String status;
    /**
     * @return interface type.
     * 
     */
    private @Nullable String type;

    private DeviceSecondaryDeviceInterface() {}
    /**
     * @return interface management type (Equinix Managed or empty).
     * 
     */
    public Optional<String> assignedType() {
        return Optional.ofNullable(this.assignedType);
    }
    /**
     * @return interface identifier.
     * 
     */
    public Optional<Integer> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return interface IP address.
     * 
     */
    public Optional<String> ipAddress() {
        return Optional.ofNullable(this.ipAddress);
    }
    /**
     * @return interface MAC address.
     * 
     */
    public Optional<String> macAddress() {
        return Optional.ofNullable(this.macAddress);
    }
    /**
     * @return Device name.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return interface operational status. One of `up`, `down`.
     * 
     */
    public Optional<String> operationalStatus() {
        return Optional.ofNullable(this.operationalStatus);
    }
    /**
     * @return interface status. One of `AVAILABLE`, `RESERVED`, `ASSIGNED`.
     * 
     */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }
    /**
     * @return interface type.
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeviceSecondaryDeviceInterface defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String assignedType;
        private @Nullable Integer id;
        private @Nullable String ipAddress;
        private @Nullable String macAddress;
        private @Nullable String name;
        private @Nullable String operationalStatus;
        private @Nullable String status;
        private @Nullable String type;
        public Builder() {}
        public Builder(DeviceSecondaryDeviceInterface defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assignedType = defaults.assignedType;
    	      this.id = defaults.id;
    	      this.ipAddress = defaults.ipAddress;
    	      this.macAddress = defaults.macAddress;
    	      this.name = defaults.name;
    	      this.operationalStatus = defaults.operationalStatus;
    	      this.status = defaults.status;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder assignedType(@Nullable String assignedType) {
            this.assignedType = assignedType;
            return this;
        }
        @CustomType.Setter
        public Builder id(@Nullable Integer id) {
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder ipAddress(@Nullable String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        @CustomType.Setter
        public Builder macAddress(@Nullable String macAddress) {
            this.macAddress = macAddress;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder operationalStatus(@Nullable String operationalStatus) {
            this.operationalStatus = operationalStatus;
            return this;
        }
        @CustomType.Setter
        public Builder status(@Nullable String status) {
            this.status = status;
            return this;
        }
        @CustomType.Setter
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }
        public DeviceSecondaryDeviceInterface build() {
            final var _resultValue = new DeviceSecondaryDeviceInterface();
            _resultValue.assignedType = assignedType;
            _resultValue.id = id;
            _resultValue.ipAddress = ipAddress;
            _resultValue.macAddress = macAddress;
            _resultValue.name = name;
            _resultValue.operationalStatus = operationalStatus;
            _resultValue.status = status;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
