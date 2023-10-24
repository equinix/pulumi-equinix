// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Equinix.Fabric.Inputs
{

    public sealed class ConnectionZSideServiceTokenArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// User-provided service description
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Unique Resource Identifier
        /// </summary>
        [Input("href")]
        public Input<string>? Href { get; set; }

        /// <summary>
        /// Interface type
        /// </summary>
        [Input("type")]
        public InputUnion<string, Pulumi.Equinix.Fabric.ServiceTokenType>? Type { get; set; }

        /// <summary>
        /// Equinix-assigned interface identifier
        /// </summary>
        [Input("uuid")]
        public Input<string>? Uuid { get; set; }

        public ConnectionZSideServiceTokenArgs()
        {
        }
        public static new ConnectionZSideServiceTokenArgs Empty => new ConnectionZSideServiceTokenArgs();
    }
}
