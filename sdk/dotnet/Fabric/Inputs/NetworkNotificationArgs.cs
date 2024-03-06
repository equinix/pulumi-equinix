// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Equinix.Fabric.Inputs
{

    public sealed class NetworkNotificationArgs : global::Pulumi.ResourceArgs
    {
        [Input("emails", required: true)]
        private InputList<string>? _emails;

        /// <summary>
        /// Array of contact emails
        /// </summary>
        public InputList<string> Emails
        {
            get => _emails ?? (_emails = new InputList<string>());
            set => _emails = value;
        }

        /// <summary>
        /// Send interval
        /// </summary>
        [Input("sendInterval")]
        public Input<string>? SendInterval { get; set; }

        /// <summary>
        /// Notification Type - ALL,CONNECTION*APPROVAL,SALES*REP_NOTIFICATIONS, NOTIFICATIONS
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public NetworkNotificationArgs()
        {
        }
        public static new NetworkNotificationArgs Empty => new NetworkNotificationArgs();
    }
}
