// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Equinix.NetworkEdge.Inputs
{

    public sealed class DeviceClusterDetailsNode1VendorConfigurationGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("activationKey")]
        private Input<string>? _activationKey;

        /// <summary>
        /// Activation key. This is required for Velocloud clusters.
        /// </summary>
        public Input<string>? ActivationKey
        {
            get => _activationKey;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _activationKey = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("adminPassword")]
        private Input<string>? _adminPassword;

        /// <summary>
        /// The administrative password of the device. You can use it to log in to the console. This field is not available for all device types.
        /// </summary>
        public Input<string>? AdminPassword
        {
            get => _adminPassword;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _adminPassword = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// System IP Address. Mandatory for the Fortinet SDWAN cluster device.
        /// </summary>
        [Input("controller1")]
        public Input<string>? Controller1 { get; set; }

        /// <summary>
        /// Controller fqdn. This is required for Velocloud clusters.
        /// </summary>
        [Input("controllerFqdn")]
        public Input<string>? ControllerFqdn { get; set; }

        /// <summary>
        /// Gateway IP. This field is relevant only for the Infoblox devices.
        /// </summary>
        [Input("gatewayIp")]
        public Input<string>? GatewayIp { get; set; }

        /// <summary>
        /// Hostname. This is necessary for Palo Alto, Juniper, and Fortinet clusters.
        /// </summary>
        [Input("hostname")]
        public Input<string>? Hostname { get; set; }

        /// <summary>
        /// IP Address. This field is relevant only for the Infoblox devices.
        /// </summary>
        [Input("ipAddress")]
        public Input<string>? IpAddress { get; set; }

        [Input("licenseId")]
        private Input<string>? _licenseId;

        /// <summary>
        /// License id. This field is relevant only for the BlueCat DNS and DHCP Server
        /// </summary>
        public Input<string>? LicenseId
        {
            get => _licenseId;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _licenseId = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("licenseKey")]
        private Input<string>? _licenseKey;

        /// <summary>
        /// License key. This field is relevant only for the BlueCat DNS and DHCP Server
        /// </summary>
        public Input<string>? LicenseKey
        {
            get => _licenseKey;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _licenseKey = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Management Type. This field is relevant only for Cisco FTD Firewall devices
        /// </summary>
        [Input("managementType")]
        public Input<string>? ManagementType { get; set; }

        [Input("panoramaAuthKey")]
        private Input<string>? _panoramaAuthKey;

        /// <summary>
        /// Panorama Server Auth Key. This field is relevant only for the PA-VM firewall devices to have integration with Panorama Server.
        /// </summary>
        public Input<string>? PanoramaAuthKey
        {
            get => _panoramaAuthKey;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _panoramaAuthKey = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Panorama Server IP Address. This field is relevant only for the PA-VM firewall devices to have integration with Panorama Server.
        /// </summary>
        [Input("panoramaIpAddress")]
        public Input<string>? PanoramaIpAddress { get; set; }

        /// <summary>
        /// Private address. This field is relevant only for the BlueCat DNS and DHCP Server
        /// </summary>
        [Input("privateAddress")]
        public Input<string>? PrivateAddress { get; set; }

        /// <summary>
        /// Private CIDR Mask. This field is relevant only for the BlueCat DNS and DHCP Server
        /// </summary>
        [Input("privateCidrMask")]
        public Input<string>? PrivateCidrMask { get; set; }

        /// <summary>
        /// Private gateway. This field is relevant only for the BlueCat DNS and DHCP Server
        /// </summary>
        [Input("privateGateway")]
        public Input<string>? PrivateGateway { get; set; }

        [Input("rootPassword")]
        private Input<string>? _rootPassword;

        /// <summary>
        /// The CLI password of the device. This field is relevant only for the Velocloud SDWAN cluster.
        /// </summary>
        public Input<string>? RootPassword
        {
            get => _rootPassword;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _rootPassword = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Subnet Mask IP. This field is relevant only for the Infoblox devices.
        /// </summary>
        [Input("subnetMaskIp")]
        public Input<string>? SubnetMaskIp { get; set; }

        public DeviceClusterDetailsNode1VendorConfigurationGetArgs()
        {
        }
        public static new DeviceClusterDetailsNode1VendorConfigurationGetArgs Empty => new DeviceClusterDetailsNode1VendorConfigurationGetArgs();
    }
}
