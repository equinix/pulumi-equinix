// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Equinix.Fabric.Inputs
{

    public sealed class ServiceProfileMarketingInfoProcessStepGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// User-provided service description
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("subTitle")]
        public Input<string>? SubTitle { get; set; }

        [Input("title")]
        public Input<string>? Title { get; set; }

        public ServiceProfileMarketingInfoProcessStepGetArgs()
        {
        }
        public static new ServiceProfileMarketingInfoProcessStepGetArgs Empty => new ServiceProfileMarketingInfoProcessStepGetArgs();
    }
}
