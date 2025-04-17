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
    public sealed class GetStreamAttachmentsFilterResult
    {
        /// <summary>
        /// Operation applied to the values of the filter
        /// </summary>
        public readonly string Operator;
        /// <summary>
        /// Boolean value to specify if this filter is a part of the OR group. Has a maximum of 3 and only counts for 1 of the 8 possible filters
        /// </summary>
        public readonly bool? Or;
        /// <summary>
        /// Property to apply the filter to
        /// </summary>
        public readonly string Property;
        /// <summary>
        /// List of values to apply the operation to for the specified property
        /// </summary>
        public readonly ImmutableArray<string> Values;

        [OutputConstructor]
        private GetStreamAttachmentsFilterResult(
            string @operator,

            bool? or,

            string property,

            ImmutableArray<string> values)
        {
            Operator = @operator;
            Or = or;
            Property = property;
            Values = values;
        }
    }
}
