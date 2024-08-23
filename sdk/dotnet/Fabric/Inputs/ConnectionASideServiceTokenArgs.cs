// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Equinix.Fabric.Inputs
{

    public sealed class ConnectionASideServiceTokenArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Service token description
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// An absolute URL that is the subject of the link's context
        /// </summary>
        [Input("href")]
        public Input<string>? Href { get; set; }

        /// <summary>
        /// Token type - VC_TOKEN
        /// </summary>
        [Input("type")]
        public InputUnion<string, Pulumi.Equinix.Fabric.ServiceTokenType>? Type { get; set; }

        /// <summary>
        /// Equinix-assigned service token identifier
        /// </summary>
        [Input("uuid")]
        public Input<string>? Uuid { get; set; }

        public ConnectionASideServiceTokenArgs()
        {
        }
        public static new ConnectionASideServiceTokenArgs Empty => new ConnectionASideServiceTokenArgs();
    }
}