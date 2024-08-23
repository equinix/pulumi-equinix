// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetPortRedundancy {
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

    private GetPortRedundancy() {}
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

    public static Builder builder(GetPortRedundancy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean enabled;
        private String group;
        private String priority;
        public Builder() {}
        public Builder(GetPortRedundancy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.group = defaults.group;
    	      this.priority = defaults.priority;
        }

        @CustomType.Setter
        public Builder enabled(Boolean enabled) {
            if (enabled == null) {
              throw new MissingRequiredPropertyException("GetPortRedundancy", "enabled");
            }
            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder group(String group) {
            if (group == null) {
              throw new MissingRequiredPropertyException("GetPortRedundancy", "group");
            }
            this.group = group;
            return this;
        }
        @CustomType.Setter
        public Builder priority(String priority) {
            if (priority == null) {
              throw new MissingRequiredPropertyException("GetPortRedundancy", "priority");
            }
            this.priority = priority;
            return this;
        }
        public GetPortRedundancy build() {
            final var _resultValue = new GetPortRedundancy();
            _resultValue.enabled = enabled;
            _resultValue.group = group;
            _resultValue.priority = priority;
            return _resultValue;
        }
    }
}