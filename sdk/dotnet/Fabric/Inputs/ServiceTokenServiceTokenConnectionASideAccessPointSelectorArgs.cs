// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Equinix.Fabric.Inputs
{

    public sealed class ServiceTokenServiceTokenConnectionASideAccessPointSelectorArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Virtual Device Interface Configuration
        /// </summary>
        [Input("interface")]
        public Input<Inputs.ServiceTokenServiceTokenConnectionASideAccessPointSelectorInterfaceArgs>? Interface { get; set; }

        /// <summary>
        /// Link protocol Configuration
        /// </summary>
        [Input("linkProtocol")]
        public Input<Inputs.ServiceTokenServiceTokenConnectionASideAccessPointSelectorLinkProtocolArgs>? LinkProtocol { get; set; }

        /// <summary>
        /// Network Configuration
        /// </summary>
        [Input("network")]
        public Input<Inputs.ServiceTokenServiceTokenConnectionASideAccessPointSelectorNetworkArgs>? Network { get; set; }

        /// <summary>
        /// Port Configuration
        /// </summary>
        [Input("port")]
        public Input<Inputs.ServiceTokenServiceTokenConnectionASideAccessPointSelectorPortArgs>? Port { get; set; }

        /// <summary>
        /// Type of Access point; COLO, VD, NETWORK
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        /// <summary>
        /// Virtual Device Configuration
        /// </summary>
        [Input("virtualDevice")]
        public Input<Inputs.ServiceTokenServiceTokenConnectionASideAccessPointSelectorVirtualDeviceArgs>? VirtualDevice { get; set; }

        public ServiceTokenServiceTokenConnectionASideAccessPointSelectorArgs()
        {
        }
        public static new ServiceTokenServiceTokenConnectionASideAccessPointSelectorArgs Empty => new ServiceTokenServiceTokenConnectionASideAccessPointSelectorArgs();
    }
}
