// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Equinix.Fabric.Inputs
{

    public sealed class ConnectionZSideAccessPointGatewayGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Unique Resource Identifier
        /// </summary>
        [Input("href")]
        public Input<string>? Href { get; set; }

        /// <summary>
        /// Equinix-assigned virtual gateway identifier
        /// </summary>
        [Input("uuid")]
        public Input<string>? Uuid { get; set; }

        public ConnectionZSideAccessPointGatewayGetArgs()
        {
        }
        public static new ConnectionZSideAccessPointGatewayGetArgs Empty => new ConnectionZSideAccessPointGatewayGetArgs();
    }
}
