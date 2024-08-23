// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Equinix.NetworkEdge.Outputs
{

    [OutputType]
    public sealed class DeviceSecondaryDevice
    {
        /// <summary>
        /// Billing account number for secondary device.
        /// </summary>
        public readonly string AccountNumber;
        /// <summary>
        /// Identifier of a WAN interface ACL template that will be applied on a secondary device.
        /// </summary>
        public readonly string? AclTemplateId;
        /// <summary>
        /// Additional Internet bandwidth, in Mbps, for a secondary device.
        /// </summary>
        public readonly int? AdditionalBandwidth;
        /// <summary>
        /// (Autonomous System Number) Unique identifier for a network on the internet.
        /// </summary>
        public readonly int? Asn;
        /// <summary>
        /// Identifier of a cloud init file that will be applied on a secondary device.
        /// </summary>
        public readonly string? CloudInitFileId;
        /// <summary>
        /// Secondary device hostname.
        /// </summary>
        public readonly string? Hostname;
        /// <summary>
        /// Device location Equinix Business Exchange name.
        /// </summary>
        public readonly string? Ibx;
        /// <summary>
        /// List of device interfaces. See Interface Attribute below for more details.
        /// </summary>
        public readonly ImmutableArray<Outputs.DeviceSecondaryDeviceInterface> Interfaces;
        /// <summary>
        /// Path to the license file that will be uploaded and applied on a secondary device. Applicable for some device types in BYOL licensing mode.
        /// </summary>
        public readonly string? LicenseFile;
        /// <summary>
        /// Identifier of a license file that will be applied on a secondary device.
        /// </summary>
        public readonly string? LicenseFileId;
        /// <summary>
        /// Device license registration status. Possible values are `APPLYING_LICENSE`, `REGISTERED`, `APPLIED`, `WAITING_FOR_CLUSTER_SETUP`, `REGISTRATION_FAILED`.
        /// </summary>
        public readonly string? LicenseStatus;
        /// <summary>
        /// License Token can be provided for some device types o the device.
        /// </summary>
        public readonly string? LicenseToken;
        /// <summary>
        /// Metro location of a secondary device.
        /// </summary>
        public readonly string MetroCode;
        /// <summary>
        /// Identifier of an MGMT interface ACL template that will be applied on a secondary device.
        /// * `ssh-key` - (Optional) Up to one definition of SSH key that will be provisioned on a secondary device.
        /// </summary>
        public readonly string? MgmtAclTemplateUuid;
        /// <summary>
        /// Secondary device name.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// List of email addresses that will receive notifications about secondary device.
        /// </summary>
        public readonly ImmutableArray<string> Notifications;
        /// <summary>
        /// Unique Identifier for the project resource where the device is scoped to.If you leave it out, the device will be created under the default project id of your organization.
        /// </summary>
        public readonly string? ProjectId;
        /// <summary>
        /// Device redundancy type applicable for HA devices, either primary or secondary.
        /// </summary>
        public readonly string? RedundancyType;
        /// <summary>
        /// Unique identifier for a redundant device applicable for HA devices.
        /// </summary>
        public readonly string? RedundantId;
        /// <summary>
        /// Device location region.
        /// </summary>
        public readonly string? Region;
        /// <summary>
        /// IP address of SSH enabled interface on the device.
        /// </summary>
        public readonly string? SshIpAddress;
        /// <summary>
        /// FQDN of SSH enabled interface on the device.
        /// </summary>
        public readonly string? SshIpFqdn;
        /// <summary>
        /// Definition of SSH key that will be provisioned on a device
        /// </summary>
        public readonly Outputs.DeviceSecondaryDeviceSshKey? SshKey;
        /// <summary>
        /// interface status. One of `AVAILABLE`, `RESERVED`, `ASSIGNED`.
        /// </summary>
        public readonly string? Status;
        /// <summary>
        /// Device unique identifier.
        /// </summary>
        public readonly string? Uuid;
        /// <summary>
        /// Key/Value pairs of vendor specific configuration parameters for a secondary device. Key values are `controller1`, `activationKey`, `managementType`, `siteId`, `systemIpAddress`, `privateAddress`, `privateCidrMask`, `privateGateway`, `licenseKey`, `licenseId`, `panoramaAuthKey`, `panoramaIpAddress`.
        /// </summary>
        public readonly ImmutableDictionary<string, string>? VendorConfiguration;
        /// <summary>
        /// device interface id picked for WAN
        /// </summary>
        public readonly string? WanInterfaceId;
        /// <summary>
        /// Device location zone code.
        /// </summary>
        public readonly string? ZoneCode;

        [OutputConstructor]
        private DeviceSecondaryDevice(
            string accountNumber,

            string? aclTemplateId,

            int? additionalBandwidth,

            int? asn,

            string? cloudInitFileId,

            string? hostname,

            string? ibx,

            ImmutableArray<Outputs.DeviceSecondaryDeviceInterface> interfaces,

            string? licenseFile,

            string? licenseFileId,

            string? licenseStatus,

            string? licenseToken,

            string metroCode,

            string? mgmtAclTemplateUuid,

            string name,

            ImmutableArray<string> notifications,

            string? projectId,

            string? redundancyType,

            string? redundantId,

            string? region,

            string? sshIpAddress,

            string? sshIpFqdn,

            Outputs.DeviceSecondaryDeviceSshKey? sshKey,

            string? status,

            string? uuid,

            ImmutableDictionary<string, string>? vendorConfiguration,

            string? wanInterfaceId,

            string? zoneCode)
        {
            AccountNumber = accountNumber;
            AclTemplateId = aclTemplateId;
            AdditionalBandwidth = additionalBandwidth;
            Asn = asn;
            CloudInitFileId = cloudInitFileId;
            Hostname = hostname;
            Ibx = ibx;
            Interfaces = interfaces;
            LicenseFile = licenseFile;
            LicenseFileId = licenseFileId;
            LicenseStatus = licenseStatus;
            LicenseToken = licenseToken;
            MetroCode = metroCode;
            MgmtAclTemplateUuid = mgmtAclTemplateUuid;
            Name = name;
            Notifications = notifications;
            ProjectId = projectId;
            RedundancyType = redundancyType;
            RedundantId = redundantId;
            Region = region;
            SshIpAddress = sshIpAddress;
            SshIpFqdn = sshIpFqdn;
            SshKey = sshKey;
            Status = status;
            Uuid = uuid;
            VendorConfiguration = vendorConfiguration;
            WanInterfaceId = wanInterfaceId;
            ZoneCode = zoneCode;
        }
    }
}