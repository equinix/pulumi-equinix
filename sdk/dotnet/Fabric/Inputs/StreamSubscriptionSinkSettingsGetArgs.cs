// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Equinix.Fabric.Inputs
{

    public sealed class StreamSubscriptionSinkSettingsGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("applicationKey")]
        public Input<string>? ApplicationKey { get; set; }

        [Input("eventIndex")]
        public Input<string>? EventIndex { get; set; }

        [Input("eventUri")]
        public Input<string>? EventUri { get; set; }

        [Input("metricIndex")]
        public Input<string>? MetricIndex { get; set; }

        [Input("metricUri")]
        public Input<string>? MetricUri { get; set; }

        [Input("source")]
        public Input<string>? Source { get; set; }

        public StreamSubscriptionSinkSettingsGetArgs()
        {
        }
        public static new StreamSubscriptionSinkSettingsGetArgs Empty => new StreamSubscriptionSinkSettingsGetArgs();
    }
}
