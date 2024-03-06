// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Equinix.Metal.Inputs
{

    public sealed class InterconnectionPortGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("id", required: true)]
        public Input<string> Id { get; set; } = null!;

        [Input("linkStatus", required: true)]
        public Input<string> LinkStatus { get; set; } = null!;

        /// <summary>
        /// Name of the connection resource
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        [Input("role", required: true)]
        public Input<string> Role { get; set; } = null!;

        /// <summary>
        /// Connection speed -  Values must be in the format '&lt;number&gt;Mbps' or '&lt;number&gt;Gpbs', for example '100Mbps' or '50Gbps'.  Actual supported values will depend on the connection type and whether the connection uses VLANs or VRF.
        /// </summary>
        [Input("speed", required: true)]
        public Input<int> Speed { get; set; } = null!;

        /// <summary>
        /// Status of the connection resource.
        /// </summary>
        [Input("status", required: true)]
        public Input<string> Status { get; set; } = null!;

        [Input("virtualCircuitIds", required: true)]
        private InputList<object>? _virtualCircuitIds;
        public InputList<object> VirtualCircuitIds
        {
            get => _virtualCircuitIds ?? (_virtualCircuitIds = new InputList<object>());
            set => _virtualCircuitIds = value;
        }

        public InterconnectionPortGetArgs()
        {
        }
        public static new InterconnectionPortGetArgs Empty => new InterconnectionPortGetArgs();
    }
}
