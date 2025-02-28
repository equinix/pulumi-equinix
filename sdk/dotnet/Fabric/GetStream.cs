// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Equinix.Fabric
{
    public static class GetStream
    {
        /// <summary>
        /// Fabric V4 API compatible data resource that allow user to fetch Equinix Fabric Stream by UUID
        /// 
        /// Additional Documentation:
        /// * Getting Started: https://docs.equinix.com/en-us/Content/KnowledgeCenter/Fabric/GettingStarted/Integrating-with-Fabric-V4-APIs/IntegrateWithSink.htm
        /// * API: https://developer.equinix.com/catalog/fabricv4#tag/Streams
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Equinix = Pulumi.Equinix;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var dataStream = Equinix.Fabric.GetStream.Invoke(new()
        ///     {
        ///         StreamId = "&lt;uuid_of_stream&gt;",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["streamState"] = dataStream.Apply(getStreamResult =&gt; getStreamResult.State),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetStreamResult> InvokeAsync(GetStreamArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetStreamResult>("equinix:fabric/getStream:getStream", args ?? new GetStreamArgs(), options.WithDefaults());

        /// <summary>
        /// Fabric V4 API compatible data resource that allow user to fetch Equinix Fabric Stream by UUID
        /// 
        /// Additional Documentation:
        /// * Getting Started: https://docs.equinix.com/en-us/Content/KnowledgeCenter/Fabric/GettingStarted/Integrating-with-Fabric-V4-APIs/IntegrateWithSink.htm
        /// * API: https://developer.equinix.com/catalog/fabricv4#tag/Streams
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Equinix = Pulumi.Equinix;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var dataStream = Equinix.Fabric.GetStream.Invoke(new()
        ///     {
        ///         StreamId = "&lt;uuid_of_stream&gt;",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["streamState"] = dataStream.Apply(getStreamResult =&gt; getStreamResult.State),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetStreamResult> Invoke(GetStreamInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetStreamResult>("equinix:fabric/getStream:getStream", args ?? new GetStreamInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetStreamArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The uuid of the stream this data source should retrieve
        /// </summary>
        [Input("streamId", required: true)]
        public string StreamId { get; set; } = null!;

        public GetStreamArgs()
        {
        }
        public static new GetStreamArgs Empty => new GetStreamArgs();
    }

    public sealed class GetStreamInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The uuid of the stream this data source should retrieve
        /// </summary>
        [Input("streamId", required: true)]
        public Input<string> StreamId { get; set; } = null!;

        public GetStreamInvokeArgs()
        {
        }
        public static new GetStreamInvokeArgs Empty => new GetStreamInvokeArgs();
    }


    [OutputType]
    public sealed class GetStreamResult
    {
        /// <summary>
        /// Count of the streaming assets attached to the stream resource
        /// </summary>
        public readonly double AssetsCount;
        /// <summary>
        /// Details of the last change on the stream resource
        /// </summary>
        public readonly Outputs.GetStreamChangeLogResult ChangeLog;
        /// <summary>
        /// Customer-provided description of the stream resource
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// Equinix auto generated URI to the stream resource in Equinix Portal
        /// </summary>
        public readonly string Href;
        /// <summary>
        /// The unique identifier of the resource
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Customer-provided name of the stream resource
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Equinix Project attribute object
        /// </summary>
        public readonly Outputs.GetStreamProjectResult Project;
        /// <summary>
        /// Value representing provisioning status for the stream resource
        /// </summary>
        public readonly string State;
        /// <summary>
        /// The uuid of the stream this data source should retrieve
        /// </summary>
        public readonly string StreamId;
        /// <summary>
        /// Count of the client subscriptions on the stream resource
        /// </summary>
        public readonly double StreamSubscriptionsCount;
        /// <summary>
        /// Equinix defined Streaming Type
        /// </summary>
        public readonly string Type;
        /// <summary>
        /// Equinix-assigned unique id for the stream resource
        /// </summary>
        public readonly string Uuid;

        [OutputConstructor]
        private GetStreamResult(
            double assetsCount,

            Outputs.GetStreamChangeLogResult changeLog,

            string description,

            string href,

            string id,

            string name,

            Outputs.GetStreamProjectResult project,

            string state,

            string streamId,

            double streamSubscriptionsCount,

            string type,

            string uuid)
        {
            AssetsCount = assetsCount;
            ChangeLog = changeLog;
            Description = description;
            Href = href;
            Id = id;
            Name = name;
            Project = project;
            State = state;
            StreamId = streamId;
            StreamSubscriptionsCount = streamSubscriptionsCount;
            Type = type;
            Uuid = uuid;
        }
    }
}
