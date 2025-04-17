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
    /// Fabric V4 API compatible resource allows creation and management of Equinix Fabric Route Aggregation
    /// 
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
    ///     var raRule = new Equinix.Fabric.RouteAggregationRule("raRule", new()
    ///     {
    ///         RouteAggregationId = "&lt;route_aggregation_id&gt;",
    ///         Description = "Route aggregation rule",
    ///         Prefix = "192.168.0.0/24",
    ///     });
    /// 
    ///     return new Dictionary&lt;string, object?&gt;
    ///     {
    ///         ["routeAggregationRuleName"] = raRule.Name,
    ///         ["routeAggregationRuleDescription"] = raRule.Description,
    ///         ["routeAggregationRuleType"] = raRule.Type,
    ///         ["routeAggregationRulePrefix"] = raRule.Prefix,
    ///         ["routeAggregationRuleState"] = raRule.State,
    ///     };
    /// });
    /// ```
    /// </summary>
    [EquinixResourceType("equinix:fabric/routeAggregationRule:RouteAggregationRule")]
    public partial class RouteAggregationRule : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Current state of latest route aggregation rule change
        /// </summary>
        [Output("change")]
        public Output<Outputs.RouteAggregationRuleChange> Change { get; private set; } = null!;

        /// <summary>
        /// Details of the last change on the stream resource
        /// </summary>
        [Output("changeLog")]
        public Output<Outputs.RouteAggregationRuleChangeLog> ChangeLog { get; private set; } = null!;

        /// <summary>
        /// Customer-provided route aggregation rule description
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// Equinix auto generated URI to the route aggregation rule resource
        /// </summary>
        [Output("href")]
        public Output<string> Href { get; private set; } = null!;

        /// <summary>
        /// Customer provided name of the route aggregation rule
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Customer-provided route aggregation rule prefix
        /// </summary>
        [Output("prefix")]
        public Output<string> Prefix { get; private set; } = null!;

        /// <summary>
        /// UUID of the Route Aggregation to apply this Rule to
        /// </summary>
        [Output("routeAggregationId")]
        public Output<string> RouteAggregationId { get; private set; } = null!;

        /// <summary>
        /// Value representing provisioning status for the route aggregation rule resource
        /// </summary>
        [Output("state")]
        public Output<string> State { get; private set; } = null!;

        [Output("timeouts")]
        public Output<Outputs.RouteAggregationRuleTimeouts?> Timeouts { get; private set; } = null!;

        /// <summary>
        /// Equinix defined Route Aggregation Type; BGP*IPv4*PREFIX*AGGREGATION, BGP*IPv6*PREFIX*AGGREGATION
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;

        /// <summary>
        /// Equinix-assigned unique id for the route aggregation rule resource
        /// </summary>
        [Output("uuid")]
        public Output<string> Uuid { get; private set; } = null!;


        /// <summary>
        /// Create a RouteAggregationRule resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public RouteAggregationRule(string name, RouteAggregationRuleArgs args, CustomResourceOptions? options = null)
            : base("equinix:fabric/routeAggregationRule:RouteAggregationRule", name, args ?? new RouteAggregationRuleArgs(), MakeResourceOptions(options, ""))
        {
        }

        private RouteAggregationRule(string name, Input<string> id, RouteAggregationRuleState? state = null, CustomResourceOptions? options = null)
            : base("equinix:fabric/routeAggregationRule:RouteAggregationRule", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing RouteAggregationRule resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static RouteAggregationRule Get(string name, Input<string> id, RouteAggregationRuleState? state = null, CustomResourceOptions? options = null)
        {
            return new RouteAggregationRule(name, id, state, options);
        }
    }

    public sealed class RouteAggregationRuleArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Customer-provided route aggregation rule description
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Customer provided name of the route aggregation rule
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Customer-provided route aggregation rule prefix
        /// </summary>
        [Input("prefix", required: true)]
        public Input<string> Prefix { get; set; } = null!;

        /// <summary>
        /// UUID of the Route Aggregation to apply this Rule to
        /// </summary>
        [Input("routeAggregationId", required: true)]
        public Input<string> RouteAggregationId { get; set; } = null!;

        [Input("timeouts")]
        public Input<Inputs.RouteAggregationRuleTimeoutsArgs>? Timeouts { get; set; }

        public RouteAggregationRuleArgs()
        {
        }
        public static new RouteAggregationRuleArgs Empty => new RouteAggregationRuleArgs();
    }

    public sealed class RouteAggregationRuleState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Current state of latest route aggregation rule change
        /// </summary>
        [Input("change")]
        public Input<Inputs.RouteAggregationRuleChangeGetArgs>? Change { get; set; }

        /// <summary>
        /// Details of the last change on the stream resource
        /// </summary>
        [Input("changeLog")]
        public Input<Inputs.RouteAggregationRuleChangeLogGetArgs>? ChangeLog { get; set; }

        /// <summary>
        /// Customer-provided route aggregation rule description
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Equinix auto generated URI to the route aggregation rule resource
        /// </summary>
        [Input("href")]
        public Input<string>? Href { get; set; }

        /// <summary>
        /// Customer provided name of the route aggregation rule
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Customer-provided route aggregation rule prefix
        /// </summary>
        [Input("prefix")]
        public Input<string>? Prefix { get; set; }

        /// <summary>
        /// UUID of the Route Aggregation to apply this Rule to
        /// </summary>
        [Input("routeAggregationId")]
        public Input<string>? RouteAggregationId { get; set; }

        /// <summary>
        /// Value representing provisioning status for the route aggregation rule resource
        /// </summary>
        [Input("state")]
        public Input<string>? State { get; set; }

        [Input("timeouts")]
        public Input<Inputs.RouteAggregationRuleTimeoutsGetArgs>? Timeouts { get; set; }

        /// <summary>
        /// Equinix defined Route Aggregation Type; BGP*IPv4*PREFIX*AGGREGATION, BGP*IPv6*PREFIX*AGGREGATION
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        /// <summary>
        /// Equinix-assigned unique id for the route aggregation rule resource
        /// </summary>
        [Input("uuid")]
        public Input<string>? Uuid { get; set; }

        public RouteAggregationRuleState()
        {
        }
        public static new RouteAggregationRuleState Empty => new RouteAggregationRuleState();
    }
}
