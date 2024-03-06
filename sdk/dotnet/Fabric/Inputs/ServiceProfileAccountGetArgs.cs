// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Equinix.Fabric.Inputs
{

    public sealed class ServiceProfileAccountGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Legal name of the accountholder.
        /// </summary>
        [Input("accountName")]
        public Input<string>? AccountName { get; set; }

        /// <summary>
        /// Equinix-assigned account number.
        /// </summary>
        [Input("accountNumber")]
        public Input<int>? AccountNumber { get; set; }

        /// <summary>
        /// Equinix-assigned ID of the subscriber's parent organization.
        /// </summary>
        [Input("globalCustId")]
        public Input<string>? GlobalCustId { get; set; }

        /// <summary>
        /// Equinix-assigned ID of the subscriber's parent organization.
        /// </summary>
        [Input("globalOrgId")]
        public Input<string>? GlobalOrgId { get; set; }

        /// <summary>
        /// Equinix-assigned name of the subscriber's parent organization.
        /// </summary>
        [Input("globalOrganizationName")]
        public Input<string>? GlobalOrganizationName { get; set; }

        /// <summary>
        /// Equinix-assigned ID of the subscriber's organization.
        /// </summary>
        [Input("orgId")]
        public Input<int>? OrgId { get; set; }

        /// <summary>
        /// Equinix-assigned name of the subscriber's organization.
        /// </summary>
        [Input("organizationName")]
        public Input<string>? OrganizationName { get; set; }

        /// <summary>
        /// Enterprise datastore id
        /// </summary>
        [Input("ucmId")]
        public Input<string>? UcmId { get; set; }

        public ServiceProfileAccountGetArgs()
        {
        }
        public static new ServiceProfileAccountGetArgs Empty => new ServiceProfileAccountGetArgs();
    }
}
