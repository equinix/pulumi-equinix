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
    public sealed class GetServiceTokensDataServiceTokenConnectionZSideAccessPointSelectorResult
    {
        /// <summary>
        /// Virtual Device Interface Configuration
        /// </summary>
        public readonly Outputs.GetServiceTokensDataServiceTokenConnectionZSideAccessPointSelectorInterfaceResult? Interface;
        /// <summary>
        /// Link protocol Configuration
        /// </summary>
        public readonly Outputs.GetServiceTokensDataServiceTokenConnectionZSideAccessPointSelectorLinkProtocolResult? LinkProtocol;
        /// <summary>
        /// Network Configuration
        /// </summary>
        public readonly Outputs.GetServiceTokensDataServiceTokenConnectionZSideAccessPointSelectorNetworkResult Network;
        /// <summary>
        /// Port Configuration
        /// </summary>
        public readonly Outputs.GetServiceTokensDataServiceTokenConnectionZSideAccessPointSelectorPortResult? Port;
        /// <summary>
        /// Type of Access point; COLO, VD, NETWORK
        /// </summary>
        public readonly string Type;
        /// <summary>
        /// Virtual Device Configuration
        /// </summary>
        public readonly Outputs.GetServiceTokensDataServiceTokenConnectionZSideAccessPointSelectorVirtualDeviceResult? VirtualDevice;

        [OutputConstructor]
        private GetServiceTokensDataServiceTokenConnectionZSideAccessPointSelectorResult(
            Outputs.GetServiceTokensDataServiceTokenConnectionZSideAccessPointSelectorInterfaceResult? @interface,

            Outputs.GetServiceTokensDataServiceTokenConnectionZSideAccessPointSelectorLinkProtocolResult? linkProtocol,

            Outputs.GetServiceTokensDataServiceTokenConnectionZSideAccessPointSelectorNetworkResult network,

            Outputs.GetServiceTokensDataServiceTokenConnectionZSideAccessPointSelectorPortResult? port,

            string type,

            Outputs.GetServiceTokensDataServiceTokenConnectionZSideAccessPointSelectorVirtualDeviceResult? virtualDevice)
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
