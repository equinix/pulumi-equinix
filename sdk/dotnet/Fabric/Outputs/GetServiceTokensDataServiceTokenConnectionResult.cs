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
    public sealed class GetServiceTokensDataServiceTokenConnectionResult
    {
        /// <summary>
        /// A-Side Connection link protocol,virtual device or network configuration
        /// </summary>
        public readonly ImmutableArray<Outputs.GetServiceTokensDataServiceTokenConnectionASideResult> ASides;
        /// <summary>
        /// Allow custom bandwidth value
        /// </summary>
        public readonly bool AllowCustomBandwidth;
        /// <summary>
        /// Authorization to connect remotely
        /// </summary>
        public readonly bool AllowRemoteConnection;
        /// <summary>
        /// Connection bandwidth limit in Mbps
        /// </summary>
        public readonly int BandwidthLimit;
        /// <summary>
        /// List of permitted bandwidths'; For Port-based Service Tokens, the maximum allowable bandwidth is 50 Gbps, while for Virtual Device-based Service Tokens, it is limited to 10 Gbps
        /// </summary>
        public readonly ImmutableArray<int> SupportedBandwidths;
        /// <summary>
        /// Type of Connection supported by Service Token you will create; EVPL_VC, EVPLAN_VC, EPLAN_VC, IPWAN_VC
        /// </summary>
        public readonly string Type;
        /// <summary>
        /// Equinix-assigned connection identifier
        /// </summary>
        public readonly string Uuid;
        /// <summary>
        /// Z-Side Connection link protocol,virtual device or network configuration
        /// </summary>
        public readonly ImmutableArray<Outputs.GetServiceTokensDataServiceTokenConnectionZSideResult> ZSides;

        [OutputConstructor]
        private GetServiceTokensDataServiceTokenConnectionResult(
            ImmutableArray<Outputs.GetServiceTokensDataServiceTokenConnectionASideResult> aSides,

            bool allowCustomBandwidth,

            bool allowRemoteConnection,

            int bandwidthLimit,

            ImmutableArray<int> supportedBandwidths,

            string type,

            string uuid,

            ImmutableArray<Outputs.GetServiceTokensDataServiceTokenConnectionZSideResult> zSides)
        {
            ASides = aSides;
            AllowCustomBandwidth = allowCustomBandwidth;
            AllowRemoteConnection = allowRemoteConnection;
            BandwidthLimit = bandwidthLimit;
            SupportedBandwidths = supportedBandwidths;
            Type = type;
            Uuid = uuid;
            ZSides = zSides;
        }
    }
}