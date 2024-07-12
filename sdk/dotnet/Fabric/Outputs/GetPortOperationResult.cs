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
    public sealed class GetPortOperationResult
    {
        /// <summary>
        /// Total number of current connections
        /// </summary>
        public readonly int ConnectionCount;
        /// <summary>
        /// Date and time at which port availability changed
        /// </summary>
        public readonly string OpStatusChangedAt;
        /// <summary>
        /// Port operation status
        /// </summary>
        public readonly string OperationalStatus;

        [OutputConstructor]
        private GetPortOperationResult(
            int connectionCount,

            string opStatusChangedAt,

            string operationalStatus)
        {
            ConnectionCount = connectionCount;
            OpStatusChangedAt = opStatusChangedAt;
            OperationalStatus = operationalStatus;
        }
    }
}
