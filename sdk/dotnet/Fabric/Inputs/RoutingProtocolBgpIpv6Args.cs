// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Equinix.Fabric.Inputs
{

    public sealed class RoutingProtocolBgpIpv6Args : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Customer side peering ip
        /// </summary>
        [Input("customerPeerIp", required: true)]
        public Input<string> CustomerPeerIp { get; set; } = null!;

        /// <summary>
        /// Admin status for the BGP session
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// Equinix side peering ip
        /// </summary>
        [Input("equinixPeerIp")]
        public Input<string>? EquinixPeerIp { get; set; }

        /// <summary>
        /// Inbound Multi Exit Discriminator attribute
        /// </summary>
        [Input("inboundMed")]
        public Input<int>? InboundMed { get; set; }

        /// <summary>
        /// AS path prepend count. One of: 0, 1, 3, 5
        /// </summary>
        [Input("outboundAsPrependCount")]
        public Input<string>? OutboundAsPrependCount { get; set; }

        /// <summary>
        /// Outbound Multi Exit Discriminator attribute
        /// </summary>
        [Input("outboundMed")]
        public Input<int>? OutboundMed { get; set; }

        public RoutingProtocolBgpIpv6Args()
        {
        }
        public static new RoutingProtocolBgpIpv6Args Empty => new RoutingProtocolBgpIpv6Args();
    }
}
