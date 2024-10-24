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
    public sealed class GetRouteFilterRulesDataChangeResult
    {
        /// <summary>
        /// The URI of the previous Route Filter Rule Change
        /// </summary>
        public readonly string Href;
        /// <summary>
        /// Type of change. One of [ "BGP_IPv4_PREFIX_FILTER_RULE_UPDATE","BGP_IPv4_PREFIX_FILTER_RULE_CREATION","BGP_IPv4_PREFIX_FILTER_RULE_DELETION","BGP_IPv6_PREFIX_FILTER_RULE_UPDATE","BGP_IPv6_PREFIX_FILTER_RULE_CREATION","BGP_IPv6_PREFIX_FILTER_RULE_DELETION" ]
        /// </summary>
        public readonly string Type;
        /// <summary>
        /// Unique identifier for the previous change
        /// </summary>
        public readonly string Uuid;

        [OutputConstructor]
        private GetRouteFilterRulesDataChangeResult(
            string href,

            string type,

            string uuid)
        {
            Href = href;
            Type = type;
            Uuid = uuid;
        }
    }
}
