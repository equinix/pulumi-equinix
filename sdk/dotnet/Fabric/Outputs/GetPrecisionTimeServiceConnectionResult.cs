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
    public sealed class GetPrecisionTimeServiceConnectionResult
    {
        /// <summary>
        /// Link to the Equinix Fabric Connection associated with the Precision Time Service
        /// </summary>
        public readonly string Href;
        /// <summary>
        /// Type of the Equinix Fabric Connection associated with the Precision Time Service
        /// </summary>
        public readonly string Type;
        /// <summary>
        /// Equinix Fabric Connection UUID; Precision Time Service will be connected with it
        /// </summary>
        public readonly string Uuid;

        [OutputConstructor]
        private GetPrecisionTimeServiceConnectionResult(
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
