// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Equinix.Fabric.Inputs
{

    public sealed class GetServiceProfilesFilterArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Possible operator to use on filters = - equal
        /// </summary>
        [Input("operator")]
        public string? Operator { get; set; }

        /// <summary>
        /// Search Criteria for Service Profile - /name, /uuid, /state, /metros/code, /visibility, /type
        /// </summary>
        [Input("property")]
        public string? Property { get; set; }

        [Input("values")]
        private List<string>? _values;

        /// <summary>
        /// Values
        /// </summary>
        public List<string> Values
        {
            get => _values ?? (_values = new List<string>());
            set => _values = value;
        }

        public GetServiceProfilesFilterArgs()
        {
        }
        public static new GetServiceProfilesFilterArgs Empty => new GetServiceProfilesFilterArgs();
    }
}
