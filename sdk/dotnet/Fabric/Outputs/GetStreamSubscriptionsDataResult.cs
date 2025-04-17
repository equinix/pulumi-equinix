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
    public sealed class GetStreamSubscriptionsDataResult
    {
        /// <summary>
        /// Details of the last change on the stream resource
        /// </summary>
        public readonly Outputs.GetStreamSubscriptionsDataChangeLogResult ChangeLog;
        /// <summary>
        /// Customer-provided stream subscription description
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// Stream subscription enabled status
        /// </summary>
        public readonly bool Enabled;
        /// <summary>
        /// Lists of events to be included/excluded on the stream subscription
        /// </summary>
        public readonly Outputs.GetStreamSubscriptionsDataEventSelectorResult EventSelector;
        /// <summary>
        /// Equinix assigned URI of the stream subscription resource
        /// </summary>
        public readonly string Href;
        /// <summary>
        /// Lists of metrics to be included/excluded on the stream subscription
        /// </summary>
        public readonly Outputs.GetStreamSubscriptionsDataMetricSelectorResult MetricSelector;
        /// <summary>
        /// Customer-provided stream subscription name
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The details of the subscriber to the Equinix Stream
        /// </summary>
        public readonly Outputs.GetStreamSubscriptionsDataSinkResult Sink;
        /// <summary>
        /// Value representing provisioning status for the stream resource
        /// </summary>
        public readonly string State;
        /// <summary>
        /// Type of the stream subscription request
        /// </summary>
        public readonly string Type;
        /// <summary>
        /// Equinix assigned unique identifier of the stream subscription resource
        /// </summary>
        public readonly string Uuid;

        [OutputConstructor]
        private GetStreamSubscriptionsDataResult(
            Outputs.GetStreamSubscriptionsDataChangeLogResult changeLog,

            string description,

            bool enabled,

            Outputs.GetStreamSubscriptionsDataEventSelectorResult eventSelector,

            string href,

            Outputs.GetStreamSubscriptionsDataMetricSelectorResult metricSelector,

            string name,

            Outputs.GetStreamSubscriptionsDataSinkResult sink,

            string state,

            string type,

            string uuid)
        {
            ChangeLog = changeLog;
            Description = description;
            Enabled = enabled;
            EventSelector = eventSelector;
            Href = href;
            MetricSelector = metricSelector;
            Name = name;
            Sink = sink;
            State = state;
            Type = type;
            Uuid = uuid;
        }
    }
}
