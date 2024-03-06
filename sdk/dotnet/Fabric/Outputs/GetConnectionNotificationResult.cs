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
    public sealed class GetConnectionNotificationResult
    {
        /// <summary>
        /// Array of contact emails
        /// </summary>
        public readonly ImmutableArray<string> Emails;
        /// <summary>
        /// Send interval
        /// </summary>
        public readonly string? SendInterval;
        /// <summary>
        /// Notification Type - ALL,CONNECTION_APPROVAL,SALES_REP_NOTIFICATIONS, NOTIFICATIONS
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private GetConnectionNotificationResult(
            ImmutableArray<string> emails,

            string? sendInterval,

            string type)
        {
            Emails = emails;
            SendInterval = sendInterval;
            Type = type;
        }
    }
}
