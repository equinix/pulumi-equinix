// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Equinix.NetworkEdge.Inputs
{

    public sealed class AclTemplateInboundRuleArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Inbound rule description, up to 200 characters.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Inbound traffic destination ports. Allowed values are a comma separated
        /// list of ports, e.g., `20,22,23`, port range, e.g., `1023-1040` or word `any`.
        /// </summary>
        [Input("dstPort", required: true)]
        public Input<string> DstPort { get; set; } = null!;

        /// <summary>
        /// Inbound traffic protocol. One of `IP`, `TCP`, `UDP`.
        /// </summary>
        [Input("protocol", required: true)]
        public InputUnion<string, Pulumi.Equinix.NetworkEdge.AclRuleProtocolType> Protocol { get; set; } = null!;

        /// <summary>
        /// Inbound rule sequence number
        /// </summary>
        [Input("sequenceNumber")]
        public Input<int>? SequenceNumber { get; set; }

        /// <summary>
        /// Type of traffic source used in a given inbound rule
        /// </summary>
        [Input("sourceType")]
        public Input<string>? SourceType { get; set; }

        /// <summary>
        /// Inbound traffic source ports. Allowed values are a comma separated list
        /// of ports, e.g., `20,22,23`, port range, e.g., `1023-1040` or word `any`.
        /// </summary>
        [Input("srcPort", required: true)]
        public Input<string> SrcPort { get; set; } = null!;

        /// <summary>
        /// Inbound traffic source IP subnet in CIDR format.
        /// </summary>
        [Input("subnet")]
        public Input<string>? Subnet { get; set; }

        [Input("subnets")]
        private InputList<string>? _subnets;

        /// <summary>
        /// Inbound traffic source IP subnets in CIDR format.
        /// </summary>
        [Obsolete(@"Use Subnet instead")]
        public InputList<string> Subnets
        {
            get => _subnets ?? (_subnets = new InputList<string>());
            set => _subnets = value;
        }

        public AclTemplateInboundRuleArgs()
        {
        }
        public static new AclTemplateInboundRuleArgs Empty => new AclTemplateInboundRuleArgs();
    }
}
