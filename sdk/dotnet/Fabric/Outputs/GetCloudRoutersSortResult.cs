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
    public sealed class GetCloudRoutersSortResult
    {
        /// <summary>
        /// The sorting direction. Can be one of: [DESC, ASC], Defaults to DESC
        /// </summary>
        public readonly string? Direction;
        /// <summary>
        /// The property name to use in sorting. Can be one of the following: [/name, /uuid, /state, /location/metroCode, /location/metroName, /package/code, /changeLog/createdDateTime, /changeLog/updatedDateTime], Defaults to /changeLog/updatedDateTime
        /// </summary>
        public readonly string? Property;

        [OutputConstructor]
        private GetCloudRoutersSortResult(
            string? direction,

            string? property)
        {
            Direction = direction;
            Property = property;
        }
    }
}
