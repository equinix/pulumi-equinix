// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Equinix.Fabric.Inputs
{

    public sealed class GetNetworksSortInputArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The sorting direction. Can be one of: [DESC, ASC], Defaults to DESC
        /// </summary>
        [Input("direction")]
        public Input<string>? Direction { get; set; }

        /// <summary>
        /// The property name to use in sorting. One of [/name /uuid /scope /operation/equinixStatus /location/region /changeLog/createdDateTime /changeLog/updatedDateTime]. Defaults to /changeLog/updatedDateTime
        /// </summary>
        [Input("property")]
        public Input<string>? Property { get; set; }

        public GetNetworksSortInputArgs()
        {
        }
        public static new GetNetworksSortInputArgs Empty => new GetNetworksSortInputArgs();
    }
}
