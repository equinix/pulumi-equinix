// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Equinix.Fabric.Inputs
{

    public sealed class ConnectionZSideAccessPointPortRedundancyArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Access point redundancy
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// Port redundancy group
        /// </summary>
        [Input("group")]
        public Input<string>? Group { get; set; }

        /// <summary>
        /// Priority type-Primary or Secondary
        /// </summary>
        [Input("priority")]
        public Input<string>? Priority { get; set; }

        public ConnectionZSideAccessPointPortRedundancyArgs()
        {
        }
        public static new ConnectionZSideAccessPointPortRedundancyArgs Empty => new ConnectionZSideAccessPointPortRedundancyArgs();
    }
}
