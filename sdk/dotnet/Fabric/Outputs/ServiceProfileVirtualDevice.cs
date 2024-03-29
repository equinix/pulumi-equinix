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
    public sealed class ServiceProfileVirtualDevice
    {
        /// <summary>
        /// Device Interface Uuid
        /// </summary>
        public readonly string? InterfaceUuid;
        /// <summary>
        /// Device Location
        /// </summary>
        public readonly Outputs.ServiceProfileVirtualDeviceLocation? Location;
        /// <summary>
        /// Virtual Device Type
        /// </summary>
        public readonly string Type;
        /// <summary>
        /// Virtual Device Uuid
        /// </summary>
        public readonly string Uuid;

        [OutputConstructor]
        private ServiceProfileVirtualDevice(
            string? interfaceUuid,

            Outputs.ServiceProfileVirtualDeviceLocation? location,

            string type,

            string uuid)
        {
            InterfaceUuid = interfaceUuid;
            Location = location;
            Type = type;
            Uuid = uuid;
        }
    }
}
