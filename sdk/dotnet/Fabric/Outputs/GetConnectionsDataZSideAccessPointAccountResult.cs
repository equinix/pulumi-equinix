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
    public sealed class GetConnectionsDataZSideAccessPointAccountResult
    {
        /// <summary>
        /// Legal name of the accountholder.
        /// </summary>
        public readonly string AccountName;
        /// <summary>
        /// Equinix-assigned account number.
        /// </summary>
        public readonly int AccountNumber;
        /// <summary>
        /// Equinix-assigned ID of the subscriber's parent organization.
        /// </summary>
        public readonly string GlobalCustId;
        /// <summary>
        /// Equinix-assigned ID of the subscriber's parent organization.
        /// </summary>
        public readonly string GlobalOrgId;
        /// <summary>
        /// Equinix-assigned name of the subscriber's parent organization.
        /// </summary>
        public readonly string GlobalOrganizationName;
        /// <summary>
        /// Equinix-assigned ID of the subscriber's organization.
        /// </summary>
        public readonly int OrgId;
        /// <summary>
        /// Equinix-assigned name of the subscriber's organization.
        /// </summary>
        public readonly string OrganizationName;
        /// <summary>
        /// Enterprise datastore id
        /// </summary>
        public readonly string UcmId;

        [OutputConstructor]
        private GetConnectionsDataZSideAccessPointAccountResult(
            string accountName,

            int accountNumber,

            string globalCustId,

            string globalOrgId,

            string globalOrganizationName,

            int orgId,

            string organizationName,

            string ucmId)
        {
            AccountName = accountName;
            AccountNumber = accountNumber;
            GlobalCustId = globalCustId;
            GlobalOrgId = globalOrgId;
            GlobalOrganizationName = globalOrganizationName;
            OrgId = orgId;
            OrganizationName = organizationName;
            UcmId = ucmId;
        }
    }
}
