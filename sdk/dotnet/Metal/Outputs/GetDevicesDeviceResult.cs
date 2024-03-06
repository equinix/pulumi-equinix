// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Equinix.Metal.Outputs
{

    [OutputType]
    public sealed class GetDevicesDeviceResult
    {
        /// <summary>
        /// The ipv4 private IP assigned to the device
        /// </summary>
        public readonly string AccessPrivateIpv4;
        /// <summary>
        /// The ipv4 management IP assigned to the device
        /// </summary>
        public readonly string AccessPublicIpv4;
        /// <summary>
        /// The ipv6 management IP assigned to the device
        /// </summary>
        public readonly string AccessPublicIpv6;
        public readonly bool AlwaysPxe;
        /// <summary>
        /// The billing cycle of the device (monthly or hourly)
        /// </summary>
        public readonly string BillingCycle;
        /// <summary>
        /// Description string for the device
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// Device ID
        /// </summary>
        public readonly string DeviceId;
        /// <summary>
        /// The facility where the device is deployed
        /// </summary>
        public readonly string Facility;
        /// <summary>
        /// The id of hardware reservation which this device occupies
        /// </summary>
        public readonly string HardwareReservationId;
        /// <summary>
        /// The device name
        /// </summary>
        public readonly string Hostname;
        public readonly string IpxeScriptUrl;
        /// <summary>
        /// The metro where the device is deployed
        /// </summary>
        public readonly string Metro;
        /// <summary>
        /// L2 network type of the device, one oflayer3, hybrid, layer2-individual, layer2-bonded
        /// </summary>
        public readonly string NetworkType;
        /// <summary>
        /// The device's private and public IP (v4 and v6) network details. When a device is run without any special network configuration, it will have 3 networks: ublic IPv4 at equinix_metal_device.name.network.0, IPv6 at equinix_metal_device.name.network.1 and private IPv4 at equinix_metal_device.name.network.2. Elastic addresses then stack by type - an assigned public IPv4 will go after the management public IPv4 (to index 1), and will then shift the indices of the IPv6 and private IPv4. Assigned private IPv4 will go after the management private IPv4 (to the end of the network list).
        /// </summary>
        public readonly ImmutableArray<Outputs.GetDevicesDeviceNetworkResult> Networks;
        /// <summary>
        /// The operating system running on the device
        /// </summary>
        public readonly string OperatingSystem;
        /// <summary>
        /// The hardware config of the device
        /// </summary>
        public readonly string Plan;
        /// <summary>
        /// Ports assigned to the device
        /// </summary>
        public readonly ImmutableArray<Outputs.GetDevicesDevicePortResult> Ports;
        /// <summary>
        /// ID of project containing the devices. Exactly one of `project_id` and `organization_id` must be set.
        /// </summary>
        public readonly string ProjectId;
        /// <summary>
        /// Root password to the server (if still available)
        /// </summary>
        public readonly string RootPassword;
        /// <summary>
        /// The hostname to use for [Serial over SSH](https://deploy.equinix.com/developers/docs/metal/resilience-recovery/serial-over-ssh/) access to the device
        /// </summary>
        public readonly string SosHostname;
        /// <summary>
        /// List of IDs of SSH keys deployed in the device, can be both user or project SSH keys
        /// </summary>
        public readonly ImmutableArray<string> SshKeyIds;
        /// <summary>
        /// The state of the device
        /// </summary>
        public readonly string State;
        public readonly string Storage;
        /// <summary>
        /// Tags attached to the device
        /// </summary>
        public readonly ImmutableArray<string> Tags;

        [OutputConstructor]
        private GetDevicesDeviceResult(
            string accessPrivateIpv4,

            string accessPublicIpv4,

            string accessPublicIpv6,

            bool alwaysPxe,

            string billingCycle,

            string description,

            string deviceId,

            string facility,

            string hardwareReservationId,

            string hostname,

            string ipxeScriptUrl,

            string metro,

            string networkType,

            ImmutableArray<Outputs.GetDevicesDeviceNetworkResult> networks,

            string operatingSystem,

            string plan,

            ImmutableArray<Outputs.GetDevicesDevicePortResult> ports,

            string projectId,

            string rootPassword,

            string sosHostname,

            ImmutableArray<string> sshKeyIds,

            string state,

            string storage,

            ImmutableArray<string> tags)
        {
            AccessPrivateIpv4 = accessPrivateIpv4;
            AccessPublicIpv4 = accessPublicIpv4;
            AccessPublicIpv6 = accessPublicIpv6;
            AlwaysPxe = alwaysPxe;
            BillingCycle = billingCycle;
            Description = description;
            DeviceId = deviceId;
            Facility = facility;
            HardwareReservationId = hardwareReservationId;
            Hostname = hostname;
            IpxeScriptUrl = ipxeScriptUrl;
            Metro = metro;
            NetworkType = networkType;
            Networks = networks;
            OperatingSystem = operatingSystem;
            Plan = plan;
            Ports = ports;
            ProjectId = projectId;
            RootPassword = rootPassword;
            SosHostname = sosHostname;
            SshKeyIds = sshKeyIds;
            State = state;
            Storage = storage;
            Tags = tags;
        }
    }
}
