// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.networkedge.outputs;

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
     * @return License id. This field is relevant only for the BlueCat DNS and DHCP Server
     * 
     */
    private @Nullable String licenseId;
    /**
     * @return License key. This field is relevant only for the BlueCat DNS and DHCP Server
     * 
     */
    private @Nullable String licenseKey;
    /**
     * @return Private address. This field is relevant only for the BlueCat DNS and DHCP Server
     * 
     */
    private @Nullable String privateAddress;
    /**
     * @return Private CIDR Mask. This field is relevant only for the BlueCat DNS and DHCP Server
     * 
     */
    private @Nullable String privateCidrMask;
    /**
     * @return Private gateway. This field is relevant only for the BlueCat DNS and DHCP Server
     * 
     */
    private @Nullable String privateGateway;
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
     * @return License id. This field is relevant only for the BlueCat DNS and DHCP Server
     * 
     */
    public Optional<String> licenseId() {
        return Optional.ofNullable(this.licenseId);
    }
    /**
     * @return License key. This field is relevant only for the BlueCat DNS and DHCP Server
     * 
     */
    public Optional<String> licenseKey() {
        return Optional.ofNullable(this.licenseKey);
    }
    /**
     * @return Private address. This field is relevant only for the BlueCat DNS and DHCP Server
     * 
     */
    public Optional<String> privateAddress() {
        return Optional.ofNullable(this.privateAddress);
    }
    /**
     * @return Private CIDR Mask. This field is relevant only for the BlueCat DNS and DHCP Server
     * 
     */
    public Optional<String> privateCidrMask() {
        return Optional.ofNullable(this.privateCidrMask);
    }
    /**
     * @return Private gateway. This field is relevant only for the BlueCat DNS and DHCP Server
     * 
     */
    public Optional<String> privateGateway() {
        return Optional.ofNullable(this.privateGateway);
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
        private @Nullable String licenseId;
        private @Nullable String licenseKey;
        private @Nullable String privateAddress;
        private @Nullable String privateCidrMask;
        private @Nullable String privateGateway;
        private @Nullable String rootPassword;
        public Builder() {}
        public Builder(DeviceClusterDetailsNode0VendorConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activationKey = defaults.activationKey;
    	      this.adminPassword = defaults.adminPassword;
    	      this.controller1 = defaults.controller1;
    	      this.controllerFqdn = defaults.controllerFqdn;
    	      this.hostname = defaults.hostname;
    	      this.licenseId = defaults.licenseId;
    	      this.licenseKey = defaults.licenseKey;
    	      this.privateAddress = defaults.privateAddress;
    	      this.privateCidrMask = defaults.privateCidrMask;
    	      this.privateGateway = defaults.privateGateway;
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
        public Builder licenseId(@Nullable String licenseId) {
            this.licenseId = licenseId;
            return this;
        }
        @CustomType.Setter
        public Builder licenseKey(@Nullable String licenseKey) {
            this.licenseKey = licenseKey;
            return this;
        }
        @CustomType.Setter
        public Builder privateAddress(@Nullable String privateAddress) {
            this.privateAddress = privateAddress;
            return this;
        }
        @CustomType.Setter
        public Builder privateCidrMask(@Nullable String privateCidrMask) {
            this.privateCidrMask = privateCidrMask;
            return this;
        }
        @CustomType.Setter
        public Builder privateGateway(@Nullable String privateGateway) {
            this.privateGateway = privateGateway;
            return this;
        }
        @CustomType.Setter
        public Builder rootPassword(@Nullable String rootPassword) {
            this.rootPassword = rootPassword;
            return this;
        }
        public DeviceClusterDetailsNode0VendorConfiguration build() {
            final var _resultValue = new DeviceClusterDetailsNode0VendorConfiguration();
            _resultValue.activationKey = activationKey;
            _resultValue.adminPassword = adminPassword;
            _resultValue.controller1 = controller1;
            _resultValue.controllerFqdn = controllerFqdn;
            _resultValue.hostname = hostname;
            _resultValue.licenseId = licenseId;
            _resultValue.licenseKey = licenseKey;
            _resultValue.privateAddress = privateAddress;
            _resultValue.privateCidrMask = privateCidrMask;
            _resultValue.privateGateway = privateGateway;
            _resultValue.rootPassword = rootPassword;
            return _resultValue;
        }
    }
}
