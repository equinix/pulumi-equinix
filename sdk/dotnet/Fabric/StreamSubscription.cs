// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Equinix.Fabric
{
    /// <summary>
    /// Fabric V4 API compatible resource allows creation and management of Equinix Fabric Stream Subscriptions
    /// 
    /// Additional Documentation:
    /// * Getting Started: https://docs.equinix.com/en-us/Content/KnowledgeCenter/Fabric/GettingStarted/Integrating-with-Fabric-V4-APIs/IntegrateWithSink.htm
    /// * API: https://developer.equinix.com/catalog/fabricv4#tag/Stream-Subscriptions
    /// </summary>
    [EquinixResourceType("equinix:fabric/streamSubscription:StreamSubscription")]
    public partial class StreamSubscription : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Details of the last change on the stream resource
        /// </summary>
        [Output("changeLog")]
        public Output<Outputs.StreamSubscriptionChangeLog> ChangeLog { get; private set; } = null!;

        /// <summary>
        /// Customer-provided stream subscription description
        /// </summary>
        [Output("description")]
        public Output<string> Description { get; private set; } = null!;

        /// <summary>
        /// Stream subscription enabled status
        /// </summary>
        [Output("enabled")]
        public Output<bool> Enabled { get; private set; } = null!;

        /// <summary>
        /// Lists of events to be included/excluded on the stream subscription
        /// </summary>
        [Output("eventSelector")]
        public Output<Outputs.StreamSubscriptionEventSelector> EventSelector { get; private set; } = null!;

        /// <summary>
        /// Equinix assigned URI of the stream subscription resource
        /// </summary>
        [Output("href")]
        public Output<string> Href { get; private set; } = null!;

        /// <summary>
        /// Lists of metrics to be included/excluded on the stream subscription
        /// </summary>
        [Output("metricSelector")]
        public Output<Outputs.StreamSubscriptionMetricSelector> MetricSelector { get; private set; } = null!;

        /// <summary>
        /// Customer-provided stream subscription name
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The details of the subscriber to the Equinix Stream
        /// </summary>
        [Output("sink")]
        public Output<Outputs.StreamSubscriptionSink> Sink { get; private set; } = null!;

        /// <summary>
        /// Value representing provisioning status for the stream resource
        /// </summary>
        [Output("state")]
        public Output<string> State { get; private set; } = null!;

        /// <summary>
        /// The uuid of the stream that is the target of the stream subscription
        /// </summary>
        [Output("streamId")]
        public Output<string> StreamId { get; private set; } = null!;

        [Output("timeouts")]
        public Output<Outputs.StreamSubscriptionTimeouts?> Timeouts { get; private set; } = null!;

        /// <summary>
        /// Type of the stream subscription request
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;

        /// <summary>
        /// Equinix assigned unique identifier of the stream subscription resource
        /// </summary>
        [Output("uuid")]
        public Output<string> Uuid { get; private set; } = null!;


        /// <summary>
        /// Create a StreamSubscription resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public StreamSubscription(string name, StreamSubscriptionArgs args, CustomResourceOptions? options = null)
            : base("equinix:fabric/streamSubscription:StreamSubscription", name, args ?? new StreamSubscriptionArgs(), MakeResourceOptions(options, ""))
        {
        }

        private StreamSubscription(string name, Input<string> id, StreamSubscriptionState? state = null, CustomResourceOptions? options = null)
            : base("equinix:fabric/streamSubscription:StreamSubscription", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                PluginDownloadURL = "github://api.github.com/equinix",
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing StreamSubscription resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static StreamSubscription Get(string name, Input<string> id, StreamSubscriptionState? state = null, CustomResourceOptions? options = null)
        {
            return new StreamSubscription(name, id, state, options);
        }
    }

    public sealed class StreamSubscriptionArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Customer-provided stream subscription description
        /// </summary>
        [Input("description", required: true)]
        public Input<string> Description { get; set; } = null!;

        /// <summary>
        /// Stream subscription enabled status
        /// </summary>
        [Input("enabled", required: true)]
        public Input<bool> Enabled { get; set; } = null!;

        /// <summary>
        /// Lists of events to be included/excluded on the stream subscription
        /// </summary>
        [Input("eventSelector")]
        public Input<Inputs.StreamSubscriptionEventSelectorArgs>? EventSelector { get; set; }

        /// <summary>
        /// Lists of metrics to be included/excluded on the stream subscription
        /// </summary>
        [Input("metricSelector")]
        public Input<Inputs.StreamSubscriptionMetricSelectorArgs>? MetricSelector { get; set; }

        /// <summary>
        /// Customer-provided stream subscription name
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The details of the subscriber to the Equinix Stream
        /// </summary>
        [Input("sink", required: true)]
        public Input<Inputs.StreamSubscriptionSinkArgs> Sink { get; set; } = null!;

        /// <summary>
        /// The uuid of the stream that is the target of the stream subscription
        /// </summary>
        [Input("streamId", required: true)]
        public Input<string> StreamId { get; set; } = null!;

        [Input("timeouts")]
        public Input<Inputs.StreamSubscriptionTimeoutsArgs>? Timeouts { get; set; }

        /// <summary>
        /// Type of the stream subscription request
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public StreamSubscriptionArgs()
        {
        }
        public static new StreamSubscriptionArgs Empty => new StreamSubscriptionArgs();
    }

    public sealed class StreamSubscriptionState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Details of the last change on the stream resource
        /// </summary>
        [Input("changeLog")]
        public Input<Inputs.StreamSubscriptionChangeLogGetArgs>? ChangeLog { get; set; }

        /// <summary>
        /// Customer-provided stream subscription description
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Stream subscription enabled status
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// Lists of events to be included/excluded on the stream subscription
        /// </summary>
        [Input("eventSelector")]
        public Input<Inputs.StreamSubscriptionEventSelectorGetArgs>? EventSelector { get; set; }

        /// <summary>
        /// Equinix assigned URI of the stream subscription resource
        /// </summary>
        [Input("href")]
        public Input<string>? Href { get; set; }

        /// <summary>
        /// Lists of metrics to be included/excluded on the stream subscription
        /// </summary>
        [Input("metricSelector")]
        public Input<Inputs.StreamSubscriptionMetricSelectorGetArgs>? MetricSelector { get; set; }

        /// <summary>
        /// Customer-provided stream subscription name
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The details of the subscriber to the Equinix Stream
        /// </summary>
        [Input("sink")]
        public Input<Inputs.StreamSubscriptionSinkGetArgs>? Sink { get; set; }

        /// <summary>
        /// Value representing provisioning status for the stream resource
        /// </summary>
        [Input("state")]
        public Input<string>? State { get; set; }

        /// <summary>
        /// The uuid of the stream that is the target of the stream subscription
        /// </summary>
        [Input("streamId")]
        public Input<string>? StreamId { get; set; }

        [Input("timeouts")]
        public Input<Inputs.StreamSubscriptionTimeoutsGetArgs>? Timeouts { get; set; }

        /// <summary>
        /// Type of the stream subscription request
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        /// <summary>
        /// Equinix assigned unique identifier of the stream subscription resource
        /// </summary>
        [Input("uuid")]
        public Input<string>? Uuid { get; set; }

        public StreamSubscriptionState()
        {
        }
        public static new StreamSubscriptionState Empty => new StreamSubscriptionState();
    }
}
