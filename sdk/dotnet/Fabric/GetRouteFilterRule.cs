// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Equinix.Fabric
{
    public static class GetRouteFilterRule
    {
        /// <summary>
        /// Fabric V4 API compatible data resource that allow user to fetch route filter for a given UUID
        /// 
        /// Additional Documentation:
        /// * Getting Started: https://docs.equinix.com/en-us/Content/Interconnection/FCR/FCR-route-filters.htm
        /// * API: https://developer.equinix.com/dev-docs/fabric/api-reference/fabric-v4-apis#route-filter-rules
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
        ///     var rfRule = Equinix.Fabric.GetRouteFilterRule.Invoke(new()
        ///     {
        ///         RouteFilterId = "&lt;route_filter_policy_id&gt;",
        ///         Uuid = "&lt;route_filter_rule_uuid&gt;",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["routeFilterRuleName"] = rfRule.Apply(getRouteFilterRuleResult =&gt; getRouteFilterRuleResult.Name),
        ///         ["routeFilterRuleDescription"] = rfRule.Apply(getRouteFilterRuleResult =&gt; getRouteFilterRuleResult.Description),
        ///         ["routeFilterRulePrefix"] = rfRule.Apply(getRouteFilterRuleResult =&gt; getRouteFilterRuleResult.Prefix),
        ///         ["routeFilterRulePrefixMatch"] = rfRule.Apply(getRouteFilterRuleResult =&gt; getRouteFilterRuleResult.PrefixMatch),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetRouteFilterRuleResult> InvokeAsync(GetRouteFilterRuleArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetRouteFilterRuleResult>("equinix:fabric/getRouteFilterRule:getRouteFilterRule", args ?? new GetRouteFilterRuleArgs(), options.WithDefaults());

        /// <summary>
        /// Fabric V4 API compatible data resource that allow user to fetch route filter for a given UUID
        /// 
        /// Additional Documentation:
        /// * Getting Started: https://docs.equinix.com/en-us/Content/Interconnection/FCR/FCR-route-filters.htm
        /// * API: https://developer.equinix.com/dev-docs/fabric/api-reference/fabric-v4-apis#route-filter-rules
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
        ///     var rfRule = Equinix.Fabric.GetRouteFilterRule.Invoke(new()
        ///     {
        ///         RouteFilterId = "&lt;route_filter_policy_id&gt;",
        ///         Uuid = "&lt;route_filter_rule_uuid&gt;",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["routeFilterRuleName"] = rfRule.Apply(getRouteFilterRuleResult =&gt; getRouteFilterRuleResult.Name),
        ///         ["routeFilterRuleDescription"] = rfRule.Apply(getRouteFilterRuleResult =&gt; getRouteFilterRuleResult.Description),
        ///         ["routeFilterRulePrefix"] = rfRule.Apply(getRouteFilterRuleResult =&gt; getRouteFilterRuleResult.Prefix),
        ///         ["routeFilterRulePrefixMatch"] = rfRule.Apply(getRouteFilterRuleResult =&gt; getRouteFilterRuleResult.PrefixMatch),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetRouteFilterRuleResult> Invoke(GetRouteFilterRuleInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetRouteFilterRuleResult>("equinix:fabric/getRouteFilterRule:getRouteFilterRule", args ?? new GetRouteFilterRuleInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetRouteFilterRuleArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// UUID of the Route Filter Policy the rule is attached to
        /// </summary>
        [Input("routeFilterId", required: true)]
        public string RouteFilterId { get; set; } = null!;

        /// <summary>
        /// Equinix Assigned ID for Route Filter Rule to retrieve data for
        /// </summary>
        [Input("uuid", required: true)]
        public string Uuid { get; set; } = null!;

        public GetRouteFilterRuleArgs()
        {
        }
        public static new GetRouteFilterRuleArgs Empty => new GetRouteFilterRuleArgs();
    }

    public sealed class GetRouteFilterRuleInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// UUID of the Route Filter Policy the rule is attached to
        /// </summary>
        [Input("routeFilterId", required: true)]
        public Input<string> RouteFilterId { get; set; } = null!;

        /// <summary>
        /// Equinix Assigned ID for Route Filter Rule to retrieve data for
        /// </summary>
        [Input("uuid", required: true)]
        public Input<string> Uuid { get; set; } = null!;

        public GetRouteFilterRuleInvokeArgs()
        {
        }
        public static new GetRouteFilterRuleInvokeArgs Empty => new GetRouteFilterRuleInvokeArgs();
    }


    [OutputType]
    public sealed class GetRouteFilterRuleResult
    {
        /// <summary>
        /// Action that will be taken on IP Addresses matching the rule
        /// </summary>
        public readonly string Action;
        public readonly ImmutableArray<Outputs.GetRouteFilterRuleChangeLogResult> ChangeLogs;
        /// <summary>
        /// An object with the details of the previous change applied on the Route Filter
        /// </summary>
        public readonly ImmutableArray<Outputs.GetRouteFilterRuleChangeResult> Changes;
        /// <summary>
        /// Optional description to add to the Route Filter you will be creating
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// Route filter rules URI
        /// </summary>
        public readonly string Href;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Name of the Route Filter
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// IP Address Prefix to Filter on
        /// </summary>
        public readonly string Prefix;
        /// <summary>
        /// Prefix matching operator. One of [ orlonger, exact ] Default: "orlonger"
        /// </summary>
        public readonly string PrefixMatch;
        /// <summary>
        /// UUID of the Route Filter Policy the rule is attached to
        /// </summary>
        public readonly string RouteFilterId;
        /// <summary>
        /// State of the Route Filter Rule in its lifecycle
        /// </summary>
        public readonly string State;
        /// <summary>
        /// Route Filter Type. One of [ BGP*IPv4*PREFIX*FILTER*RULE, BGP*IPv6*PREFIX*FILTER*RULE ]
        /// </summary>
        public readonly string Type;
        /// <summary>
        /// Equinix Assigned ID for Route Filter Rule to retrieve data for
        /// </summary>
        public readonly string Uuid;

        [OutputConstructor]
        private GetRouteFilterRuleResult(
            string action,

            ImmutableArray<Outputs.GetRouteFilterRuleChangeLogResult> changeLogs,

            ImmutableArray<Outputs.GetRouteFilterRuleChangeResult> changes,

            string description,

            string href,

            string id,

            string name,

            string prefix,

            string prefixMatch,

            string routeFilterId,

            string state,

            string type,

            string uuid)
        {
            Action = action;
            ChangeLogs = changeLogs;
            Changes = changes;
            Description = description;
            Href = href;
            Id = id;
            Name = name;
            Prefix = prefix;
            PrefixMatch = prefixMatch;
            RouteFilterId = routeFilterId;
            State = state;
            Type = type;
            Uuid = uuid;
        }
    }
}
