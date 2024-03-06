// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetNetworkProject {
    /**
     * @return Customer project identifier
     * 
     */
    private String projectId;

    private GetNetworkProject() {}
    /**
     * @return Customer project identifier
     * 
     */
    public String projectId() {
        return this.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNetworkProject defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String projectId;
        public Builder() {}
        public Builder(GetNetworkProject defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.projectId = defaults.projectId;
        }

        @CustomType.Setter
        public Builder projectId(String projectId) {
            this.projectId = Objects.requireNonNull(projectId);
            return this;
        }
        public GetNetworkProject build() {
            final var _resultValue = new GetNetworkProject();
            _resultValue.projectId = projectId;
            return _resultValue;
        }
    }
}
