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
    public sealed class GetStreamSubscriptionSinkResult
    {
        /// <summary>
        /// Boolean switch enabling batch delivery of data
        /// </summary>
        public readonly bool BatchEnabled;
        /// <summary>
        /// Maximum size of the batch delivery if enabled
        /// </summary>
        public readonly int BatchSizeMax;
        /// <summary>
        /// Maximum time to wait for batch delivery if enabled
        /// </summary>
        public readonly int BatchWaitTimeMax;
        /// <summary>
        /// Access details for the specified sink type
        /// </summary>
        public readonly Outputs.GetStreamSubscriptionSinkCredentialResult Credential;
        /// <summary>
        /// Known hostname of certain data stream subscription products. Not to be confused with a variable URI
        /// </summary>
        public readonly string Host;
        /// <summary>
        /// Stream subscription sink settings
        /// </summary>
        public readonly Outputs.GetStreamSubscriptionSinkSettingsResult Settings;
        /// <summary>
        /// Type of the subscriber
        /// </summary>
        public readonly string Type;
        /// <summary>
        /// Publicly reachable http endpoint destination for data stream
        /// </summary>
        public readonly string Uri;

        [OutputConstructor]
        private GetStreamSubscriptionSinkResult(
            bool batchEnabled,

            int batchSizeMax,

            int batchWaitTimeMax,

            Outputs.GetStreamSubscriptionSinkCredentialResult credential,

            string host,

            Outputs.GetStreamSubscriptionSinkSettingsResult settings,

            string type,

            string uri)
        {
            BatchEnabled = batchEnabled;
            BatchSizeMax = batchSizeMax;
            BatchWaitTimeMax = batchWaitTimeMax;
            Credential = credential;
            Host = host;
            Settings = settings;
            Type = type;
            Uri = uri;
        }
    }
}
