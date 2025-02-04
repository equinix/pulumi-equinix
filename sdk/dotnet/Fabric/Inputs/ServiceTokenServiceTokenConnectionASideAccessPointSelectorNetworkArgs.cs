// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Equinix.Fabric.Inputs
{

    public sealed class ServiceTokenServiceTokenConnectionASideAccessPointSelectorNetworkArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Unique Resource Identifier
        /// </summary>
        [Input("href")]
        public Input<string>? Href { get; set; }

        [Input("locations")]
        private InputList<Inputs.ServiceTokenServiceTokenConnectionASideAccessPointSelectorNetworkLocationArgs>? _locations;

        /// <summary>
        /// Location
        /// </summary>
        public InputList<Inputs.ServiceTokenServiceTokenConnectionASideAccessPointSelectorNetworkLocationArgs> Locations
        {
            get => _locations ?? (_locations = new InputList<Inputs.ServiceTokenServiceTokenConnectionASideAccessPointSelectorNetworkLocationArgs>());
            set => _locations = value;
        }

        /// <summary>
        /// Network Name
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Scope of Network
        /// </summary>
        [Input("scope")]
        public Input<string>? Scope { get; set; }

        /// <summary>
        /// Type of Network
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        /// <summary>
        /// Equinix-assigned Network identifier
        /// </summary>
        [Input("uuid", required: true)]
        public Input<string> Uuid { get; set; } = null!;

        public ServiceTokenServiceTokenConnectionASideAccessPointSelectorNetworkArgs()
        {
        }
        public static new ServiceTokenServiceTokenConnectionASideAccessPointSelectorNetworkArgs Empty => new ServiceTokenServiceTokenConnectionASideAccessPointSelectorNetworkArgs();
    }
}
