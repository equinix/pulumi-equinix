// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Equinix.NetworkEdge
{
    /// <summary>
    /// Resource `equinix.networkedge.NetworkFile` allows creation and management of Equinix Network Edge files.
    /// 
    /// ## Example Usage
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Equinix = Pulumi.Equinix;
    /// using Std = Pulumi.Std;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var config = new Config();
    ///     var filepath = config.Get("filepath") ?? "fileFolder/fileName.txt";
    ///     var testFile = new Equinix.NetworkEdge.NetworkFile("test-file", new()
    ///     {
    ///         FileName = "fileName.txt",
    ///         Content = Std.File.Invoke(new()
    ///         {
    ///             Input = filepath,
    ///         }).Apply(invoke =&gt; invoke.Result),
    ///         MetroCode = Equinix.Metro.SiliconValley,
    ///         DeviceTypeCode = "AVIATRIX_EDGE",
    ///         ProcessType = Equinix.NetworkEdge.FileType.CloudInit,
    ///         SelfManaged = true,
    ///         Byol = true,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// This resource can be imported using an existing ID:
    /// 
    /// ```sh
    /// $ pulumi import equinix:networkedge/networkFile:NetworkFile example {existing_id}
    /// ```
    /// 
    /// The `content`, `self_managed` and `byol` fields can not be imported.
    /// </summary>
    [EquinixResourceType("equinix:networkedge/networkFile:NetworkFile")]
    public partial class NetworkFile : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Boolean value that determines device licensing mode, i.e., `bring your own license` or `subscription`.
        /// </summary>
        [Output("byol")]
        public Output<bool> Byol { get; private set; } = null!;

        /// <summary>
        /// Uploaded file content, expected to be a UTF-8 encoded string.
        /// </summary>
        [Output("content")]
        public Output<string> Content { get; private set; } = null!;

        /// <summary>
        /// Device type code
        /// </summary>
        [Output("deviceTypeCode")]
        public Output<string> DeviceTypeCode { get; private set; } = null!;

        /// <summary>
        /// File name.
        /// </summary>
        [Output("fileName")]
        public Output<string> FileName { get; private set; } = null!;

        /// <summary>
        /// File upload location metro code. It should match the device location metro code.
        /// </summary>
        [Output("metroCode")]
        public Output<string> MetroCode { get; private set; } = null!;

        /// <summary>
        /// File process type (LICENSE or CLOUD_INIT).
        /// </summary>
        [Output("processType")]
        public Output<string> ProcessType { get; private set; } = null!;

        /// <summary>
        /// Boolean value that determines device management mode, i.e., `self-managed` or `Equinix-managed`.
        /// </summary>
        [Output("selfManaged")]
        public Output<bool> SelfManaged { get; private set; } = null!;

        /// <summary>
        /// File upload status.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;

        /// <summary>
        /// Unique identifier of file resource.
        /// </summary>
        [Output("uuid")]
        public Output<string> Uuid { get; private set; } = null!;


        /// <summary>
        /// Create a NetworkFile resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public NetworkFile(string name, NetworkFileArgs args, CustomResourceOptions? options = null)
            : base("equinix:networkedge/networkFile:NetworkFile", name, args ?? new NetworkFileArgs(), MakeResourceOptions(options, ""))
        {
        }

        private NetworkFile(string name, Input<string> id, NetworkFileState? state = null, CustomResourceOptions? options = null)
            : base("equinix:networkedge/networkFile:NetworkFile", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                PluginDownloadURL = "github://api.github.com/equinix",
                AdditionalSecretOutputs =
                {
                    "content",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing NetworkFile resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static NetworkFile Get(string name, Input<string> id, NetworkFileState? state = null, CustomResourceOptions? options = null)
        {
            return new NetworkFile(name, id, state, options);
        }
    }

    public sealed class NetworkFileArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Boolean value that determines device licensing mode, i.e., `bring your own license` or `subscription`.
        /// </summary>
        [Input("byol", required: true)]
        public Input<bool> Byol { get; set; } = null!;

        [Input("content", required: true)]
        private Input<string>? _content;

        /// <summary>
        /// Uploaded file content, expected to be a UTF-8 encoded string.
        /// </summary>
        public Input<string>? Content
        {
            get => _content;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _content = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Device type code
        /// </summary>
        [Input("deviceTypeCode", required: true)]
        public Input<string> DeviceTypeCode { get; set; } = null!;

        /// <summary>
        /// File name.
        /// </summary>
        [Input("fileName", required: true)]
        public Input<string> FileName { get; set; } = null!;

        /// <summary>
        /// File upload location metro code. It should match the device location metro code.
        /// </summary>
        [Input("metroCode", required: true)]
        public InputUnion<string, Pulumi.Equinix.Metro> MetroCode { get; set; } = null!;

        /// <summary>
        /// File process type (LICENSE or CLOUD_INIT).
        /// </summary>
        [Input("processType", required: true)]
        public InputUnion<string, Pulumi.Equinix.NetworkEdge.FileType> ProcessType { get; set; } = null!;

        /// <summary>
        /// Boolean value that determines device management mode, i.e., `self-managed` or `Equinix-managed`.
        /// </summary>
        [Input("selfManaged", required: true)]
        public Input<bool> SelfManaged { get; set; } = null!;

        public NetworkFileArgs()
        {
        }
        public static new NetworkFileArgs Empty => new NetworkFileArgs();
    }

    public sealed class NetworkFileState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Boolean value that determines device licensing mode, i.e., `bring your own license` or `subscription`.
        /// </summary>
        [Input("byol")]
        public Input<bool>? Byol { get; set; }

        [Input("content")]
        private Input<string>? _content;

        /// <summary>
        /// Uploaded file content, expected to be a UTF-8 encoded string.
        /// </summary>
        public Input<string>? Content
        {
            get => _content;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _content = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Device type code
        /// </summary>
        [Input("deviceTypeCode")]
        public Input<string>? DeviceTypeCode { get; set; }

        /// <summary>
        /// File name.
        /// </summary>
        [Input("fileName")]
        public Input<string>? FileName { get; set; }

        /// <summary>
        /// File upload location metro code. It should match the device location metro code.
        /// </summary>
        [Input("metroCode")]
        public InputUnion<string, Pulumi.Equinix.Metro>? MetroCode { get; set; }

        /// <summary>
        /// File process type (LICENSE or CLOUD_INIT).
        /// </summary>
        [Input("processType")]
        public InputUnion<string, Pulumi.Equinix.NetworkEdge.FileType>? ProcessType { get; set; }

        /// <summary>
        /// Boolean value that determines device management mode, i.e., `self-managed` or `Equinix-managed`.
        /// </summary>
        [Input("selfManaged")]
        public Input<bool>? SelfManaged { get; set; }

        /// <summary>
        /// File upload status.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        /// <summary>
        /// Unique identifier of file resource.
        /// </summary>
        [Input("uuid")]
        public Input<string>? Uuid { get; set; }

        public NetworkFileState()
        {
        }
        public static new NetworkFileState Empty => new NetworkFileState();
    }
}
