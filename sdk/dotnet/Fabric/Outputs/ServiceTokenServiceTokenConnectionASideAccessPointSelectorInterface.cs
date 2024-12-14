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
    public sealed class ServiceTokenServiceTokenConnectionASideAccessPointSelectorInterface
    {
        /// <summary>
        /// id
        /// </summary>
        public readonly int? Id;
        /// <summary>
        /// Interface type
        /// </summary>
        public readonly string Type;
        /// <summary>
        /// Equinix-assigned interface identifier
        /// </summary>
        public readonly string? Uuid;

        [OutputConstructor]
        private ServiceTokenServiceTokenConnectionASideAccessPointSelectorInterface(
            int? id,

            string type,

            string? uuid)
        {
            Id = id;
            Type = type;
            Uuid = uuid;
        }
    }
}
