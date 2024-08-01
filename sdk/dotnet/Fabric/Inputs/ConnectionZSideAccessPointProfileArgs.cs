// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Equinix.Fabric.Inputs
{

    public sealed class ConnectionZSideAccessPointProfileArgs : global::Pulumi.ResourceArgs
    {
        [Input("accessPointTypeConfigs")]
        private InputList<Inputs.ConnectionZSideAccessPointProfileAccessPointTypeConfigArgs>? _accessPointTypeConfigs;

        /// <summary>
        /// Access point config information
        /// </summary>
        public InputList<Inputs.ConnectionZSideAccessPointProfileAccessPointTypeConfigArgs> AccessPointTypeConfigs
        {
            get => _accessPointTypeConfigs ?? (_accessPointTypeConfigs = new InputList<Inputs.ConnectionZSideAccessPointProfileAccessPointTypeConfigArgs>());
            set => _accessPointTypeConfigs = value;
        }

        /// <summary>
        /// User-provided service description
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Service Profile URI response attribute
        /// </summary>
        [Input("href")]
        public Input<string>? Href { get; set; }

        /// <summary>
        /// Customer-assigned service profile name
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Service profile type - L2*PROFILE, L3*PROFILE, ECIA*PROFILE, ECMC*PROFILE, IA_PROFILE
        /// </summary>
        [Input("type", required: true)]
        public InputUnion<string, Pulumi.Equinix.Fabric.ProfileType> Type { get; set; } = null!;

        /// <summary>
        /// Equinix assigned service profile identifier
        /// </summary>
        [Input("uuid", required: true)]
        public Input<string> Uuid { get; set; } = null!;

        public ConnectionZSideAccessPointProfileArgs()
        {
        }
        public static new ConnectionZSideAccessPointProfileArgs Empty => new ConnectionZSideAccessPointProfileArgs();
    }
}
