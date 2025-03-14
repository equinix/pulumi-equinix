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
    public sealed class GetMetrosPaginationResult
    {
        /// <summary>
        /// Maximum number of search results returned per page.
        /// </summary>
        public readonly double? Limit;
        /// <summary>
        /// URL relative to the next item in the response.
        /// </summary>
        public readonly string Next;
        /// <summary>
        /// Index of the first item returned in the response.
        /// </summary>
        public readonly double? Offset;
        /// <summary>
        /// URL relative to the previous item in the response.
        /// </summary>
        public readonly string Previous;
        /// <summary>
        /// The total number of metro returned
        /// </summary>
        public readonly double Total;

        [OutputConstructor]
        private GetMetrosPaginationResult(
            double? limit,

            string next,

            double? offset,

            string previous,

            double total)
        {
            Limit = limit;
            Next = next;
            Offset = offset;
            Previous = previous;
            Total = total;
        }
    }
}
