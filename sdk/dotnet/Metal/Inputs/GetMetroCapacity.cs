// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Equinix.Metal.Inputs
{

    public sealed class GetMetroCapacityArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Device plan that must be available in selected location.
        /// </summary>
        [Input("plan", required: true)]
        public string Plan { get; set; } = null!;

        /// <summary>
        /// Minimum number of devices that must be available in selected location. Default is `1`.
        /// </summary>
        [Input("quantity")]
        public int? Quantity { get; set; }

        public GetMetroCapacityArgs()
        {
        }
        public static new GetMetroCapacityArgs Empty => new GetMetroCapacityArgs();
    }
}
