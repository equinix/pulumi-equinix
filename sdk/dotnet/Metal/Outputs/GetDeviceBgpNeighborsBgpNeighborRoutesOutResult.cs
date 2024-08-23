// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Equinix.Metal.Outputs
{

    [OutputType]
    public sealed class GetDeviceBgpNeighborsBgpNeighborRoutesOutResult
    {
        /// <summary>
        /// (bool) Whether the route is exact.
        /// </summary>
        public readonly bool Exact;
        /// <summary>
        /// CIDR expression of route (IP/mask).
        /// </summary>
        public readonly string Route;

        [OutputConstructor]
        private GetDeviceBgpNeighborsBgpNeighborRoutesOutResult(
            bool exact,

            string route)
        {
            Exact = exact;
            Route = route;
        }
    }
}