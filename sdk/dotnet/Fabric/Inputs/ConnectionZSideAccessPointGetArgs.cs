// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Equinix.Fabric.Inputs
{

    public sealed class ConnectionZSideAccessPointGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Account
        /// </summary>
        [Input("account")]
        public Input<Inputs.ConnectionZSideAccessPointAccountGetArgs>? Account { get; set; }

        /// <summary>
        /// Authentication key for provider based connections
        /// </summary>
        [Input("authenticationKey")]
        public Input<string>? AuthenticationKey { get; set; }

        [Input("gateway")]
        public Input<Inputs.ConnectionZSideAccessPointGatewayGetArgs>? Gateway { get; set; }

        /// <summary>
        /// Virtual device interface
        /// </summary>
        [Input("interface")]
        public Input<Inputs.ConnectionZSideAccessPointInterfaceGetArgs>? Interface { get; set; }

        /// <summary>
        /// Connection link protocol
        /// </summary>
        [Input("linkProtocol")]
        public Input<Inputs.ConnectionZSideAccessPointLinkProtocolGetArgs>? LinkProtocol { get; set; }

        /// <summary>
        /// Access point location
        /// </summary>
        [Input("location")]
        public Input<Inputs.ConnectionZSideAccessPointLocationGetArgs>? Location { get; set; }

        /// <summary>
        /// Simplified Network
        /// </summary>
        [Input("network")]
        public Input<Inputs.ConnectionZSideAccessPointNetworkGetArgs>? Network { get; set; }

        /// <summary>
        /// Peering Type- PRIVATE,MICROSOFT,PUBLIC, MANUAL
        /// </summary>
        [Input("peeringType")]
        public InputUnion<string, Pulumi.Equinix.Fabric.AccessPointPeeringType>? PeeringType { get; set; }

        /// <summary>
        /// Port access point information
        /// </summary>
        [Input("port")]
        public Input<Inputs.ConnectionZSideAccessPointPortGetArgs>? Port { get; set; }

        /// <summary>
        /// Service Profile
        /// </summary>
        [Input("profile")]
        public Input<Inputs.ConnectionZSideAccessPointProfileGetArgs>? Profile { get; set; }

        /// <summary>
        /// Provider assigned Connection Id
        /// </summary>
        [Input("providerConnectionId")]
        public Input<string>? ProviderConnectionId { get; set; }

        /// <summary>
        /// Cloud Router access point information that replaces `gateway` (refers to below for nested schema)
        /// </summary>
        [Input("router")]
        public Input<Inputs.ConnectionZSideAccessPointRouterGetArgs>? Router { get; set; }

        [Input("routingProtocols")]
        private InputList<Inputs.ConnectionZSideAccessPointRoutingProtocolGetArgs>? _routingProtocols;

        /// <summary>
        /// Access point routing protocols configuration
        /// </summary>
        public InputList<Inputs.ConnectionZSideAccessPointRoutingProtocolGetArgs> RoutingProtocols
        {
            get => _routingProtocols ?? (_routingProtocols = new InputList<Inputs.ConnectionZSideAccessPointRoutingProtocolGetArgs>());
            set => _routingProtocols = value;
        }

        /// <summary>
        /// Access point seller region
        /// </summary>
        [Input("sellerRegion")]
        public Input<string>? SellerRegion { get; set; }

        /// <summary>
        /// Interface type
        /// </summary>
        [Input("type")]
        public InputUnion<string, Pulumi.Equinix.Fabric.AccessPointType>? Type { get; set; }

        /// <summary>
        /// Virtual device
        /// </summary>
        [Input("virtualDevice")]
        public Input<Inputs.ConnectionZSideAccessPointVirtualDeviceGetArgs>? VirtualDevice { get; set; }

        public ConnectionZSideAccessPointGetArgs()
        {
        }
        public static new ConnectionZSideAccessPointGetArgs Empty => new ConnectionZSideAccessPointGetArgs();
    }
}
