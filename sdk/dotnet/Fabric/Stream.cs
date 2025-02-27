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
    /// Fabric V4 API compatible resource allows creation and management of Equinix Fabric Stream
    /// 
    /// Additional Documentation:
    /// * Getting Started: https://docs.equinix.com/en-us/Content/KnowledgeCenter/Fabric/GettingStarted/Integrating-with-Fabric-V4-APIs/IntegrateWithSink.htm
    /// * API: https://developer.equinix.com/catalog/fabricv4#tag/Streams
    /// </summary>
    [EquinixResourceType("equinix:fabric/stream:Stream")]
    public partial class Stream : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Count of the streaming assets attached to the stream resource
        /// </summary>
        [Output("assetsCount")]
        public Output<double> AssetsCount { get; private set; } = null!;

        /// <summary>
        /// Details of the last change on the stream resource
        /// </summary>
        [Output("changeLog")]
        public Output<Outputs.StreamChangeLog> ChangeLog { get; private set; } = null!;

        /// <summary>
        /// Customer-provided description of the stream resource
        /// </summary>
        [Output("description")]
        public Output<string> Description { get; private set; } = null!;

        /// <summary>
        /// Equinix auto generated URI to the stream resource in Equinix Portal
        /// </summary>
        [Output("href")]
        public Output<string> Href { get; private set; } = null!;

        /// <summary>
        /// Customer-provided name of the stream resource
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Equinix Project attribute object
        /// </summary>
        [Output("project")]
        public Output<Outputs.StreamProject> Project { get; private set; } = null!;

        /// <summary>
        /// Value representing provisioning status for the stream resource
        /// </summary>
        [Output("state")]
        public Output<string> State { get; private set; } = null!;

        /// <summary>
        /// Count of the client subscriptions on the stream resource
        /// </summary>
        [Output("streamSubscriptionsCount")]
        public Output<double> StreamSubscriptionsCount { get; private set; } = null!;

        [Output("timeouts")]
        public Output<Outputs.StreamTimeouts?> Timeouts { get; private set; } = null!;

        /// <summary>
        /// Equinix defined Streaming Type
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;

        /// <summary>
        /// Equinix-assigned unique id for the stream resource
        /// </summary>
        [Output("uuid")]
        public Output<string> Uuid { get; private set; } = null!;


        /// <summary>
        /// Create a Stream resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Stream(string name, StreamArgs args, CustomResourceOptions? options = null)
            : base("equinix:fabric/stream:Stream", name, args ?? new StreamArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Stream(string name, Input<string> id, StreamState? state = null, CustomResourceOptions? options = null)
            : base("equinix:fabric/stream:Stream", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Stream resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Stream Get(string name, Input<string> id, StreamState? state = null, CustomResourceOptions? options = null)
        {
            return new Stream(name, id, state, options);
        }
    }

    public sealed class StreamArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Customer-provided description of the stream resource
        /// </summary>
        [Input("description", required: true)]
        public Input<string> Description { get; set; } = null!;

        /// <summary>
        /// Customer-provided name of the stream resource
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Equinix Project attribute object
        /// </summary>
        [Input("project")]
        public Input<Inputs.StreamProjectArgs>? Project { get; set; }

        [Input("timeouts")]
        public Input<Inputs.StreamTimeoutsArgs>? Timeouts { get; set; }

        /// <summary>
        /// Equinix defined Streaming Type
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public StreamArgs()
        {
        }
        public static new StreamArgs Empty => new StreamArgs();
    }

    public sealed class StreamState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Count of the streaming assets attached to the stream resource
        /// </summary>
        [Input("assetsCount")]
        public Input<double>? AssetsCount { get; set; }

        /// <summary>
        /// Details of the last change on the stream resource
        /// </summary>
        [Input("changeLog")]
        public Input<Inputs.StreamChangeLogGetArgs>? ChangeLog { get; set; }

        /// <summary>
        /// Customer-provided description of the stream resource
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Equinix auto generated URI to the stream resource in Equinix Portal
        /// </summary>
        [Input("href")]
        public Input<string>? Href { get; set; }

        /// <summary>
        /// Customer-provided name of the stream resource
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Equinix Project attribute object
        /// </summary>
        [Input("project")]
        public Input<Inputs.StreamProjectGetArgs>? Project { get; set; }

        /// <summary>
        /// Value representing provisioning status for the stream resource
        /// </summary>
        [Input("state")]
        public Input<string>? State { get; set; }

        /// <summary>
        /// Count of the client subscriptions on the stream resource
        /// </summary>
        [Input("streamSubscriptionsCount")]
        public Input<double>? StreamSubscriptionsCount { get; set; }

        [Input("timeouts")]
        public Input<Inputs.StreamTimeoutsGetArgs>? Timeouts { get; set; }

        /// <summary>
        /// Equinix defined Streaming Type
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        /// <summary>
        /// Equinix-assigned unique id for the stream resource
        /// </summary>
        [Input("uuid")]
        public Input<string>? Uuid { get; set; }

        public StreamState()
        {
        }
        public static new StreamState Empty => new StreamState();
    }
}
