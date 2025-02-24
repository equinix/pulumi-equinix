// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Equinix.Fabric.Inputs
{

    public sealed class ConnectionOrderArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Billing tier for connection bandwidth
        /// </summary>
        [Input("billingTier")]
        public Input<string>? BillingTier { get; set; }

        /// <summary>
        /// Order Identification
        /// </summary>
        [Input("orderId")]
        public Input<string>? OrderId { get; set; }

        /// <summary>
        /// Order Reference Number
        /// </summary>
        [Input("orderNumber")]
        public Input<string>? OrderNumber { get; set; }

        /// <summary>
        /// Purchase order number
        /// </summary>
        [Input("purchaseOrderNumber")]
        public Input<string>? PurchaseOrderNumber { get; set; }

        /// <summary>
        /// Term length in months; valid values are 1, 12, 24, 36 where 1 is the default value (for on-demand case)
        /// </summary>
        [Input("termLength")]
        public Input<int>? TermLength { get; set; }

        public ConnectionOrderArgs()
        {
        }
        public static new ConnectionOrderArgs Empty => new ConnectionOrderArgs();
    }
}
