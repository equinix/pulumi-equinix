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
    public sealed class DeviceClusterDetailsNode0VendorConfiguration
    {
        /// <summary>
        /// Activation key. This is required for Velocloud clusters.
        /// </summary>
        public readonly string? ActivationKey;
        /// <summary>
        /// The administrative password of the device. You can use it to log in
        /// to the console. This field is not available for all device types.
        /// </summary>
        public readonly string? AdminPassword;
        /// <summary>
        /// System IP Address. Mandatory for the Fortinet SDWAN cluster device.
        /// </summary>
        public readonly string? Controller1;
        /// <summary>
        /// Controller fqdn. This is required for Velocloud clusters.
        /// </summary>
        public readonly string? ControllerFqdn;
        /// <summary>
        /// Hostname. This is necessary for Palo Alto, Juniper, and Fortinet clusters.
        /// </summary>
        public readonly string? Hostname;
        /// <summary>
        /// License id. This field is relevant only for the BlueCat DNS and DHCP Server
        /// </summary>
        public readonly string? LicenseId;
        /// <summary>
        /// License key. This field is relevant only for the BlueCat DNS and DHCP Server
        /// </summary>
        public readonly string? LicenseKey;
        /// <summary>
        /// Private address. This field is relevant only for the BlueCat DNS and DHCP Server
        /// </summary>
        public readonly string? PrivateAddress;
        /// <summary>
        /// Private CIDR Mask. This field is relevant only for the BlueCat DNS and DHCP Server
        /// </summary>
        public readonly string? PrivateCidrMask;
        /// <summary>
        /// Private gateway. This field is relevant only for the BlueCat DNS and DHCP Server
        /// </summary>
        public readonly string? PrivateGateway;
        /// <summary>
        /// The CLI password of the device. This field is relevant only for the
        /// Velocloud SDWAN cluster.
        /// </summary>
        public readonly string? RootPassword;

        [OutputConstructor]
        private DeviceClusterDetailsNode0VendorConfiguration(
            string? activationKey,

            string? adminPassword,

            string? controller1,

            string? controllerFqdn,

            string? hostname,

            string? licenseId,

            string? licenseKey,

            string? privateAddress,

            string? privateCidrMask,

            string? privateGateway,

            string? rootPassword)
        {
            ActivationKey = activationKey;
            AdminPassword = adminPassword;
            Controller1 = controller1;
            ControllerFqdn = controllerFqdn;
            Hostname = hostname;
            LicenseId = licenseId;
            LicenseKey = licenseKey;
            PrivateAddress = privateAddress;
            PrivateCidrMask = privateCidrMask;
            PrivateGateway = privateGateway;
            RootPassword = rootPassword;
        }
    }
}
