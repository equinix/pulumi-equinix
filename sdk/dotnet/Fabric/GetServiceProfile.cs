// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Equinix.Fabric
{
    public static class GetServiceProfile
    {
        /// <summary>
        /// Fabric V4 API compatible data resource that allow user to fetch Service Profile by UUID filter criteria
        /// 
        /// &gt; **Note** Equinix Fabric v4 resources and datasources are currently in Beta. The interfaces related to `equinix_fabric_` resources and datasources may change ahead of general availability
        /// </summary>
        public static Task<GetServiceProfileResult> InvokeAsync(GetServiceProfileArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetServiceProfileResult>("equinix:fabric/getServiceProfile:getServiceProfile", args ?? new GetServiceProfileArgs(), options.WithDefaults());

        /// <summary>
        /// Fabric V4 API compatible data resource that allow user to fetch Service Profile by UUID filter criteria
        /// 
        /// &gt; **Note** Equinix Fabric v4 resources and datasources are currently in Beta. The interfaces related to `equinix_fabric_` resources and datasources may change ahead of general availability
        /// </summary>
        public static Output<GetServiceProfileResult> Invoke(GetServiceProfileInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetServiceProfileResult>("equinix:fabric/getServiceProfile:getServiceProfile", args ?? new GetServiceProfileInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetServiceProfileArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Service profile state - ACTIVE, PENDING_APPROVAL, DELETED, REJECTED
        /// </summary>
        [Input("state")]
        public string? State { get; set; }

        [Input("uuid", required: true)]
        public string Uuid { get; set; } = null!;

        public GetServiceProfileArgs()
        {
        }
        public static new GetServiceProfileArgs Empty => new GetServiceProfileArgs();
    }

    public sealed class GetServiceProfileInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Service profile state - ACTIVE, PENDING_APPROVAL, DELETED, REJECTED
        /// </summary>
        [Input("state")]
        public Input<string>? State { get; set; }

        [Input("uuid", required: true)]
        public Input<string> Uuid { get; set; } = null!;

        public GetServiceProfileInvokeArgs()
        {
        }
        public static new GetServiceProfileInvokeArgs Empty => new GetServiceProfileInvokeArgs();
    }


    [OutputType]
    public sealed class GetServiceProfileResult
    {
        /// <summary>
        /// Access point config information
        /// </summary>
        public readonly ImmutableArray<Outputs.GetServiceProfileAccessPointTypeConfigResult> AccessPointTypeConfigs;
        /// <summary>
        /// Account
        /// </summary>
        public readonly Outputs.GetServiceProfileAccountResult Account;
        /// <summary>
        /// Array of contact emails
        /// </summary>
        public readonly ImmutableArray<string> AllowedEmails;
        /// <summary>
        /// Captures connection lifecycle change information
        /// </summary>
        public readonly Outputs.GetServiceProfileChangeLogResult ChangeLog;
        /// <summary>
        /// Custom Fields
        /// </summary>
        public readonly ImmutableArray<Outputs.GetServiceProfileCustomFieldResult> CustomFields;
        /// <summary>
        /// User-provided service description
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// Service Profile URI response attribute
        /// </summary>
        public readonly string Href;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Marketing Info
        /// </summary>
        public readonly Outputs.GetServiceProfileMarketingInfoResult MarketingInfo;
        /// <summary>
        /// Access point config information
        /// </summary>
        public readonly ImmutableArray<Outputs.GetServiceProfileMetroResult> Metros;
        /// <summary>
        /// Customer-assigned service profile name
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Preferences for notifications on connection configuration or status changes
        /// </summary>
        public readonly ImmutableArray<Outputs.GetServiceProfileNotificationResult> Notifications;
        /// <summary>
        /// Ports
        /// </summary>
        public readonly ImmutableArray<Outputs.GetServiceProfilePortResult> Ports;
        /// <summary>
        /// Project information
        /// </summary>
        public readonly Outputs.GetServiceProfileProjectResult Project;
        /// <summary>
        /// Self Profile indicating if the profile is created for customer's  self use
        /// </summary>
        public readonly bool SelfProfile;
        /// <summary>
        /// Service profile state - ACTIVE, PENDING_APPROVAL, DELETED, REJECTED
        /// </summary>
        public readonly string? State;
        /// <summary>
        /// Tags attached to the connection
        /// </summary>
        public readonly ImmutableArray<string> Tags;
        /// <summary>
        /// Service profile type - L2*PROFILE, L3*PROFILE, ECIA*PROFILE, ECMC*PROFILE
        /// </summary>
        public readonly string Type;
        /// <summary>
        /// Equinix assigned service profile identifier
        /// </summary>
        public readonly string Uuid;
        /// <summary>
        /// Service profile visibility - PUBLIC, PRIVATE
        /// </summary>
        public readonly string Visibility;

        [OutputConstructor]
        private GetServiceProfileResult(
            ImmutableArray<Outputs.GetServiceProfileAccessPointTypeConfigResult> accessPointTypeConfigs,

            Outputs.GetServiceProfileAccountResult account,

            ImmutableArray<string> allowedEmails,

            Outputs.GetServiceProfileChangeLogResult changeLog,

            ImmutableArray<Outputs.GetServiceProfileCustomFieldResult> customFields,

            string description,

            string href,

            string id,

            Outputs.GetServiceProfileMarketingInfoResult marketingInfo,

            ImmutableArray<Outputs.GetServiceProfileMetroResult> metros,

            string name,

            ImmutableArray<Outputs.GetServiceProfileNotificationResult> notifications,

            ImmutableArray<Outputs.GetServiceProfilePortResult> ports,

            Outputs.GetServiceProfileProjectResult project,

            bool selfProfile,

            string? state,

            ImmutableArray<string> tags,

            string type,

            string uuid,

            string visibility)
        {
            AccessPointTypeConfigs = accessPointTypeConfigs;
            Account = account;
            AllowedEmails = allowedEmails;
            ChangeLog = changeLog;
            CustomFields = customFields;
            Description = description;
            Href = href;
            Id = id;
            MarketingInfo = marketingInfo;
            Metros = metros;
            Name = name;
            Notifications = notifications;
            Ports = ports;
            Project = project;
            SelfProfile = selfProfile;
            State = state;
            Tags = tags;
            Type = type;
            Uuid = uuid;
            Visibility = visibility;
        }
    }
}
