// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Equinix.Fabric.Inputs
{

    public sealed class ServiceProfileMarketingInfoArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Logo
        /// </summary>
        [Input("logo")]
        public Input<string>? Logo { get; set; }

        [Input("processSteps")]
        private InputList<Inputs.ServiceProfileMarketingInfoProcessStepArgs>? _processSteps;

        /// <summary>
        /// Process Step
        /// </summary>
        public InputList<Inputs.ServiceProfileMarketingInfoProcessStepArgs> ProcessSteps
        {
            get => _processSteps ?? (_processSteps = new InputList<Inputs.ServiceProfileMarketingInfoProcessStepArgs>());
            set => _processSteps = value;
        }

        /// <summary>
        /// Promotion
        /// </summary>
        [Input("promotion")]
        public Input<bool>? Promotion { get; set; }

        public ServiceProfileMarketingInfoArgs()
        {
        }
        public static new ServiceProfileMarketingInfoArgs Empty => new ServiceProfileMarketingInfoArgs();
    }
}
