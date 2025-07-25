// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Equinix.Fabric
{
    public static class GetRouteAggregationRule
    {
        /// <summary>
        /// Fabric V4 API compatible data resource that allow user to fetch Equinix Fabric Route Aggregation Rule by UUID
        /// Additional Documentation:
        /// * API: https://developer.equinix.com/catalog/fabricv4#tag/Route-Aggregations
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
        ///     var raRule = Equinix.Fabric.GetRouteAggregationRule.Invoke(new()
        ///     {
        ///         RouteAggregationId = "&lt;route_aggregation_id&gt;",
        ///         RouteAggregationRuleId = "&lt;route_aggregation_rule_id&gt;",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["routeAggregationRuleName"] = raRule.Apply(getRouteAggregationRuleResult =&gt; getRouteAggregationRuleResult.Name),
        ///         ["routeAggregationRuleDescription"] = raRule.Apply(getRouteAggregationRuleResult =&gt; getRouteAggregationRuleResult.Description),
        ///         ["routeAggregationRuleType"] = raRule.Apply(getRouteAggregationRuleResult =&gt; getRouteAggregationRuleResult.Type),
        ///         ["routeAggregationRulePrefix"] = raRule.Apply(getRouteAggregationRuleResult =&gt; getRouteAggregationRuleResult.Prefix),
        ///         ["routeAggregationRuleState"] = raRule.Apply(getRouteAggregationRuleResult =&gt; getRouteAggregationRuleResult.State),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetRouteAggregationRuleResult> InvokeAsync(GetRouteAggregationRuleArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetRouteAggregationRuleResult>("equinix:fabric/getRouteAggregationRule:getRouteAggregationRule", args ?? new GetRouteAggregationRuleArgs(), options.WithDefaults());

        /// <summary>
        /// Fabric V4 API compatible data resource that allow user to fetch Equinix Fabric Route Aggregation Rule by UUID
        /// Additional Documentation:
        /// * API: https://developer.equinix.com/catalog/fabricv4#tag/Route-Aggregations
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
        ///     var raRule = Equinix.Fabric.GetRouteAggregationRule.Invoke(new()
        ///     {
        ///         RouteAggregationId = "&lt;route_aggregation_id&gt;",
        ///         RouteAggregationRuleId = "&lt;route_aggregation_rule_id&gt;",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["routeAggregationRuleName"] = raRule.Apply(getRouteAggregationRuleResult =&gt; getRouteAggregationRuleResult.Name),
        ///         ["routeAggregationRuleDescription"] = raRule.Apply(getRouteAggregationRuleResult =&gt; getRouteAggregationRuleResult.Description),
        ///         ["routeAggregationRuleType"] = raRule.Apply(getRouteAggregationRuleResult =&gt; getRouteAggregationRuleResult.Type),
        ///         ["routeAggregationRulePrefix"] = raRule.Apply(getRouteAggregationRuleResult =&gt; getRouteAggregationRuleResult.Prefix),
        ///         ["routeAggregationRuleState"] = raRule.Apply(getRouteAggregationRuleResult =&gt; getRouteAggregationRuleResult.State),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetRouteAggregationRuleResult> Invoke(GetRouteAggregationRuleInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetRouteAggregationRuleResult>("equinix:fabric/getRouteAggregationRule:getRouteAggregationRule", args ?? new GetRouteAggregationRuleInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Fabric V4 API compatible data resource that allow user to fetch Equinix Fabric Route Aggregation Rule by UUID
        /// Additional Documentation:
        /// * API: https://developer.equinix.com/catalog/fabricv4#tag/Route-Aggregations
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
        ///     var raRule = Equinix.Fabric.GetRouteAggregationRule.Invoke(new()
        ///     {
        ///         RouteAggregationId = "&lt;route_aggregation_id&gt;",
        ///         RouteAggregationRuleId = "&lt;route_aggregation_rule_id&gt;",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["routeAggregationRuleName"] = raRule.Apply(getRouteAggregationRuleResult =&gt; getRouteAggregationRuleResult.Name),
        ///         ["routeAggregationRuleDescription"] = raRule.Apply(getRouteAggregationRuleResult =&gt; getRouteAggregationRuleResult.Description),
        ///         ["routeAggregationRuleType"] = raRule.Apply(getRouteAggregationRuleResult =&gt; getRouteAggregationRuleResult.Type),
        ///         ["routeAggregationRulePrefix"] = raRule.Apply(getRouteAggregationRuleResult =&gt; getRouteAggregationRuleResult.Prefix),
        ///         ["routeAggregationRuleState"] = raRule.Apply(getRouteAggregationRuleResult =&gt; getRouteAggregationRuleResult.State),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetRouteAggregationRuleResult> Invoke(GetRouteAggregationRuleInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetRouteAggregationRuleResult>("equinix:fabric/getRouteAggregationRule:getRouteAggregationRule", args ?? new GetRouteAggregationRuleInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetRouteAggregationRuleArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Customer-provided route aggregation rule description
        /// </summary>
        [Input("description")]
        public string? Description { get; set; }

        /// <summary>
        /// The uuid of the route aggregation this data source should retrieve
        /// </summary>
        [Input("routeAggregationId", required: true)]
        public string RouteAggregationId { get; set; } = null!;

        /// <summary>
        /// The uuid of the route aggregation rule this data source should retrieve
        /// </summary>
        [Input("routeAggregationRuleId", required: true)]
        public string RouteAggregationRuleId { get; set; } = null!;

        public GetRouteAggregationRuleArgs()
        {
        }
        public static new GetRouteAggregationRuleArgs Empty => new GetRouteAggregationRuleArgs();
    }

    public sealed class GetRouteAggregationRuleInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Customer-provided route aggregation rule description
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The uuid of the route aggregation this data source should retrieve
        /// </summary>
        [Input("routeAggregationId", required: true)]
        public Input<string> RouteAggregationId { get; set; } = null!;

        /// <summary>
        /// The uuid of the route aggregation rule this data source should retrieve
        /// </summary>
        [Input("routeAggregationRuleId", required: true)]
        public Input<string> RouteAggregationRuleId { get; set; } = null!;

        public GetRouteAggregationRuleInvokeArgs()
        {
        }
        public static new GetRouteAggregationRuleInvokeArgs Empty => new GetRouteAggregationRuleInvokeArgs();
    }


    [OutputType]
    public sealed class GetRouteAggregationRuleResult
    {
        /// <summary>
        /// Current state of latest route aggregation rule change
        /// </summary>
        public readonly Outputs.GetRouteAggregationRuleChangeResult Change;
        /// <summary>
        /// Details of the last change on the stream resource
        /// </summary>
        public readonly Outputs.GetRouteAggregationRuleChangeLogResult ChangeLog;
        /// <summary>
        /// Customer-provided route aggregation rule description
        /// </summary>
        public readonly string? Description;
        /// <summary>
        /// Equinix auto generated URI to the route aggregation rule resource
        /// </summary>
        public readonly string Href;
        /// <summary>
        /// The unique identifier of the resource
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Customer provided name of the route aggregation rule
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Customer-provided route aggregation rule prefix
        /// </summary>
        public readonly string Prefix;
        /// <summary>
        /// The uuid of the route aggregation this data source should retrieve
        /// </summary>
        public readonly string RouteAggregationId;
        /// <summary>
        /// The uuid of the route aggregation rule this data source should retrieve
        /// </summary>
        public readonly string RouteAggregationRuleId;
        /// <summary>
        /// Value representing provisioning status for the route aggregation rule resource
        /// </summary>
        public readonly string State;
        /// <summary>
        /// Equinix defined Route Aggregation Type; BGP*IPv4*PREFIX*AGGREGATION, BGP*IPv6*PREFIX*AGGREGATION
        /// </summary>
        public readonly string Type;
        /// <summary>
        /// Equinix-assigned unique id for the route aggregation rule resource
        /// </summary>
        public readonly string Uuid;

        [OutputConstructor]
        private GetRouteAggregationRuleResult(
            Outputs.GetRouteAggregationRuleChangeResult change,

            Outputs.GetRouteAggregationRuleChangeLogResult changeLog,

            string? description,

            string href,

            string id,

            string name,

            string prefix,

            string routeAggregationId,

            string routeAggregationRuleId,

            string state,

            string type,

            string uuid)
        {
            Change = change;
            ChangeLog = changeLog;
            Description = description;
            Href = href;
            Id = id;
            Name = name;
            Prefix = prefix;
            RouteAggregationId = routeAggregationId;
            RouteAggregationRuleId = routeAggregationRuleId;
            State = state;
            Type = type;
            Uuid = uuid;
        }
    }
}
