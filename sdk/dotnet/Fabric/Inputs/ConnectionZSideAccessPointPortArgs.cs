// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Equinix.Fabric.Inputs
{

    public sealed class ConnectionZSideAccessPointPortArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Connection URI information
        /// </summary>
        [Input("href")]
        public Input<string>? Href { get; set; }

        /// <summary>
        /// Connection name. An alpha-numeric 24 characters string which can include only hyphens and underscores
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("redundancies")]
        private InputList<Inputs.ConnectionZSideAccessPointPortRedundancyArgs>? _redundancies;

        /// <summary>
        /// Redundancy Information
        /// </summary>
        public InputList<Inputs.ConnectionZSideAccessPointPortRedundancyArgs> Redundancies
        {
            get => _redundancies ?? (_redundancies = new InputList<Inputs.ConnectionZSideAccessPointPortRedundancyArgs>());
            set => _redundancies = value;
        }

        [Input("uuid")]
        public Input<string>? Uuid { get; set; }

        public ConnectionZSideAccessPointPortArgs()
        {
        }
        public static new ConnectionZSideAccessPointPortArgs Empty => new ConnectionZSideAccessPointPortArgs();
    }
}
