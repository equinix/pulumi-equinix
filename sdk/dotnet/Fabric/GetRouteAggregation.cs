// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Equinix.Fabric
{
    public static class GetRouteAggregation
    {
        /// <summary>
        /// Fabric V4 API compatible data resource that allow user to fetch Equinix Fabric Route Aggregation by UUID
        /// Additional Documentation:
        /// * API: https://developer.equinix.com/catalog/fabricv4#tag/Route-Aggregations
        /// </summary>
        public static Task<GetRouteAggregationResult> InvokeAsync(GetRouteAggregationArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetRouteAggregationResult>("equinix:fabric/getRouteAggregation:getRouteAggregation", args ?? new GetRouteAggregationArgs(), options.WithDefaults());

        /// <summary>
        /// Fabric V4 API compatible data resource that allow user to fetch Equinix Fabric Route Aggregation by UUID
        /// Additional Documentation:
        /// * API: https://developer.equinix.com/catalog/fabricv4#tag/Route-Aggregations
        /// </summary>
        public static Output<GetRouteAggregationResult> Invoke(GetRouteAggregationInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetRouteAggregationResult>("equinix:fabric/getRouteAggregation:getRouteAggregation", args ?? new GetRouteAggregationInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Fabric V4 API compatible data resource that allow user to fetch Equinix Fabric Route Aggregation by UUID
        /// Additional Documentation:
        /// * API: https://developer.equinix.com/catalog/fabricv4#tag/Route-Aggregations
        /// </summary>
        public static Output<GetRouteAggregationResult> Invoke(GetRouteAggregationInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetRouteAggregationResult>("equinix:fabric/getRouteAggregation:getRouteAggregation", args ?? new GetRouteAggregationInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetRouteAggregationArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The uuid of the route aggregation this data source should retrieve
        /// </summary>
        [Input("routeAggregationId", required: true)]
        public string RouteAggregationId { get; set; } = null!;

        public GetRouteAggregationArgs()
        {
        }
        public static new GetRouteAggregationArgs Empty => new GetRouteAggregationArgs();
    }

    public sealed class GetRouteAggregationInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The uuid of the route aggregation this data source should retrieve
        /// </summary>
        [Input("routeAggregationId", required: true)]
        public Input<string> RouteAggregationId { get; set; } = null!;

        public GetRouteAggregationInvokeArgs()
        {
        }
        public static new GetRouteAggregationInvokeArgs Empty => new GetRouteAggregationInvokeArgs();
    }


    [OutputType]
    public sealed class GetRouteAggregationResult
    {
        /// <summary>
        /// Current state of latest Route Aggregation change
        /// </summary>
        public readonly Outputs.GetRouteAggregationChangeResult Change;
        /// <summary>
        /// Details of the last change on the route aggregation resource
        /// </summary>
        public readonly Outputs.GetRouteAggregationChangeLogResult ChangeLog;
        /// <summary>
        /// Number of Connections attached to route aggregation
        /// </summary>
        public readonly int ConnectionsCount;
        /// <summary>
        /// Customer-provided route aggregation description
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// Equinix auto generated URI to the route aggregation resource
        /// </summary>
        public readonly string Href;
        /// <summary>
        /// The unique identifier of the resource
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Customer provided name of the route aggregation
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Equinix Project attribute object
        /// </summary>
        public readonly Outputs.GetRouteAggregationProjectResult Project;
        /// <summary>
        /// The uuid of the route aggregation this data source should retrieve
        /// </summary>
        public readonly string RouteAggregationId;
        /// <summary>
        /// Number of Rules attached to route aggregation
        /// </summary>
        public readonly int RulesCount;
        /// <summary>
        /// Value representing provisioning status for the route aggregation resource
        /// </summary>
        public readonly string State;
        /// <summary>
        /// Equinix defined Route Aggregation Type; BGP*IPv4*PREFIX*AGGREGATION, BGP*IPv6*PREFIX*AGGREGATION
        /// </summary>
        public readonly string Type;
        /// <summary>
        /// Equinix-assigned unique id for the route aggregation resource
        /// </summary>
        public readonly string Uuid;

        [OutputConstructor]
        private GetRouteAggregationResult(
            Outputs.GetRouteAggregationChangeResult change,

            Outputs.GetRouteAggregationChangeLogResult changeLog,

            int connectionsCount,

            string description,

            string href,

            string id,

            string name,

            Outputs.GetRouteAggregationProjectResult project,

            string routeAggregationId,

            int rulesCount,

            string state,

            string type,

            string uuid)
        {
            Change = change;
            ChangeLog = changeLog;
            ConnectionsCount = connectionsCount;
            Description = description;
            Href = href;
            Id = id;
            Name = name;
            Project = project;
            RouteAggregationId = routeAggregationId;
            RulesCount = rulesCount;
            State = state;
            Type = type;
            Uuid = uuid;
        }
    }
}
