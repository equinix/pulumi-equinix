// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Equinix.Fabric.Inputs
{

    public sealed class StreamSubscriptionSinkArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Boolean switch enabling batch delivery of data
        /// </summary>
        [Input("batchEnabled")]
        public Input<bool>? BatchEnabled { get; set; }

        /// <summary>
        /// Maximum size of the batch delivery if enabled
        /// </summary>
        [Input("batchSizeMax")]
        public Input<int>? BatchSizeMax { get; set; }

        /// <summary>
        /// Maximum time to wait for batch delivery if enabled
        /// </summary>
        [Input("batchWaitTimeMax")]
        public Input<int>? BatchWaitTimeMax { get; set; }

        /// <summary>
        /// Access details for the specified sink type
        /// </summary>
        [Input("credential")]
        public Input<Inputs.StreamSubscriptionSinkCredentialArgs>? Credential { get; set; }

        /// <summary>
        /// Known hostname of certain data stream subscription products. Not to be confused with a variable URI
        /// </summary>
        [Input("host")]
        public Input<string>? Host { get; set; }

        /// <summary>
        /// Stream subscription sink settings
        /// </summary>
        [Input("settings")]
        public Input<Inputs.StreamSubscriptionSinkSettingsArgs>? Settings { get; set; }

        /// <summary>
        /// Type of the subscriber
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        /// <summary>
        /// Publicly reachable http endpoint destination for data stream
        /// </summary>
        [Input("uri")]
        public Input<string>? Uri { get; set; }

        public StreamSubscriptionSinkArgs()
        {
        }
        public static new StreamSubscriptionSinkArgs Empty => new StreamSubscriptionSinkArgs();
    }
}
