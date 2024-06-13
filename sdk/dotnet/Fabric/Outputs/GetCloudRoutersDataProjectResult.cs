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
    public sealed class GetCloudRoutersDataProjectResult
    {
        /// <summary>
        /// Unique Resource URL
        /// </summary>
        public readonly string Href;
        /// <summary>
        /// Project Id
        /// </summary>
        public readonly string ProjectId;

        [OutputConstructor]
        private GetCloudRoutersDataProjectResult(
            string href,

            string projectId)
        {
            Href = href;
            ProjectId = projectId;
        }
    }
}
