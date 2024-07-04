// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.networkedge.outputs;

import com.equinix.pulumi.networkedge.outputs.GetDeviceSecondaryDeviceInterface;
import com.equinix.pulumi.networkedge.outputs.GetDeviceSecondaryDeviceSshKey;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetDeviceSecondaryDevice {
    /**
     * @return Device billing account number
     * 
     */
    private String accountNumber;
    /**
     * @return Unique identifier of applied ACL template
     * 
     */
    private String aclTemplateId;
    /**
     * @return Additional Internet bandwidth, in Mbps, that will be allocated to the device
     * 
     */
    private Integer additionalBandwidth;
    /**
     * @return Autonomous system number
     * 
     */
    private Integer asn;
    /**
     * @return Unique identifier of applied cloud init file
     * 
     */
    private String cloudInitFileId;
    /**
     * @return Device hostname prefix
     * 
     */
    private String hostname;
    /**
     * @return Device location Equinix Business Exchange name
     * 
     */
    private String ibx;
    /**
     * @return List of device interfaces
     * * `interface.#.id` - interface identifier
     * * `interface.#.name` - interface name
     * * `interface.#.status` - interface status (AVAILABLE, RESERVED, ASSIGNED)
     * * `interface.#.operational_status` - interface operational status (up or down)
     * * `interface.#.mac_address` - interface MAC address
     * * `interface.#.ip_address` - interface IP address
     * * `interface.#.assigned_type` - interface management type (Equinix Managed or empty)
     * * `interface.#.type` - interface type
     * 
     */
    private List<GetDeviceSecondaryDeviceInterface> interfaces;
    /**
     * @return Path to the license file that will be uploaded and applied on a device, applicable for some device types in BYOL licensing mode
     * 
     */
    private String licenseFile;
    /**
     * @return Unique identifier of applied license file
     * 
     */
    private String licenseFileId;
    /**
     * @return Device license registration status
     * * APPLYING_LICENSE
     * * REGISTERED
     * * APPLIED
     * * WAITING_FOR_CLUSTER_SETUP
     * * REGISTRATION_FAILED
     * * NA
     * 
     */
    private String licenseStatus;
    /**
     * @return License Token applicable for some device types in BYOL licensing mode
     * 
     */
    private String licenseToken;
    /**
     * @return Device location metro code
     * 
     */
    private String metroCode;
    /**
     * @return Unique identifier of applied MGMT ACL template
     * 
     */
    private String mgmtAclTemplateUuid;
    /**
     * @return Name of an existing Equinix Network Edge device
     * 
     */
    private String name;
    /**
     * @return List of email addresses that will receive device status notifications
     * 
     */
    private List<String> notifications;
    /**
     * @return The unique identifier of Project Resource to which device is scoped to
     * 
     */
    private String projectId;
    /**
     * @return Device redundancy type applicable for HA devices, either primary or secondary
     * 
     */
    private String redundancyType;
    /**
     * @return Unique identifier for a redundant device applicable for HA devices
     * 
     */
    private String redundantId;
    /**
     * @return Device location region
     * 
     */
    private String region;
    /**
     * @return IP address of SSH enabled interface on the device
     * 
     */
    private String sshIpAddress;
    /**
     * @return FQDN of SSH enabled interface on the device
     * 
     */
    private String sshIpFqdn;
    /**
     * @return Definition of SSH key that will be provisioned on a device
     * 
     */
    private List<GetDeviceSecondaryDeviceSshKey> sshKeys;
    /**
     * @return Device provisioning status
     * * INITIALIZING
     * * PROVISIONING
     * * PROVISIONED (**NOTE: By default data source will only return devices in this state. To include other states see `valid_state_list`**)
     * * WAITING_FOR_PRIMARY
     * * WAITING_FOR_SECONDARY
     * * WAITING_FOR_REPLICA_CLUSTER_NODES
     * * CLUSTER_SETUP_IN_PROGRESS
     * * FAILED
     * * DEPROVISIONING
     * * DEPROVISIONED
     * * RESOURCE_UPGRADE_IN_PROGRESS
     * * RESOURCE_UPGRADE_FAILED
     * 
     */
    private String status;
    /**
     * @return UUID of an existing Equinix Network Edge device
     * 
     */
    private String uuid;
    /**
     * @return Map of vendor specific configuration parameters for a device (controller1, activationKey, managementType, siteId, systemIpAddress)
     * 
     */
    private Map<String,String> vendorConfiguration;
    /**
     * @return device interface id picked for WAN
     * 
     */
    private String wanInterfaceId;
    /**
     * @return Device location zone code
     * 
     */
    private String zoneCode;

    private GetDeviceSecondaryDevice() {}
    /**
     * @return Device billing account number
     * 
     */
    public String accountNumber() {
        return this.accountNumber;
    }
    /**
     * @return Unique identifier of applied ACL template
     * 
     */
    public String aclTemplateId() {
        return this.aclTemplateId;
    }
    /**
     * @return Additional Internet bandwidth, in Mbps, that will be allocated to the device
     * 
     */
    public Integer additionalBandwidth() {
        return this.additionalBandwidth;
    }
    /**
     * @return Autonomous system number
     * 
     */
    public Integer asn() {
        return this.asn;
    }
    /**
     * @return Unique identifier of applied cloud init file
     * 
     */
    public String cloudInitFileId() {
        return this.cloudInitFileId;
    }
    /**
     * @return Device hostname prefix
     * 
     */
    public String hostname() {
        return this.hostname;
    }
    /**
     * @return Device location Equinix Business Exchange name
     * 
     */
    public String ibx() {
        return this.ibx;
    }
    /**
     * @return List of device interfaces
     * * `interface.#.id` - interface identifier
     * * `interface.#.name` - interface name
     * * `interface.#.status` - interface status (AVAILABLE, RESERVED, ASSIGNED)
     * * `interface.#.operational_status` - interface operational status (up or down)
     * * `interface.#.mac_address` - interface MAC address
     * * `interface.#.ip_address` - interface IP address
     * * `interface.#.assigned_type` - interface management type (Equinix Managed or empty)
     * * `interface.#.type` - interface type
     * 
     */
    public List<GetDeviceSecondaryDeviceInterface> interfaces() {
        return this.interfaces;
    }
    /**
     * @return Path to the license file that will be uploaded and applied on a device, applicable for some device types in BYOL licensing mode
     * 
     */
    public String licenseFile() {
        return this.licenseFile;
    }
    /**
     * @return Unique identifier of applied license file
     * 
     */
    public String licenseFileId() {
        return this.licenseFileId;
    }
    /**
     * @return Device license registration status
     * * APPLYING_LICENSE
     * * REGISTERED
     * * APPLIED
     * * WAITING_FOR_CLUSTER_SETUP
     * * REGISTRATION_FAILED
     * * NA
     * 
     */
    public String licenseStatus() {
        return this.licenseStatus;
    }
    /**
     * @return License Token applicable for some device types in BYOL licensing mode
     * 
     */
    public String licenseToken() {
        return this.licenseToken;
    }
    /**
     * @return Device location metro code
     * 
     */
    public String metroCode() {
        return this.metroCode;
    }
    /**
     * @return Unique identifier of applied MGMT ACL template
     * 
     */
    public String mgmtAclTemplateUuid() {
        return this.mgmtAclTemplateUuid;
    }
    /**
     * @return Name of an existing Equinix Network Edge device
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return List of email addresses that will receive device status notifications
     * 
     */
    public List<String> notifications() {
        return this.notifications;
    }
    /**
     * @return The unique identifier of Project Resource to which device is scoped to
     * 
     */
    public String projectId() {
        return this.projectId;
    }
    /**
     * @return Device redundancy type applicable for HA devices, either primary or secondary
     * 
     */
    public String redundancyType() {
        return this.redundancyType;
    }
    /**
     * @return Unique identifier for a redundant device applicable for HA devices
     * 
     */
    public String redundantId() {
        return this.redundantId;
    }
    /**
     * @return Device location region
     * 
     */
    public String region() {
        return this.region;
    }
    /**
     * @return IP address of SSH enabled interface on the device
     * 
     */
    public String sshIpAddress() {
        return this.sshIpAddress;
    }
    /**
     * @return FQDN of SSH enabled interface on the device
     * 
     */
    public String sshIpFqdn() {
        return this.sshIpFqdn;
    }
    /**
     * @return Definition of SSH key that will be provisioned on a device
     * 
     */
    public List<GetDeviceSecondaryDeviceSshKey> sshKeys() {
        return this.sshKeys;
    }
    /**
     * @return Device provisioning status
     * * INITIALIZING
     * * PROVISIONING
     * * PROVISIONED (**NOTE: By default data source will only return devices in this state. To include other states see `valid_state_list`**)
     * * WAITING_FOR_PRIMARY
     * * WAITING_FOR_SECONDARY
     * * WAITING_FOR_REPLICA_CLUSTER_NODES
     * * CLUSTER_SETUP_IN_PROGRESS
     * * FAILED
     * * DEPROVISIONING
     * * DEPROVISIONED
     * * RESOURCE_UPGRADE_IN_PROGRESS
     * * RESOURCE_UPGRADE_FAILED
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return UUID of an existing Equinix Network Edge device
     * 
     */
    public String uuid() {
        return this.uuid;
    }
    /**
     * @return Map of vendor specific configuration parameters for a device (controller1, activationKey, managementType, siteId, systemIpAddress)
     * 
     */
    public Map<String,String> vendorConfiguration() {
        return this.vendorConfiguration;
    }
    /**
     * @return device interface id picked for WAN
     * 
     */
    public String wanInterfaceId() {
        return this.wanInterfaceId;
    }
    /**
     * @return Device location zone code
     * 
     */
    public String zoneCode() {
        return this.zoneCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDeviceSecondaryDevice defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String accountNumber;
        private String aclTemplateId;
        private Integer additionalBandwidth;
        private Integer asn;
        private String cloudInitFileId;
        private String hostname;
        private String ibx;
        private List<GetDeviceSecondaryDeviceInterface> interfaces;
        private String licenseFile;
        private String licenseFileId;
        private String licenseStatus;
        private String licenseToken;
        private String metroCode;
        private String mgmtAclTemplateUuid;
        private String name;
        private List<String> notifications;
        private String projectId;
        private String redundancyType;
        private String redundantId;
        private String region;
        private String sshIpAddress;
        private String sshIpFqdn;
        private List<GetDeviceSecondaryDeviceSshKey> sshKeys;
        private String status;
        private String uuid;
        private Map<String,String> vendorConfiguration;
        private String wanInterfaceId;
        private String zoneCode;
        public Builder() {}
        public Builder(GetDeviceSecondaryDevice defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountNumber = defaults.accountNumber;
    	      this.aclTemplateId = defaults.aclTemplateId;
    	      this.additionalBandwidth = defaults.additionalBandwidth;
    	      this.asn = defaults.asn;
    	      this.cloudInitFileId = defaults.cloudInitFileId;
    	      this.hostname = defaults.hostname;
    	      this.ibx = defaults.ibx;
    	      this.interfaces = defaults.interfaces;
    	      this.licenseFile = defaults.licenseFile;
    	      this.licenseFileId = defaults.licenseFileId;
    	      this.licenseStatus = defaults.licenseStatus;
    	      this.licenseToken = defaults.licenseToken;
    	      this.metroCode = defaults.metroCode;
    	      this.mgmtAclTemplateUuid = defaults.mgmtAclTemplateUuid;
    	      this.name = defaults.name;
    	      this.notifications = defaults.notifications;
    	      this.projectId = defaults.projectId;
    	      this.redundancyType = defaults.redundancyType;
    	      this.redundantId = defaults.redundantId;
    	      this.region = defaults.region;
    	      this.sshIpAddress = defaults.sshIpAddress;
    	      this.sshIpFqdn = defaults.sshIpFqdn;
    	      this.sshKeys = defaults.sshKeys;
    	      this.status = defaults.status;
    	      this.uuid = defaults.uuid;
    	      this.vendorConfiguration = defaults.vendorConfiguration;
    	      this.wanInterfaceId = defaults.wanInterfaceId;
    	      this.zoneCode = defaults.zoneCode;
        }

        @CustomType.Setter
        public Builder accountNumber(String accountNumber) {
            this.accountNumber = Objects.requireNonNull(accountNumber);
            return this;
        }
        @CustomType.Setter
        public Builder aclTemplateId(String aclTemplateId) {
            this.aclTemplateId = Objects.requireNonNull(aclTemplateId);
            return this;
        }
        @CustomType.Setter
        public Builder additionalBandwidth(Integer additionalBandwidth) {
            this.additionalBandwidth = Objects.requireNonNull(additionalBandwidth);
            return this;
        }
        @CustomType.Setter
        public Builder asn(Integer asn) {
            this.asn = Objects.requireNonNull(asn);
            return this;
        }
        @CustomType.Setter
        public Builder cloudInitFileId(String cloudInitFileId) {
            this.cloudInitFileId = Objects.requireNonNull(cloudInitFileId);
            return this;
        }
        @CustomType.Setter
        public Builder hostname(String hostname) {
            this.hostname = Objects.requireNonNull(hostname);
            return this;
        }
        @CustomType.Setter
        public Builder ibx(String ibx) {
            this.ibx = Objects.requireNonNull(ibx);
            return this;
        }
        @CustomType.Setter
        public Builder interfaces(List<GetDeviceSecondaryDeviceInterface> interfaces) {
            this.interfaces = Objects.requireNonNull(interfaces);
            return this;
        }
        public Builder interfaces(GetDeviceSecondaryDeviceInterface... interfaces) {
            return interfaces(List.of(interfaces));
        }
        @CustomType.Setter
        public Builder licenseFile(String licenseFile) {
            this.licenseFile = Objects.requireNonNull(licenseFile);
            return this;
        }
        @CustomType.Setter
        public Builder licenseFileId(String licenseFileId) {
            this.licenseFileId = Objects.requireNonNull(licenseFileId);
            return this;
        }
        @CustomType.Setter
        public Builder licenseStatus(String licenseStatus) {
            this.licenseStatus = Objects.requireNonNull(licenseStatus);
            return this;
        }
        @CustomType.Setter
        public Builder licenseToken(String licenseToken) {
            this.licenseToken = Objects.requireNonNull(licenseToken);
            return this;
        }
        @CustomType.Setter
        public Builder metroCode(String metroCode) {
            this.metroCode = Objects.requireNonNull(metroCode);
            return this;
        }
        @CustomType.Setter
        public Builder mgmtAclTemplateUuid(String mgmtAclTemplateUuid) {
            this.mgmtAclTemplateUuid = Objects.requireNonNull(mgmtAclTemplateUuid);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder notifications(List<String> notifications) {
            this.notifications = Objects.requireNonNull(notifications);
            return this;
        }
        public Builder notifications(String... notifications) {
            return notifications(List.of(notifications));
        }
        @CustomType.Setter
        public Builder projectId(String projectId) {
            this.projectId = Objects.requireNonNull(projectId);
            return this;
        }
        @CustomType.Setter
        public Builder redundancyType(String redundancyType) {
            this.redundancyType = Objects.requireNonNull(redundancyType);
            return this;
        }
        @CustomType.Setter
        public Builder redundantId(String redundantId) {
            this.redundantId = Objects.requireNonNull(redundantId);
            return this;
        }
        @CustomType.Setter
        public Builder region(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }
        @CustomType.Setter
        public Builder sshIpAddress(String sshIpAddress) {
            this.sshIpAddress = Objects.requireNonNull(sshIpAddress);
            return this;
        }
        @CustomType.Setter
        public Builder sshIpFqdn(String sshIpFqdn) {
            this.sshIpFqdn = Objects.requireNonNull(sshIpFqdn);
            return this;
        }
        @CustomType.Setter
        public Builder sshKeys(List<GetDeviceSecondaryDeviceSshKey> sshKeys) {
            this.sshKeys = Objects.requireNonNull(sshKeys);
            return this;
        }
        public Builder sshKeys(GetDeviceSecondaryDeviceSshKey... sshKeys) {
            return sshKeys(List.of(sshKeys));
        }
        @CustomType.Setter
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        @CustomType.Setter
        public Builder uuid(String uuid) {
            this.uuid = Objects.requireNonNull(uuid);
            return this;
        }
        @CustomType.Setter
        public Builder vendorConfiguration(Map<String,String> vendorConfiguration) {
            this.vendorConfiguration = Objects.requireNonNull(vendorConfiguration);
            return this;
        }
        @CustomType.Setter
        public Builder wanInterfaceId(String wanInterfaceId) {
            this.wanInterfaceId = Objects.requireNonNull(wanInterfaceId);
            return this;
        }
        @CustomType.Setter
        public Builder zoneCode(String zoneCode) {
            this.zoneCode = Objects.requireNonNull(zoneCode);
            return this;
        }
        public GetDeviceSecondaryDevice build() {
            final var _resultValue = new GetDeviceSecondaryDevice();
            _resultValue.accountNumber = accountNumber;
            _resultValue.aclTemplateId = aclTemplateId;
            _resultValue.additionalBandwidth = additionalBandwidth;
            _resultValue.asn = asn;
            _resultValue.cloudInitFileId = cloudInitFileId;
            _resultValue.hostname = hostname;
            _resultValue.ibx = ibx;
            _resultValue.interfaces = interfaces;
            _resultValue.licenseFile = licenseFile;
            _resultValue.licenseFileId = licenseFileId;
            _resultValue.licenseStatus = licenseStatus;
            _resultValue.licenseToken = licenseToken;
            _resultValue.metroCode = metroCode;
            _resultValue.mgmtAclTemplateUuid = mgmtAclTemplateUuid;
            _resultValue.name = name;
            _resultValue.notifications = notifications;
            _resultValue.projectId = projectId;
            _resultValue.redundancyType = redundancyType;
            _resultValue.redundantId = redundantId;
            _resultValue.region = region;
            _resultValue.sshIpAddress = sshIpAddress;
            _resultValue.sshIpFqdn = sshIpFqdn;
            _resultValue.sshKeys = sshKeys;
            _resultValue.status = status;
            _resultValue.uuid = uuid;
            _resultValue.vendorConfiguration = vendorConfiguration;
            _resultValue.wanInterfaceId = wanInterfaceId;
            _resultValue.zoneCode = zoneCode;
            return _resultValue;
        }
    }
}
