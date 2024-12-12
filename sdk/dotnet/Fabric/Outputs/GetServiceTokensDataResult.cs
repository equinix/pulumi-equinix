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
    public sealed class GetServiceTokensDataResult
    {
        /// <summary>
        /// Customer account information that is associated with this service token
        /// </summary>
        public readonly ImmutableArray<Outputs.GetServiceTokensDataAccountResult> Accounts;
        /// <summary>
        /// Captures connection lifecycle change information
        /// </summary>
        public readonly ImmutableArray<Outputs.GetServiceTokensDataChangeLogResult> ChangeLogs;
        /// <summary>
        /// Optional Description to the Service Token you will be creating
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// Expiration date and time of the service token; 2020-11-06T07:00:00Z
        /// </summary>
        public readonly string ExpirationDateTime;
        /// <summary>
        /// An absolute URL that is the subject of the link's context.
        /// </summary>
        public readonly string Href;
        /// <summary>
        /// Information about token side; ASIDE, ZSIDE
        /// </summary>
        public readonly string IssuerSide;
        /// <summary>
        /// Name of the Service Token
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Preferences for notifications on Service Token configuration or status changes
        /// </summary>
        public readonly ImmutableArray<Outputs.GetServiceTokensDataNotificationResult> Notifications;
        /// <summary>
        /// Project information
        /// </summary>
        public readonly ImmutableArray<Outputs.GetServiceTokensDataProjectResult> Projects;
        /// <summary>
        /// Service Token Connection Type Information
        /// </summary>
        public readonly ImmutableArray<Outputs.GetServiceTokensDataServiceTokenConnectionResult> ServiceTokenConnections;
        /// <summary>
        /// Service token state; ACTIVE, INACTIVE, EXPIRED, DELETED
        /// </summary>
        public readonly string State;
        /// <summary>
        /// Service Token Type; VC_TOKEN,EPL_TOKEN
        /// </summary>
        public readonly string Type;
        /// <summary>
        /// Equinix-assigned service token identifier
        /// </summary>
        public readonly string Uuid;

        [OutputConstructor]
        private GetServiceTokensDataResult(
            ImmutableArray<Outputs.GetServiceTokensDataAccountResult> accounts,

            ImmutableArray<Outputs.GetServiceTokensDataChangeLogResult> changeLogs,

            string description,

            string expirationDateTime,

            string href,

            string issuerSide,

            string name,

            ImmutableArray<Outputs.GetServiceTokensDataNotificationResult> notifications,

            ImmutableArray<Outputs.GetServiceTokensDataProjectResult> projects,

            ImmutableArray<Outputs.GetServiceTokensDataServiceTokenConnectionResult> serviceTokenConnections,

            string state,

            string type,

            string uuid)
        {
            Accounts = accounts;
            ChangeLogs = changeLogs;
            Description = description;
            ExpirationDateTime = expirationDateTime;
            Href = href;
            IssuerSide = issuerSide;
            Name = name;
            Notifications = notifications;
            Projects = projects;
            ServiceTokenConnections = serviceTokenConnections;
            State = state;
            Type = type;
            Uuid = uuid;
        }
    }
}
