// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.equinix.networkedge.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.equinix.networkedge.outputs.GetDeviceClusterDetailNode0;
import com.pulumi.equinix.networkedge.outputs.GetDeviceClusterDetailNode1;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetDeviceClusterDetail {
    /**
     * @return The id of the cluster
     * 
     */
    private String clusterId;
    private String clusterName;
    private List<GetDeviceClusterDetailNode0> node0s;
    private List<GetDeviceClusterDetailNode1> node1s;
    /**
     * @return The number of nodes in the cluster
     * 
     */
    private Integer numOfNodes;

    private GetDeviceClusterDetail() {}
    /**
     * @return The id of the cluster
     * 
     */
    public String clusterId() {
        return this.clusterId;
    }
    public String clusterName() {
        return this.clusterName;
    }
    public List<GetDeviceClusterDetailNode0> node0s() {
        return this.node0s;
    }
    public List<GetDeviceClusterDetailNode1> node1s() {
        return this.node1s;
    }
    /**
     * @return The number of nodes in the cluster
     * 
     */
    public Integer numOfNodes() {
        return this.numOfNodes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDeviceClusterDetail defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String clusterId;
        private String clusterName;
        private List<GetDeviceClusterDetailNode0> node0s;
        private List<GetDeviceClusterDetailNode1> node1s;
        private Integer numOfNodes;
        public Builder() {}
        public Builder(GetDeviceClusterDetail defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterId = defaults.clusterId;
    	      this.clusterName = defaults.clusterName;
    	      this.node0s = defaults.node0s;
    	      this.node1s = defaults.node1s;
    	      this.numOfNodes = defaults.numOfNodes;
        }

        @CustomType.Setter
        public Builder clusterId(String clusterId) {
            this.clusterId = Objects.requireNonNull(clusterId);
            return this;
        }
        @CustomType.Setter
        public Builder clusterName(String clusterName) {
            this.clusterName = Objects.requireNonNull(clusterName);
            return this;
        }
        @CustomType.Setter
        public Builder node0s(List<GetDeviceClusterDetailNode0> node0s) {
            this.node0s = Objects.requireNonNull(node0s);
            return this;
        }
        public Builder node0s(GetDeviceClusterDetailNode0... node0s) {
            return node0s(List.of(node0s));
        }
        @CustomType.Setter
        public Builder node1s(List<GetDeviceClusterDetailNode1> node1s) {
            this.node1s = Objects.requireNonNull(node1s);
            return this;
        }
        public Builder node1s(GetDeviceClusterDetailNode1... node1s) {
            return node1s(List.of(node1s));
        }
        @CustomType.Setter
        public Builder numOfNodes(Integer numOfNodes) {
            this.numOfNodes = Objects.requireNonNull(numOfNodes);
            return this;
        }
        public GetDeviceClusterDetail build() {
            final var o = new GetDeviceClusterDetail();
            o.clusterId = clusterId;
            o.clusterName = clusterName;
            o.node0s = node0s;
            o.node1s = node1s;
            o.numOfNodes = numOfNodes;
            return o;
        }
    }
}
