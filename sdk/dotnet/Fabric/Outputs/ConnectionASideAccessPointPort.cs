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
    public sealed class ConnectionASideAccessPointPort
    {
        /// <summary>
        /// Unique Resource Identifier
        /// </summary>
        public readonly string? Href;
        /// <summary>
        /// Port name
        /// </summary>
        public readonly string? Name;
        /// <summary>
        /// Redundancy Information
        /// </summary>
        public readonly Outputs.ConnectionASideAccessPointPortRedundancy? Redundancy;
        /// <summary>
        /// Equinix-assigned Port identifier
        /// </summary>
        public readonly string? Uuid;

        [OutputConstructor]
        private ConnectionASideAccessPointPort(
            string? href,

            string? name,

            Outputs.ConnectionASideAccessPointPortRedundancy? redundancy,

            string? uuid)
        {
            Href = href;
            Name = name;
            Redundancy = redundancy;
            Uuid = uuid;
        }
    }
}