// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Equinix.Fabric.Inputs
{

    public sealed class GetConnectionsFilterInputArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Optional custom id parameter to assign this filter to an inner AND or OR group. Group id must be prefixed with AND_ or OR_. Ensure intended grouped elements have the same given id. Ungrouped filters will be placed in the filter list group by themselves.
        /// </summary>
        [Input("group")]
        public Input<string>? Group { get; set; }

        /// <summary>
        /// Operators to use on your filtered field with the values given. One of [ =, !=, &gt;, &gt;=, &lt;, &lt;=, BETWEEN, NOT BETWEEN, LIKE, NOT LIKE, IN, NOT IN, IS NOT NULL, IS NULL]
        /// </summary>
        [Input("operator", required: true)]
        public Input<string> Operator { get; set; } = null!;

        /// <summary>
        /// Possible field names to use on filters. One of [/isRemote /name /uuid /type /geoScope /account/orgId /aSide/accessPoint/account/accountName /aSide/accessPoint/account/accountNumber /aSide/accessPoint/router/uuid /aSide/accessPoint/linkProtocol/vlanCTag /aSide/accessPoint/linkProtocol/vlanSTag /aSide/accessPoint/linkProtocol/vlanTagMin /aSide/accessPoint/linkProtocol/vlanTagMax /aSide/accessPoint/location/metroCode /aSide/accessPoint/location/metroName /aSide/accessPoint/name /aSide/accessPoint/port/uuid /aSide/accessPoint/port/name /aSide/accessPoint/type /aSide/accessPoint/virtualDevice/name /aSide/accessPoint/virtualDevice/uuid /aSide/serviceToken/uuid /change/status /operation/equinixStatus /operation/providerStatus /project/projectId /redundancy/group /redundancy/priority /zSide/accessPoint/account/accountName /zSide/accessPoint/authenticationKey /zSide/accessPoint/linkProtocol/vlanCTag /zSide/accessPoint/linkProtocol/vlanSTag /zSide/accessPoint/linkProtocol/vlanTagMin /zSide/accessPoint/linkProtocol/vlanTagMax /zSide/accessPoint/location/metroCode /zSide/accessPoint/location/metroName /zSide/accessPoint/name /zSide/accessPoint/port/uuid /zSide/accessPoint/network/uuid /zSide/accessPoint/port/name /zSide/accessPoint/profile/uuid /zSide/accessPoint/type /zSide/accessPoint/virtualDevice/name /zSide/accessPoint/virtualDevice/uuid /zSide/serviceToken/uuid *]
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

        public GetConnectionsFilterInputArgs()
        {
        }
        public static new GetConnectionsFilterInputArgs Empty => new GetConnectionsFilterInputArgs();
    }
}