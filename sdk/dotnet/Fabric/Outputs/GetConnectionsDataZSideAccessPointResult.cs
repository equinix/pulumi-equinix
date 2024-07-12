// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Equinix.Fabric.Outputs
{

    [OutputType]
    public sealed class GetConnectionsDataZSideAccessPointResult
    {
        /// <summary>
        /// Account
        /// </summary>
        public readonly ImmutableArray<Outputs.GetConnectionsDataZSideAccessPointAccountResult> Accounts;
        /// <summary>
        /// Authentication key for provider based connections
        /// </summary>
        public readonly string? AuthenticationKey;
        /// <summary>
        /// **Deprecated** `gateway` Use `router` attribute instead
        /// </summary>
        public readonly Outputs.GetConnectionsDataZSideAccessPointGatewayResult? Gateway;
        /// <summary>
        /// Virtual device interface
        /// </summary>
        public readonly Outputs.GetConnectionsDataZSideAccessPointInterfaceResult? Interface;
        /// <summary>
        /// Connection link protocol
        /// </summary>
        public readonly Outputs.GetConnectionsDataZSideAccessPointLinkProtocolResult? LinkProtocol;
        /// <summary>
        /// Access point location
        /// </summary>
        public readonly Outputs.GetConnectionsDataZSideAccessPointLocationResult Location;
        /// <summary>
        /// network access point information
        /// </summary>
        public readonly Outputs.GetConnectionsDataZSideAccessPointNetworkResult? Network;
        /// <summary>
        /// Peering Type- PRIVATE,MICROSOFT,PUBLIC, MANUAL
        /// </summary>
        public readonly string? PeeringType;
        /// <summary>
        /// Port access point information
        /// </summary>
        public readonly Outputs.GetConnectionsDataZSideAccessPointPortResult? Port;
        /// <summary>
        /// Service Profile
        /// </summary>
        public readonly Outputs.GetConnectionsDataZSideAccessPointProfileResult? Profile;
        /// <summary>
        /// Provider assigned Connection Id
        /// </summary>
        public readonly string ProviderConnectionId;
        /// <summary>
        /// Cloud Router access point information that replaces `gateway`
        /// </summary>
        public readonly Outputs.GetConnectionsDataZSideAccessPointRouterResult? Router;
        /// <summary>
        /// Access point seller region
        /// </summary>
        public readonly string? SellerRegion;
        /// <summary>
        /// Access point type - COLO, VD, VG, SP, IGW, SUBNET, CLOUD_ROUTER, NETWORK
        /// </summary>
        public readonly string? Type;
        /// <summary>
        /// Virtual device
        /// </summary>
        public readonly Outputs.GetConnectionsDataZSideAccessPointVirtualDeviceResult? VirtualDevice;

        [OutputConstructor]
        private GetConnectionsDataZSideAccessPointResult(
            ImmutableArray<Outputs.GetConnectionsDataZSideAccessPointAccountResult> accounts,

            string? authenticationKey,

            Outputs.GetConnectionsDataZSideAccessPointGatewayResult? gateway,

            Outputs.GetConnectionsDataZSideAccessPointInterfaceResult? @interface,

            Outputs.GetConnectionsDataZSideAccessPointLinkProtocolResult? linkProtocol,

            Outputs.GetConnectionsDataZSideAccessPointLocationResult location,

            Outputs.GetConnectionsDataZSideAccessPointNetworkResult? network,

            string? peeringType,

            Outputs.GetConnectionsDataZSideAccessPointPortResult? port,

            Outputs.GetConnectionsDataZSideAccessPointProfileResult? profile,

            string providerConnectionId,

            Outputs.GetConnectionsDataZSideAccessPointRouterResult? router,

            string? sellerRegion,

            string? type,

            Outputs.GetConnectionsDataZSideAccessPointVirtualDeviceResult? virtualDevice)
        {
            Accounts = accounts;
            AuthenticationKey = authenticationKey;
            Gateway = gateway;
            Interface = @interface;
            LinkProtocol = linkProtocol;
            Location = location;
            Network = network;
            PeeringType = peeringType;
            Port = port;
            Profile = profile;
            ProviderConnectionId = providerConnectionId;
            Router = router;
            SellerRegion = sellerRegion;
            Type = type;
            VirtualDevice = virtualDevice;
        }
    }
}
