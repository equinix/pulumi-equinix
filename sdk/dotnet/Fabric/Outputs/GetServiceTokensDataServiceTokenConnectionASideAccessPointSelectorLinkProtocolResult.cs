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
    public sealed class GetServiceTokensDataServiceTokenConnectionASideAccessPointSelectorLinkProtocolResult
    {
        /// <summary>
        /// Type of the link protocol - UNTAGGED, DOT1Q, QINQ, EVPN_VXLAN
        /// </summary>
        public readonly string Type;
        /// <summary>
        /// Vlan Customer Tag information, vlanCTag value specified for QINQ connections
        /// </summary>
        public readonly int VlanCTag;
        /// <summary>
        /// Vlan Provider Tag information, vlanSTag value specified for QINQ connections
        /// </summary>
        public readonly int VlanSTag;
        /// <summary>
        /// Vlan Tag information, vlanTag value specified for DOT1Q connections
        /// </summary>
        public readonly int VlanTag;

        [OutputConstructor]
        private GetServiceTokensDataServiceTokenConnectionASideAccessPointSelectorLinkProtocolResult(
            string type,

            int vlanCTag,

            int vlanSTag,

            int vlanTag)
        {
            Type = type;
            VlanCTag = vlanCTag;
            VlanSTag = vlanSTag;
            VlanTag = vlanTag;
        }
    }
}
