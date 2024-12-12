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
    public sealed class ServiceTokenServiceTokenConnectionZSideAccessPointSelectorPort
    {
        /// <summary>
        /// Account Name
        /// </summary>
        public readonly string? AccountName;
        /// <summary>
        /// Port Bandwidth
        /// </summary>
        public readonly int? Bandwidth;
        /// <summary>
        /// Customer virtual port Id
        /// </summary>
        public readonly int? CvpId;
        /// <summary>
        /// Port Encapsulation
        /// </summary>
        public readonly string? EncapsulationProtocolType;
        /// <summary>
        /// Unique Resource Identifier
        /// </summary>
        public readonly string? Href;
        /// <summary>
        /// Port Location
        /// </summary>
        public readonly ImmutableArray<Outputs.ServiceTokenServiceTokenConnectionZSideAccessPointSelectorPortLocation> Locations;
        /// <summary>
        /// Port Name
        /// </summary>
        public readonly string? PortName;
        /// <summary>
        /// Port Priority
        /// </summary>
        public readonly string? Priority;
        /// <summary>
        /// Type of Port
        /// </summary>
        public readonly string? Type;
        /// <summary>
        /// Equinix-assigned Port identifier
        /// </summary>
        public readonly string Uuid;

        [OutputConstructor]
        private ServiceTokenServiceTokenConnectionZSideAccessPointSelectorPort(
            string? accountName,

            int? bandwidth,

            int? cvpId,

            string? encapsulationProtocolType,

            string? href,

            ImmutableArray<Outputs.ServiceTokenServiceTokenConnectionZSideAccessPointSelectorPortLocation> locations,

            string? portName,

            string? priority,

            string? type,

            string uuid)
        {
            AccountName = accountName;
            Bandwidth = bandwidth;
            CvpId = cvpId;
            EncapsulationProtocolType = encapsulationProtocolType;
            Href = href;
            Locations = locations;
            PortName = portName;
            Priority = priority;
            Type = type;
            Uuid = uuid;
        }
    }
}
