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
    public sealed class RouteFilterRuleChangeLog
    {
        /// <summary>
        /// Created by User Key
        /// </summary>
        public readonly string? CreatedBy;
        /// <summary>
        /// Created by User Email Address
        /// </summary>
        public readonly string? CreatedByEmail;
        /// <summary>
        /// Created by User Full Name
        /// </summary>
        public readonly string? CreatedByFullName;
        /// <summary>
        /// Created by Date and Time
        /// </summary>
        public readonly string? CreatedDateTime;
        /// <summary>
        /// Deleted by User Key
        /// </summary>
        public readonly string? DeletedBy;
        /// <summary>
        /// Deleted by User Email Address
        /// </summary>
        public readonly string? DeletedByEmail;
        /// <summary>
        /// Deleted by User Full Name
        /// </summary>
        public readonly string? DeletedByFullName;
        /// <summary>
        /// Deleted by Date and Time
        /// </summary>
        public readonly string? DeletedDateTime;
        /// <summary>
        /// Updated by User Key
        /// </summary>
        public readonly string? UpdatedBy;
        /// <summary>
        /// Updated by User Email Address
        /// </summary>
        public readonly string? UpdatedByEmail;
        /// <summary>
        /// Updated by User Full Name
        /// </summary>
        public readonly string? UpdatedByFullName;
        /// <summary>
        /// Updated by Date and Time
        /// </summary>
        public readonly string? UpdatedDateTime;

        [OutputConstructor]
        private RouteFilterRuleChangeLog(
            string? createdBy,

            string? createdByEmail,

            string? createdByFullName,

            string? createdDateTime,

            string? deletedBy,

            string? deletedByEmail,

            string? deletedByFullName,

            string? deletedDateTime,

            string? updatedBy,

            string? updatedByEmail,

            string? updatedByFullName,

            string? updatedDateTime)
        {
            CreatedBy = createdBy;
            CreatedByEmail = createdByEmail;
            CreatedByFullName = createdByFullName;
            CreatedDateTime = createdDateTime;
            DeletedBy = deletedBy;
            DeletedByEmail = deletedByEmail;
            DeletedByFullName = deletedByFullName;
            DeletedDateTime = deletedDateTime;
            UpdatedBy = updatedBy;
            UpdatedByEmail = updatedByEmail;
            UpdatedByFullName = updatedByFullName;
            UpdatedDateTime = updatedDateTime;
        }
    }
}
