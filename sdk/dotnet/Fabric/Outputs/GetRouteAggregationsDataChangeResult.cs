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
    public sealed class GetRouteAggregationsDataChangeResult
    {
        /// <summary>
        /// Equinix auto generated URI to the route aggregation change
        /// </summary>
        public readonly string Href;
        /// <summary>
        /// Equinix defined Route Aggregation Change Type
        /// </summary>
        public readonly string Type;
        /// <summary>
        /// Equinix-assigned unique id for a change
        /// </summary>
        public readonly string Uuid;

        [OutputConstructor]
        private GetRouteAggregationsDataChangeResult(
            string href,

            string type,

            string uuid)
        {
            Href = href;
            Type = type;
            Uuid = uuid;
        }
    }
}
