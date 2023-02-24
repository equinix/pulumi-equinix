// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.equinix.fabric.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetPortsDataDeviceRedundancy {
    private String group;
    private String priority;

    private GetPortsDataDeviceRedundancy() {}
    public String group() {
        return this.group;
    }
    public String priority() {
        return this.priority;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPortsDataDeviceRedundancy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String group;
        private String priority;
        public Builder() {}
        public Builder(GetPortsDataDeviceRedundancy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.group = defaults.group;
    	      this.priority = defaults.priority;
        }

        @CustomType.Setter
        public Builder group(String group) {
            this.group = Objects.requireNonNull(group);
            return this;
        }
        @CustomType.Setter
        public Builder priority(String priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }
        public GetPortsDataDeviceRedundancy build() {
            final var o = new GetPortsDataDeviceRedundancy();
            o.group = group;
            o.priority = priority;
            return o;
        }
    }
}
