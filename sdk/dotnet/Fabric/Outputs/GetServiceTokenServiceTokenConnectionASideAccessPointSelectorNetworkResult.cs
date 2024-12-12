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
    public sealed class GetServiceTokenServiceTokenConnectionASideAccessPointSelectorNetworkResult
    {
        /// <summary>
        /// Unique Resource Identifier
        /// </summary>
        public readonly string Href;
        /// <summary>
        /// Location
        /// </summary>
        public readonly ImmutableArray<Outputs.GetServiceTokenServiceTokenConnectionASideAccessPointSelectorNetworkLocationResult> Locations;
        /// <summary>
        /// Network Name
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Scope of Network
        /// </summary>
        public readonly string Scope;
        /// <summary>
        /// Type of Network
        /// </summary>
        public readonly string Type;
        /// <summary>
        /// Equinix-assigned Network identifier
        /// </summary>
        public readonly string Uuid;

        [OutputConstructor]
        private GetServiceTokenServiceTokenConnectionASideAccessPointSelectorNetworkResult(
            string href,

            ImmutableArray<Outputs.GetServiceTokenServiceTokenConnectionASideAccessPointSelectorNetworkLocationResult> locations,

            string name,

            string scope,

            string type,

            string uuid)
        {
            Href = href;
            Locations = locations;
            Name = name;
            Scope = scope;
            Type = type;
            Uuid = uuid;
        }
    }
}
