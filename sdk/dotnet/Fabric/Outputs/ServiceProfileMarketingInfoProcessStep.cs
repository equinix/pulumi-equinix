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
    public sealed class ServiceProfileMarketingInfoProcessStep
    {
        /// <summary>
        /// Description of authorization key
        /// </summary>
        public readonly string? Description;
        /// <summary>
        /// Sub Title
        /// </summary>
        public readonly string? SubTitle;
        /// <summary>
        /// Title
        /// </summary>
        public readonly string? Title;

        [OutputConstructor]
        private ServiceProfileMarketingInfoProcessStep(
            string? description,

            string? subTitle,

            string? title)
        {
            Description = description;
            SubTitle = subTitle;
            Title = title;
        }
    }
}
