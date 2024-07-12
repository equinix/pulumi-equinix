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
    public sealed class GetConnectionsDataOperationErrorResult
    {
        /// <summary>
        /// Pricing error additional Info
        /// </summary>
        public readonly ImmutableArray<Outputs.GetConnectionsDataOperationErrorAdditionalInfoResult> AdditionalInfos;
        /// <summary>
        /// CorrelationId
        /// </summary>
        public readonly string CorrelationId;
        /// <summary>
        /// Details
        /// </summary>
        public readonly string Details;
        /// <summary>
        /// Error  code
        /// </summary>
        public readonly string ErrorCode;
        /// <summary>
        /// Error Message
        /// </summary>
        public readonly string ErrorMessage;
        /// <summary>
        /// Help
        /// </summary>
        public readonly string Help;

        [OutputConstructor]
        private GetConnectionsDataOperationErrorResult(
            ImmutableArray<Outputs.GetConnectionsDataOperationErrorAdditionalInfoResult> additionalInfos,

            string correlationId,

            string details,

            string errorCode,

            string errorMessage,

            string help)
        {
            AdditionalInfos = additionalInfos;
            CorrelationId = correlationId;
            Details = details;
            ErrorCode = errorCode;
            ErrorMessage = errorMessage;
            Help = help;
        }
    }
}
