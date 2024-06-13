// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Equinix.Fabric
{
    public static class GetCloudRouter
    {
        /// <summary>
        /// Fabric V4 API compatible data resource that allow user to fetch Fabric Cloud Router for a given UUID
        /// 
        /// Additional documentation:
        /// * Getting Started: &lt;https://docs.equinix.com/en-us/Content/Interconnection/FCR/FCR-intro.htm#HowItWorks&gt;
        /// * API: &lt;https://developer.equinix.com/dev-docs/fabric/api-reference/fabric-v4-apis#fabric-cloud-routers&gt;
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
        ///     var cloudRouterDataName = Equinix.Fabric.GetCloudRouter.Invoke(new()
        ///     {
        ///         Uuid = "&lt;uuid_of_cloud_router&gt;",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["id"] = cloudRouterDataName.Apply(getCloudRouterResult =&gt; getCloudRouterResult.Id),
        ///         ["name"] = cloudRouterDataName.Apply(getCloudRouterResult =&gt; getCloudRouterResult.Name),
        ///         ["accountNumber"] = cloudRouterDataName.Apply(getCloudRouterResult =&gt; getCloudRouterResult.Accounts[0]?.AccountNumber),
        ///         ["equinixAsn"] = cloudRouterDataName.Apply(getCloudRouterResult =&gt; getCloudRouterResult.EquinixAsn),
        ///         ["metroCode"] = cloudRouterDataName.Apply(getCloudRouterResult =&gt; getCloudRouterResult.Locations[0]?.MetroCode),
        ///         ["metroName"] = cloudRouterDataName.Apply(getCloudRouterResult =&gt; getCloudRouterResult.Locations[0]?.MetroName),
        ///         ["region"] = cloudRouterDataName.Apply(getCloudRouterResult =&gt; getCloudRouterResult.Locations[0]?.Region),
        ///         ["packageCode"] = cloudRouterDataName.Apply(getCloudRouterResult =&gt; getCloudRouterResult.Packages[0]?.Code),
        ///         ["projectId"] = cloudRouterDataName.Apply(getCloudRouterResult =&gt; getCloudRouterResult.Projects[0]?.ProjectId),
        ///         ["type"] = cloudRouterDataName.Apply(getCloudRouterResult =&gt; getCloudRouterResult.Type),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetCloudRouterResult> InvokeAsync(GetCloudRouterArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetCloudRouterResult>("equinix:fabric/getCloudRouter:getCloudRouter", args ?? new GetCloudRouterArgs(), options.WithDefaults());

        /// <summary>
        /// Fabric V4 API compatible data resource that allow user to fetch Fabric Cloud Router for a given UUID
        /// 
        /// Additional documentation:
        /// * Getting Started: &lt;https://docs.equinix.com/en-us/Content/Interconnection/FCR/FCR-intro.htm#HowItWorks&gt;
        /// * API: &lt;https://developer.equinix.com/dev-docs/fabric/api-reference/fabric-v4-apis#fabric-cloud-routers&gt;
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
        ///     var cloudRouterDataName = Equinix.Fabric.GetCloudRouter.Invoke(new()
        ///     {
        ///         Uuid = "&lt;uuid_of_cloud_router&gt;",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["id"] = cloudRouterDataName.Apply(getCloudRouterResult =&gt; getCloudRouterResult.Id),
        ///         ["name"] = cloudRouterDataName.Apply(getCloudRouterResult =&gt; getCloudRouterResult.Name),
        ///         ["accountNumber"] = cloudRouterDataName.Apply(getCloudRouterResult =&gt; getCloudRouterResult.Accounts[0]?.AccountNumber),
        ///         ["equinixAsn"] = cloudRouterDataName.Apply(getCloudRouterResult =&gt; getCloudRouterResult.EquinixAsn),
        ///         ["metroCode"] = cloudRouterDataName.Apply(getCloudRouterResult =&gt; getCloudRouterResult.Locations[0]?.MetroCode),
        ///         ["metroName"] = cloudRouterDataName.Apply(getCloudRouterResult =&gt; getCloudRouterResult.Locations[0]?.MetroName),
        ///         ["region"] = cloudRouterDataName.Apply(getCloudRouterResult =&gt; getCloudRouterResult.Locations[0]?.Region),
        ///         ["packageCode"] = cloudRouterDataName.Apply(getCloudRouterResult =&gt; getCloudRouterResult.Packages[0]?.Code),
        ///         ["projectId"] = cloudRouterDataName.Apply(getCloudRouterResult =&gt; getCloudRouterResult.Projects[0]?.ProjectId),
        ///         ["type"] = cloudRouterDataName.Apply(getCloudRouterResult =&gt; getCloudRouterResult.Type),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetCloudRouterResult> Invoke(GetCloudRouterInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetCloudRouterResult>("equinix:fabric/getCloudRouter:getCloudRouter", args ?? new GetCloudRouterInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetCloudRouterArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Equinix-assigned Fabric Cloud Router identifier
        /// </summary>
        [Input("uuid", required: true)]
        public string Uuid { get; set; } = null!;

        public GetCloudRouterArgs()
        {
        }
        public static new GetCloudRouterArgs Empty => new GetCloudRouterArgs();
    }

    public sealed class GetCloudRouterInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Equinix-assigned Fabric Cloud Router identifier
        /// </summary>
        [Input("uuid", required: true)]
        public Input<string> Uuid { get; set; } = null!;

        public GetCloudRouterInvokeArgs()
        {
        }
        public static new GetCloudRouterInvokeArgs Empty => new GetCloudRouterInvokeArgs();
    }


    [OutputType]
    public sealed class GetCloudRouterResult
    {
        /// <summary>
        /// Customer account information that is associated with this Fabric Cloud Router
        /// </summary>
        public readonly ImmutableArray<Outputs.GetCloudRouterAccountResult> Accounts;
        /// <summary>
        /// Number of IPv4 BGP routes in use (including non-distinct prefixes)
        /// </summary>
        public readonly int BgpIpv4RoutesCount;
        /// <summary>
        /// Number of IPv6 BGP routes in use (including non-distinct prefixes)
        /// </summary>
        public readonly int BgpIpv6RoutesCount;
        /// <summary>
        /// Captures Fabric Cloud Router lifecycle change information
        /// </summary>
        public readonly ImmutableArray<Outputs.GetCloudRouterChangeLogResult> ChangeLogs;
        /// <summary>
        /// Number of connections associated with this Fabric Cloud Router instance
        /// </summary>
        public readonly int ConnectionsCount;
        /// <summary>
        /// Customer-provided Fabric Cloud Router description
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// Number of distinct IPv4 routes
        /// </summary>
        public readonly int DistinctIpv4PrefixesCount;
        /// <summary>
        /// Number of distinct IPv6 routes
        /// </summary>
        public readonly int DistinctIpv6PrefixesCount;
        /// <summary>
        /// Equinix ASN
        /// </summary>
        public readonly int EquinixAsn;
        /// <summary>
        /// Fabric Cloud Router URI information
        /// </summary>
        public readonly string Href;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Fabric Cloud Router location
        /// </summary>
        public readonly ImmutableArray<Outputs.GetCloudRouterLocationResult> Locations;
        /// <summary>
        /// Fabric Cloud Router name. An alpha-numeric 24 characters string which can include only hyphens and underscores
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Preferences for notifications on Fabric Cloud Router configuration or status changes
        /// </summary>
        public readonly ImmutableArray<Outputs.GetCloudRouterNotificationResult> Notifications;
        /// <summary>
        /// Order information related to this Fabric Cloud Router
        /// </summary>
        public readonly ImmutableArray<Outputs.GetCloudRouterOrderResult> Orders;
        /// <summary>
        /// Fabric Cloud Router Package Type
        /// </summary>
        public readonly ImmutableArray<Outputs.GetCloudRouterPackageResult> Packages;
        /// <summary>
        /// Customer resource hierarchy project information.Applicable to customers onboarded to Equinix Identity and Access Management. For more information see Identity and Access Management: Projects
        /// </summary>
        public readonly ImmutableArray<Outputs.GetCloudRouterProjectResult> Projects;
        /// <summary>
        /// Fabric Cloud Router overall state
        /// </summary>
        public readonly string State;
        /// <summary>
        /// Defines the FCR type like; XF_ROUTER
        /// </summary>
        public readonly string Type;
        /// <summary>
        /// Equinix-assigned Fabric Cloud Router identifier
        /// </summary>
        public readonly string Uuid;

        [OutputConstructor]
        private GetCloudRouterResult(
            ImmutableArray<Outputs.GetCloudRouterAccountResult> accounts,

            int bgpIpv4RoutesCount,

            int bgpIpv6RoutesCount,

            ImmutableArray<Outputs.GetCloudRouterChangeLogResult> changeLogs,

            int connectionsCount,

            string description,

            int distinctIpv4PrefixesCount,

            int distinctIpv6PrefixesCount,

            int equinixAsn,

            string href,

            string id,

            ImmutableArray<Outputs.GetCloudRouterLocationResult> locations,

            string name,

            ImmutableArray<Outputs.GetCloudRouterNotificationResult> notifications,

            ImmutableArray<Outputs.GetCloudRouterOrderResult> orders,

            ImmutableArray<Outputs.GetCloudRouterPackageResult> packages,

            ImmutableArray<Outputs.GetCloudRouterProjectResult> projects,

            string state,

            string type,

            string uuid)
        {
            Accounts = accounts;
            BgpIpv4RoutesCount = bgpIpv4RoutesCount;
            BgpIpv6RoutesCount = bgpIpv6RoutesCount;
            ChangeLogs = changeLogs;
            ConnectionsCount = connectionsCount;
            Description = description;
            DistinctIpv4PrefixesCount = distinctIpv4PrefixesCount;
            DistinctIpv6PrefixesCount = distinctIpv6PrefixesCount;
            EquinixAsn = equinixAsn;
            Href = href;
            Id = id;
            Locations = locations;
            Name = name;
            Notifications = notifications;
            Orders = orders;
            Packages = packages;
            Projects = projects;
            State = state;
            Type = type;
            Uuid = uuid;
        }
    }
}
