// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Equinix.Metal.Outputs
{

    [OutputType]
    public sealed class DeviceBehavior
    {
        /// <summary>
        /// List of attributes that are allowed to change without recreating the instance. Supported attributes: `custom_data`, `user_data`
        /// </summary>
        public readonly ImmutableArray<string> AllowChanges;

        [OutputConstructor]
        private DeviceBehavior(ImmutableArray<string> allowChanges)
        {
            AllowChanges = allowChanges;
        }
    }
}
