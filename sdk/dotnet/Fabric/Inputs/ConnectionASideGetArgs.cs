// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Equinix.Fabric.Inputs
{

    public sealed class ConnectionASideGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Point of access details
        /// </summary>
        [Input("accessPoint")]
        public Input<Inputs.ConnectionASideAccessPointGetArgs>? AccessPoint { get; set; }

        [Input("additionalInfo")]
        private InputList<Inputs.ConnectionASideAdditionalInfoGetArgs>? _additionalInfo;

        /// <summary>
        /// Connection side additional information
        /// </summary>
        public InputList<Inputs.ConnectionASideAdditionalInfoGetArgs> AdditionalInfo
        {
            get => _additionalInfo ?? (_additionalInfo = new InputList<Inputs.ConnectionASideAdditionalInfoGetArgs>());
            set => _additionalInfo = value;
        }

        /// <summary>
        /// For service token based connections, Service tokens authorize users to access protected resources and services. Resource owners can distribute the tokens to trusted partners and vendors, allowing selected third parties to work directly with Equinix network assets
        /// </summary>
        [Input("serviceToken")]
        public Input<Inputs.ConnectionASideServiceTokenGetArgs>? ServiceToken { get; set; }

        public ConnectionASideGetArgs()
        {
        }
        public static new ConnectionASideGetArgs Empty => new ConnectionASideGetArgs();
    }
}
