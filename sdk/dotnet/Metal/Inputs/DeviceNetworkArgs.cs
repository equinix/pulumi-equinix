// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Equinix.Metal.Inputs
{

    public sealed class DeviceNetworkArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// IPv4 or IPv6 address string
        /// </summary>
        [Input("address")]
        public Input<string>? Address { get; set; }

        /// <summary>
        /// CIDR suffix for IP address block to be assigned, i.e. amount of addresses
        /// </summary>
        [Input("cidr")]
        public Input<int>? Cidr { get; set; }

        /// <summary>
        /// IP version - "4" or "6"
        /// </summary>
        [Input("family")]
        public Input<int>? Family { get; set; }

        /// <summary>
        /// Address of router
        /// </summary>
        [Input("gateway")]
        public Input<string>? Gateway { get; set; }

        /// <summary>
        /// Whether the address is routable from the Internet
        /// </summary>
        [Input("public")]
        public Input<bool>? Public { get; set; }

        public DeviceNetworkArgs()
        {
        }
        public static new DeviceNetworkArgs Empty => new DeviceNetworkArgs();
    }
}
