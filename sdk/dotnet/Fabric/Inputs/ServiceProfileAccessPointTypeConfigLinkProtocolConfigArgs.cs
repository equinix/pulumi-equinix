// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Equinix.Fabric.Inputs
{

    public sealed class ServiceProfileAccessPointTypeConfigLinkProtocolConfigArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Data frames encapsulation standard.UNTAGGED - Untagged encapsulation for EPL connections. DOT1Q - DOT1Q encapsulation standard. QINQ - QINQ encapsulation standard.
        /// </summary>
        [Input("encapsulation")]
        public Input<string>? Encapsulation { get; set; }

        /// <summary>
        /// Additional tagging information required by the seller profile.
        /// </summary>
        [Input("encapsulationStrategy")]
        public Input<string>? EncapsulationStrategy { get; set; }

        /// <summary>
        /// Automatically accept subsequent DOT1Q to QINQ connections that use the same authentication key. These connections will have the same VLAN S-tag assigned as the initial connection.
        /// </summary>
        [Input("reuseVlanSTag")]
        public Input<bool>? ReuseVlanSTag { get; set; }

        public ServiceProfileAccessPointTypeConfigLinkProtocolConfigArgs()
        {
        }
        public static new ServiceProfileAccessPointTypeConfigLinkProtocolConfigArgs Empty => new ServiceProfileAccessPointTypeConfigLinkProtocolConfigArgs();
    }
}
