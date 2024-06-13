// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetConnectionsDataASideAccessPointPortRedundancy {
    /**
     * @return Access point redundancy
     * 
     */
    private Boolean enabled;
    /**
     * @return Port redundancy group
     * 
     */
    private String group;
    /**
     * @return Priority type-Primary or Secondary
     * 
     */
    private String priority;

    private GetConnectionsDataASideAccessPointPortRedundancy() {}
    /**
     * @return Access point redundancy
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }
    /**
     * @return Port redundancy group
     * 
     */
    public String group() {
        return this.group;
    }
    /**
     * @return Priority type-Primary or Secondary
     * 
     */
    public String priority() {
        return this.priority;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConnectionsDataASideAccessPointPortRedundancy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean enabled;
        private String group;
        private String priority;
        public Builder() {}
        public Builder(GetConnectionsDataASideAccessPointPortRedundancy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.group = defaults.group;
    	      this.priority = defaults.priority;
        }

        @CustomType.Setter
        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
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
        public GetConnectionsDataASideAccessPointPortRedundancy build() {
            final var _resultValue = new GetConnectionsDataASideAccessPointPortRedundancy();
            _resultValue.enabled = enabled;
            _resultValue.group = group;
            _resultValue.priority = priority;
            return _resultValue;
        }
    }
}
