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
    public sealed class DeviceIpAddress
    {
        /// <summary>
        /// CIDR suffix for IP address block to be assigned, i.e. amount of addresses.
        /// </summary>
        public readonly int? Cidr;
        /// <summary>
        /// List of UUIDs of IP block reservations
        /// from which the public IPv4 address should be taken.
        /// </summary>
        public readonly ImmutableArray<string> ReservationIds;
        /// <summary>
        /// One of `private_ipv4`, `public_ipv4`, `public_ipv6`.
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private DeviceIpAddress(
            int? cidr,

            ImmutableArray<string> reservationIds,

            string type)
        {
            Cidr = cidr;
            ReservationIds = reservationIds;
            Type = type;
        }
    }
}
