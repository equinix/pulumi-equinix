// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetConnectionsDataRedundancy {
    /**
     * @return Redundancy group identifier (Use the redundancy.0.group UUID of primary connection; e.g. one(equinix_fabric_connection.primary_port_connection.redundancy).group or equinix_fabric_connection.primary_port_connection.redundancy.0.group)
     * 
     */
    private String group;
    /**
     * @return Connection priority in redundancy group - PRIMARY, SECONDARY
     * 
     */
    private String priority;

    private GetConnectionsDataRedundancy() {}
    /**
     * @return Redundancy group identifier (Use the redundancy.0.group UUID of primary connection; e.g. one(equinix_fabric_connection.primary_port_connection.redundancy).group or equinix_fabric_connection.primary_port_connection.redundancy.0.group)
     * 
     */
    public String group() {
        return this.group;
    }
    /**
     * @return Connection priority in redundancy group - PRIMARY, SECONDARY
     * 
     */
    public String priority() {
        return this.priority;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConnectionsDataRedundancy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String group;
        private String priority;
        public Builder() {}
        public Builder(GetConnectionsDataRedundancy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.group = defaults.group;
    	      this.priority = defaults.priority;
        }

        @CustomType.Setter
        public Builder group(String group) {
            if (group == null) {
              throw new MissingRequiredPropertyException("GetConnectionsDataRedundancy", "group");
            }
            this.group = group;
            return this;
        }
        @CustomType.Setter
        public Builder priority(String priority) {
            if (priority == null) {
              throw new MissingRequiredPropertyException("GetConnectionsDataRedundancy", "priority");
            }
            this.priority = priority;
            return this;
        }
        public GetConnectionsDataRedundancy build() {
            final var _resultValue = new GetConnectionsDataRedundancy();
            _resultValue.group = group;
            _resultValue.priority = priority;
            return _resultValue;
        }
    }
}
