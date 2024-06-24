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
    public sealed class GetConnectionsDataASideAccessPointResult
    {
        /// <summary>
        /// Account
        /// </summary>
        public readonly ImmutableArray<Outputs.GetConnectionsDataASideAccessPointAccountResult> Accounts;
        /// <summary>
        /// Authentication key for provider based connections
        /// </summary>
        public readonly string? AuthenticationKey;
        /// <summary>
        /// **Deprecated** `gateway` Use `router` attribute instead
        /// </summary>
        public readonly Outputs.GetConnectionsDataASideAccessPointGatewayResult? Gateway;
        /// <summary>
        /// Virtual device interface
        /// </summary>
        public readonly Outputs.GetConnectionsDataASideAccessPointInterfaceResult? Interface;
        /// <summary>
        /// Connection link protocol
        /// </summary>
        public readonly Outputs.GetConnectionsDataASideAccessPointLinkProtocolResult? LinkProtocol;
        /// <summary>
        /// Access point location
        /// </summary>
        public readonly Outputs.GetConnectionsDataASideAccessPointLocationResult Location;
        /// <summary>
        /// network access point information
        /// </summary>
        public readonly Outputs.GetConnectionsDataASideAccessPointNetworkResult? Network;
        /// <summary>
        /// Peering Type- PRIVATE,MICROSOFT,PUBLIC, MANUAL
        /// </summary>
        public readonly string? PeeringType;
        /// <summary>
        /// Port access point information
        /// </summary>
        public readonly Outputs.GetConnectionsDataASideAccessPointPortResult? Port;
        /// <summary>
        /// Service Profile
        /// </summary>
        public readonly Outputs.GetConnectionsDataASideAccessPointProfileResult? Profile;
        /// <summary>
        /// Provider assigned Connection Id
        /// </summary>
        public readonly string ProviderConnectionId;
        /// <summary>
        /// Cloud Router access point information that replaces `gateway`
        /// </summary>
        public readonly Outputs.GetConnectionsDataASideAccessPointRouterResult? Router;
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
        public readonly Outputs.GetConnectionsDataASideAccessPointVirtualDeviceResult? VirtualDevice;

        [OutputConstructor]
        private GetConnectionsDataASideAccessPointResult(
            ImmutableArray<Outputs.GetConnectionsDataASideAccessPointAccountResult> accounts,

            string? authenticationKey,

            Outputs.GetConnectionsDataASideAccessPointGatewayResult? gateway,

            Outputs.GetConnectionsDataASideAccessPointInterfaceResult? @interface,

            Outputs.GetConnectionsDataASideAccessPointLinkProtocolResult? linkProtocol,

            Outputs.GetConnectionsDataASideAccessPointLocationResult location,

            Outputs.GetConnectionsDataASideAccessPointNetworkResult? network,

            string? peeringType,

            Outputs.GetConnectionsDataASideAccessPointPortResult? port,

            Outputs.GetConnectionsDataASideAccessPointProfileResult? profile,

            string providerConnectionId,

            Outputs.GetConnectionsDataASideAccessPointRouterResult? router,

            string? sellerRegion,

            string? type,

            Outputs.GetConnectionsDataASideAccessPointVirtualDeviceResult? virtualDevice)
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