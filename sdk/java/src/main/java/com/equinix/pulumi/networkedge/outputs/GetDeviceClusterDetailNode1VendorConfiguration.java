// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.networkedge.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetDeviceClusterDetailNode1VendorConfiguration {
    /**
     * @return Activation key. This is required for Velocloud clusters
     * 
     */
    private String activationKey;
    /**
     * @return The administrative password of the device. You can use it to log in to the console. This field is not available for all device types
     * 
     */
    private String adminPassword;
    /**
     * @return System IP Address. Mandatory for the Fortinet SDWAN cluster device
     * 
     */
    private String controller1;
    /**
     * @return Controller fqdn. This is required for Velocloud clusters
     * 
     */
    private String controllerFqdn;
    /**
     * @return Hostname. This is necessary for Palo Alto, Juniper, and Fortinet clusters
     * 
     */
    private String hostname;
    /**
     * @return License id. This field is relevant only for the BlueCat DNS and DHCP Server
     * 
     */
    private String licenseId;
    /**
     * @return License key. This field is relevant only for the BlueCat DNS and DHCP Server
     * 
     */
    private String licenseKey;
    /**
     * @return Private address. This field is relevant only for the BlueCat DNS and DHCP Server
     * 
     */
    private String privateAddress;
    /**
     * @return Private CIDR Mask. This field is relevant only for the BlueCat DNS and DHCP Server
     * 
     */
    private String privateCidrMask;
    /**
     * @return Private gateway. This field is relevant only for the BlueCat DNS and DHCP Server
     * 
     */
    private String privateGateway;
    /**
     * @return The CLI password of the device. This field is relevant only for the Velocloud SDWAN cluster
     * 
     */
    private String rootPassword;

    private GetDeviceClusterDetailNode1VendorConfiguration() {}
    /**
     * @return Activation key. This is required for Velocloud clusters
     * 
     */
    public String activationKey() {
        return this.activationKey;
    }
    /**
     * @return The administrative password of the device. You can use it to log in to the console. This field is not available for all device types
     * 
     */
    public String adminPassword() {
        return this.adminPassword;
    }
    /**
     * @return System IP Address. Mandatory for the Fortinet SDWAN cluster device
     * 
     */
    public String controller1() {
        return this.controller1;
    }
    /**
     * @return Controller fqdn. This is required for Velocloud clusters
     * 
     */
    public String controllerFqdn() {
        return this.controllerFqdn;
    }
    /**
     * @return Hostname. This is necessary for Palo Alto, Juniper, and Fortinet clusters
     * 
     */
    public String hostname() {
        return this.hostname;
    }
    /**
     * @return License id. This field is relevant only for the BlueCat DNS and DHCP Server
     * 
     */
    public String licenseId() {
        return this.licenseId;
    }
    /**
     * @return License key. This field is relevant only for the BlueCat DNS and DHCP Server
     * 
     */
    public String licenseKey() {
        return this.licenseKey;
    }
    /**
     * @return Private address. This field is relevant only for the BlueCat DNS and DHCP Server
     * 
     */
    public String privateAddress() {
        return this.privateAddress;
    }
    /**
     * @return Private CIDR Mask. This field is relevant only for the BlueCat DNS and DHCP Server
     * 
     */
    public String privateCidrMask() {
        return this.privateCidrMask;
    }
    /**
     * @return Private gateway. This field is relevant only for the BlueCat DNS and DHCP Server
     * 
     */
    public String privateGateway() {
        return this.privateGateway;
    }
    /**
     * @return The CLI password of the device. This field is relevant only for the Velocloud SDWAN cluster
     * 
     */
    public String rootPassword() {
        return this.rootPassword;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDeviceClusterDetailNode1VendorConfiguration defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String activationKey;
        private String adminPassword;
        private String controller1;
        private String controllerFqdn;
        private String hostname;
        private String licenseId;
        private String licenseKey;
        private String privateAddress;
        private String privateCidrMask;
        private String privateGateway;
        private String rootPassword;
        public Builder() {}
        public Builder(GetDeviceClusterDetailNode1VendorConfiguration defaults) {
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
        public Builder activationKey(String activationKey) {
            if (activationKey == null) {
              throw new MissingRequiredPropertyException("GetDeviceClusterDetailNode1VendorConfiguration", "activationKey");
            }
            this.activationKey = activationKey;
            return this;
        }
        @CustomType.Setter
        public Builder adminPassword(String adminPassword) {
            if (adminPassword == null) {
              throw new MissingRequiredPropertyException("GetDeviceClusterDetailNode1VendorConfiguration", "adminPassword");
            }
            this.adminPassword = adminPassword;
            return this;
        }
        @CustomType.Setter
        public Builder controller1(String controller1) {
            if (controller1 == null) {
              throw new MissingRequiredPropertyException("GetDeviceClusterDetailNode1VendorConfiguration", "controller1");
            }
            this.controller1 = controller1;
            return this;
        }
        @CustomType.Setter
        public Builder controllerFqdn(String controllerFqdn) {
            if (controllerFqdn == null) {
              throw new MissingRequiredPropertyException("GetDeviceClusterDetailNode1VendorConfiguration", "controllerFqdn");
            }
            this.controllerFqdn = controllerFqdn;
            return this;
        }
        @CustomType.Setter
        public Builder hostname(String hostname) {
            if (hostname == null) {
              throw new MissingRequiredPropertyException("GetDeviceClusterDetailNode1VendorConfiguration", "hostname");
            }
            this.hostname = hostname;
            return this;
        }
        @CustomType.Setter
        public Builder licenseId(String licenseId) {
            if (licenseId == null) {
              throw new MissingRequiredPropertyException("GetDeviceClusterDetailNode1VendorConfiguration", "licenseId");
            }
            this.licenseId = licenseId;
            return this;
        }
        @CustomType.Setter
        public Builder licenseKey(String licenseKey) {
            if (licenseKey == null) {
              throw new MissingRequiredPropertyException("GetDeviceClusterDetailNode1VendorConfiguration", "licenseKey");
            }
            this.licenseKey = licenseKey;
            return this;
        }
        @CustomType.Setter
        public Builder privateAddress(String privateAddress) {
            if (privateAddress == null) {
              throw new MissingRequiredPropertyException("GetDeviceClusterDetailNode1VendorConfiguration", "privateAddress");
            }
            this.privateAddress = privateAddress;
            return this;
        }
        @CustomType.Setter
        public Builder privateCidrMask(String privateCidrMask) {
            if (privateCidrMask == null) {
              throw new MissingRequiredPropertyException("GetDeviceClusterDetailNode1VendorConfiguration", "privateCidrMask");
            }
            this.privateCidrMask = privateCidrMask;
            return this;
        }
        @CustomType.Setter
        public Builder privateGateway(String privateGateway) {
            if (privateGateway == null) {
              throw new MissingRequiredPropertyException("GetDeviceClusterDetailNode1VendorConfiguration", "privateGateway");
            }
            this.privateGateway = privateGateway;
            return this;
        }
        @CustomType.Setter
        public Builder rootPassword(String rootPassword) {
            if (rootPassword == null) {
              throw new MissingRequiredPropertyException("GetDeviceClusterDetailNode1VendorConfiguration", "rootPassword");
            }
            this.rootPassword = rootPassword;
            return this;
        }
        public GetDeviceClusterDetailNode1VendorConfiguration build() {
            final var _resultValue = new GetDeviceClusterDetailNode1VendorConfiguration();
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
