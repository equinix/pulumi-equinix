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
    /// Fabric V4 API compatible resource allows creation and management of [Equinix Fabric Cloud Router](https://docs.equinix.com/en-us/Content/Interconnection/FCR/FCR-intro.htm#HowItWorks).
    /// 
    /// Additional documentation:
    /// * Getting Started: &lt;https://docs.equinix.com/en-us/Content/Interconnection/FCR/FCR-intro.htm#HowItWorks&gt;
    /// * API: &lt;https://developer.equinix.com/dev-docs/fabric/api-reference/fabric-v4-apis#fabric-cloud-routers&gt;
    /// 
    /// ## Example Usage
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Equinix = Pulumi.Equinix;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var config = new Config();
    ///     var metro = config.Get("metro") ?? "FR";
    ///     var accountNum = config.RequireInt32("accountNum");
    ///     var router = new Equinix.Fabric.CloudRouter("router", new()
    ///     {
    ///         Name = "My-Fabric-Cloud-Router",
    ///         Type = "XF_ROUTER",
    ///         Location = new Equinix.Fabric.Inputs.CloudRouterLocationArgs
    ///         {
    ///             MetroCode = metro,
    ///         },
    ///         Package = new Equinix.Fabric.Inputs.CloudRouterPackageArgs
    ///         {
    ///             Code = "BASIC",
    ///         },
    ///         Notifications = new[]
    ///         {
    ///             new Equinix.Fabric.Inputs.CloudRouterNotificationArgs
    ///             {
    ///                 Type = "ALL",
    ///                 Emails = new[]
    ///                 {
    ///                     "example@equinix.com",
    ///                 },
    ///             },
    ///         },
    ///         Account = new Equinix.Fabric.Inputs.CloudRouterAccountArgs
    ///         {
    ///             AccountNumber = 272010,
    ///         },
    ///         Project = new Equinix.Fabric.Inputs.CloudRouterProjectArgs
    ///         {
    ///             ProjectId = "995072000433550",
    ///         },
    ///     });
    /// 
    ///     return new Dictionary&lt;string, object?&gt;
    ///     {
    ///         ["routerId"] = router.Id,
    ///     };
    /// });
    /// ```
    /// </summary>
    [EquinixResourceType("equinix:fabric/cloudRouter:CloudRouter")]
    public partial class CloudRouter : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Customer account information that is associated with this Fabric Cloud Router
        /// </summary>
        [Output("account")]
        public Output<Outputs.CloudRouterAccount> Account { get; private set; } = null!;

        /// <summary>
        /// Number of IPv4 BGP routes in use (including non-distinct prefixes)
        /// </summary>
        [Output("bgpIpv4RoutesCount")]
        public Output<int> BgpIpv4RoutesCount { get; private set; } = null!;

        /// <summary>
        /// Number of IPv6 BGP routes in use (including non-distinct prefixes)
        /// </summary>
        [Output("bgpIpv6RoutesCount")]
        public Output<int> BgpIpv6RoutesCount { get; private set; } = null!;

        /// <summary>
        /// Captures Fabric Cloud Router lifecycle change information
        /// </summary>
        [Output("changeLogs")]
        public Output<ImmutableArray<Outputs.CloudRouterChangeLog>> ChangeLogs { get; private set; } = null!;

        /// <summary>
        /// Number of connections associated with this Fabric Cloud Router instance
        /// </summary>
        [Output("connectionsCount")]
        public Output<int> ConnectionsCount { get; private set; } = null!;

        /// <summary>
        /// Customer-provided Fabric Cloud Router description
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// Number of distinct IPv4 routes
        /// </summary>
        [Output("distinctIpv4PrefixesCount")]
        public Output<int> DistinctIpv4PrefixesCount { get; private set; } = null!;

        /// <summary>
        /// Number of distinct IPv6 routes
        /// </summary>
        [Output("distinctIpv6PrefixesCount")]
        public Output<int> DistinctIpv6PrefixesCount { get; private set; } = null!;

        /// <summary>
        /// Equinix ASN
        /// </summary>
        [Output("equinixAsn")]
        public Output<int> EquinixAsn { get; private set; } = null!;

        /// <summary>
        /// Fabric Cloud Router URI information
        /// </summary>
        [Output("href")]
        public Output<string> Href { get; private set; } = null!;

        /// <summary>
        /// Fabric Cloud Router location
        /// </summary>
        [Output("location")]
        public Output<Outputs.CloudRouterLocation> Location { get; private set; } = null!;

        /// <summary>
        /// Fabric Cloud Router name. An alpha-numeric 24 characters string which can include only hyphens and underscores
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Preferences for notifications on Fabric Cloud Router configuration or status changes
        /// </summary>
        [Output("notifications")]
        public Output<ImmutableArray<Outputs.CloudRouterNotification>> Notifications { get; private set; } = null!;

        /// <summary>
        /// Order information related to this Fabric Cloud Router
        /// </summary>
        [Output("order")]
        public Output<Outputs.CloudRouterOrder> Order { get; private set; } = null!;

        /// <summary>
        /// Fabric Cloud Router Package Type
        /// </summary>
        [Output("package")]
        public Output<Outputs.CloudRouterPackage> Package { get; private set; } = null!;

        /// <summary>
        /// Customer resource hierarchy project information. Applicable to customers onboarded to Equinix Identity and Access Management. For more information see Identity and Access Management: Projects
        /// </summary>
        [Output("project")]
        public Output<Outputs.CloudRouterProject> Project { get; private set; } = null!;

        /// <summary>
        /// Fabric Cloud Router overall state
        /// </summary>
        [Output("state")]
        public Output<string> State { get; private set; } = null!;

        /// <summary>
        /// Defines the FCR type like; XF_ROUTER
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;

        /// <summary>
        /// Equinix-assigned Fabric Cloud Router identifier
        /// </summary>
        [Output("uuid")]
        public Output<string> Uuid { get; private set; } = null!;


        /// <summary>
        /// Create a CloudRouter resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public CloudRouter(string name, CloudRouterArgs args, CustomResourceOptions? options = null)
            : base("equinix:fabric/cloudRouter:CloudRouter", name, args ?? new CloudRouterArgs(), MakeResourceOptions(options, ""))
        {
        }

        private CloudRouter(string name, Input<string> id, CloudRouterState? state = null, CustomResourceOptions? options = null)
            : base("equinix:fabric/cloudRouter:CloudRouter", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing CloudRouter resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static CloudRouter Get(string name, Input<string> id, CloudRouterState? state = null, CustomResourceOptions? options = null)
        {
            return new CloudRouter(name, id, state, options);
        }
    }

    public sealed class CloudRouterArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Customer account information that is associated with this Fabric Cloud Router
        /// </summary>
        [Input("account", required: true)]
        public Input<Inputs.CloudRouterAccountArgs> Account { get; set; } = null!;

        /// <summary>
        /// Customer-provided Fabric Cloud Router description
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Fabric Cloud Router URI information
        /// </summary>
        [Input("href")]
        public Input<string>? Href { get; set; }

        /// <summary>
        /// Fabric Cloud Router location
        /// </summary>
        [Input("location", required: true)]
        public Input<Inputs.CloudRouterLocationArgs> Location { get; set; } = null!;

        /// <summary>
        /// Fabric Cloud Router name. An alpha-numeric 24 characters string which can include only hyphens and underscores
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("notifications", required: true)]
        private InputList<Inputs.CloudRouterNotificationArgs>? _notifications;

        /// <summary>
        /// Preferences for notifications on Fabric Cloud Router configuration or status changes
        /// </summary>
        public InputList<Inputs.CloudRouterNotificationArgs> Notifications
        {
            get => _notifications ?? (_notifications = new InputList<Inputs.CloudRouterNotificationArgs>());
            set => _notifications = value;
        }

        /// <summary>
        /// Order information related to this Fabric Cloud Router
        /// </summary>
        [Input("order")]
        public Input<Inputs.CloudRouterOrderArgs>? Order { get; set; }

        /// <summary>
        /// Fabric Cloud Router Package Type
        /// </summary>
        [Input("package", required: true)]
        public Input<Inputs.CloudRouterPackageArgs> Package { get; set; } = null!;

        /// <summary>
        /// Customer resource hierarchy project information. Applicable to customers onboarded to Equinix Identity and Access Management. For more information see Identity and Access Management: Projects
        /// </summary>
        [Input("project", required: true)]
        public Input<Inputs.CloudRouterProjectArgs> Project { get; set; } = null!;

        /// <summary>
        /// Defines the FCR type like; XF_ROUTER
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        /// <summary>
        /// Equinix-assigned Fabric Cloud Router identifier
        /// </summary>
        [Input("uuid")]
        public Input<string>? Uuid { get; set; }

        public CloudRouterArgs()
        {
        }
        public static new CloudRouterArgs Empty => new CloudRouterArgs();
    }

    public sealed class CloudRouterState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Customer account information that is associated with this Fabric Cloud Router
        /// </summary>
        [Input("account")]
        public Input<Inputs.CloudRouterAccountGetArgs>? Account { get; set; }

        /// <summary>
        /// Number of IPv4 BGP routes in use (including non-distinct prefixes)
        /// </summary>
        [Input("bgpIpv4RoutesCount")]
        public Input<int>? BgpIpv4RoutesCount { get; set; }

        /// <summary>
        /// Number of IPv6 BGP routes in use (including non-distinct prefixes)
        /// </summary>
        [Input("bgpIpv6RoutesCount")]
        public Input<int>? BgpIpv6RoutesCount { get; set; }

        [Input("changeLogs")]
        private InputList<Inputs.CloudRouterChangeLogGetArgs>? _changeLogs;

        /// <summary>
        /// Captures Fabric Cloud Router lifecycle change information
        /// </summary>
        public InputList<Inputs.CloudRouterChangeLogGetArgs> ChangeLogs
        {
            get => _changeLogs ?? (_changeLogs = new InputList<Inputs.CloudRouterChangeLogGetArgs>());
            set => _changeLogs = value;
        }

        /// <summary>
        /// Number of connections associated with this Fabric Cloud Router instance
        /// </summary>
        [Input("connectionsCount")]
        public Input<int>? ConnectionsCount { get; set; }

        /// <summary>
        /// Customer-provided Fabric Cloud Router description
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Number of distinct IPv4 routes
        /// </summary>
        [Input("distinctIpv4PrefixesCount")]
        public Input<int>? DistinctIpv4PrefixesCount { get; set; }

        /// <summary>
        /// Number of distinct IPv6 routes
        /// </summary>
        [Input("distinctIpv6PrefixesCount")]
        public Input<int>? DistinctIpv6PrefixesCount { get; set; }

        /// <summary>
        /// Equinix ASN
        /// </summary>
        [Input("equinixAsn")]
        public Input<int>? EquinixAsn { get; set; }

        /// <summary>
        /// Fabric Cloud Router URI information
        /// </summary>
        [Input("href")]
        public Input<string>? Href { get; set; }

        /// <summary>
        /// Fabric Cloud Router location
        /// </summary>
        [Input("location")]
        public Input<Inputs.CloudRouterLocationGetArgs>? Location { get; set; }

        /// <summary>
        /// Fabric Cloud Router name. An alpha-numeric 24 characters string which can include only hyphens and underscores
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("notifications")]
        private InputList<Inputs.CloudRouterNotificationGetArgs>? _notifications;

        /// <summary>
        /// Preferences for notifications on Fabric Cloud Router configuration or status changes
        /// </summary>
        public InputList<Inputs.CloudRouterNotificationGetArgs> Notifications
        {
            get => _notifications ?? (_notifications = new InputList<Inputs.CloudRouterNotificationGetArgs>());
            set => _notifications = value;
        }

        /// <summary>
        /// Order information related to this Fabric Cloud Router
        /// </summary>
        [Input("order")]
        public Input<Inputs.CloudRouterOrderGetArgs>? Order { get; set; }

        /// <summary>
        /// Fabric Cloud Router Package Type
        /// </summary>
        [Input("package")]
        public Input<Inputs.CloudRouterPackageGetArgs>? Package { get; set; }

        /// <summary>
        /// Customer resource hierarchy project information. Applicable to customers onboarded to Equinix Identity and Access Management. For more information see Identity and Access Management: Projects
        /// </summary>
        [Input("project")]
        public Input<Inputs.CloudRouterProjectGetArgs>? Project { get; set; }

        /// <summary>
        /// Fabric Cloud Router overall state
        /// </summary>
        [Input("state")]
        public Input<string>? State { get; set; }

        /// <summary>
        /// Defines the FCR type like; XF_ROUTER
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        /// <summary>
        /// Equinix-assigned Fabric Cloud Router identifier
        /// </summary>
        [Input("uuid")]
        public Input<string>? Uuid { get; set; }

        public CloudRouterState()
        {
        }
        public static new CloudRouterState Empty => new CloudRouterState();
    }
}
