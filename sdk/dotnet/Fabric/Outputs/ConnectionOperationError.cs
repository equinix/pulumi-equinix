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
    public sealed class ConnectionOperationError
    {
        /// <summary>
        /// Connection additional information
        /// </summary>
        public readonly ImmutableArray<Outputs.ConnectionOperationErrorAdditionalInfo> AdditionalInfo;
        public readonly string? CorrelationId;
        public readonly string? Details;
        public readonly string? ErrorCode;
        public readonly string? ErrorMessage;
        public readonly string? Help;

        [OutputConstructor]
        private ConnectionOperationError(
            ImmutableArray<Outputs.ConnectionOperationErrorAdditionalInfo> additionalInfo,

            string? correlationId,

            string? details,

            string? errorCode,

            string? errorMessage,

            string? help)
        {
            AdditionalInfo = additionalInfo;
            CorrelationId = correlationId;
            Details = details;
            ErrorCode = errorCode;
            ErrorMessage = errorMessage;
            Help = help;
        }
    }
}
