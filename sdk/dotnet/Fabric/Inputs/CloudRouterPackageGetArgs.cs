// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Equinix.Fabric.Inputs
{

    public sealed class CloudRouterPackageGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Fabric Cloud Router package code
        /// </summary>
        [Input("code", required: true)]
        public Input<string> Code { get; set; } = null!;

        public CloudRouterPackageGetArgs()
        {
        }
        public static new CloudRouterPackageGetArgs Empty => new CloudRouterPackageGetArgs();
    }
}
