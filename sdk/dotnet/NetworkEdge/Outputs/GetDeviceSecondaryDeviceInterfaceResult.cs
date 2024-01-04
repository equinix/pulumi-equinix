// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Equinix.NetworkEdge.Outputs
{

    [OutputType]
    public sealed class GetDeviceSecondaryDeviceInterfaceResult
    {
        public readonly string AssignedType;
        public readonly int Id;
        public readonly string IpAddress;
        public readonly string MacAddress;
        /// <summary>
        /// Name of an existing Equinix Network Edge device
        /// </summary>
        public readonly string Name;
        public readonly string OperationalStatus;
        /// <summary>
        /// Device provisioning status
        /// * INITIALIZING
        /// * PROVISIONING
        /// * PROVISIONED  (**NOTE: By default data source will only return devices in this state.  To include other states see `valid_state_list`**)
        /// * WAITING_FOR_PRIMARY
        /// * WAITING_FOR_SECONDARY
        /// * WAITING_FOR_REPLICA_CLUSTER_NODES
        /// * CLUSTER_SETUP_IN_PROGRESS
        /// * FAILED
        /// * DEPROVISIONING
        /// * DEPROVISIONED
        /// * RESOURCE_UPGRADE_IN_PROGRESS
        /// * RESOURCE_UPGRADE_FAILED
        /// </summary>
        public readonly string Status;
        public readonly string Type;

        [OutputConstructor]
        private GetDeviceSecondaryDeviceInterfaceResult(
            string assignedType,

            int id,

            string ipAddress,

            string macAddress,

            string name,

            string operationalStatus,

            string status,

            string type)
        {
            AssignedType = assignedType;
            Id = id;
            IpAddress = ipAddress;
            MacAddress = macAddress;
            Name = name;
            OperationalStatus = operationalStatus;
            Status = status;
            Type = type;
        }
    }
}
