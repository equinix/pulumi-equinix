// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.metal.outputs;

import com.equinix.pulumi.metal.outputs.GetDevicesDeviceNetwork;
import com.equinix.pulumi.metal.outputs.GetDevicesDevicePort;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetDevicesDevice {
    /**
     * @return The ipv4 private IP assigned to the device
     * 
     */
    private String accessPrivateIpv4;
    /**
     * @return The ipv4 management IP assigned to the device
     * 
     */
    private String accessPublicIpv4;
    /**
     * @return The ipv6 management IP assigned to the device
     * 
     */
    private String accessPublicIpv6;
    private Boolean alwaysPxe;
    /**
     * @return The billing cycle of the device (monthly or hourly)
     * 
     */
    private String billingCycle;
    /**
     * @return Description string for the device
     * 
     */
    private String description;
    /**
     * @return Device ID
     * 
     */
    private String deviceId;
    /**
     * @return The facility where the device is deployed
     * 
     * @deprecated
     * Use metro instead of facility.  For more information, read the migration guide: https://registry.terraform.io/providers/equinix/equinix/latest/docs/guides/migration_guide_facilities_to_metros_devices
     * 
     */
    @Deprecated /* Use metro instead of facility.  For more information, read the migration guide: https://registry.terraform.io/providers/equinix/equinix/latest/docs/guides/migration_guide_facilities_to_metros_devices */
    private String facility;
    /**
     * @return The id of hardware reservation which this device occupies
     * 
     */
    private String hardwareReservationId;
    /**
     * @return The device name
     * 
     */
    private String hostname;
    private String ipxeScriptUrl;
    /**
     * @return The metro where the device is deployed
     * 
     */
    private String metro;
    /**
     * @return L2 network type of the device, one oflayer3, hybrid, layer2-individual, layer2-bonded
     * 
     */
    private String networkType;
    /**
     * @return The device&#39;s private and public IP (v4 and v6) network details. When a device is run without any special network configuration, it will have 3 networks: ublic IPv4 at equinix_metal_device.name.network.0, IPv6 at equinix_metal_device.name.network.1 and private IPv4 at equinix_metal_device.name.network.2. Elastic addresses then stack by type - an assigned public IPv4 will go after the management public IPv4 (to index 1), and will then shift the indices of the IPv6 and private IPv4. Assigned private IPv4 will go after the management private IPv4 (to the end of the network list).
     * 
     */
    private List<GetDevicesDeviceNetwork> networks;
    /**
     * @return The operating system running on the device
     * 
     */
    private String operatingSystem;
    /**
     * @return The hardware config of the device
     * 
     */
    private String plan;
    /**
     * @return Ports assigned to the device
     * 
     */
    private List<GetDevicesDevicePort> ports;
    /**
     * @return ID of project containing the devices. Exactly one of `project_id` and `organization_id` must be set.
     * 
     */
    private String projectId;
    /**
     * @return Root password to the server (if still available)
     * 
     */
    private String rootPassword;
    /**
     * @return The hostname to use for [Serial over SSH](https://deploy.equinix.com/developers/docs/metal/resilience-recovery/serial-over-ssh/) access to the device
     * 
     */
    private String sosHostname;
    /**
     * @return List of IDs of SSH keys deployed in the device, can be both user or project SSH keys
     * 
     */
    private List<String> sshKeyIds;
    /**
     * @return The state of the device
     * 
     */
    private String state;
    private String storage;
    /**
     * @return Tags attached to the device
     * 
     */
    private List<String> tags;

    private GetDevicesDevice() {}
    /**
     * @return The ipv4 private IP assigned to the device
     * 
     */
    public String accessPrivateIpv4() {
        return this.accessPrivateIpv4;
    }
    /**
     * @return The ipv4 management IP assigned to the device
     * 
     */
    public String accessPublicIpv4() {
        return this.accessPublicIpv4;
    }
    /**
     * @return The ipv6 management IP assigned to the device
     * 
     */
    public String accessPublicIpv6() {
        return this.accessPublicIpv6;
    }
    public Boolean alwaysPxe() {
        return this.alwaysPxe;
    }
    /**
     * @return The billing cycle of the device (monthly or hourly)
     * 
     */
    public String billingCycle() {
        return this.billingCycle;
    }
    /**
     * @return Description string for the device
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return Device ID
     * 
     */
    public String deviceId() {
        return this.deviceId;
    }
    /**
     * @return The facility where the device is deployed
     * 
     * @deprecated
     * Use metro instead of facility.  For more information, read the migration guide: https://registry.terraform.io/providers/equinix/equinix/latest/docs/guides/migration_guide_facilities_to_metros_devices
     * 
     */
    @Deprecated /* Use metro instead of facility.  For more information, read the migration guide: https://registry.terraform.io/providers/equinix/equinix/latest/docs/guides/migration_guide_facilities_to_metros_devices */
    public String facility() {
        return this.facility;
    }
    /**
     * @return The id of hardware reservation which this device occupies
     * 
     */
    public String hardwareReservationId() {
        return this.hardwareReservationId;
    }
    /**
     * @return The device name
     * 
     */
    public String hostname() {
        return this.hostname;
    }
    public String ipxeScriptUrl() {
        return this.ipxeScriptUrl;
    }
    /**
     * @return The metro where the device is deployed
     * 
     */
    public String metro() {
        return this.metro;
    }
    /**
     * @return L2 network type of the device, one oflayer3, hybrid, layer2-individual, layer2-bonded
     * 
     */
    public String networkType() {
        return this.networkType;
    }
    /**
     * @return The device&#39;s private and public IP (v4 and v6) network details. When a device is run without any special network configuration, it will have 3 networks: ublic IPv4 at equinix_metal_device.name.network.0, IPv6 at equinix_metal_device.name.network.1 and private IPv4 at equinix_metal_device.name.network.2. Elastic addresses then stack by type - an assigned public IPv4 will go after the management public IPv4 (to index 1), and will then shift the indices of the IPv6 and private IPv4. Assigned private IPv4 will go after the management private IPv4 (to the end of the network list).
     * 
     */
    public List<GetDevicesDeviceNetwork> networks() {
        return this.networks;
    }
    /**
     * @return The operating system running on the device
     * 
     */
    public String operatingSystem() {
        return this.operatingSystem;
    }
    /**
     * @return The hardware config of the device
     * 
     */
    public String plan() {
        return this.plan;
    }
    /**
     * @return Ports assigned to the device
     * 
     */
    public List<GetDevicesDevicePort> ports() {
        return this.ports;
    }
    /**
     * @return ID of project containing the devices. Exactly one of `project_id` and `organization_id` must be set.
     * 
     */
    public String projectId() {
        return this.projectId;
    }
    /**
     * @return Root password to the server (if still available)
     * 
     */
    public String rootPassword() {
        return this.rootPassword;
    }
    /**
     * @return The hostname to use for [Serial over SSH](https://deploy.equinix.com/developers/docs/metal/resilience-recovery/serial-over-ssh/) access to the device
     * 
     */
    public String sosHostname() {
        return this.sosHostname;
    }
    /**
     * @return List of IDs of SSH keys deployed in the device, can be both user or project SSH keys
     * 
     */
    public List<String> sshKeyIds() {
        return this.sshKeyIds;
    }
    /**
     * @return The state of the device
     * 
     */
    public String state() {
        return this.state;
    }
    public String storage() {
        return this.storage;
    }
    /**
     * @return Tags attached to the device
     * 
     */
    public List<String> tags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDevicesDevice defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String accessPrivateIpv4;
        private String accessPublicIpv4;
        private String accessPublicIpv6;
        private Boolean alwaysPxe;
        private String billingCycle;
        private String description;
        private String deviceId;
        private String facility;
        private String hardwareReservationId;
        private String hostname;
        private String ipxeScriptUrl;
        private String metro;
        private String networkType;
        private List<GetDevicesDeviceNetwork> networks;
        private String operatingSystem;
        private String plan;
        private List<GetDevicesDevicePort> ports;
        private String projectId;
        private String rootPassword;
        private String sosHostname;
        private List<String> sshKeyIds;
        private String state;
        private String storage;
        private List<String> tags;
        public Builder() {}
        public Builder(GetDevicesDevice defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessPrivateIpv4 = defaults.accessPrivateIpv4;
    	      this.accessPublicIpv4 = defaults.accessPublicIpv4;
    	      this.accessPublicIpv6 = defaults.accessPublicIpv6;
    	      this.alwaysPxe = defaults.alwaysPxe;
    	      this.billingCycle = defaults.billingCycle;
    	      this.description = defaults.description;
    	      this.deviceId = defaults.deviceId;
    	      this.facility = defaults.facility;
    	      this.hardwareReservationId = defaults.hardwareReservationId;
    	      this.hostname = defaults.hostname;
    	      this.ipxeScriptUrl = defaults.ipxeScriptUrl;
    	      this.metro = defaults.metro;
    	      this.networkType = defaults.networkType;
    	      this.networks = defaults.networks;
    	      this.operatingSystem = defaults.operatingSystem;
    	      this.plan = defaults.plan;
    	      this.ports = defaults.ports;
    	      this.projectId = defaults.projectId;
    	      this.rootPassword = defaults.rootPassword;
    	      this.sosHostname = defaults.sosHostname;
    	      this.sshKeyIds = defaults.sshKeyIds;
    	      this.state = defaults.state;
    	      this.storage = defaults.storage;
    	      this.tags = defaults.tags;
        }

        @CustomType.Setter
        public Builder accessPrivateIpv4(String accessPrivateIpv4) {
            this.accessPrivateIpv4 = Objects.requireNonNull(accessPrivateIpv4);
            return this;
        }
        @CustomType.Setter
        public Builder accessPublicIpv4(String accessPublicIpv4) {
            this.accessPublicIpv4 = Objects.requireNonNull(accessPublicIpv4);
            return this;
        }
        @CustomType.Setter
        public Builder accessPublicIpv6(String accessPublicIpv6) {
            this.accessPublicIpv6 = Objects.requireNonNull(accessPublicIpv6);
            return this;
        }
        @CustomType.Setter
        public Builder alwaysPxe(Boolean alwaysPxe) {
            this.alwaysPxe = Objects.requireNonNull(alwaysPxe);
            return this;
        }
        @CustomType.Setter
        public Builder billingCycle(String billingCycle) {
            this.billingCycle = Objects.requireNonNull(billingCycle);
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder deviceId(String deviceId) {
            this.deviceId = Objects.requireNonNull(deviceId);
            return this;
        }
        @CustomType.Setter
        public Builder facility(String facility) {
            this.facility = Objects.requireNonNull(facility);
            return this;
        }
        @CustomType.Setter
        public Builder hardwareReservationId(String hardwareReservationId) {
            this.hardwareReservationId = Objects.requireNonNull(hardwareReservationId);
            return this;
        }
        @CustomType.Setter
        public Builder hostname(String hostname) {
            this.hostname = Objects.requireNonNull(hostname);
            return this;
        }
        @CustomType.Setter
        public Builder ipxeScriptUrl(String ipxeScriptUrl) {
            this.ipxeScriptUrl = Objects.requireNonNull(ipxeScriptUrl);
            return this;
        }
        @CustomType.Setter
        public Builder metro(String metro) {
            this.metro = Objects.requireNonNull(metro);
            return this;
        }
        @CustomType.Setter
        public Builder networkType(String networkType) {
            this.networkType = Objects.requireNonNull(networkType);
            return this;
        }
        @CustomType.Setter
        public Builder networks(List<GetDevicesDeviceNetwork> networks) {
            this.networks = Objects.requireNonNull(networks);
            return this;
        }
        public Builder networks(GetDevicesDeviceNetwork... networks) {
            return networks(List.of(networks));
        }
        @CustomType.Setter
        public Builder operatingSystem(String operatingSystem) {
            this.operatingSystem = Objects.requireNonNull(operatingSystem);
            return this;
        }
        @CustomType.Setter
        public Builder plan(String plan) {
            this.plan = Objects.requireNonNull(plan);
            return this;
        }
        @CustomType.Setter
        public Builder ports(List<GetDevicesDevicePort> ports) {
            this.ports = Objects.requireNonNull(ports);
            return this;
        }
        public Builder ports(GetDevicesDevicePort... ports) {
            return ports(List.of(ports));
        }
        @CustomType.Setter
        public Builder projectId(String projectId) {
            this.projectId = Objects.requireNonNull(projectId);
            return this;
        }
        @CustomType.Setter
        public Builder rootPassword(String rootPassword) {
            this.rootPassword = Objects.requireNonNull(rootPassword);
            return this;
        }
        @CustomType.Setter
        public Builder sosHostname(String sosHostname) {
            this.sosHostname = Objects.requireNonNull(sosHostname);
            return this;
        }
        @CustomType.Setter
        public Builder sshKeyIds(List<String> sshKeyIds) {
            this.sshKeyIds = Objects.requireNonNull(sshKeyIds);
            return this;
        }
        public Builder sshKeyIds(String... sshKeyIds) {
            return sshKeyIds(List.of(sshKeyIds));
        }
        @CustomType.Setter
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        @CustomType.Setter
        public Builder storage(String storage) {
            this.storage = Objects.requireNonNull(storage);
            return this;
        }
        @CustomType.Setter
        public Builder tags(List<String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }
        public GetDevicesDevice build() {
            final var _resultValue = new GetDevicesDevice();
            _resultValue.accessPrivateIpv4 = accessPrivateIpv4;
            _resultValue.accessPublicIpv4 = accessPublicIpv4;
            _resultValue.accessPublicIpv6 = accessPublicIpv6;
            _resultValue.alwaysPxe = alwaysPxe;
            _resultValue.billingCycle = billingCycle;
            _resultValue.description = description;
            _resultValue.deviceId = deviceId;
            _resultValue.facility = facility;
            _resultValue.hardwareReservationId = hardwareReservationId;
            _resultValue.hostname = hostname;
            _resultValue.ipxeScriptUrl = ipxeScriptUrl;
            _resultValue.metro = metro;
            _resultValue.networkType = networkType;
            _resultValue.networks = networks;
            _resultValue.operatingSystem = operatingSystem;
            _resultValue.plan = plan;
            _resultValue.ports = ports;
            _resultValue.projectId = projectId;
            _resultValue.rootPassword = rootPassword;
            _resultValue.sosHostname = sosHostname;
            _resultValue.sshKeyIds = sshKeyIds;
            _resultValue.state = state;
            _resultValue.storage = storage;
            _resultValue.tags = tags;
            return _resultValue;
        }
    }
}
