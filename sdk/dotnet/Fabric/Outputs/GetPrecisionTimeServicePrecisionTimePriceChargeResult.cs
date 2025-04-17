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
    public sealed class GetPrecisionTimeServicePrecisionTimePriceChargeResult
    {
        /// <summary>
        /// Offering price
        /// </summary>
        public readonly double Price;
        /// <summary>
        /// Price charge type; MONTHLY*RECURRING, NON*RECURRING
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private GetPrecisionTimeServicePrecisionTimePriceChargeResult(
            double price,

            string type)
        {
            Price = price;
            Type = type;
        }
    }
}
