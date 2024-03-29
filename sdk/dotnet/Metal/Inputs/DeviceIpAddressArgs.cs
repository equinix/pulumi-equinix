// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Equinix.Metal.Inputs
{

    public sealed class DeviceIpAddressArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// CIDR suffix for IP address block to be assigned, i.e. amount of addresses.
        /// </summary>
        [Input("cidr")]
        public Input<int>? Cidr { get; set; }

        [Input("reservationIds")]
        private InputList<string>? _reservationIds;

        /// <summary>
        /// List of UUIDs of IP block reservations
        /// from which the public IPv4 address should be taken.
        /// 
        /// You can supply one `ip_address` block per IP address type. If you use the `ip_address` you must
        /// always pass a block for `private_ipv4`.
        /// 
        /// To learn more about using the reserved IP addresses for new devices, see the examples in the
        /// equinix.metal.ReservedIpBlock documentation.
        /// </summary>
        public InputList<string> ReservationIds
        {
            get => _reservationIds ?? (_reservationIds = new InputList<string>());
            set => _reservationIds = value;
        }

        /// <summary>
        /// One of `private_ipv4`, `public_ipv4`, `public_ipv6`.
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public DeviceIpAddressArgs()
        {
        }
        public static new DeviceIpAddressArgs Empty => new DeviceIpAddressArgs();
    }
}
