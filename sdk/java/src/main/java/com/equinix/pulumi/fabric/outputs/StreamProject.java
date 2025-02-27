// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.equinix.pulumi.fabric.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class StreamProject {
    /**
     * @return Equinix Subscriber-assigned project ID
     * 
     */
    private String projectId;

    private StreamProject() {}
    /**
     * @return Equinix Subscriber-assigned project ID
     * 
     */
    public String projectId() {
        return this.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StreamProject defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String projectId;
        public Builder() {}
        public Builder(StreamProject defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.projectId = defaults.projectId;
        }

        @CustomType.Setter
        public Builder projectId(String projectId) {
            if (projectId == null) {
              throw new MissingRequiredPropertyException("StreamProject", "projectId");
            }
            this.projectId = projectId;
            return this;
        }
        public StreamProject build() {
            final var _resultValue = new StreamProject();
            _resultValue.projectId = projectId;
            return _resultValue;
        }
    }
}
