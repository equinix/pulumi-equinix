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
    public sealed class GetDeviceClusterDetailResult
    {
        /// <summary>
        /// The id of the cluster
        /// </summary>
        public readonly string ClusterId;
        /// <summary>
        /// The name of the cluster device
        /// </summary>
        public readonly string ClusterName;
        /// <summary>
        /// An object that has node0 details
        /// </summary>
        public readonly ImmutableArray<Outputs.GetDeviceClusterDetailNode0Result> Node0s;
        /// <summary>
        /// An object that has node1 details
        /// </summary>
        public readonly ImmutableArray<Outputs.GetDeviceClusterDetailNode1Result> Node1s;
        /// <summary>
        /// The number of nodes in the cluster
        /// </summary>
        public readonly int NumOfNodes;

        [OutputConstructor]
        private GetDeviceClusterDetailResult(
            string clusterId,

            string clusterName,

            ImmutableArray<Outputs.GetDeviceClusterDetailNode0Result> node0s,

            ImmutableArray<Outputs.GetDeviceClusterDetailNode1Result> node1s,

            int numOfNodes)
        {
            ClusterId = clusterId;
            ClusterName = clusterName;
            Node0s = node0s;
            Node1s = node1s;
            NumOfNodes = numOfNodes;
        }
    }
}
