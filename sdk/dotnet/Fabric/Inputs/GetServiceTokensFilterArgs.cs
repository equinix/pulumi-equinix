// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Equinix.Fabric.Inputs
{

    public sealed class GetServiceTokensFilterInputArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Possible operators to use on the filter property. Can be one of the following: [ "=", "!=", "[NOT] LIKE", "[NOT] IN", "ILIKE" ]
        /// </summary>
        [Input("operator", required: true)]
        public Input<string> Operator { get; set; } = null!;

        /// <summary>
        /// The API response property which you want to filter your request on. Can be one of the following: "/type", "/name", "/project/projectId", "/uuid", "/state"
        /// </summary>
        [Input("property", required: true)]
        public Input<string> Property { get; set; } = null!;

        [Input("values", required: true)]
        private InputList<string>? _values;

        /// <summary>
        /// The values that you want to apply the property+operator combination to in order to filter your data search
        /// </summary>
        public InputList<string> Values
        {
            get => _values ?? (_values = new InputList<string>());
            set => _values = value;
        }

        public GetServiceTokensFilterInputArgs()
        {
        }
        public static new GetServiceTokensFilterInputArgs Empty => new GetServiceTokensFilterInputArgs();
    }
}