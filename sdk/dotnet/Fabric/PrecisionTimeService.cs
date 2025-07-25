// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Equinix.Fabric
{
    /// <summary>
    /// Fabric V4 API compatible resource allows creation and management of Equinix Fabric Precision Time Service
    /// 
    /// Additional Documentation:
    /// * API: https://docs.equinix.com/en-us/Content/KnowledgeCenter/Fabric/API-Reference/API-Precision-Time.htm
    /// </summary>
    [EquinixResourceType("equinix:fabric/precisionTimeService:PrecisionTimeService")]
    public partial class PrecisionTimeService : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Equinix User Account associated with Precision Time Service
        /// </summary>
        [Output("account")]
        public Output<Outputs.PrecisionTimeServiceAccount> Account { get; private set; } = null!;

        /// <summary>
        /// Details of the last change on the route aggregation resource
        /// </summary>
        [Output("changeLog")]
        public Output<Outputs.PrecisionTimeServiceChangeLog> ChangeLog { get; private set; } = null!;

        /// <summary>
        /// An array of objects with unique identifiers of connections.
        /// </summary>
        [Output("connections")]
        public Output<ImmutableArray<Outputs.PrecisionTimeServiceConnection>> Connections { get; private set; } = null!;

        /// <summary>
        /// Equinix generated Portal link for the created Precision Time Service
        /// </summary>
        [Output("href")]
        public Output<string> Href { get; private set; } = null!;

        /// <summary>
        /// An object that has Network IP Configurations for Timing Master Servers.
        /// </summary>
        [Output("ipv4")]
        public Output<Outputs.PrecisionTimeServiceIpv4> Ipv4 { get; private set; } = null!;

        /// <summary>
        /// Name of Precision Time Service. Applicable values: Maximum: 24 characters; Allowed characters: alpha-numeric, hyphens ('-') and underscores ('_')
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// NTP Advanced configuration
        /// </summary>
        [Output("ntpAdvancedConfigurations")]
        public Output<ImmutableArray<Outputs.PrecisionTimeServiceNtpAdvancedConfiguration>> NtpAdvancedConfigurations { get; private set; } = null!;

        /// <summary>
        /// Precision Time Order
        /// </summary>
        [Output("order")]
        public Output<Outputs.PrecisionTimeServiceOrder> Order { get; private set; } = null!;

        /// <summary>
        /// Precision Time Service Package Details
        /// </summary>
        [Output("package")]
        public Output<Outputs.PrecisionTimeServicePackage> Package { get; private set; } = null!;

        /// <summary>
        /// Precision Time Service Price
        /// </summary>
        [Output("precisionTimePrice")]
        public Output<Outputs.PrecisionTimeServicePrecisionTimePrice> PrecisionTimePrice { get; private set; } = null!;

        /// <summary>
        /// Equinix Project attribute object
        /// </summary>
        [Output("project")]
        public Output<Outputs.PrecisionTimeServiceProject> Project { get; private set; } = null!;

        /// <summary>
        /// PTP Advanced Configuration
        /// </summary>
        [Output("ptpAdvancedConfiguration")]
        public Output<Outputs.PrecisionTimeServicePtpAdvancedConfiguration> PtpAdvancedConfiguration { get; private set; } = null!;

        /// <summary>
        /// Indicator of the state of this Precision Time Service
        /// </summary>
        [Output("state")]
        public Output<string> State { get; private set; } = null!;

        [Output("timeouts")]
        public Output<Outputs.PrecisionTimeServiceTimeouts?> Timeouts { get; private set; } = null!;

        /// <summary>
        /// Choose type of Precision Time Service
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;

        /// <summary>
        /// Equinix generated id for the Precision Time Service
        /// </summary>
        [Output("uuid")]
        public Output<string> Uuid { get; private set; } = null!;


        /// <summary>
        /// Create a PrecisionTimeService resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public PrecisionTimeService(string name, PrecisionTimeServiceArgs args, CustomResourceOptions? options = null)
            : base("equinix:fabric/precisionTimeService:PrecisionTimeService", name, args ?? new PrecisionTimeServiceArgs(), MakeResourceOptions(options, ""))
        {
        }

        private PrecisionTimeService(string name, Input<string> id, PrecisionTimeServiceState? state = null, CustomResourceOptions? options = null)
            : base("equinix:fabric/precisionTimeService:PrecisionTimeService", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                PluginDownloadURL = "github://api.github.com/equinix",
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing PrecisionTimeService resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static PrecisionTimeService Get(string name, Input<string> id, PrecisionTimeServiceState? state = null, CustomResourceOptions? options = null)
        {
            return new PrecisionTimeService(name, id, state, options);
        }
    }

    public sealed class PrecisionTimeServiceArgs : global::Pulumi.ResourceArgs
    {
        [Input("connections", required: true)]
        private InputList<Inputs.PrecisionTimeServiceConnectionArgs>? _connections;

        /// <summary>
        /// An array of objects with unique identifiers of connections.
        /// </summary>
        public InputList<Inputs.PrecisionTimeServiceConnectionArgs> Connections
        {
            get => _connections ?? (_connections = new InputList<Inputs.PrecisionTimeServiceConnectionArgs>());
            set => _connections = value;
        }

        /// <summary>
        /// An object that has Network IP Configurations for Timing Master Servers.
        /// </summary>
        [Input("ipv4", required: true)]
        public Input<Inputs.PrecisionTimeServiceIpv4Args> Ipv4 { get; set; } = null!;

        /// <summary>
        /// Name of Precision Time Service. Applicable values: Maximum: 24 characters; Allowed characters: alpha-numeric, hyphens ('-') and underscores ('_')
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("ntpAdvancedConfigurations")]
        private InputList<Inputs.PrecisionTimeServiceNtpAdvancedConfigurationArgs>? _ntpAdvancedConfigurations;

        /// <summary>
        /// NTP Advanced configuration
        /// </summary>
        public InputList<Inputs.PrecisionTimeServiceNtpAdvancedConfigurationArgs> NtpAdvancedConfigurations
        {
            get => _ntpAdvancedConfigurations ?? (_ntpAdvancedConfigurations = new InputList<Inputs.PrecisionTimeServiceNtpAdvancedConfigurationArgs>());
            set => _ntpAdvancedConfigurations = value;
        }

        /// <summary>
        /// Precision Time Service Package Details
        /// </summary>
        [Input("package", required: true)]
        public Input<Inputs.PrecisionTimeServicePackageArgs> Package { get; set; } = null!;

        /// <summary>
        /// PTP Advanced Configuration
        /// </summary>
        [Input("ptpAdvancedConfiguration")]
        public Input<Inputs.PrecisionTimeServicePtpAdvancedConfigurationArgs>? PtpAdvancedConfiguration { get; set; }

        [Input("timeouts")]
        public Input<Inputs.PrecisionTimeServiceTimeoutsArgs>? Timeouts { get; set; }

        /// <summary>
        /// Choose type of Precision Time Service
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public PrecisionTimeServiceArgs()
        {
        }
        public static new PrecisionTimeServiceArgs Empty => new PrecisionTimeServiceArgs();
    }

    public sealed class PrecisionTimeServiceState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Equinix User Account associated with Precision Time Service
        /// </summary>
        [Input("account")]
        public Input<Inputs.PrecisionTimeServiceAccountGetArgs>? Account { get; set; }

        /// <summary>
        /// Details of the last change on the route aggregation resource
        /// </summary>
        [Input("changeLog")]
        public Input<Inputs.PrecisionTimeServiceChangeLogGetArgs>? ChangeLog { get; set; }

        [Input("connections")]
        private InputList<Inputs.PrecisionTimeServiceConnectionGetArgs>? _connections;

        /// <summary>
        /// An array of objects with unique identifiers of connections.
        /// </summary>
        public InputList<Inputs.PrecisionTimeServiceConnectionGetArgs> Connections
        {
            get => _connections ?? (_connections = new InputList<Inputs.PrecisionTimeServiceConnectionGetArgs>());
            set => _connections = value;
        }

        /// <summary>
        /// Equinix generated Portal link for the created Precision Time Service
        /// </summary>
        [Input("href")]
        public Input<string>? Href { get; set; }

        /// <summary>
        /// An object that has Network IP Configurations for Timing Master Servers.
        /// </summary>
        [Input("ipv4")]
        public Input<Inputs.PrecisionTimeServiceIpv4GetArgs>? Ipv4 { get; set; }

        /// <summary>
        /// Name of Precision Time Service. Applicable values: Maximum: 24 characters; Allowed characters: alpha-numeric, hyphens ('-') and underscores ('_')
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("ntpAdvancedConfigurations")]
        private InputList<Inputs.PrecisionTimeServiceNtpAdvancedConfigurationGetArgs>? _ntpAdvancedConfigurations;

        /// <summary>
        /// NTP Advanced configuration
        /// </summary>
        public InputList<Inputs.PrecisionTimeServiceNtpAdvancedConfigurationGetArgs> NtpAdvancedConfigurations
        {
            get => _ntpAdvancedConfigurations ?? (_ntpAdvancedConfigurations = new InputList<Inputs.PrecisionTimeServiceNtpAdvancedConfigurationGetArgs>());
            set => _ntpAdvancedConfigurations = value;
        }

        /// <summary>
        /// Precision Time Order
        /// </summary>
        [Input("order")]
        public Input<Inputs.PrecisionTimeServiceOrderGetArgs>? Order { get; set; }

        /// <summary>
        /// Precision Time Service Package Details
        /// </summary>
        [Input("package")]
        public Input<Inputs.PrecisionTimeServicePackageGetArgs>? Package { get; set; }

        /// <summary>
        /// Precision Time Service Price
        /// </summary>
        [Input("precisionTimePrice")]
        public Input<Inputs.PrecisionTimeServicePrecisionTimePriceGetArgs>? PrecisionTimePrice { get; set; }

        /// <summary>
        /// Equinix Project attribute object
        /// </summary>
        [Input("project")]
        public Input<Inputs.PrecisionTimeServiceProjectGetArgs>? Project { get; set; }

        /// <summary>
        /// PTP Advanced Configuration
        /// </summary>
        [Input("ptpAdvancedConfiguration")]
        public Input<Inputs.PrecisionTimeServicePtpAdvancedConfigurationGetArgs>? PtpAdvancedConfiguration { get; set; }

        /// <summary>
        /// Indicator of the state of this Precision Time Service
        /// </summary>
        [Input("state")]
        public Input<string>? State { get; set; }

        [Input("timeouts")]
        public Input<Inputs.PrecisionTimeServiceTimeoutsGetArgs>? Timeouts { get; set; }

        /// <summary>
        /// Choose type of Precision Time Service
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        /// <summary>
        /// Equinix generated id for the Precision Time Service
        /// </summary>
        [Input("uuid")]
        public Input<string>? Uuid { get; set; }

        public PrecisionTimeServiceState()
        {
        }
        public static new PrecisionTimeServiceState Empty => new PrecisionTimeServiceState();
    }
}
