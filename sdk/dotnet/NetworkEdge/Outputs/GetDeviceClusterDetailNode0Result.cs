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
    public sealed class GetDeviceClusterDetailNode0Result
    {
        /// <summary>
        /// Unique identifier of applied license file
        /// </summary>
        public readonly string LicenseFileId;
        /// <summary>
        /// License token. This is necessary for Palo Alto clusters
        /// </summary>
        public readonly string LicenseToken;
        /// <summary>
        /// Name of an existing Equinix Network Edge device
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// UUID of an existing Equinix Network Edge device
        /// </summary>
        public readonly string Uuid;
        /// <summary>
        /// An object that has fields relevant to the vendor of the cluster device
        /// </summary>
        public readonly ImmutableArray<Outputs.GetDeviceClusterDetailNode0VendorConfigurationResult> VendorConfigurations;

        [OutputConstructor]
        private GetDeviceClusterDetailNode0Result(
            string licenseFileId,

            string licenseToken,

            string name,

            string uuid,

            ImmutableArray<Outputs.GetDeviceClusterDetailNode0VendorConfigurationResult> vendorConfigurations)
        {
            LicenseFileId = licenseFileId;
            LicenseToken = licenseToken;
            Name = name;
            Uuid = uuid;
            VendorConfigurations = vendorConfigurations;
        }
    }
}
