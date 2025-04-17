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
    public sealed class GetPrecisionTimeServicesDataResult
    {
        /// <summary>
        /// Equinix User Account associated with Precision Time Service
        /// </summary>
        public readonly Outputs.GetPrecisionTimeServicesDataAccountResult Account;
        /// <summary>
        /// Details of the last change on the route aggregation resource
        /// </summary>
        public readonly Outputs.GetPrecisionTimeServicesDataChangeLogResult ChangeLog;
        /// <summary>
        /// An array of objects with unique identifiers of connections.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetPrecisionTimeServicesDataConnectionResult> Connections;
        /// <summary>
        /// Equinix generated Portal link for the created Precision Time Service
        /// </summary>
        public readonly string Href;
        /// <summary>
        /// An object that has Network IP Configurations for Timing Master Servers.
        /// </summary>
        public readonly Outputs.GetPrecisionTimeServicesDataIpv4Result Ipv4;
        /// <summary>
        /// Name of Precision Time Service. Applicable values: Maximum: 24 characters; Allowed characters: alpha-numeric, hyphens ('-') and underscores ('_')
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// NTP Advanced configuration
        /// </summary>
        public readonly ImmutableArray<Outputs.GetPrecisionTimeServicesDataNtpAdvancedConfigurationResult> NtpAdvancedConfigurations;
        /// <summary>
        /// Precision Time Order
        /// </summary>
        public readonly Outputs.GetPrecisionTimeServicesDataOrderResult Order;
        /// <summary>
        /// Precision Time Service Package Details
        /// </summary>
        public readonly Outputs.GetPrecisionTimeServicesDataPackageResult Package;
        /// <summary>
        /// Precision Time Service Price
        /// </summary>
        public readonly Outputs.GetPrecisionTimeServicesDataPrecisionTimePriceResult PrecisionTimePrice;
        /// <summary>
        /// Equinix Project attribute object
        /// </summary>
        public readonly Outputs.GetPrecisionTimeServicesDataProjectResult? Project;
        /// <summary>
        /// PTP Advanced Configuration
        /// </summary>
        public readonly Outputs.GetPrecisionTimeServicesDataPtpAdvancedConfigurationResult? PtpAdvancedConfiguration;
        /// <summary>
        /// Indicator of the state of this Precision Time Service
        /// </summary>
        public readonly string State;
        /// <summary>
        /// Choose type of Precision Time Service
        /// </summary>
        public readonly string Type;
        /// <summary>
        /// Equinix generated id for the Precision Time Service
        /// </summary>
        public readonly string Uuid;

        [OutputConstructor]
        private GetPrecisionTimeServicesDataResult(
            Outputs.GetPrecisionTimeServicesDataAccountResult account,

            Outputs.GetPrecisionTimeServicesDataChangeLogResult changeLog,

            ImmutableArray<Outputs.GetPrecisionTimeServicesDataConnectionResult> connections,

            string href,

            Outputs.GetPrecisionTimeServicesDataIpv4Result ipv4,

            string name,

            ImmutableArray<Outputs.GetPrecisionTimeServicesDataNtpAdvancedConfigurationResult> ntpAdvancedConfigurations,

            Outputs.GetPrecisionTimeServicesDataOrderResult order,

            Outputs.GetPrecisionTimeServicesDataPackageResult package,

            Outputs.GetPrecisionTimeServicesDataPrecisionTimePriceResult precisionTimePrice,

            Outputs.GetPrecisionTimeServicesDataProjectResult? project,

            Outputs.GetPrecisionTimeServicesDataPtpAdvancedConfigurationResult? ptpAdvancedConfiguration,

            string state,

            string type,

            string uuid)
        {
            Account = account;
            ChangeLog = changeLog;
            Connections = connections;
            Href = href;
            Ipv4 = ipv4;
            Name = name;
            NtpAdvancedConfigurations = ntpAdvancedConfigurations;
            Order = order;
            Package = package;
            PrecisionTimePrice = precisionTimePrice;
            Project = project;
            PtpAdvancedConfiguration = ptpAdvancedConfiguration;
            State = state;
            Type = type;
            Uuid = uuid;
        }
    }
}
