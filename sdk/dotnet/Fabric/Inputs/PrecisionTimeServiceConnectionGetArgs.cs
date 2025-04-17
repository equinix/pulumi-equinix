// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Equinix.Fabric.Inputs
{

    public sealed class PrecisionTimeServiceConnectionGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Link to the Equinix Fabric Connection associated with the Precision Time Service
        /// </summary>
        [Input("href")]
        public Input<string>? Href { get; set; }

        /// <summary>
        /// Type of the Equinix Fabric Connection associated with the Precision Time Service
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        /// <summary>
        /// Equinix Fabric Connection UUID; Precision Time Service will be connected with it
        /// </summary>
        [Input("uuid", required: true)]
        public Input<string> Uuid { get; set; } = null!;

        public PrecisionTimeServiceConnectionGetArgs()
        {
        }
        public static new PrecisionTimeServiceConnectionGetArgs Empty => new PrecisionTimeServiceConnectionGetArgs();
    }
}
