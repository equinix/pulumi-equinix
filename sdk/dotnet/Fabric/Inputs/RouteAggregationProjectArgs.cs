// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Equinix.Fabric.Inputs
{

    public sealed class RouteAggregationProjectArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Equinix Subscriber-assigned project ID
        /// </summary>
        [Input("projectId", required: true)]
        public Input<string> ProjectId { get; set; } = null!;

        public RouteAggregationProjectArgs()
        {
        }
        public static new RouteAggregationProjectArgs Empty => new RouteAggregationProjectArgs();
    }
}
