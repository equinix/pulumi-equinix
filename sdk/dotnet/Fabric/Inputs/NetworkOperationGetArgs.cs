// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Equinix.Fabric.Inputs
{

    public sealed class NetworkOperationGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Progress towards provisioning a given asset.
        /// </summary>
        [Input("equinixStatus")]
        public Input<string>? EquinixStatus { get; set; }

        public NetworkOperationGetArgs()
        {
        }
        public static new NetworkOperationGetArgs Empty => new NetworkOperationGetArgs();
    }
}