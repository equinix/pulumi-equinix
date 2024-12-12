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
    public sealed class ServiceTokenServiceTokenConnectionZSideAccessPointSelectorPortLocation
    {
        /// <summary>
        /// IBX Code
        /// </summary>
        public readonly string? Ibx;
        /// <summary>
        /// Access point metro code
        /// </summary>
        public readonly string? MetroCode;
        /// <summary>
        /// Access point metro name
        /// </summary>
        public readonly string? MetroName;
        /// <summary>
        /// Access point region
        /// </summary>
        public readonly string? Region;

        [OutputConstructor]
        private ServiceTokenServiceTokenConnectionZSideAccessPointSelectorPortLocation(
            string? ibx,

            string? metroCode,

            string? metroName,

            string? region)
        {
            Ibx = ibx;
            MetroCode = metroCode;
            MetroName = metroName;
            Region = region;
        }
    }
}
