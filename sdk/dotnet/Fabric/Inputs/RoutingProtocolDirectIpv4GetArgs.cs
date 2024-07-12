// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Equinix.Fabric.Inputs
{

    public sealed class RoutingProtocolDirectIpv4GetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Equinix side Interface IP address
        /// </summary>
        [Input("equinixIfaceIp", required: true)]
        public Input<string> EquinixIfaceIp { get; set; } = null!;

        public RoutingProtocolDirectIpv4GetArgs()
        {
        }
        public static new RoutingProtocolDirectIpv4GetArgs Empty => new RoutingProtocolDirectIpv4GetArgs();
    }
}
