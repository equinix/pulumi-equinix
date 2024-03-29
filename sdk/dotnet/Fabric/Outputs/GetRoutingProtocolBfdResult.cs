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
    public sealed class GetRoutingProtocolBfdResult
    {
        /// <summary>
        /// Bidirectional Forwarding Detection enablement
        /// </summary>
        public readonly bool Enabled;
        /// <summary>
        /// Interval range between the received BFD control packets
        /// </summary>
        public readonly string? Interval;

        [OutputConstructor]
        private GetRoutingProtocolBfdResult(
            bool enabled,

            string? interval)
        {
            Enabled = enabled;
            Interval = interval;
        }
    }
}
