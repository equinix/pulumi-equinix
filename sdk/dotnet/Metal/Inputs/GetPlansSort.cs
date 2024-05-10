// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Equinix.Metal.Inputs
{

    public sealed class GetPlansSortArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The attribute used to sort the results. Sort attributes are case-sensitive
        /// </summary>
        [Input("attribute", required: true)]
        public string Attribute { get; set; } = null!;

        /// <summary>
        /// Sort results in ascending or descending order. Strings are sorted in alphabetical order. One of: asc, desc
        /// </summary>
        [Input("direction")]
        public string? Direction { get; set; }

        public GetPlansSortArgs()
        {
        }
        public static new GetPlansSortArgs Empty => new GetPlansSortArgs();
    }
}
