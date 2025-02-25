// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Equinix.Fabric.Inputs
{

    public sealed class GetMetrosPaginationInputArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Maximum number of search results returned per page.
        /// </summary>
        [Input("limit")]
        public Input<double>? Limit { get; set; }

        /// <summary>
        /// URL relative to the next item in the response.
        /// </summary>
        [Input("next", required: true)]
        public Input<string> Next { get; set; } = null!;

        /// <summary>
        /// Index of the first item returned in the response.
        /// </summary>
        [Input("offset")]
        public Input<double>? Offset { get; set; }

        /// <summary>
        /// URL relative to the previous item in the response.
        /// </summary>
        [Input("previous", required: true)]
        public Input<string> Previous { get; set; } = null!;

        /// <summary>
        /// The total number of metro returned
        /// </summary>
        [Input("total", required: true)]
        public Input<double> Total { get; set; } = null!;

        public GetMetrosPaginationInputArgs()
        {
        }
        public static new GetMetrosPaginationInputArgs Empty => new GetMetrosPaginationInputArgs();
    }
}
