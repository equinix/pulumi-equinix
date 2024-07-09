// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.networkedge.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetDeviceInterface {
    /**
     * @return Interface management type (Equinix Managed or empty)
     * 
     */
    private String assignedType;
    /**
     * @return Interface identifier
     * 
     */
    private Integer id;
    /**
     * @return interface IP address
     * 
     */
    private String ipAddress;
    /**
     * @return Interface MAC addres
     * 
     */
    private String macAddress;
    /**
     * @return Name of an existing Equinix Network Edge device
     * 
     */
    private String name;
    /**
     * @return Interface operational status (up or down)
     * 
     */
    private String operationalStatus;
    /**
     * @return Device provisioning status
     * * INITIALIZING
     * * PROVISIONING
     * * PROVISIONED (**NOTE: By default data source will only return devices in this state. To include other states see `valid_state_list`**)
     * * WAITING_FOR_PRIMARY
     * * WAITING_FOR_SECONDARY
     * * WAITING_FOR_REPLICA_CLUSTER_NODES
     * * CLUSTER_SETUP_IN_PROGRESS
     * * FAILED
     * * DEPROVISIONING
     * * DEPROVISIONED
     * * RESOURCE_UPGRADE_IN_PROGRESS
     * * RESOURCE_UPGRADE_FAILED
     * 
     */
    private String status;
    /**
     * @return Interface type
     * 
     */
    private String type;

    private GetDeviceInterface() {}
    /**
     * @return Interface management type (Equinix Managed or empty)
     * 
     */
    public String assignedType() {
        return this.assignedType;
    }
    /**
     * @return Interface identifier
     * 
     */
    public Integer id() {
        return this.id;
    }
    /**
     * @return interface IP address
     * 
     */
    public String ipAddress() {
        return this.ipAddress;
    }
    /**
     * @return Interface MAC addres
     * 
     */
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
    /**
     * @return Interface operational status (up or down)
     * 
     */
    public String operationalStatus() {
        return this.operationalStatus;
    }
    /**
     * @return Device provisioning status
     * * INITIALIZING
     * * PROVISIONING
     * * PROVISIONED (**NOTE: By default data source will only return devices in this state. To include other states see `valid_state_list`**)
     * * WAITING_FOR_PRIMARY
     * * WAITING_FOR_SECONDARY
     * * WAITING_FOR_REPLICA_CLUSTER_NODES
     * * CLUSTER_SETUP_IN_PROGRESS
     * * FAILED
     * * DEPROVISIONING
     * * DEPROVISIONED
     * * RESOURCE_UPGRADE_IN_PROGRESS
     * * RESOURCE_UPGRADE_FAILED
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return Interface type
     * 
     */
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
            if (assignedType == null) {
              throw new MissingRequiredPropertyException("GetDeviceInterface", "assignedType");
            }
            this.assignedType = assignedType;
            return this;
        }
        @CustomType.Setter
        public Builder id(Integer id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetDeviceInterface", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder ipAddress(String ipAddress) {
            if (ipAddress == null) {
              throw new MissingRequiredPropertyException("GetDeviceInterface", "ipAddress");
            }
            this.ipAddress = ipAddress;
            return this;
        }
        @CustomType.Setter
        public Builder macAddress(String macAddress) {
            if (macAddress == null) {
              throw new MissingRequiredPropertyException("GetDeviceInterface", "macAddress");
            }
            this.macAddress = macAddress;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetDeviceInterface", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder operationalStatus(String operationalStatus) {
            if (operationalStatus == null) {
              throw new MissingRequiredPropertyException("GetDeviceInterface", "operationalStatus");
            }
            this.operationalStatus = operationalStatus;
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            if (status == null) {
              throw new MissingRequiredPropertyException("GetDeviceInterface", "status");
            }
            this.status = status;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("GetDeviceInterface", "type");
            }
            this.type = type;
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
