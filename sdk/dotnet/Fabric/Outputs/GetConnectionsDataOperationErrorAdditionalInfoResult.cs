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
    public sealed class GetConnectionsDataOperationErrorAdditionalInfoResult
    {
        /// <summary>
        /// Property at which the error potentially occurred
        /// </summary>
        public readonly string Property;
        /// <summary>
        /// Reason for the error
        /// </summary>
        public readonly string Reason;

        [OutputConstructor]
        private GetConnectionsDataOperationErrorAdditionalInfoResult(
            string property,

            string reason)
        {
            Property = property;
            Reason = reason;
        }
    }
}
