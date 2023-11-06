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
    public sealed class GetRoutingProtocolDirectIpv4Result
    {
        /// <summary>
        /// Equinix side Interface IP address
        /// </summary>
        public readonly string EquinixIfaceIp;

        [OutputConstructor]
        private GetRoutingProtocolDirectIpv4Result(string equinixIfaceIp)
        {
            EquinixIfaceIp = equinixIfaceIp;
        }
    }
}