// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Equinix.Fabric.Inputs
{

    public sealed class PrecisionTimeServiceAccountArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Account Name
        /// </summary>
        [Input("accountName")]
        public Input<string>? AccountName { get; set; }

        /// <summary>
        /// Equinix Account Number
        /// </summary>
        [Input("accountNumber")]
        public Input<int>? AccountNumber { get; set; }

        /// <summary>
        /// Global Customer Id
        /// </summary>
        [Input("globalCustId")]
        public Input<string>? GlobalCustId { get; set; }

        /// <summary>
        /// Customer organization naidentifierme
        /// </summary>
        [Input("globalOrgId")]
        public Input<string>? GlobalOrgId { get; set; }

        /// <summary>
        /// Global organization name
        /// </summary>
        [Input("globalOrganizationName")]
        public Input<string>? GlobalOrganizationName { get; set; }

        /// <summary>
        /// Customer organization identifier
        /// </summary>
        [Input("orgId")]
        public Input<int>? OrgId { get; set; }

        /// <summary>
        /// Customer organization name
        /// </summary>
        [Input("organizationName")]
        public Input<string>? OrganizationName { get; set; }

        /// <summary>
        /// Reseller account name
        /// </summary>
        [Input("resellerAccountName")]
        public Input<string>? ResellerAccountName { get; set; }

        /// <summary>
        /// Reseller account number
        /// </summary>
        [Input("resellerAccountNumber")]
        public Input<int>? ResellerAccountNumber { get; set; }

        /// <summary>
        /// Reseller customer organization identifier
        /// </summary>
        [Input("resellerOrgId")]
        public Input<int>? ResellerOrgId { get; set; }

        /// <summary>
        /// Reseller account ucmId
        /// </summary>
        [Input("resellerUcmId")]
        public Input<string>? ResellerUcmId { get; set; }

        /// <summary>
        /// Global organization name
        /// </summary>
        [Input("ucmId")]
        public Input<string>? UcmId { get; set; }

        public PrecisionTimeServiceAccountArgs()
        {
        }
        public static new PrecisionTimeServiceAccountArgs Empty => new PrecisionTimeServiceAccountArgs();
    }
}
