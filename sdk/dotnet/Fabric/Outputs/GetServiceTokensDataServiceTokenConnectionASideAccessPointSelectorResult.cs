// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Equinix.Fabric.Outputs
{

    [OutputType]
    public sealed class GetServiceTokensDataServiceTokenConnectionASideAccessPointSelectorResult
    {
        /// <summary>
        /// Virtual Device Interface Configuration
        /// </summary>
        public readonly Outputs.GetServiceTokensDataServiceTokenConnectionASideAccessPointSelectorInterfaceResult Interface;
        /// <summary>
        /// Link protocol Configuration
        /// </summary>
        public readonly Outputs.GetServiceTokensDataServiceTokenConnectionASideAccessPointSelectorLinkProtocolResult LinkProtocol;
        /// <summary>
        /// Network Configuration
        /// </summary>
        public readonly Outputs.GetServiceTokensDataServiceTokenConnectionASideAccessPointSelectorNetworkResult Network;
        /// <summary>
        /// Port Configuration
        /// </summary>
        public readonly Outputs.GetServiceTokensDataServiceTokenConnectionASideAccessPointSelectorPortResult Port;
        /// <summary>
        /// Type of Access point; COLO, VD, NETWORK
        /// </summary>
        public readonly string Type;
        /// <summary>
        /// Virtual Device Configuration
        /// </summary>
        public readonly Outputs.GetServiceTokensDataServiceTokenConnectionASideAccessPointSelectorVirtualDeviceResult? VirtualDevice;

        [OutputConstructor]
        private GetServiceTokensDataServiceTokenConnectionASideAccessPointSelectorResult(
            Outputs.GetServiceTokensDataServiceTokenConnectionASideAccessPointSelectorInterfaceResult @interface,

            Outputs.GetServiceTokensDataServiceTokenConnectionASideAccessPointSelectorLinkProtocolResult linkProtocol,

            Outputs.GetServiceTokensDataServiceTokenConnectionASideAccessPointSelectorNetworkResult network,

            Outputs.GetServiceTokensDataServiceTokenConnectionASideAccessPointSelectorPortResult port,

            string type,

            Outputs.GetServiceTokensDataServiceTokenConnectionASideAccessPointSelectorVirtualDeviceResult? virtualDevice)
        {
            Interface = @interface;
            LinkProtocol = linkProtocol;
            Network = network;
            Port = port;
            Type = type;
            VirtualDevice = virtualDevice;
        }
    }
}