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
    public sealed class GetServiceProfileCustomFieldResult
    {
        /// <summary>
        /// Required field
        /// </summary>
        public readonly bool? CaptureInEmail;
        /// <summary>
        /// Data type
        /// </summary>
        public readonly string DataType;
        /// <summary>
        /// Description
        /// </summary>
        public readonly string? Description;
        /// <summary>
        /// Label
        /// </summary>
        public readonly string Label;
        /// <summary>
        /// Options
        /// </summary>
        public readonly ImmutableArray<string> Options;
        /// <summary>
        /// Required field
        /// </summary>
        public readonly bool Required;

        [OutputConstructor]
        private GetServiceProfileCustomFieldResult(
            bool? captureInEmail,

            string dataType,

            string? description,

            string label,

            ImmutableArray<string> options,

            bool required)
        {
            CaptureInEmail = captureInEmail;
            DataType = dataType;
            Description = description;
            Label = label;
            Options = options;
            Required = required;
        }
    }
}
