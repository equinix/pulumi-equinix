// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Equinix.Fabric.Inputs
{

    public sealed class ServiceTokenServiceTokenConnectionZSideAccessPointSelectorPortArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Account Name
        /// </summary>
        [Input("accountName")]
        public Input<string>? AccountName { get; set; }

        /// <summary>
        /// Port Bandwidth
        /// </summary>
        [Input("bandwidth")]
        public Input<int>? Bandwidth { get; set; }

        /// <summary>
        /// Customer virtual port Id
        /// </summary>
        [Input("cvpId")]
        public Input<int>? CvpId { get; set; }

        /// <summary>
        /// Port Encapsulation
        /// </summary>
        [Input("encapsulationProtocolType")]
        public Input<string>? EncapsulationProtocolType { get; set; }

        /// <summary>
        /// Unique Resource Identifier
        /// </summary>
        [Input("href")]
        public Input<string>? Href { get; set; }

        [Input("locations")]
        private InputList<Inputs.ServiceTokenServiceTokenConnectionZSideAccessPointSelectorPortLocationArgs>? _locations;

        /// <summary>
        /// Port Location
        /// </summary>
        public InputList<Inputs.ServiceTokenServiceTokenConnectionZSideAccessPointSelectorPortLocationArgs> Locations
        {
            get => _locations ?? (_locations = new InputList<Inputs.ServiceTokenServiceTokenConnectionZSideAccessPointSelectorPortLocationArgs>());
            set => _locations = value;
        }

        /// <summary>
        /// Port Name
        /// </summary>
        [Input("portName")]
        public Input<string>? PortName { get; set; }

        /// <summary>
        /// Port Priority
        /// </summary>
        [Input("priority")]
        public Input<string>? Priority { get; set; }

        /// <summary>
        /// Type of Port
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        /// <summary>
        /// Equinix-assigned Port identifier
        /// </summary>
        [Input("uuid", required: true)]
        public Input<string> Uuid { get; set; } = null!;

        public ServiceTokenServiceTokenConnectionZSideAccessPointSelectorPortArgs()
        {
        }
        public static new ServiceTokenServiceTokenConnectionZSideAccessPointSelectorPortArgs Empty => new ServiceTokenServiceTokenConnectionZSideAccessPointSelectorPortArgs();
    }
}
