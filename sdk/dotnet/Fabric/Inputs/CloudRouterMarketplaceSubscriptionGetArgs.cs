// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Equinix.Fabric.Inputs
{

    public sealed class CloudRouterMarketplaceSubscriptionGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Marketplace Subscription type like; AWS*MARKETPLACE*SUBSCRIPTION
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        /// <summary>
        /// Equinix-assigned Marketplace Subscription identifier
        /// </summary>
        [Input("uuid", required: true)]
        public Input<string> Uuid { get; set; } = null!;

        public CloudRouterMarketplaceSubscriptionGetArgs()
        {
        }
        public static new CloudRouterMarketplaceSubscriptionGetArgs Empty => new CloudRouterMarketplaceSubscriptionGetArgs();
    }
}
