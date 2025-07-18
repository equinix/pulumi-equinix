// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Equinix.Fabric.Outputs
{

    [OutputType]
    public sealed class GetRouteAggregationsDataResult
    {
        /// <summary>
        /// Current state of latest Route Aggregation change
        /// </summary>
        public readonly Outputs.GetRouteAggregationsDataChangeResult Change;
        /// <summary>
        /// Details of the last change on the route aggregation resource
        /// </summary>
        public readonly Outputs.GetRouteAggregationsDataChangeLogResult ChangeLog;
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
        /// Customer provided name of the route aggregation
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Equinix Project attribute object
        /// </summary>
        public readonly Outputs.GetRouteAggregationsDataProjectResult Project;
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
        private GetRouteAggregationsDataResult(
            Outputs.GetRouteAggregationsDataChangeResult change,

            Outputs.GetRouteAggregationsDataChangeLogResult changeLog,

            int connectionsCount,

            string description,

            string href,

            string name,

            Outputs.GetRouteAggregationsDataProjectResult project,

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
            Name = name;
            Project = project;
            RulesCount = rulesCount;
            State = state;
            Type = type;
            Uuid = uuid;
        }
    }
}
