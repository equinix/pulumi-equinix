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
    public sealed class GetConnectionsDataOperationResult
    {
        /// <summary>
        /// Connection status
        /// </summary>
        public readonly string EquinixStatus;
        /// <summary>
        /// Errors occurred
        /// </summary>
        public readonly ImmutableArray<Outputs.GetConnectionsDataOperationErrorResult> Errors;
        /// <summary>
        /// Connection provider readiness status
        /// </summary>
        public readonly string ProviderStatus;

        [OutputConstructor]
        private GetConnectionsDataOperationResult(
            string equinixStatus,

            ImmutableArray<Outputs.GetConnectionsDataOperationErrorResult> errors,

            string providerStatus)
        {
            EquinixStatus = equinixStatus;
            Errors = errors;
            ProviderStatus = providerStatus;
        }
    }
}
