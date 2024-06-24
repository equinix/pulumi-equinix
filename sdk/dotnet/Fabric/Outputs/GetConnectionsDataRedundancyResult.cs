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
    public sealed class GetConnectionsDataRedundancyResult
    {
        /// <summary>
        /// Redundancy group identifier (Use the redundancy.0.group UUID of primary connection; e.g. one(equinix_fabric_connection.primary_port_connection.redundancy).group or equinix_fabric_connection.primary_port_connection.redundancy.0.group)
        /// </summary>
        public readonly string Group;
        /// <summary>
        /// Connection priority in redundancy group - PRIMARY, SECONDARY
        /// </summary>
        public readonly string Priority;

        [OutputConstructor]
        private GetConnectionsDataRedundancyResult(
            string group,

            string priority)
        {
            Group = group;
            Priority = priority;
        }
    }
}