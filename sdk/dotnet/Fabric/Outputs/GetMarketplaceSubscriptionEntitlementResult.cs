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
    public sealed class GetMarketplaceSubscriptionEntitlementResult
    {
        /// <summary>
        /// Asset information
        /// </summary>
        public readonly ImmutableArray<Outputs.GetMarketplaceSubscriptionEntitlementAssetResult> Assets;
        /// <summary>
        /// Available Quantity
        /// </summary>
        public readonly int QuantityAvailable;
        /// <summary>
        /// Consumed Quantity
        /// </summary>
        public readonly int QuantityConsumed;
        /// <summary>
        /// Entitled Quantity
        /// </summary>
        public readonly int QuantityEntitled;
        /// <summary>
        /// Subscription Entitlement Id
        /// </summary>
        public readonly string Uuid;

        [OutputConstructor]
        private GetMarketplaceSubscriptionEntitlementResult(
            ImmutableArray<Outputs.GetMarketplaceSubscriptionEntitlementAssetResult> assets,

            int quantityAvailable,

            int quantityConsumed,

            int quantityEntitled,

            string uuid)
        {
            Assets = assets;
            QuantityAvailable = quantityAvailable;
            QuantityConsumed = quantityConsumed;
            QuantityEntitled = quantityEntitled;
            Uuid = uuid;
        }
    }
}