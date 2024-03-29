// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Equinix.Fabric.Inputs
{

    public sealed class ConnectionOperationArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Connection status
        /// </summary>
        [Input("equinixStatus")]
        public Input<string>? EquinixStatus { get; set; }

        [Input("errors")]
        private InputList<Inputs.ConnectionOperationErrorArgs>? _errors;

        /// <summary>
        /// Errors occurred
        /// </summary>
        public InputList<Inputs.ConnectionOperationErrorArgs> Errors
        {
            get => _errors ?? (_errors = new InputList<Inputs.ConnectionOperationErrorArgs>());
            set => _errors = value;
        }

        /// <summary>
        /// Connection provider readiness status
        /// </summary>
        [Input("providerStatus")]
        public Input<string>? ProviderStatus { get; set; }

        public ConnectionOperationArgs()
        {
        }
        public static new ConnectionOperationArgs Empty => new ConnectionOperationArgs();
    }
}
