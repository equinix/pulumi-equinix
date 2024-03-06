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
    public sealed class ConnectionASideAccessPoint
    {
        /// <summary>
        /// Account
        /// </summary>
        public readonly Outputs.ConnectionASideAccessPointAccount? Account;
        /// <summary>
        /// Authentication key for provider based connections
        /// </summary>
        public readonly string? AuthenticationKey;
        /// <summary>
        /// **Deprecated** `gateway` Use `router` attribute instead
        /// </summary>
        public readonly Outputs.ConnectionASideAccessPointGateway? Gateway;
        /// <summary>
        /// Virtual device interface
        /// </summary>
        public readonly Outputs.ConnectionASideAccessPointInterface? Interface;
        /// <summary>
        /// Connection link protocol
        /// </summary>
        public readonly Outputs.ConnectionASideAccessPointLinkProtocol? LinkProtocol;
        /// <summary>
        /// Access point location
        /// </summary>
        public readonly Outputs.ConnectionASideAccessPointLocation? Location;
        /// <summary>
        /// network access point information
        /// </summary>
        public readonly Outputs.ConnectionASideAccessPointNetwork? Network;
        /// <summary>
        /// Peering Type- PRIVATE,MICROSOFT,PUBLIC, MANUAL
        /// </summary>
        public readonly string? PeeringType;
        /// <summary>
        /// Port access point information
        /// </summary>
        public readonly Outputs.ConnectionASideAccessPointPort? Port;
        /// <summary>
        /// Service Profile
        /// </summary>
        public readonly Outputs.ConnectionASideAccessPointProfile? Profile;
        /// <summary>
        /// Provider assigned Connection Id
        /// </summary>
        public readonly string? ProviderConnectionId;
        /// <summary>
        /// Cloud Router access point information that replaces `gateway`
        /// </summary>
        public readonly Outputs.ConnectionASideAccessPointRouter? Router;
        /// <summary>
        /// Access point seller region
        /// </summary>
        public readonly string? SellerRegion;
        /// <summary>
        /// Interface type
        /// </summary>
        public readonly string? Type;
        /// <summary>
        /// Virtual device
        /// </summary>
        public readonly Outputs.ConnectionASideAccessPointVirtualDevice? VirtualDevice;

        [OutputConstructor]
        private ConnectionASideAccessPoint(
            Outputs.ConnectionASideAccessPointAccount? account,

            string? authenticationKey,

            Outputs.ConnectionASideAccessPointGateway? gateway,

            Outputs.ConnectionASideAccessPointInterface? @interface,

            Outputs.ConnectionASideAccessPointLinkProtocol? linkProtocol,

            Outputs.ConnectionASideAccessPointLocation? location,

            Outputs.ConnectionASideAccessPointNetwork? network,

            string? peeringType,

            Outputs.ConnectionASideAccessPointPort? port,

            Outputs.ConnectionASideAccessPointProfile? profile,

            string? providerConnectionId,

            Outputs.ConnectionASideAccessPointRouter? router,

            string? sellerRegion,

            string? type,

            Outputs.ConnectionASideAccessPointVirtualDevice? virtualDevice)
        {
            Account = account;
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
