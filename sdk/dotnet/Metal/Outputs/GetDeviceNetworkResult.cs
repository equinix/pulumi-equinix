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
    public sealed class GetDeviceNetworkResult
    {
        /// <summary>
        /// IPv4 or IPv6 address string
        /// </summary>
        public readonly string Address;
        /// <summary>
        /// Bit length of the network mask of the address
        /// </summary>
        public readonly int Cidr;
        /// <summary>
        /// IP version - "4" or "6"
        /// </summary>
        public readonly int Family;
        /// <summary>
        /// Address of router
        /// </summary>
        public readonly string Gateway;
        /// <summary>
        /// Whether the address is routable from the Internet
        /// </summary>
        public readonly bool Public;

        [OutputConstructor]
        private GetDeviceNetworkResult(
            string address,

            int cidr,

            int family,

            string gateway,

            bool @public)
        {
            Address = address;
            Cidr = cidr;
            Family = family;
            Gateway = gateway;
            Public = @public;
        }
    }
}
