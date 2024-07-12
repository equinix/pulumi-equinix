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
    public sealed class GetNetworkOperationResult
    {
        /// <summary>
        /// Progress towards provisioning a given asset.
        /// </summary>
        public readonly string EquinixStatus;

        [OutputConstructor]
        private GetNetworkOperationResult(string equinixStatus)
        {
            EquinixStatus = equinixStatus;
        }
    }
}
