// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Equinix.NetworkEdge.Outputs
{

    [OutputType]
    public sealed class DeviceLinkLink
    {
        /// <summary>
        /// billing account number to be used for connection charges
        /// </summary>
        public readonly string AccountNumber;
        /// <summary>
        /// connection destination metro code.
        /// </summary>
        public readonly string DstMetroCode;
        /// <summary>
        /// connection destination zone code is not required.
        /// </summary>
        public readonly string? DstZoneCode;
        /// <summary>
        /// connection source metro code.
        /// </summary>
        public readonly string SrcMetroCode;
        /// <summary>
        /// connection source zone code is not required.
        /// </summary>
        public readonly string? SrcZoneCode;
        /// <summary>
        /// connection throughput.
        /// </summary>
        public readonly string Throughput;
        /// <summary>
        /// connection throughput unit (Mbps or Gbps).
        /// </summary>
        public readonly string ThroughputUnit;

        [OutputConstructor]
        private DeviceLinkLink(
            string accountNumber,

            string dstMetroCode,

            string? dstZoneCode,

            string srcMetroCode,

            string? srcZoneCode,

            string throughput,

            string throughputUnit)
        {
            AccountNumber = accountNumber;
            DstMetroCode = dstMetroCode;
            DstZoneCode = dstZoneCode;
            SrcMetroCode = srcMetroCode;
            SrcZoneCode = srcZoneCode;
            Throughput = throughput;
            ThroughputUnit = throughputUnit;
        }
    }
}
