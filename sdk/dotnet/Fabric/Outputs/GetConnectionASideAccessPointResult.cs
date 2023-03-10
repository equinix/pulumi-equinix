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
    public sealed class GetConnectionASideAccessPointResult
    {
        /// <summary>
        /// Customer account information that is associated with this connection
        /// </summary>
        public readonly ImmutableArray<Outputs.GetConnectionASideAccessPointAccountResult> Accounts;
        public readonly string AuthenticationKey;
        public readonly ImmutableArray<Outputs.GetConnectionASideAccessPointGatewayResult> Gateways;
        public readonly ImmutableArray<Outputs.GetConnectionASideAccessPointInterfaceResult> Interfaces;
        public readonly ImmutableArray<Outputs.GetConnectionASideAccessPointLinkProtocolResult> LinkProtocols;
        public readonly ImmutableArray<Outputs.GetConnectionASideAccessPointLocationResult> Locations;
        public readonly string PeeringType;
        public readonly ImmutableArray<Outputs.GetConnectionASideAccessPointPortResult> Ports;
        public readonly ImmutableArray<Outputs.GetConnectionASideAccessPointProfileResult> Profiles;
        public readonly string ProviderConnectionId;
        public readonly string SellerRegion;
        /// <summary>
        /// Defines the connection type like VG*VC, EVPL*VC, EPL*VC, EC*VC, GW*VC, ACCESS*EPL_VC
        /// </summary>
        public readonly string Type;
        public readonly ImmutableArray<Outputs.GetConnectionASideAccessPointVirtualDeviceResult> VirtualDevices;

        [OutputConstructor]
        private GetConnectionASideAccessPointResult(
            ImmutableArray<Outputs.GetConnectionASideAccessPointAccountResult> accounts,

            string authenticationKey,

            ImmutableArray<Outputs.GetConnectionASideAccessPointGatewayResult> gateways,

            ImmutableArray<Outputs.GetConnectionASideAccessPointInterfaceResult> interfaces,

            ImmutableArray<Outputs.GetConnectionASideAccessPointLinkProtocolResult> linkProtocols,

            ImmutableArray<Outputs.GetConnectionASideAccessPointLocationResult> locations,

            string peeringType,

            ImmutableArray<Outputs.GetConnectionASideAccessPointPortResult> ports,

            ImmutableArray<Outputs.GetConnectionASideAccessPointProfileResult> profiles,

            string providerConnectionId,

            string sellerRegion,

            string type,

            ImmutableArray<Outputs.GetConnectionASideAccessPointVirtualDeviceResult> virtualDevices)
        {
            Accounts = accounts;
            AuthenticationKey = authenticationKey;
            Gateways = gateways;
            Interfaces = interfaces;
            LinkProtocols = linkProtocols;
            Locations = locations;
            PeeringType = peeringType;
            Ports = ports;
            Profiles = profiles;
            ProviderConnectionId = providerConnectionId;
            SellerRegion = sellerRegion;
            Type = type;
            VirtualDevices = virtualDevices;
        }
    }
}
