// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Equinix.Fabric.Inputs
{

    public sealed class ServiceProfileMarketingInfoGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Logo
        /// </summary>
        [Input("logo")]
        public Input<string>? Logo { get; set; }

        [Input("processSteps")]
        private InputList<Inputs.ServiceProfileMarketingInfoProcessStepGetArgs>? _processSteps;

        /// <summary>
        /// Process Step
        /// </summary>
        public InputList<Inputs.ServiceProfileMarketingInfoProcessStepGetArgs> ProcessSteps
        {
            get => _processSteps ?? (_processSteps = new InputList<Inputs.ServiceProfileMarketingInfoProcessStepGetArgs>());
            set => _processSteps = value;
        }

        /// <summary>
        /// Promotion
        /// </summary>
        [Input("promotion")]
        public Input<bool>? Promotion { get; set; }

        public ServiceProfileMarketingInfoGetArgs()
        {
        }
        public static new ServiceProfileMarketingInfoGetArgs Empty => new ServiceProfileMarketingInfoGetArgs();
    }
}