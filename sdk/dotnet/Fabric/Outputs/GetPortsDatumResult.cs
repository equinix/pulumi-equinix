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
    public sealed class GetPortsDatumResult
    {
        /// <summary>
        /// Customer account information that is associated with this port
        /// </summary>
        public readonly ImmutableArray<Outputs.GetPortsDatumAccountResult> Accounts;
        /// <summary>
        /// Port available bandwidth in Mbps
        /// </summary>
        public readonly int AvailableBandwidth;
        /// <summary>
        /// Port bandwidth in Mbps
        /// </summary>
        public readonly int Bandwidth;
        /// <summary>
        /// Captures port lifecycle change information
        /// </summary>
        public readonly ImmutableArray<Outputs.GetPortsDatumChangeLogResult> ChangeLogs;
        /// <summary>
        /// Port description
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// Port device
        /// </summary>
        public readonly ImmutableArray<Outputs.GetPortsDatumDeviceResult> Devices;
        /// <summary>
        /// Port encapsulation protocol
        /// </summary>
        public readonly ImmutableArray<Outputs.GetPortsDatumEncapsulationResult> Encapsulations;
        /// <summary>
        /// Port URI information
        /// </summary>
        public readonly string Href;
        /// <summary>
        /// Port Lag
        /// </summary>
        public readonly bool LagEnabled;
        /// <summary>
        /// Port location information
        /// </summary>
        public readonly ImmutableArray<Outputs.GetPortsDatumLocationResult> Locations;
        /// <summary>
        /// Port name
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Port specific operational data
        /// </summary>
        public readonly ImmutableArray<Outputs.GetPortsDatumOperationResult> Operations;
        /// <summary>
        /// Port redundancy information
        /// </summary>
        public readonly ImmutableArray<Outputs.GetPortsDatumRedundancyResult> Redundancies;
        /// <summary>
        /// Port service type
        /// </summary>
        public readonly string ServiceType;
        /// <summary>
        /// Port state
        /// </summary>
        public readonly string State;
        /// <summary>
        /// Port type
        /// </summary>
        public readonly string Type;
        /// <summary>
        /// Port used bandwidth in Mbps
        /// </summary>
        public readonly int UsedBandwidth;
        /// <summary>
        /// Equinix-assigned port identifier
        /// </summary>
        public readonly string Uuid;

        [OutputConstructor]
        private GetPortsDatumResult(
            ImmutableArray<Outputs.GetPortsDatumAccountResult> accounts,

            int availableBandwidth,

            int bandwidth,

            ImmutableArray<Outputs.GetPortsDatumChangeLogResult> changeLogs,

            string description,

            ImmutableArray<Outputs.GetPortsDatumDeviceResult> devices,

            ImmutableArray<Outputs.GetPortsDatumEncapsulationResult> encapsulations,

            string href,

            bool lagEnabled,

            ImmutableArray<Outputs.GetPortsDatumLocationResult> locations,

            string name,

            ImmutableArray<Outputs.GetPortsDatumOperationResult> operations,

            ImmutableArray<Outputs.GetPortsDatumRedundancyResult> redundancies,

            string serviceType,

            string state,

            string type,

            int usedBandwidth,

            string uuid)
        {
            Accounts = accounts;
            AvailableBandwidth = availableBandwidth;
            Bandwidth = bandwidth;
            ChangeLogs = changeLogs;
            Description = description;
            Devices = devices;
            Encapsulations = encapsulations;
            Href = href;
            LagEnabled = lagEnabled;
            Locations = locations;
            Name = name;
            Operations = operations;
            Redundancies = redundancies;
            ServiceType = serviceType;
            State = state;
            Type = type;
            UsedBandwidth = usedBandwidth;
            Uuid = uuid;
        }
    }
}