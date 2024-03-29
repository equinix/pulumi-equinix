// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Equinix.Fabric.Inputs
{

    public sealed class ConnectionASideArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Point of access details
        /// </summary>
        [Input("accessPoint")]
        public Input<Inputs.ConnectionASideAccessPointArgs>? AccessPoint { get; set; }

        [Input("additionalInfo")]
        private InputList<Inputs.ConnectionASideAdditionalInfoArgs>? _additionalInfo;

        /// <summary>
        /// Connection side additional information
        /// </summary>
        public InputList<Inputs.ConnectionASideAdditionalInfoArgs> AdditionalInfo
        {
            get => _additionalInfo ?? (_additionalInfo = new InputList<Inputs.ConnectionASideAdditionalInfoArgs>());
            set => _additionalInfo = value;
        }

        /// <summary>
        /// For service token based connections, Service tokens authorize users to access protected resources and services. Resource owners can distribute the tokens to trusted partners and vendors, allowing selected third parties to work directly with Equinix network assets
        /// </summary>
        [Input("serviceToken")]
        public Input<Inputs.ConnectionASideServiceTokenArgs>? ServiceToken { get; set; }

        public ConnectionASideArgs()
        {
        }
        public static new ConnectionASideArgs Empty => new ConnectionASideArgs();
    }
}
