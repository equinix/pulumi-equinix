// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.networkedge.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetDeviceInterface {
    private String assignedType;
    private Integer id;
    private String ipAddress;
    private String macAddress;
    /**
     * @return Name of an existing Equinix Network Edge device
     * 
     */
    private String name;
    private String operationalStatus;
    /**
     * @return Device provisioning status
     * * INITIALIZING
     * * PROVISIONING
     * * PROVISIONED  (**NOTE: By default data source will only return devices in this state.  To include other states see `valid_state_list`**)
     * * WAITING_FOR_PRIMARY
     * * WAITING_FOR_SECONDARY
     * * WAITING_FOR_REPLICA_CLUSTER_NODES
     * * CLUSTER_SETUP_IN_PROGRESS
     * * FAILED
     * * DEPROVISIONING
     * * DEPROVISIONED
     * 
     */
    private String status;
    private String type;

    private GetDeviceInterface() {}
    public String assignedType() {
        return this.assignedType;
    }
    public Integer id() {
        return this.id;
    }
    public String ipAddress() {
        return this.ipAddress;
    }
    public String macAddress() {
        return this.macAddress;
    }
    /**
     * @return Name of an existing Equinix Network Edge device
     * 
     */
    public String name() {
        return this.name;
    }
    public String operationalStatus() {
        return this.operationalStatus;
    }
    /**
     * @return Device provisioning status
     * * INITIALIZING
     * * PROVISIONING
     * * PROVISIONED  (**NOTE: By default data source will only return devices in this state.  To include other states see `valid_state_list`**)
     * * WAITING_FOR_PRIMARY
     * * WAITING_FOR_SECONDARY
     * * WAITING_FOR_REPLICA_CLUSTER_NODES
     * * CLUSTER_SETUP_IN_PROGRESS
     * * FAILED
     * * DEPROVISIONING
     * * DEPROVISIONED
     * 
     */
    public String status() {
        return this.status;
    }
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDeviceInterface defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String assignedType;
        private Integer id;
        private String ipAddress;
        private String macAddress;
        private String name;
        private String operationalStatus;
        private String status;
        private String type;
        public Builder() {}
        public Builder(GetDeviceInterface defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assignedType = defaults.assignedType;
    	      this.id = defaults.id;
    	      this.ipAddress = defaults.ipAddress;
    	      this.macAddress = defaults.macAddress;
    	      this.name = defaults.name;
    	      this.operationalStatus = defaults.operationalStatus;
    	      this.status = defaults.status;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder assignedType(String assignedType) {
            this.assignedType = Objects.requireNonNull(assignedType);
            return this;
        }
        @CustomType.Setter
        public Builder id(Integer id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder ipAddress(String ipAddress) {
            this.ipAddress = Objects.requireNonNull(ipAddress);
            return this;
        }
        @CustomType.Setter
        public Builder macAddress(String macAddress) {
            this.macAddress = Objects.requireNonNull(macAddress);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder operationalStatus(String operationalStatus) {
            this.operationalStatus = Objects.requireNonNull(operationalStatus);
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetDeviceInterface build() {
            final var _resultValue = new GetDeviceInterface();
            _resultValue.assignedType = assignedType;
            _resultValue.id = id;
            _resultValue.ipAddress = ipAddress;
            _resultValue.macAddress = macAddress;
            _resultValue.name = name;
            _resultValue.operationalStatus = operationalStatus;
            _resultValue.status = status;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
