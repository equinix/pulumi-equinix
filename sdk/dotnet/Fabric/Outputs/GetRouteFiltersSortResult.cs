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
    public sealed class GetRouteFiltersSortResult
    {
        /// <summary>
        /// The sorting direction. Can be one of: [DESC, ASC], Defaults to DESC
        /// </summary>
        public readonly string? Direction;
        /// <summary>
        /// The property name to use in sorting. Can be one of the following: [/type, /uuid, /name, /project/projectId, /state, /notMatchedRuleAction, /connectionsCount, /changeLog/createdDateTime, /changeLog/updatedDateTime], Defaults to /changeLog/updatedDateTime
        /// </summary>
        public readonly string? Property;

        [OutputConstructor]
        private GetRouteFiltersSortResult(
            string? direction,

            string? property)
        {
            Direction = direction;
            Property = property;
        }
    }
}
