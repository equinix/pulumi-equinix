// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Equinix.Fabric.Inputs
{

    public sealed class ServiceProfileAccessPointTypeConfigGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Setting to enable or disable the ability of the buyer to change connection bandwidth without approval of the seller
        /// </summary>
        [Input("allowBandwidthAutoApproval")]
        public Input<bool>? AllowBandwidthAutoApproval { get; set; }

        /// <summary>
        /// Availability of a bandwidth upgrade. The default is false
        /// </summary>
        [Input("allowBandwidthUpgrade")]
        public Input<bool>? AllowBandwidthUpgrade { get; set; }

        /// <summary>
        /// Setting to enable or disable the ability of the buyer to customize the bandwidth
        /// </summary>
        [Input("allowCustomBandwidth")]
        public Input<bool>? AllowCustomBandwidth { get; set; }

        /// <summary>
        /// Setting to allow or prohibit remote connections to the service profile
        /// </summary>
        [Input("allowRemoteConnections")]
        public Input<bool>? AllowRemoteConnections { get; set; }

        /// <summary>
        /// Api configuration details
        /// </summary>
        [Input("apiConfig")]
        public Input<Inputs.ServiceProfileAccessPointTypeConfigApiConfigGetArgs>? ApiConfig { get; set; }

        /// <summary>
        /// Authentication key details
        /// </summary>
        [Input("authenticationKey")]
        public Input<Inputs.ServiceProfileAccessPointTypeConfigAuthenticationKeyGetArgs>? AuthenticationKey { get; set; }

        /// <summary>
        /// Percentage of port bandwidth at which an allocation alert is generated
        /// </summary>
        [Input("bandwidthAlertThreshold")]
        public Input<double>? BandwidthAlertThreshold { get; set; }

        /// <summary>
        /// Custom name for Connection
        /// </summary>
        [Input("connectionLabel")]
        public Input<string>? ConnectionLabel { get; set; }

        /// <summary>
        /// Mandate redundant connections
        /// </summary>
        [Input("connectionRedundancyRequired")]
        public Input<bool>? ConnectionRedundancyRequired { get; set; }

        /// <summary>
        /// Enable auto generate service key
        /// </summary>
        [Input("enableAutoGenerateServiceKey")]
        public Input<bool>? EnableAutoGenerateServiceKey { get; set; }

        /// <summary>
        /// Link protocol configuration details
        /// </summary>
        [Input("linkProtocolConfig")]
        public Input<Inputs.ServiceProfileAccessPointTypeConfigLinkProtocolConfigGetArgs>? LinkProtocolConfig { get; set; }

        [Input("supportedBandwidths")]
        private InputList<int>? _supportedBandwidths;

        /// <summary>
        /// Supported bandwidths
        /// </summary>
        public InputList<int> SupportedBandwidths
        {
            get => _supportedBandwidths ?? (_supportedBandwidths = new InputList<int>());
            set => _supportedBandwidths = value;
        }

        /// <summary>
        /// Type of access point type config - VD, COLO
        /// </summary>
        [Input("type", required: true)]
        public InputUnion<string, Pulumi.Equinix.Fabric.ProfileAccessPointType> Type { get; set; } = null!;

        /// <summary>
        /// Colo/Port Uuid
        /// </summary>
        [Input("uuid")]
        public Input<string>? Uuid { get; set; }

        public ServiceProfileAccessPointTypeConfigGetArgs()
        {
        }
        public static new ServiceProfileAccessPointTypeConfigGetArgs Empty => new ServiceProfileAccessPointTypeConfigGetArgs();
    }
}
