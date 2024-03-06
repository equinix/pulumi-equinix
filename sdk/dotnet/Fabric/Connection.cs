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
    /// Fabric V4 API compatible resource allows creation and management of Equinix Fabric connection
    /// 
    /// ## Example Usage
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Equinix = Pulumi.Equinix;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var config = new Config();
    ///     var metro = config.Get("metro") ?? "FR";
    ///     var speedInMbps = config.GetNumber("speedInMbps") ?? 50;
    ///     var fabricPortName = config.Require("fabricPortName");
    ///     var awsRegion = config.Get("awsRegion") ?? "eu-central-1";
    ///     var awsAccountId = config.Require("awsAccountId");
    ///     var serviceProfileId = Equinix.Fabric.GetServiceProfiles.Invoke(new()
    ///     {
    ///         Filter = new Equinix.Fabric.Inputs.GetServiceProfilesFilterInputArgs
    ///         {
    ///             Property = "/name",
    ///             Operator = "=",
    ///             Values = new[]
    ///             {
    ///                 "AWS Direct Connect",
    ///             },
    ///         },
    ///     }).Apply(invoke =&gt; invoke.Data[0]?.Uuid);
    /// 
    ///     var portId = Equinix.Fabric.GetPorts.Invoke(new()
    ///     {
    ///         Filter = new Equinix.Fabric.Inputs.GetPortsFilterInputArgs
    ///         {
    ///             Name = fabricPortName,
    ///         },
    ///     }).Apply(invoke =&gt; invoke.Data[0]?.Uuid);
    /// 
    ///     var colo2Aws = new Equinix.Fabric.Connection("colo2Aws", new()
    ///     {
    ///         Name = "Pulumi-colo2Aws",
    ///         Type = "EVPL_VC",
    ///         Notifications = new[]
    ///         {
    ///             new Equinix.Fabric.Inputs.ConnectionNotificationArgs
    ///             {
    ///                 Type = "ALL",
    ///                 Emails = new[]
    ///                 {
    ///                     "example@equinix.com",
    ///                 },
    ///             },
    ///         },
    ///         Bandwidth = speedInMbps,
    ///         Redundancy = new Equinix.Fabric.Inputs.ConnectionRedundancyArgs
    ///         {
    ///             Priority = "PRIMARY",
    ///         },
    ///         ASide = new Equinix.Fabric.Inputs.ConnectionASideArgs
    ///         {
    ///             AccessPoint = new Equinix.Fabric.Inputs.ConnectionASideAccessPointArgs
    ///             {
    ///                 Type = "COLO",
    ///                 Port = new Equinix.Fabric.Inputs.ConnectionASideAccessPointPortArgs
    ///                 {
    ///                     Uuid = portId,
    ///                 },
    ///                 LinkProtocol = new Equinix.Fabric.Inputs.ConnectionASideAccessPointLinkProtocolArgs
    ///                 {
    ///                     Type = "DOT1Q",
    ///                     VlanTag = 1234,
    ///                 },
    ///             },
    ///         },
    ///         ZSide = new Equinix.Fabric.Inputs.ConnectionZSideArgs
    ///         {
    ///             AccessPoint = new Equinix.Fabric.Inputs.ConnectionZSideAccessPointArgs
    ///             {
    ///                 Type = "SP",
    ///                 AuthenticationKey = awsAccountId,
    ///                 SellerRegion = awsRegion,
    ///                 Profile = new Equinix.Fabric.Inputs.ConnectionZSideAccessPointProfileArgs
    ///                 {
    ///                     Type = "L2_PROFILE",
    ///                     Uuid = serviceProfileId,
    ///                 },
    ///                 Location = new Equinix.Fabric.Inputs.ConnectionZSideAccessPointLocationArgs
    ///                 {
    ///                     MetroCode = metro,
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    ///     return new Dictionary&lt;string, object?&gt;
    ///     {
    ///         ["connectionId"] = colo2Aws.Id,
    ///         ["connectionStatus"] = colo2Aws.Operation.Apply(operation =&gt; operation.EquinixStatus),
    ///         ["connectionProviderStatus"] = colo2Aws.Operation.Apply(operation =&gt; operation.ProviderStatus),
    ///         ["awsDirectConnectId"] = colo2Aws.ZSide.Apply(zSide =&gt; zSide.AccessPoint?.ProviderConnectionId),
    ///     };
    /// });
    /// ```
    /// </summary>
    [EquinixResourceType("equinix:fabric/connection:Connection")]
    public partial class Connection : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Requester or Customer side connection configuration object of the multi-segment connection
        /// </summary>
        [Output("aSide")]
        public Output<Outputs.ConnectionASide> ASide { get; private set; } = null!;

        /// <summary>
        /// Account
        /// </summary>
        [Output("account")]
        public Output<Outputs.ConnectionAccount> Account { get; private set; } = null!;

        /// <summary>
        /// Connection side additional information
        /// </summary>
        [Output("additionalInfo")]
        public Output<ImmutableArray<ImmutableDictionary<string, object>>> AdditionalInfo { get; private set; } = null!;

        /// <summary>
        /// Connection bandwidth in Mbps
        /// </summary>
        [Output("bandwidth")]
        public Output<int> Bandwidth { get; private set; } = null!;

        /// <summary>
        /// Captures connection lifecycle change information
        /// </summary>
        [Output("changeLog")]
        public Output<Outputs.ConnectionChangeLog> ChangeLog { get; private set; } = null!;

        /// <summary>
        /// User-provided service description
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// Connection directionality from the requester point of view
        /// </summary>
        [Output("direction")]
        public Output<string> Direction { get; private set; } = null!;

        /// <summary>
        /// Unique Resource Identifier
        /// </summary>
        [Output("href")]
        public Output<string> Href { get; private set; } = null!;

        /// <summary>
        /// Connection property derived from access point locations
        /// </summary>
        [Output("isRemote")]
        public Output<bool> IsRemote { get; private set; } = null!;

        /// <summary>
        /// Port name
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Preferences for notifications on connection configuration or status changes
        /// </summary>
        [Output("notifications")]
        public Output<ImmutableArray<Outputs.ConnectionNotification>> Notifications { get; private set; } = null!;

        /// <summary>
        /// Connection type-specific operational data
        /// </summary>
        [Output("operation")]
        public Output<Outputs.ConnectionOperation> Operation { get; private set; } = null!;

        /// <summary>
        /// Order details
        /// </summary>
        [Output("order")]
        public Output<Outputs.ConnectionOrder> Order { get; private set; } = null!;

        /// <summary>
        /// Project information
        /// </summary>
        [Output("project")]
        public Output<Outputs.ConnectionProject> Project { get; private set; } = null!;

        /// <summary>
        /// Redundancy Information
        /// </summary>
        [Output("redundancy")]
        public Output<Outputs.ConnectionRedundancy?> Redundancy { get; private set; } = null!;

        /// <summary>
        /// Connection overall state
        /// </summary>
        [Output("state")]
        public Output<string> State { get; private set; } = null!;

        /// <summary>
        /// Interface type
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;

        /// <summary>
        /// Equinix-assigned virtual gateway identifier
        /// </summary>
        [Output("uuid")]
        public Output<string> Uuid { get; private set; } = null!;

        /// <summary>
        /// Destination or Provider side connection configuration object of the multi-segment connection
        /// </summary>
        [Output("zSide")]
        public Output<Outputs.ConnectionZSide> ZSide { get; private set; } = null!;


        /// <summary>
        /// Create a Connection resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Connection(string name, ConnectionArgs args, CustomResourceOptions? options = null)
            : base("equinix:fabric/connection:Connection", name, args ?? new ConnectionArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Connection(string name, Input<string> id, ConnectionState? state = null, CustomResourceOptions? options = null)
            : base("equinix:fabric/connection:Connection", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Connection resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Connection Get(string name, Input<string> id, ConnectionState? state = null, CustomResourceOptions? options = null)
        {
            return new Connection(name, id, state, options);
        }
    }

    public sealed class ConnectionArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Requester or Customer side connection configuration object of the multi-segment connection
        /// </summary>
        [Input("aSide", required: true)]
        public Input<Inputs.ConnectionASideArgs> ASide { get; set; } = null!;

        [Input("additionalInfo")]
        private InputList<ImmutableDictionary<string, object>>? _additionalInfo;

        /// <summary>
        /// Connection side additional information
        /// </summary>
        public InputList<ImmutableDictionary<string, object>> AdditionalInfo
        {
            get => _additionalInfo ?? (_additionalInfo = new InputList<ImmutableDictionary<string, object>>());
            set => _additionalInfo = value;
        }

        /// <summary>
        /// Connection bandwidth in Mbps
        /// </summary>
        [Input("bandwidth", required: true)]
        public Input<int> Bandwidth { get; set; } = null!;

        /// <summary>
        /// User-provided service description
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Port name
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("notifications", required: true)]
        private InputList<Inputs.ConnectionNotificationArgs>? _notifications;

        /// <summary>
        /// Preferences for notifications on connection configuration or status changes
        /// </summary>
        public InputList<Inputs.ConnectionNotificationArgs> Notifications
        {
            get => _notifications ?? (_notifications = new InputList<Inputs.ConnectionNotificationArgs>());
            set => _notifications = value;
        }

        /// <summary>
        /// Order details
        /// </summary>
        [Input("order", required: true)]
        public Input<Inputs.ConnectionOrderArgs> Order { get; set; } = null!;

        /// <summary>
        /// Project information
        /// </summary>
        [Input("project")]
        public Input<Inputs.ConnectionProjectArgs>? Project { get; set; }

        /// <summary>
        /// Redundancy Information
        /// </summary>
        [Input("redundancy")]
        public Input<Inputs.ConnectionRedundancyArgs>? Redundancy { get; set; }

        /// <summary>
        /// Interface type
        /// </summary>
        [Input("type", required: true)]
        public InputUnion<string, Pulumi.Equinix.Fabric.ConnectionType> Type { get; set; } = null!;

        /// <summary>
        /// Destination or Provider side connection configuration object of the multi-segment connection
        /// </summary>
        [Input("zSide", required: true)]
        public Input<Inputs.ConnectionZSideArgs> ZSide { get; set; } = null!;

        public ConnectionArgs()
        {
        }
        public static new ConnectionArgs Empty => new ConnectionArgs();
    }

    public sealed class ConnectionState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Requester or Customer side connection configuration object of the multi-segment connection
        /// </summary>
        [Input("aSide")]
        public Input<Inputs.ConnectionASideGetArgs>? ASide { get; set; }

        /// <summary>
        /// Account
        /// </summary>
        [Input("account")]
        public Input<Inputs.ConnectionAccountGetArgs>? Account { get; set; }

        [Input("additionalInfo")]
        private InputList<ImmutableDictionary<string, object>>? _additionalInfo;

        /// <summary>
        /// Connection side additional information
        /// </summary>
        public InputList<ImmutableDictionary<string, object>> AdditionalInfo
        {
            get => _additionalInfo ?? (_additionalInfo = new InputList<ImmutableDictionary<string, object>>());
            set => _additionalInfo = value;
        }

        /// <summary>
        /// Connection bandwidth in Mbps
        /// </summary>
        [Input("bandwidth")]
        public Input<int>? Bandwidth { get; set; }

        /// <summary>
        /// Captures connection lifecycle change information
        /// </summary>
        [Input("changeLog")]
        public Input<Inputs.ConnectionChangeLogGetArgs>? ChangeLog { get; set; }

        /// <summary>
        /// User-provided service description
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Connection directionality from the requester point of view
        /// </summary>
        [Input("direction")]
        public Input<string>? Direction { get; set; }

        /// <summary>
        /// Unique Resource Identifier
        /// </summary>
        [Input("href")]
        public Input<string>? Href { get; set; }

        /// <summary>
        /// Connection property derived from access point locations
        /// </summary>
        [Input("isRemote")]
        public Input<bool>? IsRemote { get; set; }

        /// <summary>
        /// Port name
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("notifications")]
        private InputList<Inputs.ConnectionNotificationGetArgs>? _notifications;

        /// <summary>
        /// Preferences for notifications on connection configuration or status changes
        /// </summary>
        public InputList<Inputs.ConnectionNotificationGetArgs> Notifications
        {
            get => _notifications ?? (_notifications = new InputList<Inputs.ConnectionNotificationGetArgs>());
            set => _notifications = value;
        }

        /// <summary>
        /// Connection type-specific operational data
        /// </summary>
        [Input("operation")]
        public Input<Inputs.ConnectionOperationGetArgs>? Operation { get; set; }

        /// <summary>
        /// Order details
        /// </summary>
        [Input("order")]
        public Input<Inputs.ConnectionOrderGetArgs>? Order { get; set; }

        /// <summary>
        /// Project information
        /// </summary>
        [Input("project")]
        public Input<Inputs.ConnectionProjectGetArgs>? Project { get; set; }

        /// <summary>
        /// Redundancy Information
        /// </summary>
        [Input("redundancy")]
        public Input<Inputs.ConnectionRedundancyGetArgs>? Redundancy { get; set; }

        /// <summary>
        /// Connection overall state
        /// </summary>
        [Input("state")]
        public Input<string>? State { get; set; }

        /// <summary>
        /// Interface type
        /// </summary>
        [Input("type")]
        public InputUnion<string, Pulumi.Equinix.Fabric.ConnectionType>? Type { get; set; }

        /// <summary>
        /// Equinix-assigned virtual gateway identifier
        /// </summary>
        [Input("uuid")]
        public Input<string>? Uuid { get; set; }

        /// <summary>
        /// Destination or Provider side connection configuration object of the multi-segment connection
        /// </summary>
        [Input("zSide")]
        public Input<Inputs.ConnectionZSideGetArgs>? ZSide { get; set; }

        public ConnectionState()
        {
        }
        public static new ConnectionState Empty => new ConnectionState();
    }
}
