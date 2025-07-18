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
    public sealed class GetPrecisionTimeServicePrecisionTimePriceResult
    {
        /// <summary>
        /// offering price charge
        /// </summary>
        public readonly ImmutableArray<Outputs.GetPrecisionTimeServicePrecisionTimePriceChargeResult> Charges;
        /// <summary>
        /// Offering price currency
        /// </summary>
        public readonly string Currency;

        [OutputConstructor]
        private GetPrecisionTimeServicePrecisionTimePriceResult(
            ImmutableArray<Outputs.GetPrecisionTimeServicePrecisionTimePriceChargeResult> charges,

            string currency)
        {
            Charges = charges;
            Currency = currency;
        }
    }
}
