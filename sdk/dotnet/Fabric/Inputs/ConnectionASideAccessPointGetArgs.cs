// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Equinix.Fabric.Inputs
{

    public sealed class ConnectionASideAccessPointGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Customer account information that is associated with this connection
        /// </summary>
        [Input("account")]
        public Input<Inputs.ConnectionASideAccessPointAccountGetArgs>? Account { get; set; }

        [Input("authenticationKey")]
        public Input<string>? AuthenticationKey { get; set; }

        [Input("gateway")]
        public Input<Inputs.ConnectionASideAccessPointGatewayGetArgs>? Gateway { get; set; }

        [Input("interface")]
        public Input<Inputs.ConnectionASideAccessPointInterfaceGetArgs>? Interface { get; set; }

        [Input("linkProtocol")]
        public Input<Inputs.ConnectionASideAccessPointLinkProtocolGetArgs>? LinkProtocol { get; set; }

        [Input("location")]
        public Input<Inputs.ConnectionASideAccessPointLocationGetArgs>? Location { get; set; }

        [Input("peeringType")]
        public InputUnion<string, Pulumi.Equinix.Fabric.AccessPointPeeringType>? PeeringType { get; set; }

        [Input("port")]
        public Input<Inputs.ConnectionASideAccessPointPortGetArgs>? Port { get; set; }

        [Input("profile")]
        public Input<Inputs.ConnectionASideAccessPointProfileGetArgs>? Profile { get; set; }

        [Input("providerConnectionId")]
        public Input<string>? ProviderConnectionId { get; set; }

        [Input("routingProtocols")]
        private InputList<Inputs.ConnectionASideAccessPointRoutingProtocolGetArgs>? _routingProtocols;
        public InputList<Inputs.ConnectionASideAccessPointRoutingProtocolGetArgs> RoutingProtocols
        {
            get => _routingProtocols ?? (_routingProtocols = new InputList<Inputs.ConnectionASideAccessPointRoutingProtocolGetArgs>());
            set => _routingProtocols = value;
        }

        [Input("sellerRegion")]
        public Input<string>? SellerRegion { get; set; }

        /// <summary>
        /// Defines the connection type like VG*VC, EVPL*VC, EPL*VC, EC*VC, GW*VC, ACCESS*EPL_VC
        /// </summary>
        [Input("type")]
        public InputUnion<string, Pulumi.Equinix.Fabric.AccessPointType>? Type { get; set; }

        [Input("virtualDevice")]
        public Input<Inputs.ConnectionASideAccessPointVirtualDeviceGetArgs>? VirtualDevice { get; set; }

        public ConnectionASideAccessPointGetArgs()
        {
        }
        public static new ConnectionASideAccessPointGetArgs Empty => new ConnectionASideAccessPointGetArgs();
    }
}
