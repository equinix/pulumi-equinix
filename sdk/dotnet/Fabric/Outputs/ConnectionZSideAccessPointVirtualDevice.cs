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
    public sealed class ConnectionZSideAccessPointVirtualDevice
    {
        /// <summary>
        /// Unique Resource Identifier
        /// </summary>
        public readonly string? Href;
        /// <summary>
        /// Customer-assigned Virtual Device Name
        /// </summary>
        public readonly string? Name;
        /// <summary>
        /// Virtual Device type
        /// </summary>
        public readonly string? Type;
        /// <summary>
        /// Equinix-assigned Virtual Device identifier
        /// </summary>
        public readonly string? Uuid;

        [OutputConstructor]
        private ConnectionZSideAccessPointVirtualDevice(
            string? href,

            string? name,

            string? type,

            string? uuid)
        {
            Href = href;
            Name = name;
            Type = type;
            Uuid = uuid;
        }
    }
}