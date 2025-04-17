// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Equinix.Fabric.Inputs
{

    public sealed class GetConnectionRouteAggregationsPaginationInputArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Maximum number of search results returned per page. Number must be between 1 and 100, and the default is 20
        /// </summary>
        [Input("limit", required: true)]
        public Input<int> Limit { get; set; } = null!;

        /// <summary>
        /// The URL relative to the next item in the response
        /// </summary>
        [Input("next", required: true)]
        public Input<string> Next { get; set; } = null!;

        /// <summary>
        /// Index of the first item returned in the response. The default is 0
        /// </summary>
        [Input("offset", required: true)]
        public Input<int> Offset { get; set; } = null!;

        /// <summary>
        /// The URL relative to the previous item in the response
        /// </summary>
        [Input("previous", required: true)]
        public Input<string> Previous { get; set; } = null!;

        /// <summary>
        /// The total number of connection route aggregations available to the user making the request
        /// </summary>
        [Input("total", required: true)]
        public Input<int> Total { get; set; } = null!;

        public GetConnectionRouteAggregationsPaginationInputArgs()
        {
        }
        public static new GetConnectionRouteAggregationsPaginationInputArgs Empty => new GetConnectionRouteAggregationsPaginationInputArgs();
    }
}
