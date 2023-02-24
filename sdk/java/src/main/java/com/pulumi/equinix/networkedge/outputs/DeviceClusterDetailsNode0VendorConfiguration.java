// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.equinix.networkedge.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DeviceClusterDetailsNode0VendorConfiguration {
    /**
     * @return Activation key. This is required for Velocloud clusters.
     * 
     */
    private @Nullable String activationKey;
    /**
     * @return The administrative password of the device. You can use it to log in
     * to the console. This field is not available for all device types.
     * 
     */
    private @Nullable String adminPassword;
    /**
     * @return System IP Address. Mandatory for the Fortinet SDWAN cluster device.
     * 
     */
    private @Nullable String controller1;
    /**
     * @return Controller fqdn. This is required for Velocloud clusters.
     * 
     */
    private @Nullable String controllerFqdn;
    /**
     * @return Hostname. This is necessary for Palo Alto, Juniper, and Fortinet clusters.
     * 
     */
    private @Nullable String hostname;
    /**
     * @return The CLI password of the device. This field is relevant only for the
     * Velocloud SDWAN cluster.
     * 
     */
    private @Nullable String rootPassword;

    private DeviceClusterDetailsNode0VendorConfiguration() {}
    /**
     * @return Activation key. This is required for Velocloud clusters.
     * 
     */
    public Optional<String> activationKey() {
        return Optional.ofNullable(this.activationKey);
    }
    /**
     * @return The administrative password of the device. You can use it to log in
     * to the console. This field is not available for all device types.
     * 
     */
    public Optional<String> adminPassword() {
        return Optional.ofNullable(this.adminPassword);
    }
    /**
     * @return System IP Address. Mandatory for the Fortinet SDWAN cluster device.
     * 
     */
    public Optional<String> controller1() {
        return Optional.ofNullable(this.controller1);
    }
    /**
     * @return Controller fqdn. This is required for Velocloud clusters.
     * 
     */
    public Optional<String> controllerFqdn() {
        return Optional.ofNullable(this.controllerFqdn);
    }
    /**
     * @return Hostname. This is necessary for Palo Alto, Juniper, and Fortinet clusters.
     * 
     */
    public Optional<String> hostname() {
        return Optional.ofNullable(this.hostname);
    }
    /**
     * @return The CLI password of the device. This field is relevant only for the
     * Velocloud SDWAN cluster.
     * 
     */
    public Optional<String> rootPassword() {
        return Optional.ofNullable(this.rootPassword);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeviceClusterDetailsNode0VendorConfiguration defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String activationKey;
        private @Nullable String adminPassword;
        private @Nullable String controller1;
        private @Nullable String controllerFqdn;
        private @Nullable String hostname;
        private @Nullable String rootPassword;
        public Builder() {}
        public Builder(DeviceClusterDetailsNode0VendorConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activationKey = defaults.activationKey;
    	      this.adminPassword = defaults.adminPassword;
    	      this.controller1 = defaults.controller1;
    	      this.controllerFqdn = defaults.controllerFqdn;
    	      this.hostname = defaults.hostname;
    	      this.rootPassword = defaults.rootPassword;
        }

        @CustomType.Setter
        public Builder activationKey(@Nullable String activationKey) {
            this.activationKey = activationKey;
            return this;
        }
        @CustomType.Setter
        public Builder adminPassword(@Nullable String adminPassword) {
            this.adminPassword = adminPassword;
            return this;
        }
        @CustomType.Setter
        public Builder controller1(@Nullable String controller1) {
            this.controller1 = controller1;
            return this;
        }
        @CustomType.Setter
        public Builder controllerFqdn(@Nullable String controllerFqdn) {
            this.controllerFqdn = controllerFqdn;
            return this;
        }
        @CustomType.Setter
        public Builder hostname(@Nullable String hostname) {
            this.hostname = hostname;
            return this;
        }
        @CustomType.Setter
        public Builder rootPassword(@Nullable String rootPassword) {
            this.rootPassword = rootPassword;
            return this;
        }
        public DeviceClusterDetailsNode0VendorConfiguration build() {
            final var o = new DeviceClusterDetailsNode0VendorConfiguration();
            o.activationKey = activationKey;
            o.adminPassword = adminPassword;
            o.controller1 = controller1;
            o.controllerFqdn = controllerFqdn;
            o.hostname = hostname;
            o.rootPassword = rootPassword;
            return o;
        }
    }
}
