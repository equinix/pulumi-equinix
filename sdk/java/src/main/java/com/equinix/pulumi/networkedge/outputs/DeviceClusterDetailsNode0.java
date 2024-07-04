// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.networkedge.outputs;

import com.equinix.pulumi.networkedge.outputs.DeviceClusterDetailsNode0VendorConfiguration;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DeviceClusterDetailsNode0 {
    /**
     * @return License file id. This is necessary for Fortinet and Juniper clusters.
     * 
     */
    private @Nullable String licenseFileId;
    /**
     * @return License token. This is necessary for Palo Alto clusters.
     * 
     */
    private @Nullable String licenseToken;
    /**
     * @return Device name.
     * 
     */
    private @Nullable String name;
    /**
     * @return Device unique identifier.
     * 
     */
    private @Nullable String uuid;
    /**
     * @return An object that has fields relevant to the vendor of the cluster device. See Cluster Details - Nodes - Vendor Configuration below for more details.
     * 
     */
    private @Nullable DeviceClusterDetailsNode0VendorConfiguration vendorConfiguration;

    private DeviceClusterDetailsNode0() {}
    /**
     * @return License file id. This is necessary for Fortinet and Juniper clusters.
     * 
     */
    public Optional<String> licenseFileId() {
        return Optional.ofNullable(this.licenseFileId);
    }
    /**
     * @return License token. This is necessary for Palo Alto clusters.
     * 
     */
    public Optional<String> licenseToken() {
        return Optional.ofNullable(this.licenseToken);
    }
    /**
     * @return Device name.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return Device unique identifier.
     * 
     */
    public Optional<String> uuid() {
        return Optional.ofNullable(this.uuid);
    }
    /**
     * @return An object that has fields relevant to the vendor of the cluster device. See Cluster Details - Nodes - Vendor Configuration below for more details.
     * 
     */
    public Optional<DeviceClusterDetailsNode0VendorConfiguration> vendorConfiguration() {
        return Optional.ofNullable(this.vendorConfiguration);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeviceClusterDetailsNode0 defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String licenseFileId;
        private @Nullable String licenseToken;
        private @Nullable String name;
        private @Nullable String uuid;
        private @Nullable DeviceClusterDetailsNode0VendorConfiguration vendorConfiguration;
        public Builder() {}
        public Builder(DeviceClusterDetailsNode0 defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.licenseFileId = defaults.licenseFileId;
    	      this.licenseToken = defaults.licenseToken;
    	      this.name = defaults.name;
    	      this.uuid = defaults.uuid;
    	      this.vendorConfiguration = defaults.vendorConfiguration;
        }

        @CustomType.Setter
        public Builder licenseFileId(@Nullable String licenseFileId) {
            this.licenseFileId = licenseFileId;
            return this;
        }
        @CustomType.Setter
        public Builder licenseToken(@Nullable String licenseToken) {
            this.licenseToken = licenseToken;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder uuid(@Nullable String uuid) {
            this.uuid = uuid;
            return this;
        }
        @CustomType.Setter
        public Builder vendorConfiguration(@Nullable DeviceClusterDetailsNode0VendorConfiguration vendorConfiguration) {
            this.vendorConfiguration = vendorConfiguration;
            return this;
        }
        public DeviceClusterDetailsNode0 build() {
            final var _resultValue = new DeviceClusterDetailsNode0();
            _resultValue.licenseFileId = licenseFileId;
            _resultValue.licenseToken = licenseToken;
            _resultValue.name = name;
            _resultValue.uuid = uuid;
            _resultValue.vendorConfiguration = vendorConfiguration;
            return _resultValue;
        }
    }
}
