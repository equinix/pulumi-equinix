// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Equinix.Fabric.Inputs
{

    public sealed class ConnectionASideAccessPointProfileArgs : global::Pulumi.ResourceArgs
    {
        [Input("accessPointTypeConfigs")]
        private InputList<Inputs.ConnectionASideAccessPointProfileAccessPointTypeConfigArgs>? _accessPointTypeConfigs;

        /// <summary>
        /// Access point config information
        /// </summary>
        public InputList<Inputs.ConnectionASideAccessPointProfileAccessPointTypeConfigArgs> AccessPointTypeConfigs
        {
            get => _accessPointTypeConfigs ?? (_accessPointTypeConfigs = new InputList<Inputs.ConnectionASideAccessPointProfileAccessPointTypeConfigArgs>());
            set => _accessPointTypeConfigs = value;
        }

        /// <summary>
        /// User-provided service description
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Unique Resource Identifier
        /// </summary>
        [Input("href")]
        public Input<string>? Href { get; set; }

        /// <summary>
        /// Port name
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Interface type
        /// </summary>
        [Input("type", required: true)]
        public InputUnion<string, Pulumi.Equinix.Fabric.ProfileType> Type { get; set; } = null!;

        /// <summary>
        /// Equinix-assigned virtual gateway identifier
        /// </summary>
        [Input("uuid", required: true)]
        public Input<string> Uuid { get; set; } = null!;

        public ConnectionASideAccessPointProfileArgs()
        {
        }
        public static new ConnectionASideAccessPointProfileArgs Empty => new ConnectionASideAccessPointProfileArgs();
    }
}
