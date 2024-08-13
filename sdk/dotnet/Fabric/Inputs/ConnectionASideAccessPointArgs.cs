// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Equinix.Fabric.Inputs
{

    public sealed class ConnectionASideAccessPointArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Account
        /// </summary>
        [Input("account")]
        public Input<Inputs.ConnectionASideAccessPointAccountArgs>? Account { get; set; }

        /// <summary>
        /// Authentication key for provider based connections or Metal-Fabric Integration connections
        /// </summary>
        [Input("authenticationKey")]
        public Input<string>? AuthenticationKey { get; set; }

        /// <summary>
        /// **Deprecated** `gateway` Use `router` attribute instead
        /// </summary>
        [Input("gateway")]
        public Input<Inputs.ConnectionASideAccessPointGatewayArgs>? Gateway { get; set; }

        /// <summary>
        /// Virtual device interface
        /// </summary>
        [Input("interface")]
        public Input<Inputs.ConnectionASideAccessPointInterfaceArgs>? Interface { get; set; }

        /// <summary>
        /// Connection link protocol
        /// </summary>
        [Input("linkProtocol")]
        public Input<Inputs.ConnectionASideAccessPointLinkProtocolArgs>? LinkProtocol { get; set; }

        /// <summary>
        /// Access point location
        /// </summary>
        [Input("location")]
        public Input<Inputs.ConnectionASideAccessPointLocationArgs>? Location { get; set; }

        /// <summary>
        /// network access point information
        /// </summary>
        [Input("network")]
        public Input<Inputs.ConnectionASideAccessPointNetworkArgs>? Network { get; set; }

        /// <summary>
        /// Peering Type- PRIVATE,MICROSOFT,PUBLIC, MANUAL
        /// </summary>
        [Input("peeringType")]
        public InputUnion<string, Pulumi.Equinix.Fabric.AccessPointPeeringType>? PeeringType { get; set; }

        /// <summary>
        /// Port access point information
        /// </summary>
        [Input("port")]
        public Input<Inputs.ConnectionASideAccessPointPortArgs>? Port { get; set; }

        /// <summary>
        /// Service Profile
        /// </summary>
        [Input("profile")]
        public Input<Inputs.ConnectionASideAccessPointProfileArgs>? Profile { get; set; }

        /// <summary>
        /// Provider assigned Connection Id
        /// </summary>
        [Input("providerConnectionId")]
        public Input<string>? ProviderConnectionId { get; set; }

        /// <summary>
        /// Cloud Router access point information that replaces `gateway`
        /// </summary>
        [Input("router")]
        public Input<Inputs.ConnectionASideAccessPointRouterArgs>? Router { get; set; }

        /// <summary>
        /// Access point seller region
        /// </summary>
        [Input("sellerRegion")]
        public Input<string>? SellerRegion { get; set; }

        /// <summary>
        /// Access point type - COLO, VD, VG, SP, IGW, SUBNET, CLOUD*ROUTER, NETWORK, METAL*NETWORK
        /// </summary>
        [Input("type")]
        public InputUnion<string, Pulumi.Equinix.Fabric.AccessPointType>? Type { get; set; }

        /// <summary>
        /// Virtual device
        /// </summary>
        [Input("virtualDevice")]
        public Input<Inputs.ConnectionASideAccessPointVirtualDeviceArgs>? VirtualDevice { get; set; }

        public ConnectionASideAccessPointArgs()
        {
        }
        public static new ConnectionASideAccessPointArgs Empty => new ConnectionASideAccessPointArgs();
    }
}
