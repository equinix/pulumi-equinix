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
    public sealed class GetServiceProfilesFilterResult
    {
        /// <summary>
        /// Operators to use on your filtered field with the values given. One of [=]
        /// </summary>
        public readonly string Operator;
        /// <summary>
        /// Property to apply operator and values to. One of [/name /uuid /state /metros/code /visibility /type /project/projectId]
        /// </summary>
        public readonly string Property;
        /// <summary>
        /// The values that you want to apply the property+operator combination to in order to filter your data search
        /// </summary>
        public readonly ImmutableArray<string> Values;

        [OutputConstructor]
        private GetServiceProfilesFilterResult(
            string @operator,

            string property,

            ImmutableArray<string> values)
        {
            Operator = @operator;
            Property = property;
            Values = values;
        }
    }
}