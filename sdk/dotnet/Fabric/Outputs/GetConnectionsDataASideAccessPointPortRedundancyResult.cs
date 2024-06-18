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
    public sealed class GetConnectionsDataASideAccessPointPortRedundancyResult
    {
        /// <summary>
        /// Access point redundancy
        /// </summary>
        public readonly bool Enabled;
        /// <summary>
        /// Port redundancy group
        /// </summary>
        public readonly string Group;
        /// <summary>
        /// Priority type-Primary or Secondary
        /// </summary>
        public readonly string Priority;

        [OutputConstructor]
        private GetConnectionsDataASideAccessPointPortRedundancyResult(
            bool enabled,

            string group,

            string priority)
        {
            Enabled = enabled;
            Group = group;
            Priority = priority;
        }
    }
}
