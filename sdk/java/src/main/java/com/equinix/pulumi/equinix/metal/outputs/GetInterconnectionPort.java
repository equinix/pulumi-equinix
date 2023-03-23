// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.equinix.metal.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetInterconnectionPort {
    /**
     * @return Port UUID.
     * 
     */
    private String id;
    /**
     * @return Port link status.
     * 
     */
    private String linkStatus;
    /**
     * @return Port name.
     * 
     */
    private String name;
    /**
     * @return Port role - primary or secondary.
     * 
     */
    private String role;
    /**
     * @return Port speed in bits per second.
     * 
     */
    private Integer speed;
    /**
     * @return Port status.
     * 
     */
    private String status;
    /**
     * @return List of IDs of virtual cicruits attached to this port.
     * 
     */
    private List<Object> virtualCircuitIds;

    private GetInterconnectionPort() {}
    /**
     * @return Port UUID.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Port link status.
     * 
     */
    public String linkStatus() {
        return this.linkStatus;
    }
    /**
     * @return Port name.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Port role - primary or secondary.
     * 
     */
    public String role() {
        return this.role;
    }
    /**
     * @return Port speed in bits per second.
     * 
     */
    public Integer speed() {
        return this.speed;
    }
    /**
     * @return Port status.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return List of IDs of virtual cicruits attached to this port.
     * 
     */
    public List<Object> virtualCircuitIds() {
        return this.virtualCircuitIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInterconnectionPort defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private String linkStatus;
        private String name;
        private String role;
        private Integer speed;
        private String status;
        private List<Object> virtualCircuitIds;
        public Builder() {}
        public Builder(GetInterconnectionPort defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.linkStatus = defaults.linkStatus;
    	      this.name = defaults.name;
    	      this.role = defaults.role;
    	      this.speed = defaults.speed;
    	      this.status = defaults.status;
    	      this.virtualCircuitIds = defaults.virtualCircuitIds;
        }

        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder linkStatus(String linkStatus) {
            this.linkStatus = Objects.requireNonNull(linkStatus);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder role(String role) {
            this.role = Objects.requireNonNull(role);
            return this;
        }
        @CustomType.Setter
        public Builder speed(Integer speed) {
            this.speed = Objects.requireNonNull(speed);
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        @CustomType.Setter
        public Builder virtualCircuitIds(List<Object> virtualCircuitIds) {
            this.virtualCircuitIds = Objects.requireNonNull(virtualCircuitIds);
            return this;
        }
        public Builder virtualCircuitIds(Object... virtualCircuitIds) {
            return virtualCircuitIds(List.of(virtualCircuitIds));
        }
        public GetInterconnectionPort build() {
            final var o = new GetInterconnectionPort();
            o.id = id;
            o.linkStatus = linkStatus;
            o.name = name;
            o.role = role;
            o.speed = speed;
            o.status = status;
            o.virtualCircuitIds = virtualCircuitIds;
            return o;
        }
    }
}