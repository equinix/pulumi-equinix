// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Equinix.Fabric.Inputs
{

    public sealed class PrecisionTimeServiceNtpAdvancedConfigurationGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The plaintext authentication key. For ASCII type, the key\
        /// \ must contain printable ASCII characters, range 10-20 characters. For\
        /// \ HEX type, range should be 10-40 characters
        /// </summary>
        [Input("key")]
        public Input<string>? Key { get; set; }

        /// <summary>
        /// The authentication Key ID
        /// </summary>
        [Input("keyNumber")]
        public Input<int>? KeyNumber { get; set; }

        /// <summary>
        /// md5 Authentication type
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public PrecisionTimeServiceNtpAdvancedConfigurationGetArgs()
        {
        }
        public static new PrecisionTimeServiceNtpAdvancedConfigurationGetArgs Empty => new PrecisionTimeServiceNtpAdvancedConfigurationGetArgs();
    }
}
