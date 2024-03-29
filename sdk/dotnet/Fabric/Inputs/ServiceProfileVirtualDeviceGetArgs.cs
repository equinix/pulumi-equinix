// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Equinix.Fabric.Inputs
{

    public sealed class ServiceProfileVirtualDeviceGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Device Interface Uuid
        /// </summary>
        [Input("interfaceUuid")]
        public Input<string>? InterfaceUuid { get; set; }

        /// <summary>
        /// Device Location
        /// </summary>
        [Input("location")]
        public Input<Inputs.ServiceProfileVirtualDeviceLocationGetArgs>? Location { get; set; }

        /// <summary>
        /// Virtual Device Type
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        /// <summary>
        /// Virtual Device Uuid
        /// </summary>
        [Input("uuid", required: true)]
        public Input<string> Uuid { get; set; } = null!;

        public ServiceProfileVirtualDeviceGetArgs()
        {
        }
        public static new ServiceProfileVirtualDeviceGetArgs Empty => new ServiceProfileVirtualDeviceGetArgs();
    }
}
