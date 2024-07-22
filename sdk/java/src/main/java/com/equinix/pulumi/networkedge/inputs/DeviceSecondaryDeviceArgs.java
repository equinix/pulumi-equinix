// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.networkedge.inputs;

import com.equinix.pulumi.networkedge.inputs.DeviceSecondaryDeviceInterfaceArgs;
import com.equinix.pulumi.networkedge.inputs.DeviceSecondaryDeviceSshKeyArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DeviceSecondaryDeviceArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeviceSecondaryDeviceArgs Empty = new DeviceSecondaryDeviceArgs();

    /**
     * Billing account number for secondary device.
     * 
     */
    @Import(name="accountNumber", required=true)
    private Output<String> accountNumber;

    /**
     * @return Billing account number for secondary device.
     * 
     */
    public Output<String> accountNumber() {
        return this.accountNumber;
    }

    /**
     * Identifier of a WAN interface ACL template that will be applied on a secondary device.
     * 
     */
    @Import(name="aclTemplateId")
    private @Nullable Output<String> aclTemplateId;

    /**
     * @return Identifier of a WAN interface ACL template that will be applied on a secondary device.
     * 
     */
    public Optional<Output<String>> aclTemplateId() {
        return Optional.ofNullable(this.aclTemplateId);
    }

    /**
     * Additional Internet bandwidth, in Mbps, for a secondary device.
     * 
     */
    @Import(name="additionalBandwidth")
    private @Nullable Output<Integer> additionalBandwidth;

    /**
     * @return Additional Internet bandwidth, in Mbps, for a secondary device.
     * 
     */
    public Optional<Output<Integer>> additionalBandwidth() {
        return Optional.ofNullable(this.additionalBandwidth);
    }

    /**
     * (Autonomous System Number) Unique identifier for a network on the internet.
     * 
     */
    @Import(name="asn")
    private @Nullable Output<Integer> asn;

    /**
     * @return (Autonomous System Number) Unique identifier for a network on the internet.
     * 
     */
    public Optional<Output<Integer>> asn() {
        return Optional.ofNullable(this.asn);
    }

    /**
     * Identifier of a cloud init file that will be applied on a secondary device.
     * 
     */
    @Import(name="cloudInitFileId")
    private @Nullable Output<String> cloudInitFileId;

    /**
     * @return Identifier of a cloud init file that will be applied on a secondary device.
     * 
     */
    public Optional<Output<String>> cloudInitFileId() {
        return Optional.ofNullable(this.cloudInitFileId);
    }

    /**
     * Secondary device hostname.
     * 
     */
    @Import(name="hostname")
    private @Nullable Output<String> hostname;

    /**
     * @return Secondary device hostname.
     * 
     */
    public Optional<Output<String>> hostname() {
        return Optional.ofNullable(this.hostname);
    }

    /**
     * Device location Equinix Business Exchange name.
     * 
     */
    @Import(name="ibx")
    private @Nullable Output<String> ibx;

    /**
     * @return Device location Equinix Business Exchange name.
     * 
     */
    public Optional<Output<String>> ibx() {
        return Optional.ofNullable(this.ibx);
    }

    /**
     * List of device interfaces. See Interface Attribute below for more details.
     * 
     */
    @Import(name="interfaces")
    private @Nullable Output<List<DeviceSecondaryDeviceInterfaceArgs>> interfaces;

    /**
     * @return List of device interfaces. See Interface Attribute below for more details.
     * 
     */
    public Optional<Output<List<DeviceSecondaryDeviceInterfaceArgs>>> interfaces() {
        return Optional.ofNullable(this.interfaces);
    }

    /**
     * Path to the license file that will be uploaded and applied on a secondary device. Applicable for some device types in BYOL licensing mode.
     * 
     */
    @Import(name="licenseFile")
    private @Nullable Output<String> licenseFile;

    /**
     * @return Path to the license file that will be uploaded and applied on a secondary device. Applicable for some device types in BYOL licensing mode.
     * 
     */
    public Optional<Output<String>> licenseFile() {
        return Optional.ofNullable(this.licenseFile);
    }

    /**
     * Identifier of a license file that will be applied on a secondary device.
     * 
     */
    @Import(name="licenseFileId")
    private @Nullable Output<String> licenseFileId;

    /**
     * @return Identifier of a license file that will be applied on a secondary device.
     * 
     */
    public Optional<Output<String>> licenseFileId() {
        return Optional.ofNullable(this.licenseFileId);
    }

    /**
     * Device license registration status. Possible values are `APPLYING_LICENSE`, `REGISTERED`, `APPLIED`, `WAITING_FOR_CLUSTER_SETUP`, `REGISTRATION_FAILED`.
     * 
     */
    @Import(name="licenseStatus")
    private @Nullable Output<String> licenseStatus;

    /**
     * @return Device license registration status. Possible values are `APPLYING_LICENSE`, `REGISTERED`, `APPLIED`, `WAITING_FOR_CLUSTER_SETUP`, `REGISTRATION_FAILED`.
     * 
     */
    public Optional<Output<String>> licenseStatus() {
        return Optional.ofNullable(this.licenseStatus);
    }

    /**
     * License Token can be provided for some device types o the device.
     * 
     */
    @Import(name="licenseToken")
    private @Nullable Output<String> licenseToken;

    /**
     * @return License Token can be provided for some device types o the device.
     * 
     */
    public Optional<Output<String>> licenseToken() {
        return Optional.ofNullable(this.licenseToken);
    }

    /**
     * Metro location of a secondary device.
     * 
     */
    @Import(name="metroCode", required=true)
    private Output<String> metroCode;

    /**
     * @return Metro location of a secondary device.
     * 
     */
    public Output<String> metroCode() {
        return this.metroCode;
    }

    /**
     * Identifier of an MGMT interface ACL template that will be applied on a secondary device.
     * * `ssh-key` - (Optional) Up to one definition of SSH key that will be provisioned on a secondary device.
     * 
     */
    @Import(name="mgmtAclTemplateUuid")
    private @Nullable Output<String> mgmtAclTemplateUuid;

    /**
     * @return Identifier of an MGMT interface ACL template that will be applied on a secondary device.
     * * `ssh-key` - (Optional) Up to one definition of SSH key that will be provisioned on a secondary device.
     * 
     */
    public Optional<Output<String>> mgmtAclTemplateUuid() {
        return Optional.ofNullable(this.mgmtAclTemplateUuid);
    }

    /**
     * Secondary device name.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Secondary device name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * List of email addresses that will receive notifications about secondary device.
     * 
     */
    @Import(name="notifications", required=true)
    private Output<List<String>> notifications;

    /**
     * @return List of email addresses that will receive notifications about secondary device.
     * 
     */
    public Output<List<String>> notifications() {
        return this.notifications;
    }

    /**
     * Unique Identifier for the project resource where the device is scoped to.If you leave it out, the device will be created under the default project id of your organization.
     * 
     */
    @Import(name="projectId")
    private @Nullable Output<String> projectId;

    /**
     * @return Unique Identifier for the project resource where the device is scoped to.If you leave it out, the device will be created under the default project id of your organization.
     * 
     */
    public Optional<Output<String>> projectId() {
        return Optional.ofNullable(this.projectId);
    }

    /**
     * Device redundancy type applicable for HA devices, either primary or secondary.
     * 
     */
    @Import(name="redundancyType")
    private @Nullable Output<String> redundancyType;

    /**
     * @return Device redundancy type applicable for HA devices, either primary or secondary.
     * 
     */
    public Optional<Output<String>> redundancyType() {
        return Optional.ofNullable(this.redundancyType);
    }

    /**
     * Unique identifier for a redundant device applicable for HA devices.
     * 
     */
    @Import(name="redundantId")
    private @Nullable Output<String> redundantId;

    /**
     * @return Unique identifier for a redundant device applicable for HA devices.
     * 
     */
    public Optional<Output<String>> redundantId() {
        return Optional.ofNullable(this.redundantId);
    }

    /**
     * Device location region.
     * 
     */
    @Import(name="region")
    private @Nullable Output<String> region;

    /**
     * @return Device location region.
     * 
     */
    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    /**
     * IP address of SSH enabled interface on the device.
     * 
     */
    @Import(name="sshIpAddress")
    private @Nullable Output<String> sshIpAddress;

    /**
     * @return IP address of SSH enabled interface on the device.
     * 
     */
    public Optional<Output<String>> sshIpAddress() {
        return Optional.ofNullable(this.sshIpAddress);
    }

    /**
     * FQDN of SSH enabled interface on the device.
     * 
     */
    @Import(name="sshIpFqdn")
    private @Nullable Output<String> sshIpFqdn;

    /**
     * @return FQDN of SSH enabled interface on the device.
     * 
     */
    public Optional<Output<String>> sshIpFqdn() {
        return Optional.ofNullable(this.sshIpFqdn);
    }

    /**
     * Definition of SSH key that will be provisioned on a device
     * 
     */
    @Import(name="sshKey")
    private @Nullable Output<DeviceSecondaryDeviceSshKeyArgs> sshKey;

    /**
     * @return Definition of SSH key that will be provisioned on a device
     * 
     */
    public Optional<Output<DeviceSecondaryDeviceSshKeyArgs>> sshKey() {
        return Optional.ofNullable(this.sshKey);
    }

    /**
     * interface status. One of `AVAILABLE`, `RESERVED`, `ASSIGNED`.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return interface status. One of `AVAILABLE`, `RESERVED`, `ASSIGNED`.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * Device unique identifier.
     * 
     */
    @Import(name="uuid")
    private @Nullable Output<String> uuid;

    /**
     * @return Device unique identifier.
     * 
     */
    public Optional<Output<String>> uuid() {
        return Optional.ofNullable(this.uuid);
    }

    /**
     * Key/Value pairs of vendor specific configuration parameters for a secondary device. Key values are `controller1`, `activationKey`, `managementType`, `siteId`, `systemIpAddress`, `privateAddress`, `privateCidrMask`, `privateGateway`, `licenseKey`, `licenseId`, `panoramaAuthKey`, `panoramaIpAddress`.
     * 
     */
    @Import(name="vendorConfiguration")
    private @Nullable Output<Map<String,String>> vendorConfiguration;

    /**
     * @return Key/Value pairs of vendor specific configuration parameters for a secondary device. Key values are `controller1`, `activationKey`, `managementType`, `siteId`, `systemIpAddress`, `privateAddress`, `privateCidrMask`, `privateGateway`, `licenseKey`, `licenseId`, `panoramaAuthKey`, `panoramaIpAddress`.
     * 
     */
    public Optional<Output<Map<String,String>>> vendorConfiguration() {
        return Optional.ofNullable(this.vendorConfiguration);
    }

    /**
     * device interface id picked for WAN
     * 
     */
    @Import(name="wanInterfaceId")
    private @Nullable Output<String> wanInterfaceId;

    /**
     * @return device interface id picked for WAN
     * 
     */
    public Optional<Output<String>> wanInterfaceId() {
        return Optional.ofNullable(this.wanInterfaceId);
    }

    /**
     * Device location zone code.
     * 
     */
    @Import(name="zoneCode")
    private @Nullable Output<String> zoneCode;

    /**
     * @return Device location zone code.
     * 
     */
    public Optional<Output<String>> zoneCode() {
        return Optional.ofNullable(this.zoneCode);
    }

    private DeviceSecondaryDeviceArgs() {}

    private DeviceSecondaryDeviceArgs(DeviceSecondaryDeviceArgs $) {
        this.accountNumber = $.accountNumber;
        this.aclTemplateId = $.aclTemplateId;
        this.additionalBandwidth = $.additionalBandwidth;
        this.asn = $.asn;
        this.cloudInitFileId = $.cloudInitFileId;
        this.hostname = $.hostname;
        this.ibx = $.ibx;
        this.interfaces = $.interfaces;
        this.licenseFile = $.licenseFile;
        this.licenseFileId = $.licenseFileId;
        this.licenseStatus = $.licenseStatus;
        this.licenseToken = $.licenseToken;
        this.metroCode = $.metroCode;
        this.mgmtAclTemplateUuid = $.mgmtAclTemplateUuid;
        this.name = $.name;
        this.notifications = $.notifications;
        this.projectId = $.projectId;
        this.redundancyType = $.redundancyType;
        this.redundantId = $.redundantId;
        this.region = $.region;
        this.sshIpAddress = $.sshIpAddress;
        this.sshIpFqdn = $.sshIpFqdn;
        this.sshKey = $.sshKey;
        this.status = $.status;
        this.uuid = $.uuid;
        this.vendorConfiguration = $.vendorConfiguration;
        this.wanInterfaceId = $.wanInterfaceId;
        this.zoneCode = $.zoneCode;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeviceSecondaryDeviceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeviceSecondaryDeviceArgs $;

        public Builder() {
            $ = new DeviceSecondaryDeviceArgs();
        }

        public Builder(DeviceSecondaryDeviceArgs defaults) {
            $ = new DeviceSecondaryDeviceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountNumber Billing account number for secondary device.
         * 
         * @return builder
         * 
         */
        public Builder accountNumber(Output<String> accountNumber) {
            $.accountNumber = accountNumber;
            return this;
        }

        /**
         * @param accountNumber Billing account number for secondary device.
         * 
         * @return builder
         * 
         */
        public Builder accountNumber(String accountNumber) {
            return accountNumber(Output.of(accountNumber));
        }

        /**
         * @param aclTemplateId Identifier of a WAN interface ACL template that will be applied on a secondary device.
         * 
         * @return builder
         * 
         */
        public Builder aclTemplateId(@Nullable Output<String> aclTemplateId) {
            $.aclTemplateId = aclTemplateId;
            return this;
        }

        /**
         * @param aclTemplateId Identifier of a WAN interface ACL template that will be applied on a secondary device.
         * 
         * @return builder
         * 
         */
        public Builder aclTemplateId(String aclTemplateId) {
            return aclTemplateId(Output.of(aclTemplateId));
        }

        /**
         * @param additionalBandwidth Additional Internet bandwidth, in Mbps, for a secondary device.
         * 
         * @return builder
         * 
         */
        public Builder additionalBandwidth(@Nullable Output<Integer> additionalBandwidth) {
            $.additionalBandwidth = additionalBandwidth;
            return this;
        }

        /**
         * @param additionalBandwidth Additional Internet bandwidth, in Mbps, for a secondary device.
         * 
         * @return builder
         * 
         */
        public Builder additionalBandwidth(Integer additionalBandwidth) {
            return additionalBandwidth(Output.of(additionalBandwidth));
        }

        /**
         * @param asn (Autonomous System Number) Unique identifier for a network on the internet.
         * 
         * @return builder
         * 
         */
        public Builder asn(@Nullable Output<Integer> asn) {
            $.asn = asn;
            return this;
        }

        /**
         * @param asn (Autonomous System Number) Unique identifier for a network on the internet.
         * 
         * @return builder
         * 
         */
        public Builder asn(Integer asn) {
            return asn(Output.of(asn));
        }

        /**
         * @param cloudInitFileId Identifier of a cloud init file that will be applied on a secondary device.
         * 
         * @return builder
         * 
         */
        public Builder cloudInitFileId(@Nullable Output<String> cloudInitFileId) {
            $.cloudInitFileId = cloudInitFileId;
            return this;
        }

        /**
         * @param cloudInitFileId Identifier of a cloud init file that will be applied on a secondary device.
         * 
         * @return builder
         * 
         */
        public Builder cloudInitFileId(String cloudInitFileId) {
            return cloudInitFileId(Output.of(cloudInitFileId));
        }

        /**
         * @param hostname Secondary device hostname.
         * 
         * @return builder
         * 
         */
        public Builder hostname(@Nullable Output<String> hostname) {
            $.hostname = hostname;
            return this;
        }

        /**
         * @param hostname Secondary device hostname.
         * 
         * @return builder
         * 
         */
        public Builder hostname(String hostname) {
            return hostname(Output.of(hostname));
        }

        /**
         * @param ibx Device location Equinix Business Exchange name.
         * 
         * @return builder
         * 
         */
        public Builder ibx(@Nullable Output<String> ibx) {
            $.ibx = ibx;
            return this;
        }

        /**
         * @param ibx Device location Equinix Business Exchange name.
         * 
         * @return builder
         * 
         */
        public Builder ibx(String ibx) {
            return ibx(Output.of(ibx));
        }

        /**
         * @param interfaces List of device interfaces. See Interface Attribute below for more details.
         * 
         * @return builder
         * 
         */
        public Builder interfaces(@Nullable Output<List<DeviceSecondaryDeviceInterfaceArgs>> interfaces) {
            $.interfaces = interfaces;
            return this;
        }

        /**
         * @param interfaces List of device interfaces. See Interface Attribute below for more details.
         * 
         * @return builder
         * 
         */
        public Builder interfaces(List<DeviceSecondaryDeviceInterfaceArgs> interfaces) {
            return interfaces(Output.of(interfaces));
        }

        /**
         * @param interfaces List of device interfaces. See Interface Attribute below for more details.
         * 
         * @return builder
         * 
         */
        public Builder interfaces(DeviceSecondaryDeviceInterfaceArgs... interfaces) {
            return interfaces(List.of(interfaces));
        }

        /**
         * @param licenseFile Path to the license file that will be uploaded and applied on a secondary device. Applicable for some device types in BYOL licensing mode.
         * 
         * @return builder
         * 
         */
        public Builder licenseFile(@Nullable Output<String> licenseFile) {
            $.licenseFile = licenseFile;
            return this;
        }

        /**
         * @param licenseFile Path to the license file that will be uploaded and applied on a secondary device. Applicable for some device types in BYOL licensing mode.
         * 
         * @return builder
         * 
         */
        public Builder licenseFile(String licenseFile) {
            return licenseFile(Output.of(licenseFile));
        }

        /**
         * @param licenseFileId Identifier of a license file that will be applied on a secondary device.
         * 
         * @return builder
         * 
         */
        public Builder licenseFileId(@Nullable Output<String> licenseFileId) {
            $.licenseFileId = licenseFileId;
            return this;
        }

        /**
         * @param licenseFileId Identifier of a license file that will be applied on a secondary device.
         * 
         * @return builder
         * 
         */
        public Builder licenseFileId(String licenseFileId) {
            return licenseFileId(Output.of(licenseFileId));
        }

        /**
         * @param licenseStatus Device license registration status. Possible values are `APPLYING_LICENSE`, `REGISTERED`, `APPLIED`, `WAITING_FOR_CLUSTER_SETUP`, `REGISTRATION_FAILED`.
         * 
         * @return builder
         * 
         */
        public Builder licenseStatus(@Nullable Output<String> licenseStatus) {
            $.licenseStatus = licenseStatus;
            return this;
        }

        /**
         * @param licenseStatus Device license registration status. Possible values are `APPLYING_LICENSE`, `REGISTERED`, `APPLIED`, `WAITING_FOR_CLUSTER_SETUP`, `REGISTRATION_FAILED`.
         * 
         * @return builder
         * 
         */
        public Builder licenseStatus(String licenseStatus) {
            return licenseStatus(Output.of(licenseStatus));
        }

        /**
         * @param licenseToken License Token can be provided for some device types o the device.
         * 
         * @return builder
         * 
         */
        public Builder licenseToken(@Nullable Output<String> licenseToken) {
            $.licenseToken = licenseToken;
            return this;
        }

        /**
         * @param licenseToken License Token can be provided for some device types o the device.
         * 
         * @return builder
         * 
         */
        public Builder licenseToken(String licenseToken) {
            return licenseToken(Output.of(licenseToken));
        }

        /**
         * @param metroCode Metro location of a secondary device.
         * 
         * @return builder
         * 
         */
        public Builder metroCode(Output<String> metroCode) {
            $.metroCode = metroCode;
            return this;
        }

        /**
         * @param metroCode Metro location of a secondary device.
         * 
         * @return builder
         * 
         */
        public Builder metroCode(String metroCode) {
            return metroCode(Output.of(metroCode));
        }

        /**
         * @param mgmtAclTemplateUuid Identifier of an MGMT interface ACL template that will be applied on a secondary device.
         * * `ssh-key` - (Optional) Up to one definition of SSH key that will be provisioned on a secondary device.
         * 
         * @return builder
         * 
         */
        public Builder mgmtAclTemplateUuid(@Nullable Output<String> mgmtAclTemplateUuid) {
            $.mgmtAclTemplateUuid = mgmtAclTemplateUuid;
            return this;
        }

        /**
         * @param mgmtAclTemplateUuid Identifier of an MGMT interface ACL template that will be applied on a secondary device.
         * * `ssh-key` - (Optional) Up to one definition of SSH key that will be provisioned on a secondary device.
         * 
         * @return builder
         * 
         */
        public Builder mgmtAclTemplateUuid(String mgmtAclTemplateUuid) {
            return mgmtAclTemplateUuid(Output.of(mgmtAclTemplateUuid));
        }

        /**
         * @param name Secondary device name.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Secondary device name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param notifications List of email addresses that will receive notifications about secondary device.
         * 
         * @return builder
         * 
         */
        public Builder notifications(Output<List<String>> notifications) {
            $.notifications = notifications;
            return this;
        }

        /**
         * @param notifications List of email addresses that will receive notifications about secondary device.
         * 
         * @return builder
         * 
         */
        public Builder notifications(List<String> notifications) {
            return notifications(Output.of(notifications));
        }

        /**
         * @param notifications List of email addresses that will receive notifications about secondary device.
         * 
         * @return builder
         * 
         */
        public Builder notifications(String... notifications) {
            return notifications(List.of(notifications));
        }

        /**
         * @param projectId Unique Identifier for the project resource where the device is scoped to.If you leave it out, the device will be created under the default project id of your organization.
         * 
         * @return builder
         * 
         */
        public Builder projectId(@Nullable Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId Unique Identifier for the project resource where the device is scoped to.If you leave it out, the device will be created under the default project id of your organization.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        /**
         * @param redundancyType Device redundancy type applicable for HA devices, either primary or secondary.
         * 
         * @return builder
         * 
         */
        public Builder redundancyType(@Nullable Output<String> redundancyType) {
            $.redundancyType = redundancyType;
            return this;
        }

        /**
         * @param redundancyType Device redundancy type applicable for HA devices, either primary or secondary.
         * 
         * @return builder
         * 
         */
        public Builder redundancyType(String redundancyType) {
            return redundancyType(Output.of(redundancyType));
        }

        /**
         * @param redundantId Unique identifier for a redundant device applicable for HA devices.
         * 
         * @return builder
         * 
         */
        public Builder redundantId(@Nullable Output<String> redundantId) {
            $.redundantId = redundantId;
            return this;
        }

        /**
         * @param redundantId Unique identifier for a redundant device applicable for HA devices.
         * 
         * @return builder
         * 
         */
        public Builder redundantId(String redundantId) {
            return redundantId(Output.of(redundantId));
        }

        /**
         * @param region Device location region.
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region Device location region.
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        /**
         * @param sshIpAddress IP address of SSH enabled interface on the device.
         * 
         * @return builder
         * 
         */
        public Builder sshIpAddress(@Nullable Output<String> sshIpAddress) {
            $.sshIpAddress = sshIpAddress;
            return this;
        }

        /**
         * @param sshIpAddress IP address of SSH enabled interface on the device.
         * 
         * @return builder
         * 
         */
        public Builder sshIpAddress(String sshIpAddress) {
            return sshIpAddress(Output.of(sshIpAddress));
        }

        /**
         * @param sshIpFqdn FQDN of SSH enabled interface on the device.
         * 
         * @return builder
         * 
         */
        public Builder sshIpFqdn(@Nullable Output<String> sshIpFqdn) {
            $.sshIpFqdn = sshIpFqdn;
            return this;
        }

        /**
         * @param sshIpFqdn FQDN of SSH enabled interface on the device.
         * 
         * @return builder
         * 
         */
        public Builder sshIpFqdn(String sshIpFqdn) {
            return sshIpFqdn(Output.of(sshIpFqdn));
        }

        /**
         * @param sshKey Definition of SSH key that will be provisioned on a device
         * 
         * @return builder
         * 
         */
        public Builder sshKey(@Nullable Output<DeviceSecondaryDeviceSshKeyArgs> sshKey) {
            $.sshKey = sshKey;
            return this;
        }

        /**
         * @param sshKey Definition of SSH key that will be provisioned on a device
         * 
         * @return builder
         * 
         */
        public Builder sshKey(DeviceSecondaryDeviceSshKeyArgs sshKey) {
            return sshKey(Output.of(sshKey));
        }

        /**
         * @param status interface status. One of `AVAILABLE`, `RESERVED`, `ASSIGNED`.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status interface status. One of `AVAILABLE`, `RESERVED`, `ASSIGNED`.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param uuid Device unique identifier.
         * 
         * @return builder
         * 
         */
        public Builder uuid(@Nullable Output<String> uuid) {
            $.uuid = uuid;
            return this;
        }

        /**
         * @param uuid Device unique identifier.
         * 
         * @return builder
         * 
         */
        public Builder uuid(String uuid) {
            return uuid(Output.of(uuid));
        }

        /**
         * @param vendorConfiguration Key/Value pairs of vendor specific configuration parameters for a secondary device. Key values are `controller1`, `activationKey`, `managementType`, `siteId`, `systemIpAddress`, `privateAddress`, `privateCidrMask`, `privateGateway`, `licenseKey`, `licenseId`, `panoramaAuthKey`, `panoramaIpAddress`.
         * 
         * @return builder
         * 
         */
        public Builder vendorConfiguration(@Nullable Output<Map<String,String>> vendorConfiguration) {
            $.vendorConfiguration = vendorConfiguration;
            return this;
        }

        /**
         * @param vendorConfiguration Key/Value pairs of vendor specific configuration parameters for a secondary device. Key values are `controller1`, `activationKey`, `managementType`, `siteId`, `systemIpAddress`, `privateAddress`, `privateCidrMask`, `privateGateway`, `licenseKey`, `licenseId`, `panoramaAuthKey`, `panoramaIpAddress`.
         * 
         * @return builder
         * 
         */
        public Builder vendorConfiguration(Map<String,String> vendorConfiguration) {
            return vendorConfiguration(Output.of(vendorConfiguration));
        }

        /**
         * @param wanInterfaceId device interface id picked for WAN
         * 
         * @return builder
         * 
         */
        public Builder wanInterfaceId(@Nullable Output<String> wanInterfaceId) {
            $.wanInterfaceId = wanInterfaceId;
            return this;
        }

        /**
         * @param wanInterfaceId device interface id picked for WAN
         * 
         * @return builder
         * 
         */
        public Builder wanInterfaceId(String wanInterfaceId) {
            return wanInterfaceId(Output.of(wanInterfaceId));
        }

        /**
         * @param zoneCode Device location zone code.
         * 
         * @return builder
         * 
         */
        public Builder zoneCode(@Nullable Output<String> zoneCode) {
            $.zoneCode = zoneCode;
            return this;
        }

        /**
         * @param zoneCode Device location zone code.
         * 
         * @return builder
         * 
         */
        public Builder zoneCode(String zoneCode) {
            return zoneCode(Output.of(zoneCode));
        }

        public DeviceSecondaryDeviceArgs build() {
            if ($.accountNumber == null) {
                throw new MissingRequiredPropertyException("DeviceSecondaryDeviceArgs", "accountNumber");
            }
            if ($.metroCode == null) {
                throw new MissingRequiredPropertyException("DeviceSecondaryDeviceArgs", "metroCode");
            }
            if ($.name == null) {
                throw new MissingRequiredPropertyException("DeviceSecondaryDeviceArgs", "name");
            }
            if ($.notifications == null) {
                throw new MissingRequiredPropertyException("DeviceSecondaryDeviceArgs", "notifications");
            }
            return $;
        }
    }

}
