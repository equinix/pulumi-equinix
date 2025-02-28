// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Equinix.Fabric.Inputs
{

    public sealed class StreamChangeLogGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// User name of creator of the stream resource
        /// </summary>
        [Input("createdBy")]
        public Input<string>? CreatedBy { get; set; }

        /// <summary>
        /// Email of creator of the stream resource
        /// </summary>
        [Input("createdByEmail")]
        public Input<string>? CreatedByEmail { get; set; }

        /// <summary>
        /// Legal name of creator of the stream resource
        /// </summary>
        [Input("createdByFullName")]
        public Input<string>? CreatedByFullName { get; set; }

        /// <summary>
        /// Creation time of the stream resource
        /// </summary>
        [Input("createdDateTime")]
        public Input<string>? CreatedDateTime { get; set; }

        /// <summary>
        /// User name of deleter of the stream resource
        /// </summary>
        [Input("deletedBy")]
        public Input<string>? DeletedBy { get; set; }

        /// <summary>
        /// Email of deleter of the stream resource
        /// </summary>
        [Input("deletedByEmail")]
        public Input<string>? DeletedByEmail { get; set; }

        /// <summary>
        /// Legal name of deleter of the stream resource
        /// </summary>
        [Input("deletedByFullName")]
        public Input<string>? DeletedByFullName { get; set; }

        /// <summary>
        /// Deletion time of the stream resource
        /// </summary>
        [Input("deletedDateTime")]
        public Input<string>? DeletedDateTime { get; set; }

        /// <summary>
        /// User name of last updater of the stream resource
        /// </summary>
        [Input("updatedBy")]
        public Input<string>? UpdatedBy { get; set; }

        /// <summary>
        /// Email of last updater of the stream resource
        /// </summary>
        [Input("updatedByEmail")]
        public Input<string>? UpdatedByEmail { get; set; }

        /// <summary>
        /// Legal name of last updater of the stream resource
        /// </summary>
        [Input("updatedByFullName")]
        public Input<string>? UpdatedByFullName { get; set; }

        /// <summary>
        /// Last update time of the stream resource
        /// </summary>
        [Input("updatedDateTime")]
        public Input<string>? UpdatedDateTime { get; set; }

        public StreamChangeLogGetArgs()
        {
        }
        public static new StreamChangeLogGetArgs Empty => new StreamChangeLogGetArgs();
    }
}
