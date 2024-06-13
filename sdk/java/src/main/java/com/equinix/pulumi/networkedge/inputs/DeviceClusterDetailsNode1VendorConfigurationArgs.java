// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.networkedge.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DeviceClusterDetailsNode1VendorConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeviceClusterDetailsNode1VendorConfigurationArgs Empty = new DeviceClusterDetailsNode1VendorConfigurationArgs();

    /**
     * Activation key. This is required for Velocloud clusters.
     * 
     */
    @Import(name="activationKey")
    private @Nullable Output<String> activationKey;

    /**
     * @return Activation key. This is required for Velocloud clusters.
     * 
     */
    public Optional<Output<String>> activationKey() {
        return Optional.ofNullable(this.activationKey);
    }

    /**
     * The administrative password of the device. You can use it to log in
     * to the console. This field is not available for all device types.
     * 
     */
    @Import(name="adminPassword")
    private @Nullable Output<String> adminPassword;

    /**
     * @return The administrative password of the device. You can use it to log in
     * to the console. This field is not available for all device types.
     * 
     */
    public Optional<Output<String>> adminPassword() {
        return Optional.ofNullable(this.adminPassword);
    }

    /**
     * System IP Address. Mandatory for the Fortinet SDWAN cluster device.
     * 
     */
    @Import(name="controller1")
    private @Nullable Output<String> controller1;

    /**
     * @return System IP Address. Mandatory for the Fortinet SDWAN cluster device.
     * 
     */
    public Optional<Output<String>> controller1() {
        return Optional.ofNullable(this.controller1);
    }

    /**
     * Controller fqdn. This is required for Velocloud clusters.
     * 
     */
    @Import(name="controllerFqdn")
    private @Nullable Output<String> controllerFqdn;

    /**
     * @return Controller fqdn. This is required for Velocloud clusters.
     * 
     */
    public Optional<Output<String>> controllerFqdn() {
        return Optional.ofNullable(this.controllerFqdn);
    }

    /**
     * Hostname. This is necessary for Palo Alto, Juniper, and Fortinet clusters.
     * 
     */
    @Import(name="hostname")
    private @Nullable Output<String> hostname;

    /**
     * @return Hostname. This is necessary for Palo Alto, Juniper, and Fortinet clusters.
     * 
     */
    public Optional<Output<String>> hostname() {
        return Optional.ofNullable(this.hostname);
    }

    /**
     * License id. This field is relevant only for the BlueCat DNS and DHCP Server
     * 
     */
    @Import(name="licenseId")
    private @Nullable Output<String> licenseId;

    /**
     * @return License id. This field is relevant only for the BlueCat DNS and DHCP Server
     * 
     */
    public Optional<Output<String>> licenseId() {
        return Optional.ofNullable(this.licenseId);
    }

    /**
     * License key. This field is relevant only for the BlueCat DNS and DHCP Server
     * 
     */
    @Import(name="licenseKey")
    private @Nullable Output<String> licenseKey;

    /**
     * @return License key. This field is relevant only for the BlueCat DNS and DHCP Server
     * 
     */
    public Optional<Output<String>> licenseKey() {
        return Optional.ofNullable(this.licenseKey);
    }

    /**
     * Private address. This field is relevant only for the BlueCat DNS and DHCP Server
     * 
     */
    @Import(name="privateAddress")
    private @Nullable Output<String> privateAddress;

    /**
     * @return Private address. This field is relevant only for the BlueCat DNS and DHCP Server
     * 
     */
    public Optional<Output<String>> privateAddress() {
        return Optional.ofNullable(this.privateAddress);
    }

    /**
     * Private CIDR Mask. This field is relevant only for the BlueCat DNS and DHCP Server
     * 
     */
    @Import(name="privateCidrMask")
    private @Nullable Output<String> privateCidrMask;

    /**
     * @return Private CIDR Mask. This field is relevant only for the BlueCat DNS and DHCP Server
     * 
     */
    public Optional<Output<String>> privateCidrMask() {
        return Optional.ofNullable(this.privateCidrMask);
    }

    /**
     * Private gateway. This field is relevant only for the BlueCat DNS and DHCP Server
     * 
     */
    @Import(name="privateGateway")
    private @Nullable Output<String> privateGateway;

    /**
     * @return Private gateway. This field is relevant only for the BlueCat DNS and DHCP Server
     * 
     */
    public Optional<Output<String>> privateGateway() {
        return Optional.ofNullable(this.privateGateway);
    }

    /**
     * The CLI password of the device. This field is relevant only for the
     * Velocloud SDWAN cluster.
     * 
     */
    @Import(name="rootPassword")
    private @Nullable Output<String> rootPassword;

    /**
     * @return The CLI password of the device. This field is relevant only for the
     * Velocloud SDWAN cluster.
     * 
     */
    public Optional<Output<String>> rootPassword() {
        return Optional.ofNullable(this.rootPassword);
    }

    private DeviceClusterDetailsNode1VendorConfigurationArgs() {}

    private DeviceClusterDetailsNode1VendorConfigurationArgs(DeviceClusterDetailsNode1VendorConfigurationArgs $) {
        this.activationKey = $.activationKey;
        this.adminPassword = $.adminPassword;
        this.controller1 = $.controller1;
        this.controllerFqdn = $.controllerFqdn;
        this.hostname = $.hostname;
        this.licenseId = $.licenseId;
        this.licenseKey = $.licenseKey;
        this.privateAddress = $.privateAddress;
        this.privateCidrMask = $.privateCidrMask;
        this.privateGateway = $.privateGateway;
        this.rootPassword = $.rootPassword;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeviceClusterDetailsNode1VendorConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeviceClusterDetailsNode1VendorConfigurationArgs $;

        public Builder() {
            $ = new DeviceClusterDetailsNode1VendorConfigurationArgs();
        }

        public Builder(DeviceClusterDetailsNode1VendorConfigurationArgs defaults) {
            $ = new DeviceClusterDetailsNode1VendorConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param activationKey Activation key. This is required for Velocloud clusters.
         * 
         * @return builder
         * 
         */
        public Builder activationKey(@Nullable Output<String> activationKey) {
            $.activationKey = activationKey;
            return this;
        }

        /**
         * @param activationKey Activation key. This is required for Velocloud clusters.
         * 
         * @return builder
         * 
         */
        public Builder activationKey(String activationKey) {
            return activationKey(Output.of(activationKey));
        }

        /**
         * @param adminPassword The administrative password of the device. You can use it to log in
         * to the console. This field is not available for all device types.
         * 
         * @return builder
         * 
         */
        public Builder adminPassword(@Nullable Output<String> adminPassword) {
            $.adminPassword = adminPassword;
            return this;
        }

        /**
         * @param adminPassword The administrative password of the device. You can use it to log in
         * to the console. This field is not available for all device types.
         * 
         * @return builder
         * 
         */
        public Builder adminPassword(String adminPassword) {
            return adminPassword(Output.of(adminPassword));
        }

        /**
         * @param controller1 System IP Address. Mandatory for the Fortinet SDWAN cluster device.
         * 
         * @return builder
         * 
         */
        public Builder controller1(@Nullable Output<String> controller1) {
            $.controller1 = controller1;
            return this;
        }

        /**
         * @param controller1 System IP Address. Mandatory for the Fortinet SDWAN cluster device.
         * 
         * @return builder
         * 
         */
        public Builder controller1(String controller1) {
            return controller1(Output.of(controller1));
        }

        /**
         * @param controllerFqdn Controller fqdn. This is required for Velocloud clusters.
         * 
         * @return builder
         * 
         */
        public Builder controllerFqdn(@Nullable Output<String> controllerFqdn) {
            $.controllerFqdn = controllerFqdn;
            return this;
        }

        /**
         * @param controllerFqdn Controller fqdn. This is required for Velocloud clusters.
         * 
         * @return builder
         * 
         */
        public Builder controllerFqdn(String controllerFqdn) {
            return controllerFqdn(Output.of(controllerFqdn));
        }

        /**
         * @param hostname Hostname. This is necessary for Palo Alto, Juniper, and Fortinet clusters.
         * 
         * @return builder
         * 
         */
        public Builder hostname(@Nullable Output<String> hostname) {
            $.hostname = hostname;
            return this;
        }

        /**
         * @param hostname Hostname. This is necessary for Palo Alto, Juniper, and Fortinet clusters.
         * 
         * @return builder
         * 
         */
        public Builder hostname(String hostname) {
            return hostname(Output.of(hostname));
        }

        /**
         * @param licenseId License id. This field is relevant only for the BlueCat DNS and DHCP Server
         * 
         * @return builder
         * 
         */
        public Builder licenseId(@Nullable Output<String> licenseId) {
            $.licenseId = licenseId;
            return this;
        }

        /**
         * @param licenseId License id. This field is relevant only for the BlueCat DNS and DHCP Server
         * 
         * @return builder
         * 
         */
        public Builder licenseId(String licenseId) {
            return licenseId(Output.of(licenseId));
        }

        /**
         * @param licenseKey License key. This field is relevant only for the BlueCat DNS and DHCP Server
         * 
         * @return builder
         * 
         */
        public Builder licenseKey(@Nullable Output<String> licenseKey) {
            $.licenseKey = licenseKey;
            return this;
        }

        /**
         * @param licenseKey License key. This field is relevant only for the BlueCat DNS and DHCP Server
         * 
         * @return builder
         * 
         */
        public Builder licenseKey(String licenseKey) {
            return licenseKey(Output.of(licenseKey));
        }

        /**
         * @param privateAddress Private address. This field is relevant only for the BlueCat DNS and DHCP Server
         * 
         * @return builder
         * 
         */
        public Builder privateAddress(@Nullable Output<String> privateAddress) {
            $.privateAddress = privateAddress;
            return this;
        }

        /**
         * @param privateAddress Private address. This field is relevant only for the BlueCat DNS and DHCP Server
         * 
         * @return builder
         * 
         */
        public Builder privateAddress(String privateAddress) {
            return privateAddress(Output.of(privateAddress));
        }

        /**
         * @param privateCidrMask Private CIDR Mask. This field is relevant only for the BlueCat DNS and DHCP Server
         * 
         * @return builder
         * 
         */
        public Builder privateCidrMask(@Nullable Output<String> privateCidrMask) {
            $.privateCidrMask = privateCidrMask;
            return this;
        }

        /**
         * @param privateCidrMask Private CIDR Mask. This field is relevant only for the BlueCat DNS and DHCP Server
         * 
         * @return builder
         * 
         */
        public Builder privateCidrMask(String privateCidrMask) {
            return privateCidrMask(Output.of(privateCidrMask));
        }

        /**
         * @param privateGateway Private gateway. This field is relevant only for the BlueCat DNS and DHCP Server
         * 
         * @return builder
         * 
         */
        public Builder privateGateway(@Nullable Output<String> privateGateway) {
            $.privateGateway = privateGateway;
            return this;
        }

        /**
         * @param privateGateway Private gateway. This field is relevant only for the BlueCat DNS and DHCP Server
         * 
         * @return builder
         * 
         */
        public Builder privateGateway(String privateGateway) {
            return privateGateway(Output.of(privateGateway));
        }

        /**
         * @param rootPassword The CLI password of the device. This field is relevant only for the
         * Velocloud SDWAN cluster.
         * 
         * @return builder
         * 
         */
        public Builder rootPassword(@Nullable Output<String> rootPassword) {
            $.rootPassword = rootPassword;
            return this;
        }

        /**
         * @param rootPassword The CLI password of the device. This field is relevant only for the
         * Velocloud SDWAN cluster.
         * 
         * @return builder
         * 
         */
        public Builder rootPassword(String rootPassword) {
            return rootPassword(Output.of(rootPassword));
        }

        public DeviceClusterDetailsNode1VendorConfigurationArgs build() {
            return $;
        }
    }

}
