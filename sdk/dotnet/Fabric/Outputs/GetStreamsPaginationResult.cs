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
    public sealed class GetStreamsPaginationResult
    {
        /// <summary>
        /// Maximum number of search results returned per page. Number must be between 1 and 100, and the default is 20
        /// </summary>
        public readonly int Limit;
        /// <summary>
        /// The URL relative to the next item in the response
        /// </summary>
        public readonly string Next;
        /// <summary>
        /// Index of the first item returned in the response. The default is 0
        /// </summary>
        public readonly int Offset;
        /// <summary>
        /// The URL relative to the previous item in the response
        /// </summary>
        public readonly string Previous;
        /// <summary>
        /// The total number of streams available to the user making the request
        /// </summary>
        public readonly int Total;

        [OutputConstructor]
        private GetStreamsPaginationResult(
            int limit,

            string next,

            int offset,

            string previous,

            int total)
        {
            Limit = limit;
            Next = next;
            Offset = offset;
            Previous = previous;
            Total = total;
        }
    }
}
