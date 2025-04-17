// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Equinix.Fabric.Inputs
{

    public sealed class GetRouteAggregationsFilterArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Operators to use on your filtered field with the values given. One of [ =, !=, &gt;, &gt;=, &lt;, &lt;=, BETWEEN, NOT BETWEEN, LIKE, NOT LIKE, IN, NOT IN, IS NOT NULL, IS NULL]
        /// </summary>
        [Input("operator", required: true)]
        public string Operator { get; set; } = null!;

        /// <summary>
        /// possible field names to use on filters. One of [/type /name /project/projectId /uuid /state]
        /// </summary>
        [Input("property", required: true)]
        public string Property { get; set; } = null!;

        [Input("values", required: true)]
        private List<string>? _values;

        /// <summary>
        /// The values that you want to apply the property+operator combination to in order to filter your data search
        /// </summary>
        public List<string> Values
        {
            get => _values ?? (_values = new List<string>());
            set => _values = value;
        }

        public GetRouteAggregationsFilterArgs()
        {
        }
        public static new GetRouteAggregationsFilterArgs Empty => new GetRouteAggregationsFilterArgs();
    }
}
