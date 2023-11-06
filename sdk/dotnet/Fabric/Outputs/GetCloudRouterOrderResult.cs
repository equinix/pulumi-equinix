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
    public sealed class GetCloudRouterOrderResult
    {
        public readonly string BillingTier;
        public readonly string OrderId;
        public readonly string OrderNumber;
        public readonly string PurchaseOrderNumber;

        [OutputConstructor]
        private GetCloudRouterOrderResult(
            string billingTier,

            string orderId,

            string orderNumber,

            string purchaseOrderNumber)
        {
            BillingTier = billingTier;
            OrderId = orderId;
            OrderNumber = orderNumber;
            PurchaseOrderNumber = purchaseOrderNumber;
        }
    }
}